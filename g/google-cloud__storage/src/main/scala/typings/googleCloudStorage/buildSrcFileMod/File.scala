package typings.googleCloudStorage.buildSrcFileMod

import typings.googleCloudStorage.buildSrcAclMod.Acl
import typings.googleCloudStorage.buildSrcBucketMod.AvailableServiceObjectMethods
import typings.googleCloudStorage.buildSrcBucketMod.Bucket
import typings.googleCloudStorage.buildSrcCrc32cMod.CRC32CValidator
import typings.googleCloudStorage.buildSrcCrc32cMod.CRC32CValidatorGenerator
import typings.googleCloudStorage.buildSrcNodejsCommonMod.ServiceObject
import typings.googleCloudStorage.buildSrcNodejsCommonUtilMod.Duplexify
import typings.googleCloudStorage.buildSrcSignerMod.GetSignedUrlCallback
import typings.googleCloudStorage.buildSrcSignerMod.GetSignedUrlResponse
import typings.googleCloudStorage.buildSrcSignerMod.URLSigner
import typings.googleCloudStorage.buildSrcStorageMod.PreconditionOptions
import typings.googleCloudStorage.buildSrcStorageMod.Storage
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A File object is created from your {@link Bucket} object using
  * {@link Bucket#file}.
  *
  * @class
  */
@JSImport("@google-cloud/storage/build/src/file", "File")
@js.native
open class File protected () extends ServiceObject[File] {
  /**
    * Cloud Storage uses access control lists (ACLs) to manage object and
    * bucket access. ACLs are the mechanism you use to share objects with other
    * users and allow other users to access your buckets and objects.
    *
    * An ACL consists of one or more entries, where each entry grants permissions
    * to an entity. Permissions define the actions that can be performed against
    * an object or bucket (for example, `READ` or `WRITE`); the entity defines
    * who the permission applies to (for example, a specific user or group of
    * users).
    *
    * The `acl` object on a File instance provides methods to get you a list of
    * the ACLs defined on your bucket, as well as set, update, and delete them.
    *
    * See {@link http://goo.gl/6qBBPO| About Access Control lists}
    *
    * @name File#acl
    * @mixes Acl
    *
    * @example
    * ```
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const myBucket = storage.bucket('my-bucket');
    *
    * const file = myBucket.file('my-file');
    * //-
    * // Make a file publicly readable.
    * //-
    * const options = {
    *   entity: 'allUsers',
    *   role: storage.acl.READER_ROLE
    * };
    *
    * file.acl.add(options, function(err, aclObject) {});
    *
    * //-
    * // If the callback is omitted, we'll return a Promise.
    * //-
    * file.acl.add(options).then(function(data) {
    *   const aclObject = data[0];
    *   const apiResponse = data[1];
    * });
    * ```
    */
  /**
    * The API-formatted resource description of the file.
    *
    * Note: This is not guaranteed to be up-to-date when accessed. To get the
    * latest record, call the `getMetadata()` method.
    *
    * @name File#metadata
    * @type {object}
    */
  /**
    * The file's name.
    * @name File#name
    * @type {string}
    */
  /**
    * @callback Crc32cGeneratorToStringCallback
    * A method returning the CRC32C as a base64-encoded string.
    *
    * @returns {string}
    *
    * @example
    * Hashing the string 'data' should return 'rth90Q=='
    *
    * ```js
    * const buffer = Buffer.from('data');
    * crc32c.update(buffer);
    * crc32c.toString(); // 'rth90Q=='
    * ```
    **/
  /**
    * @callback Crc32cGeneratorValidateCallback
    * A method validating a base64-encoded CRC32C string.
    *
    * @param {string} [value] base64-encoded CRC32C string to validate
    * @returns {boolean}
    *
    * @example
    * Should return `true` if the value matches, `false` otherwise
    *
    * ```js
    * const buffer = Buffer.from('data');
    * crc32c.update(buffer);
    * crc32c.validate('DkjKuA=='); // false
    * crc32c.validate('rth90Q=='); // true
    * ```
    **/
  /**
    * @callback Crc32cGeneratorUpdateCallback
    * A method for passing `Buffer`s for CRC32C generation.
    *
    * @param {Buffer} [data] data to update CRC32C value with
    * @returns {undefined}
    *
    * @example
    * Hashing buffers from 'some ' and 'text\n'
    *
    * ```js
    * const buffer1 = Buffer.from('some ');
    * crc32c.update(buffer1);
    *
    * const buffer2 = Buffer.from('text\n');
    * crc32c.update(buffer2);
    *
    * crc32c.toString(); // 'DkjKuA=='
    * ```
    **/
  /**
    * @typedef {object} CRC32CValidator
    * @property {Crc32cGeneratorToStringCallback}
    * @property {Crc32cGeneratorValidateCallback}
    * @property {Crc32cGeneratorUpdateCallback}
    */
  /**
    * @callback Crc32cGeneratorCallback
    * @returns {CRC32CValidator}
    */
  /**
    * @typedef {object} FileOptions Options passed to the File constructor.
    * @property {string} [encryptionKey] A custom encryption key.
    * @property {number} [generation] Generation to scope the file to.
    * @property {string} [kmsKeyName] Cloud KMS Key used to encrypt this
    *     object, if the object is encrypted by such a key. Limited availability;
    *     usable only by enabled projects.
    * @property {string} [userProject] The ID of the project which will be
    *     billed for all requests made from File object.
    * @property {Crc32cGeneratorCallback} [callback] A function that generates a CRC32C Validator. Defaults to {@link CRC32C}
    */
  /**
    * Constructs a file object.
    *
    * @param {Bucket} bucket The Bucket instance this file is
    *     attached to.
    * @param {string} name The name of the remote file.
    * @param {FileOptions} [options] Configuration options.
    * @example
    * ```
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const myBucket = storage.bucket('my-bucket');
    *
    * const file = myBucket.file('my-file');
    * ```
    */
  def this(bucket: Bucket, name: String) = this()
  def this(bucket: Bucket, name: String, options: FileOptions) = this()
  
  var acl: Acl = js.native
  
  var bucket: Bucket = js.native
  
  /**
    * The object's Cloud Storage URI (`gs://`)
    *
    * @example
    * ```ts
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const bucket = storage.bucket('my-bucket');
    * const file = bucket.file('image.png');
    *
    * // `gs://my-bucket/image.png`
    * const href = file.cloudStorageURI.href;
    * ```
    */
  def cloudStorageURI: URL_ = js.native
  
  def copy(destination: String): js.Promise[CopyResponse] = js.native
  def copy(destination: String, callback: CopyCallback): Unit = js.native
  def copy(destination: String, options: CopyOptions): js.Promise[CopyResponse] = js.native
  def copy(destination: String, options: CopyOptions, callback: CopyCallback): Unit = js.native
  def copy(destination: Bucket): js.Promise[CopyResponse] = js.native
  def copy(destination: Bucket, callback: CopyCallback): Unit = js.native
  def copy(destination: Bucket, options: CopyOptions): js.Promise[CopyResponse] = js.native
  def copy(destination: Bucket, options: CopyOptions, callback: CopyCallback): Unit = js.native
  def copy(destination: File): js.Promise[CopyResponse] = js.native
  def copy(destination: File, callback: CopyCallback): Unit = js.native
  def copy(destination: File, options: CopyOptions): js.Promise[CopyResponse] = js.native
  def copy(destination: File, options: CopyOptions, callback: CopyCallback): Unit = js.native
  
  def crc32cGenerator(): CRC32CValidator = js.native
  @JSName("crc32cGenerator")
  var crc32cGenerator_Original: CRC32CValidatorGenerator = js.native
  
  /**
    * @typedef {object} CreateReadStreamOptions Configuration options for File#createReadStream.
    * @property {string} [userProject] The ID of the project which will be
    *     billed for the request.
    * @property {string|boolean} [validation] Possible values: `"md5"`,
    *     `"crc32c"`, or `false`. By default, data integrity is validated with a
    *     CRC32c checksum. You may use MD5 if preferred, but that hash is not
    *     supported for composite objects. An error will be raised if MD5 is
    *     specified but is not available. You may also choose to skip validation
    *     completely, however this is **not recommended**.
    * @property {number} [start] A byte offset to begin the file's download
    *     from. Default is 0. NOTE: Byte ranges are inclusive; that is,
    *     `options.start = 0` and `options.end = 999` represent the first 1000
    *     bytes in a file or object. NOTE: when specifying a byte range, data
    *     integrity is not available.
    * @property {number} [end] A byte offset to stop reading the file at.
    *     NOTE: Byte ranges are inclusive; that is, `options.start = 0` and
    *     `options.end = 999` represent the first 1000 bytes in a file or object.
    *     NOTE: when specifying a byte range, data integrity is not available.
    * @property {boolean} [decompress=true] Disable auto decompression of the
    *     received data. By default this option is set to `true`.
    *     Applicable in cases where the data was uploaded with
    *     `gzip: true` option. See {@link File#createWriteStream}.
    */
  /**
    * Create a readable stream to read the contents of the remote file. It can be
    * piped to a writable stream or listened to for 'data' events to read a
    * file's contents.
    *
    * In the unlikely event there is a mismatch between what you downloaded and
    * the version in your Bucket, your error handler will receive an error with
    * code "CONTENT_DOWNLOAD_MISMATCH". If you receive this error, the best
    * recourse is to try downloading the file again.
    *
    * NOTE: Readable streams will emit the `end` event when the file is fully
    * downloaded.
    *
    * @param {CreateReadStreamOptions} [options] Configuration options.
    * @returns {ReadableStream}
    *
    * @example
    * ```
    * //-
    * // <h4>Downloading a File</h4>
    * //
    * // The example below demonstrates how we can reference a remote file, then
    * // pipe its contents to a local file. This is effectively creating a local
    * // backup of your remote data.
    * //-
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const bucket = storage.bucket('my-bucket');
    *
    * const fs = require('fs');
    * const remoteFile = bucket.file('image.png');
    * const localFilename = '/Users/stephen/Photos/image.png';
    *
    * remoteFile.createReadStream()
    *   .on('error', function(err) {})
    *   .on('response', function(response) {
    *     // Server connected and responded with the specified status and headers.
    *    })
    *   .on('end', function() {
    *     // The file is fully downloaded.
    *   })
    *   .pipe(fs.createWriteStream(localFilename));
    *
    * //-
    * // To limit the downloaded data to only a byte range, pass an options
    * // object.
    * //-
    * const logFile = myBucket.file('access_log');
    * logFile.createReadStream({
    *     start: 10000,
    *     end: 20000
    *   })
    *   .on('error', function(err) {})
    *   .pipe(fs.createWriteStream('/Users/stephen/logfile.txt'));
    *
    * //-
    * // To read a tail byte range, specify only `options.end` as a negative
    * // number.
    * //-
    * const logFile = myBucket.file('access_log');
    * logFile.createReadStream({
    *     end: -100
    *   })
    *   .on('error', function(err) {})
    *   .pipe(fs.createWriteStream('/Users/stephen/logfile.txt'));
    * ```
    */
  def createReadStream(): Readable = js.native
  def createReadStream(options: CreateReadStreamOptions): Readable = js.native
  
  def createResumableUpload(): js.Promise[CreateResumableUploadResponse] = js.native
  def createResumableUpload(callback: CreateResumableUploadCallback): Unit = js.native
  def createResumableUpload(options: CreateResumableUploadOptions): js.Promise[CreateResumableUploadResponse] = js.native
  def createResumableUpload(options: CreateResumableUploadOptions, callback: CreateResumableUploadCallback): Unit = js.native
  
  /**
    * @typedef {object} CreateWriteStreamOptions Configuration options for File#createWriteStream().
    * @property {string} [contentType] Alias for
    *     `options.metadata.contentType`. If set to `auto`, the file name is used
    *     to determine the contentType.
    * @property {string|boolean} [gzip] If true, automatically gzip the file.
    *     If set to `auto`, the contentType is used to determine if the file
    * should be gzipped. This will set `options.metadata.contentEncoding` to
    * `gzip` if necessary.
    * @property {object} [metadata] See the examples below or
    *     {@link https://cloud.google.com/storage/docs/json_api/v1/objects/insert#request_properties_JSON| Objects: insert request body}
    *     for more details.
    * @property {number} [offset] The starting byte of the upload stream, for
    *     resuming an interrupted upload. Defaults to 0.
    * @property {string} [predefinedAcl] Apply a predefined set of access
    * controls to this object.
    *
    * Acceptable values are:
    * - **`authenticatedRead`** - Object owner gets `OWNER` access, and
    *   `allAuthenticatedUsers` get `READER` access.
    *
    * - **`bucketOwnerFullControl`** - Object owner gets `OWNER` access, and
    *   project team owners get `OWNER` access.
    *
    * - **`bucketOwnerRead`** - Object owner gets `OWNER` access, and project
    *   team owners get `READER` access.
    *
    * - **`private`** - Object owner gets `OWNER` access.
    *
    * - **`projectPrivate`** - Object owner gets `OWNER` access, and project
    *   team members get access according to their roles.
    *
    * - **`publicRead`** - Object owner gets `OWNER` access, and `allUsers`
    *   get `READER` access.
    * @property {boolean} [private] Make the uploaded file private. (Alias for
    *     `options.predefinedAcl = 'private'`)
    * @property {boolean} [public] Make the uploaded file public. (Alias for
    *     `options.predefinedAcl = 'publicRead'`)
    * @property {boolean} [resumable] Force a resumable upload. NOTE: When
    *     working with streams, the file format and size is unknown until it's
    *     completely consumed. Because of this, it's best for you to be explicit
    *     for what makes sense given your input.
    * @property {number} [timeout=60000] Set the HTTP request timeout in
    *     milliseconds. This option is not available for resumable uploads.
    *     Default: `60000`
    * @property {string} [uri] The URI for an already-created resumable
    *     upload. See {@link File#createResumableUpload}.
    * @property {string} [userProject] The ID of the project which will be
    *     billed for the request.
    * @property {string|boolean} [validation] Possible values: `"md5"`,
    *     `"crc32c"`, or `false`. By default, data integrity is validated with a
    *     CRC32c checksum. You may use MD5 if preferred, but that hash is not
    *     supported for composite objects. An error will be raised if MD5 is
    *     specified but is not available. You may also choose to skip validation
    *     completely, however this is **not recommended**. In addition to specifying
    *     validation type, providing `metadata.crc32c` or `metadata.md5Hash` will
    *     cause the server to perform validation in addition to client validation.
    *     NOTE: Validation is automatically skipped for objects that were
    *     uploaded using the `gzip` option and have already compressed content.
    */
  /**
    * Create a writable stream to overwrite the contents of the file in your
    * bucket.
    *
    * A File object can also be used to create files for the first time.
    *
    * Resumable uploads are automatically enabled and must be shut off explicitly
    * by setting `options.resumable` to `false`.
    *
    *
    * <p class="notice">
    *   There is some overhead when using a resumable upload that can cause
    *   noticeable performance degradation while uploading a series of small
    *   files. When uploading files less than 10MB, it is recommended that the
    *   resumable feature is disabled.
    * </p>
    *
    * NOTE: Writable streams will emit the `finish` event when the file is fully
    * uploaded.
    *
    * See {@link https://cloud.google.com/storage/docs/json_api/v1/how-tos/upload| Upload Options (Simple or Resumable)}
    * See {@link https://cloud.google.com/storage/docs/json_api/v1/objects/insert| Objects: insert API Documentation}
    *
    * @param {CreateWriteStreamOptions} [options] Configuration options.
    * @returns {WritableStream}
    *
    * @example
    * ```
    * const fs = require('fs');
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const myBucket = storage.bucket('my-bucket');
    *
    * const file = myBucket.file('my-file');
    *
    * //-
    * // <h4>Uploading a File</h4>
    * //
    * // Now, consider a case where we want to upload a file to your bucket. You
    * // have the option of using {@link Bucket#upload}, but that is just
    * // a convenience method which will do the following.
    * //-
    * fs.createReadStream('/Users/stephen/Photos/birthday-at-the-zoo/panda.jpg')
    *   .pipe(file.createWriteStream())
    *   .on('error', function(err) {})
    *   .on('finish', function() {
    *     // The file upload is complete.
    *   });
    *
    * //-
    * // <h4>Uploading a File with gzip compression</h4>
    * //-
    * fs.createReadStream('/Users/stephen/site/index.html')
    *   .pipe(file.createWriteStream({ gzip: true }))
    *   .on('error', function(err) {})
    *   .on('finish', function() {
    *     // The file upload is complete.
    *   });
    *
    * //-
    * // Downloading the file with `createReadStream` will automatically decode
    * // the file.
    * //-
    *
    * //-
    * // <h4>Uploading a File with Metadata</h4>
    * //
    * // One last case you may run into is when you want to upload a file to your
    * // bucket and set its metadata at the same time. Like above, you can use
    * // {@link Bucket#upload} to do this, which is just a wrapper around
    * // the following.
    * //-
    * fs.createReadStream('/Users/stephen/Photos/birthday-at-the-zoo/panda.jpg')
    *   .pipe(file.createWriteStream({
    *     metadata: {
    *       contentType: 'image/jpeg',
    *       metadata: {
    *         custom: 'metadata'
    *       }
    *     }
    *   }))
    *   .on('error', function(err) {})
    *   .on('finish', function() {
    *     // The file upload is complete.
    *   });
    * ```
    */
  def createWriteStream(): Writable = js.native
  def createWriteStream(options: CreateWriteStreamOptions): Writable = js.native
  
  def disableAutoRetryConditionallyIdempotent_(coreOpts: Any, methodType: AvailableServiceObjectMethods): Unit = js.native
  def disableAutoRetryConditionallyIdempotent_(
    coreOpts: Any,
    methodType: AvailableServiceObjectMethods,
    localPreconditionOptions: PreconditionOptions
  ): Unit = js.native
  
  def download(): js.Promise[DownloadResponse] = js.native
  def download(callback: DownloadCallback): Unit = js.native
  def download(options: DownloadOptions): js.Promise[DownloadResponse] = js.native
  def download(options: DownloadOptions, callback: DownloadCallback): Unit = js.native
  
  /* private */ var encryptionKey: Any = js.native
  
  /* private */ var encryptionKeyBase64: Any = js.native
  
  /* private */ var encryptionKeyHash: Any = js.native
  
  /* private */ var encryptionKeyInterceptor: Any = js.native
  
  def generateSignedPostPolicyV2(callback: GenerateSignedPostPolicyV2Callback): Unit = js.native
  def generateSignedPostPolicyV2(options: GenerateSignedPostPolicyV2Options): js.Promise[GenerateSignedPostPolicyV2Response] = js.native
  def generateSignedPostPolicyV2(options: GenerateSignedPostPolicyV2Options, callback: GenerateSignedPostPolicyV2Callback): Unit = js.native
  
  def generateSignedPostPolicyV4(callback: GenerateSignedPostPolicyV4Callback): Unit = js.native
  def generateSignedPostPolicyV4(options: GenerateSignedPostPolicyV4Options): js.Promise[GenerateSignedPostPolicyV4Response] = js.native
  def generateSignedPostPolicyV4(options: GenerateSignedPostPolicyV4Options, callback: GenerateSignedPostPolicyV4Callback): Unit = js.native
  
  var generation: js.UndefOr[Double] = js.native
  
  /* private */ var getBufferFromReadable: Any = js.native
  
  def getExpirationDate(): js.Promise[GetExpirationDateResponse] = js.native
  def getExpirationDate(callback: GetExpirationDateCallback): Unit = js.native
  
  def getSignedUrl(cfg: GetSignedUrlConfig): js.Promise[GetSignedUrlResponse] = js.native
  def getSignedUrl(cfg: GetSignedUrlConfig, callback: GetSignedUrlCallback): Unit = js.native
  
  var instancePreconditionOpts: js.UndefOr[PreconditionOptions] = js.native
  
  /* private */ var instanceRetryValue: Any = js.native
  
  def isPublic(): js.Promise[IsPublicResponse] = js.native
  def isPublic(callback: IsPublicCallback): Unit = js.native
  
  var kmsKeyName: js.UndefOr[String] = js.native
  
  def makePrivate(): js.Promise[MakeFilePrivateResponse] = js.native
  def makePrivate(callback: MakeFilePrivateCallback): Unit = js.native
  def makePrivate(options: MakeFilePrivateOptions): js.Promise[MakeFilePrivateResponse] = js.native
  def makePrivate(options: MakeFilePrivateOptions, callback: MakeFilePrivateCallback): Unit = js.native
  
  def makePublic(): js.Promise[MakeFilePublicResponse] = js.native
  def makePublic(callback: MakeFilePublicCallback): Unit = js.native
  
  def move(destination: String): js.Promise[MoveResponse] = js.native
  def move(destination: String, callback: MoveCallback): Unit = js.native
  def move(destination: String, options: MoveOptions): js.Promise[MoveResponse] = js.native
  def move(destination: String, options: MoveOptions, callback: MoveCallback): Unit = js.native
  def move(destination: Bucket): js.Promise[MoveResponse] = js.native
  def move(destination: Bucket, callback: MoveCallback): Unit = js.native
  def move(destination: Bucket, options: MoveOptions): js.Promise[MoveResponse] = js.native
  def move(destination: Bucket, options: MoveOptions, callback: MoveCallback): Unit = js.native
  def move(destination: File): js.Promise[MoveResponse] = js.native
  def move(destination: File, callback: MoveCallback): Unit = js.native
  def move(destination: File, options: MoveOptions): js.Promise[MoveResponse] = js.native
  def move(destination: File, options: MoveOptions, callback: MoveCallback): Unit = js.native
  
  var name: String = js.native
  
  @JSName("parent")
  var parent_File: Bucket = js.native
  
  /* private */ var `private`: Any = js.native
  
  /**
    * The public URL of this File
    * Use {@link File#makePublic} to enable anonymous access via the returned URL.
    *
    * @returns {string}
    *
    * @example
    * ```
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const bucket = storage.bucket('albums');
    * const file = bucket.file('my-file');
    *
    * // publicUrl will be "https://storage.googleapis.com/albums/my-file"
    * const publicUrl = file.publicUrl();
    * ```
    */
  def publicUrl(): String = js.native
  
  def rename(destinationFile: String): js.Promise[RenameResponse] = js.native
  def rename(destinationFile: String, callback: RenameCallback): Unit = js.native
  def rename(destinationFile: String, options: RenameOptions): js.Promise[RenameResponse] = js.native
  def rename(destinationFile: String, options: RenameOptions, callback: RenameCallback): Unit = js.native
  def rename(destinationFile: File): js.Promise[RenameResponse] = js.native
  def rename(destinationFile: File, callback: RenameCallback): Unit = js.native
  def rename(destinationFile: File, options: RenameOptions): js.Promise[RenameResponse] = js.native
  def rename(destinationFile: File, options: RenameOptions, callback: RenameCallback): Unit = js.native
  
  def rotateEncryptionKey(): js.Promise[RotateEncryptionKeyResponse] = js.native
  def rotateEncryptionKey(callback: RotateEncryptionKeyCallback): Unit = js.native
  def rotateEncryptionKey(options: RotateEncryptionKeyOptions): js.Promise[RotateEncryptionKeyResponse] = js.native
  def rotateEncryptionKey(options: RotateEncryptionKeyOptions, callback: RotateEncryptionKeyCallback): Unit = js.native
  
  def save(data: String): js.Promise[Unit] = js.native
  def save(data: String, callback: SaveCallback): Unit = js.native
  def save(data: String, options: SaveOptions): js.Promise[Unit] = js.native
  def save(data: String, options: SaveOptions, callback: SaveCallback): Unit = js.native
  def save(data: Buffer): js.Promise[Unit] = js.native
  def save(data: Buffer, callback: SaveCallback): Unit = js.native
  def save(data: Buffer, options: SaveOptions): js.Promise[Unit] = js.native
  def save(data: Buffer, options: SaveOptions, callback: SaveCallback): Unit = js.native
  
  /**
    * The Storage API allows you to use a custom key for server-side encryption.
    *
    * See {@link https://cloud.google.com/storage/docs/encryption#customer-supplied| Customer-supplied Encryption Keys}
    *
    * @param {string|buffer} encryptionKey An AES-256 encryption key.
    * @returns {File}
    *
    * @example
    * ```
    * const crypto = require('crypto');
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const myBucket = storage.bucket('my-bucket');
    *
    * const encryptionKey = crypto.randomBytes(32);
    *
    * const fileWithCustomEncryption = myBucket.file('my-file');
    * fileWithCustomEncryption.setEncryptionKey(encryptionKey);
    *
    * const fileWithoutCustomEncryption = myBucket.file('my-file');
    *
    * fileWithCustomEncryption.save('data', function(err) {
    *   // Try to download with the File object that hasn't had
    *   // `setEncryptionKey()` called:
    *   fileWithoutCustomEncryption.download(function(err) {
    *     // We will receive an error:
    *     //   err.message === 'Bad Request'
    *
    *     // Try again with the File object we called `setEncryptionKey()` on:
    *     fileWithCustomEncryption.download(function(err, contents) {
    *       // contents.toString() === 'data'
    *     });
    *   });
    * });
    *
    * ```
    * @example <caption>include:samples/encryption.js</caption>
    * region_tag:storage_upload_encrypted_file
    * Example of uploading an encrypted file:
    *
    * @example <caption>include:samples/encryption.js</caption>
    * region_tag:storage_download_encrypted_file
    * Example of downloading an encrypted file:
    */
  def setEncryptionKey(encryptionKey: String): this.type = js.native
  def setEncryptionKey(encryptionKey: Buffer): this.type = js.native
  
  def setStorageClass(storageClass: String): Unit = js.native
  def setStorageClass(storageClass: String, callback: SetStorageClassCallback): Unit = js.native
  def setStorageClass(storageClass: String, options: SetStorageClassOptions): js.Promise[SetStorageClassResponse] = js.native
  def setStorageClass(storageClass: String, options: SetStorageClassOptions, callback: SetStorageClassCallback): Unit = js.native
  @JSName("setStorageClass")
  def setStorageClass_Promise(storageClass: String): js.Promise[SetStorageClassResponse] = js.native
  
  /**
    * Set a user project to be billed for all requests made from this File
    * object.
    *
    * @param {string} userProject The user project.
    *
    * @example
    * ```
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const bucket = storage.bucket('albums');
    * const file = bucket.file('my-file');
    *
    * file.setUserProject('grape-spaceship-123');
    * ```
    */
  def setUserProject(userProject: String): Unit = js.native
  
  /**
    * A helper method for determining if a request should be retried based on preconditions.
    * This should only be used for methods where the idempotency is determined by
    * `ifGenerationMatch`
    * @private
    *
    * A request should not be retried under the following conditions:
    * - if precondition option `ifGenerationMatch` is not set OR
    * - if `idempotencyStrategy` is set to `RetryNever`
    */
  /* private */ var shouldRetryBasedOnPreconditionAndIdempotencyStrat: Any = js.native
  
  var signer: js.UndefOr[URLSigner] = js.native
  
  /**
    * This creates a resumable-upload upload stream.
    *
    * @param {Duplexify} stream - Duplexify stream of data to pipe to the file.
    * @param {object=} options - Configuration object.
    *
    * @private
    */
  def startResumableUpload_(dup: Duplexify, options: CreateResumableUploadOptions): Unit = js.native
  
  /**
    * Takes a readable stream and pipes it to a remote file. Unlike
    * `startResumableUpload_`, which uses the resumable upload technique, this
    * method uses a simple upload (all or nothing).
    *
    * @param {Duplexify} dup - Duplexify stream of data to pipe to the file.
    * @param {object=} options - Configuration object.
    *
    * @private
    */
  def startSimpleUpload_(dup: Duplexify): Unit = js.native
  def startSimpleUpload_(dup: Duplexify, options: CreateWriteStreamOptions): Unit = js.native
  
  var storage: Storage = js.native
  
  var userProject: js.UndefOr[String] = js.native
}
