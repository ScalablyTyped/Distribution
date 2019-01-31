package typings
package atGoogleDashCloudStorageLib.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A File object is created from your {@link Bucket} object using
  * {@link Bucket#file}.
  *
  * @class
  */
@JSImport("@google-cloud/storage/build/src/file", "File")
@js.native
class File protected ()
  extends atGoogleDashCloudCommonLib.atGoogleDashCloudCommonMod.ServiceObject[File] {
  /**
    * @typedef {object} FileOptions Options passed to the File constructor.
    * @property {string} [encryptionKey] A custom encryption key.
    * @property {number} [generation] Generation to scope the file to.
    * @property {string} [kmsKeyName] Cloud KMS Key used to encrypt this
    *     object, if the object is encrypted by such a key. Limited availability;
    *     usable only by enabled projects.
    * @property {string} [userProject] The ID of the project which will be
    *     billed for all requests made from File object.
    */
  /**
    * Constructs a file object.
    *
    * @param {Bucket} bucket The Bucket instance this file is
    *     attached to.
    * @param {string} name The name of the remote file.
    * @param {FileOptions} [options] Configuration options.
    * @example
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const myBucket = storage.bucket('my-bucket');
    *
    * const file = myBucket.file('my-file');
    */
  def this(bucket: atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket, name: java.lang.String) = this()
  def this(bucket: atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket, name: java.lang.String, options: FileOptions) = this()
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
    * @see [About Access Control lists]{@link http://goo.gl/6qBBPO}
    *
    * @name File#acl
    * @mixes Acl
    *
    * @example
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
    */
  var acl: atGoogleDashCloudStorageLib.buildSrcAclMod.Acl = js.native
  var bucket: atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket = js.native
  var encryptionKey: js.UndefOr[js.Any] = js.native
  var encryptionKeyBase64: js.UndefOr[js.Any] = js.native
  var encryptionKeyHash: js.UndefOr[js.Any] = js.native
  var encryptionKeyInterceptor: js.UndefOr[js.Any] = js.native
  var generation: js.UndefOr[scala.Double] = js.native
  var kmsKeyName: js.UndefOr[java.lang.String] = js.native
  var name: java.lang.String = js.native
  @JSName("parent")
  var parent_File: atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket = js.native
  var storage: atGoogleDashCloudStorageLib.buildSrcStorageMod.Storage = js.native
  var userProject: js.UndefOr[java.lang.String] = js.native
  def copy(destination: atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket): js.Promise[CopyResponse] = js.native
  def copy(destination: atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket, callback: CopyCallback): scala.Unit = js.native
  def copy(
    destination: atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket,
    options: CopyOptions,
    callback: CopyCallback
  ): scala.Unit = js.native
  def copy(destination: File): js.Promise[CopyResponse] = js.native
  def copy(destination: File, callback: CopyCallback): scala.Unit = js.native
  def copy(destination: File, options: CopyOptions, callback: CopyCallback): scala.Unit = js.native
  def copy(destination: java.lang.String): js.Promise[CopyResponse] = js.native
  def copy(destination: java.lang.String, callback: CopyCallback): scala.Unit = js.native
  def copy(destination: java.lang.String, options: CopyOptions, callback: CopyCallback): scala.Unit = js.native
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
    * For faster crc32c computation, you must manually install
    * [`fast-crc32c`](http://www.gitnpm.com/fast-crc32c):
    *
    *     $ npm install --save fast-crc32c
    *
    * NOTE: Readable streams will emit the `end` event when the file is fully
    * downloaded.
    *
    * @param {CreateReadStreamOptions} [options] Configuration options.
    * @returns {ReadableStream}
    *
    * @example
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
    *     // Server connected and responded with the specified status and
    * headers.
    *    })
    *   .on('end', function() {
    *     // The file is fully downloaded.
    *   })
    *   .pipe(fs.createWriteStream(localFilename));
    *
    * //-
    * // To limit the downloaded data to only a byte range, pass an options
    * object.
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
    */
  def createReadStream(): nodeLib.streamMod.Readable = js.native
  def createReadStream(options: CreateReadStreamOptions): nodeLib.streamMod.Readable = js.native
  def createResumableUpload(): js.Promise[CreateResumableUploadResponse] = js.native
  def createResumableUpload(callback: CreateResumableUploadCallback): scala.Unit = js.native
  def createResumableUpload(options: CreateResumableUploadOptions): js.Promise[CreateResumableUploadResponse] = js.native
  def createResumableUpload(options: CreateResumableUploadOptions, callback: CreateResumableUploadCallback): scala.Unit = js.native
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
    *     [Objects: insert request
    * body](https://cloud.google.com/storage/docs/json_api/v1/objects/insert#request_properties_JSON)
    *     for more details.
    * @property {number} [offset] The starting byte of the upload stream, for
    *     resuming an interrupted upload. Defaults to 0.
    * @property {string} [predefinedAcl] Apply a predefined set of access
    *     controls to this object.
    *
    *     Acceptable values are:
    *     - **`authenticatedRead`** - Object owner gets `OWNER` access, and
    *       `allAuthenticatedUsers` get `READER` access.
    *
    *     - **`bucketOwnerFullControl`** - Object owner gets `OWNER` access, and
    *       project team owners get `OWNER` access.
    *
    *     - **`bucketOwnerRead`** - Object owner gets `OWNER` access, and project
    *       team owners get `READER` access.
    *
    *     - **`private`** - Object owner gets `OWNER` access.
    *
    *     - **`projectPrivate`** - Object owner gets `OWNER` access, and project
    *       team members get access according to their roles.
    *
    *     - **`publicRead`** - Object owner gets `OWNER` access, and `allUsers`
    * get `READER` access.
    * @property {boolean} [private] Make the uploaded file private. (Alias for
    *     `options.predefinedAcl = 'private'`)
    * @property {boolean} [public] Make the uploaded file public. (Alias for
    *     `options.predefinedAcl = 'publicRead'`)
    * @property {boolean} [resumable] Force a resumable upload. NOTE: When
    *     working with streams, the file format and size is unknown until it's
    *     completely consumed. Because of this, it's best for you to be explicit
    *     for what makes sense given your input.
    * @property {string} [uri] The URI for an already-created resumable
    *     upload. See {@link File#createResumableUpload}.
    * @property {string} [userProject] The ID of the project which will be
    *     billed for the request.
    * @property {string|boolean} [validation] Possible values: `"md5"`,
    *     `"crc32c"`, or `false`. By default, data integrity is validated with a
    *     CRC32c checksum. You may use MD5 if preferred, but that hash is not
    *     supported for composite objects. An error will be raised if MD5 is
    *     specified but is not available. You may also choose to skip validation
    *     completely, however this is **not recommended**.
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
    * Resumable uploads require write access to the $HOME directory. Through
    * [`config-store`](http://www.gitnpm.com/configstore), some metadata is
    * stored. By default, if the directory is not writable, we will fall back to
    * a simple upload. However, if you explicitly request a resumable upload, and
    * we cannot write to the config directory, we will return a
    * `ResumableUploadError`.
    *
    * <p class="notice">
    *   There is some overhead when using a resumable upload that can cause
    *   noticeable performance degradation while uploading a series of small
    * files. When uploading files less than 10MB, it is recommended that the
    * resumable feature is disabled.
    * </p>
    *
    * For faster crc32c computation, you must manually install
    * [`fast-crc32c`](http://www.gitnpm.com/fast-crc32c):
    *
    *     $ npm install --save fast-crc32c
    *
    * NOTE: Writable streams will emit the `finish` event when the file is fully
    * uploaded.
    *
    * @see [Upload Options (Simple or Resumable)]{@link https://cloud.google.com/storage/docs/json_api/v1/how-tos/upload}
    * @see [Objects: insert API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/objects/insert}
    *
    * @param {CreateWriteStreamOptions} [options] Configuration options.
    * @returns {WritableStream}
    *
    * @example
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
    */
  def createWriteStream(): nodeLib.streamMod.Writable = js.native
  def createWriteStream(options: CreateWriteStreamOptions): nodeLib.streamMod.Writable = js.native
  def download(): js.Promise[DownloadResponse] = js.native
  def download(callback: DownloadCallback): scala.Unit = js.native
  def download(options: DownloadOptions): js.Promise[DownloadResponse] = js.native
  def download(options: DownloadOptions, callback: DownloadCallback): scala.Unit = js.native
  def getExpirationDate(): js.Promise[GetExpirationDateResponse] = js.native
  def getExpirationDate(callback: GetExpirationDateCallback): scala.Unit = js.native
  def getSignedPolicy(callback: GetSignedPolicyCallback): scala.Unit = js.native
  def getSignedPolicy(options: GetSignedPolicyOptions): js.Promise[GetSignedPolicyResponse] = js.native
  def getSignedPolicy(options: GetSignedPolicyOptions, callback: GetSignedPolicyCallback): scala.Unit = js.native
  def getSignedUrl(cfg: GetSignedUrlConfig): js.Promise[GetSignedUrlResponse] = js.native
  def getSignedUrl(cfg: GetSignedUrlConfig, callback: GetSignedUrlCallback): scala.Unit = js.native
  def makePrivate(): js.Promise[MakeFilePrivateResponse] = js.native
  def makePrivate(callback: MakeFilePrivateCallback): scala.Unit = js.native
  def makePrivate(options: MakeFilePrivateOptions): js.Promise[MakeFilePrivateResponse] = js.native
  def makePrivate(options: MakeFilePrivateOptions, callback: MakeFilePrivateCallback): scala.Unit = js.native
  def makePublic(): js.Promise[MakeFilePublicResponse] = js.native
  def makePublic(callback: MakeFilePublicCallback): scala.Unit = js.native
  def move(destination: atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket): js.Promise[MoveResponse] = js.native
  def move(destination: atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket, callback: MoveCallback): scala.Unit = js.native
  def move(destination: atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket, options: MoveOptions): js.Promise[MoveResponse] = js.native
  def move(
    destination: atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket,
    options: MoveOptions,
    callback: MoveCallback
  ): scala.Unit = js.native
  def move(destination: File): js.Promise[MoveResponse] = js.native
  def move(destination: File, callback: MoveCallback): scala.Unit = js.native
  def move(destination: File, options: MoveOptions): js.Promise[MoveResponse] = js.native
  def move(destination: File, options: MoveOptions, callback: MoveCallback): scala.Unit = js.native
  def move(destination: java.lang.String): js.Promise[MoveResponse] = js.native
  def move(destination: java.lang.String, callback: MoveCallback): scala.Unit = js.native
  def move(destination: java.lang.String, options: MoveOptions): js.Promise[MoveResponse] = js.native
  def move(destination: java.lang.String, options: MoveOptions, callback: MoveCallback): scala.Unit = js.native
  def rotateEncryptionKey(): js.Promise[RotateEncryptionKeyResponse] = js.native
  def rotateEncryptionKey(callback: RotateEncryptionKeyCallback): scala.Unit = js.native
  def rotateEncryptionKey(options: RotateEncryptionKeyOptions): js.Promise[RotateEncryptionKeyResponse] = js.native
  def rotateEncryptionKey(options: RotateEncryptionKeyOptions, callback: RotateEncryptionKeyCallback): scala.Unit = js.native
  def save(data: js.Any): js.Promise[scala.Unit] = js.native
  def save(data: js.Any, callback: SaveCallback): scala.Unit = js.native
  def save(data: js.Any, options: SaveOptions): js.Promise[scala.Unit] = js.native
  def save(data: js.Any, options: SaveOptions, callback: SaveCallback): scala.Unit = js.native
  /**
    * The Storage API allows you to use a custom key for server-side encryption.
    *
    * @see [Customer-supplied Encryption Keys]{@link https://cloud.google.com/storage/docs/encryption#customer-supplied}
    *
    * @param {string|buffer} encryptionKey An AES-256 encryption key.
    * @returns {File}
    *
    * @example
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
    * @example <caption>include:samples/encryption.js</caption>
    * region_tag:storage_upload_encrypted_file
    * Example of uploading an encrypted file:
    *
    * @example <caption>include:samples/encryption.js</caption>
    * region_tag:storage_download_encrypted_file
    * Example of downloading an encrypted file:
    */
  def setEncryptionKey(encryptionKey: java.lang.String): this.type = js.native
  def setEncryptionKey(encryptionKey: nodeLib.Buffer): this.type = js.native
  def setStorageClass(storageClass: java.lang.String): js.Promise[SetStorageClassResponse] = js.native
  def setStorageClass(storageClass: java.lang.String, callback: SetStorageClassCallback): scala.Unit = js.native
  def setStorageClass(storageClass: java.lang.String, options: SetStorageClassOptions): js.Promise[SetStorageClassResponse] = js.native
  def setStorageClass(storageClass: java.lang.String, options: SetStorageClassOptions, callback: SetStorageClassCallback): scala.Unit = js.native
  @JSName("setStorageClass")
  def setStorageClass_Unit(storageClass: java.lang.String): scala.Unit = js.native
  /**
    * Set a user project to be billed for all requests made from this File
    * object.
    *
    * @param {string} userProject The user project.
    *
    * @example
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const bucket = storage.bucket('albums');
    * const file = bucket.file('my-file');
    *
    * file.setUserProject('grape-spaceship-123');
    */
  def setUserProject(userProject: java.lang.String): scala.Unit = js.native
  /**
    * This creates a gcs-resumable-upload upload stream.
    *
    * @see [gcs-resumable-upload]{@link https://github.com/stephenplusplus/gcs-resumable-upload}
    *
    * @param {Duplexify} stream - Duplexify stream of data to pipe to the file.
    * @param {object=} options - Configuration object.
    *
    * @private
    */
  def `startResumableUpload_`(dup: duplexifyLib.duplexifyMod.duplexifyNs.Duplexify, options: CreateResumableUploadOptions): scala.Unit = js.native
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
  def `startSimpleUpload_`(dup: duplexifyLib.duplexifyMod.duplexifyNs.Duplexify): scala.Unit = js.native
  def `startSimpleUpload_`(dup: duplexifyLib.duplexifyMod.duplexifyNs.Duplexify, options: CreateResumableUploadOptions): scala.Unit = js.native
}

