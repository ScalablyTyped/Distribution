package typings.googleCloudStorage

import typings.googleCloudStorage.anon.OmitUploadOptionsdestinat
import typings.googleCloudStorage.buildSrcBucketMod.Bucket
import typings.googleCloudStorage.buildSrcBucketMod.UploadResponse
import typings.googleCloudStorage.buildSrcFileMod.DownloadOptions
import typings.googleCloudStorage.buildSrcFileMod.DownloadResponse
import typings.googleCloudStorage.buildSrcFileMod.File
import typings.googleCloudStorage.googleCloudStorageBooleans.`false`
import typings.googleCloudStorage.googleCloudStorageStrings.crc32c
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTransferManagerMod {
  
  @JSImport("@google-cloud/storage/build/src/transfer-manager", "TransferManager")
  @js.native
  open class TransferManager protected () extends StObject {
    def this(bucket: Bucket) = this()
    
    var bucket: Bucket = js.native
    
    def downloadFileInChunks(fileOrName: String): js.Promise[Unit | DownloadResponse] = js.native
    def downloadFileInChunks(fileOrName: String, options: DownloadFileInChunksOptions): js.Promise[Unit | DownloadResponse] = js.native
    /**
      * @typedef {object} DownloadFileInChunksOptions
      * @property {number} [concurrencyLimit] The number of concurrently executing promises
      * to use when downloading the file.
      * @property {number} [chunkSizeBytes] The size in bytes of each chunk to be downloaded.
      * @property {string | boolean} [validation] Whether or not to perform a CRC32C validation check when download is complete.
      * @experimental
      */
    /**
      * Download a large file in chunks utilizing parallel download operations. This is a convenience method
      * that utilizes {@link File#download} to perform the download.
      *
      * @param {object} [file | string] {@link File} to download.
      * @param {DownloadFileInChunksOptions} [options] Configuration options.
      * @returns {Promise<DownloadResponse>}
      *
      * @example
      * ```
      * const {Storage} = require('@google-cloud/storage');
      * const storage = new Storage();
      * const bucket = storage.bucket('my-bucket');
      * const transferManager = new TransferManager(bucket);
      *
      * //-
      * // Download a large file in chunks utilizing parallel operations.
      * //-
      * const response = await transferManager.downloadLargeFile(bucket.file('large-file.txt');
      * // Your local directory now contains:
      * // - "large-file.txt" (with the contents from my-bucket.large-file.txt)
      * ```
      * @experimental
      */
    def downloadFileInChunks(fileOrName: File): js.Promise[Unit | DownloadResponse] = js.native
    def downloadFileInChunks(fileOrName: File, options: DownloadFileInChunksOptions): js.Promise[Unit | DownloadResponse] = js.native
    
    def downloadManyFiles(filesOrFolder: String): js.Promise[Unit | js.Array[DownloadResponse]] = js.native
    def downloadManyFiles(filesOrFolder: String, options: DownloadManyFilesOptions): js.Promise[Unit | js.Array[DownloadResponse]] = js.native
    /**
      * @typedef {object} DownloadManyFilesOptions
      * @property {number} [concurrencyLimit] The number of concurrently executing promises
      * to use when downloading the files.
      * @property {string} [prefix] A prefix to append to all of the downloaded files.
      * @property {string} [stripPrefix] A prefix to remove from all of the downloaded files.
      * @property {object} [passthroughOptions] {@link DownloadOptions} Options to be passed through
      * to each individual download operation.
      * @experimental
      */
    /**
      * Download multiple files in parallel to the local filesystem. This is a convenience method
      * that utilizes {@link File#download} to perform the download.
      *
      * @param {array | string} [filesOrFolder] An array of file name strings or file objects to be downloaded. If
      * a string is provided this will be treated as a GCS prefix and all files with that prefix will be downloaded.
      * @param {DownloadManyFilesOptions} [options] Configuration options.
      * @returns {Promise<DownloadResponse[]>}
      *
      * @example
      * ```
      * const {Storage} = require('@google-cloud/storage');
      * const storage = new Storage();
      * const bucket = storage.bucket('my-bucket');
      * const transferManager = new TransferManager(bucket);
      *
      * //-
      * // Download multiple files in parallel.
      * //-
      * const response = await transferManager.downloadManyFiles(['file1.txt', 'file2.txt']);
      * // The following files have been downloaded:
      * // - "file1.txt" (with the contents from my-bucket.file1.txt)
      * // - "file2.txt" (with the contents from my-bucket.file2.txt)
      * const response = await transferManager.downloadManyFiles([bucket.File('file1.txt'), bucket.File('file2.txt')]);
      * // The following files have been downloaded:
      * // - "file1.txt" (with the contents from my-bucket.file1.txt)
      * // - "file2.txt" (with the contents from my-bucket.file2.txt)
      * const response = await transferManager.downloadManyFiles('test-folder');
      * // All files with GCS prefix of 'test-folder' have been downloaded.
      * ```
      * @experimental
      */
    def downloadManyFiles(filesOrFolder: js.Array[File | String]): js.Promise[Unit | js.Array[DownloadResponse]] = js.native
    def downloadManyFiles(filesOrFolder: js.Array[File | String], options: DownloadManyFilesOptions): js.Promise[Unit | js.Array[DownloadResponse]] = js.native
    
    /* private */ var getPathsFromDirectory: Any = js.native
    
    def uploadManyFiles(filePathsOrDirectory: String): js.Promise[js.Array[UploadResponse]] = js.native
    def uploadManyFiles(filePathsOrDirectory: String, options: UploadManyFilesOptions): js.Promise[js.Array[UploadResponse]] = js.native
    /**
      * @typedef {object} UploadManyFilesOptions
      * @property {number} [concurrencyLimit] The number of concurrently executing promises
      * to use when uploading the files.
      * @property {boolean} [skipIfExists] Do not upload the file if it already exists in
      * the bucket. This will set the precondition ifGenerationMatch = 0.
      * @property {string} [prefix] A prefix to append to all of the uploaded files.
      * @property {object} [passthroughOptions] {@link UploadOptions} Options to be passed through
      * to each individual upload operation.
      * @experimental
      */
    /**
      * Upload multiple files in parallel to the bucket. This is a convenience method
      * that utilizes {@link Bucket#upload} to perform the upload.
      *
      * @param {array | string} [filePathsOrDirectory] An array of fully qualified paths to the files or a directory name.
      * If a directory name is provided, the directory will be recursively walked and all files will be added to the upload list.
      * to be uploaded to the bucket
      * @param {UploadManyFilesOptions} [options] Configuration options.
      * @returns {Promise<UploadResponse[]>}
      *
      * @example
      * ```
      * const {Storage} = require('@google-cloud/storage');
      * const storage = new Storage();
      * const bucket = storage.bucket('my-bucket');
      * const transferManager = new TransferManager(bucket);
      *
      * //-
      * // Upload multiple files in parallel.
      * //-
      * const response = await transferManager.uploadManyFiles(['/local/path/file1.txt, 'local/path/file2.txt']);
      * // Your bucket now contains:
      * // - "local/path/file1.txt" (with the contents of '/local/path/file1.txt')
      * // - "local/path/file2.txt" (with the contents of '/local/path/file2.txt')
      * const response = await transferManager.uploadManyFiles('/local/directory');
      * // Your bucket will now contain all files contained in '/local/directory' maintaining the subdirectory structure.
      * ```
      * @experimental
      */
    def uploadManyFiles(filePathsOrDirectory: js.Array[String]): js.Promise[js.Array[UploadResponse]] = js.native
    def uploadManyFiles(filePathsOrDirectory: js.Array[String], options: UploadManyFilesOptions): js.Promise[js.Array[UploadResponse]] = js.native
  }
  
  trait DownloadFileInChunksOptions extends StObject {
    
    var chunkSizeBytes: js.UndefOr[Double] = js.undefined
    
    var concurrencyLimit: js.UndefOr[Double] = js.undefined
    
    var destination: js.UndefOr[String] = js.undefined
    
    var validation: js.UndefOr[crc32c | `false`] = js.undefined
  }
  object DownloadFileInChunksOptions {
    
    inline def apply(): DownloadFileInChunksOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadFileInChunksOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DownloadFileInChunksOptions] (val x: Self) extends AnyVal {
      
      inline def setChunkSizeBytes(value: Double): Self = StObject.set(x, "chunkSizeBytes", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeBytesUndefined: Self = StObject.set(x, "chunkSizeBytes", js.undefined)
      
      inline def setConcurrencyLimit(value: Double): Self = StObject.set(x, "concurrencyLimit", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyLimitUndefined: Self = StObject.set(x, "concurrencyLimit", js.undefined)
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      inline def setValidation(value: crc32c | `false`): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
      
      inline def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
    }
  }
  
  trait DownloadManyFilesOptions extends StObject {
    
    var concurrencyLimit: js.UndefOr[Double] = js.undefined
    
    var passthroughOptions: js.UndefOr[DownloadOptions] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var stripPrefix: js.UndefOr[String] = js.undefined
  }
  object DownloadManyFilesOptions {
    
    inline def apply(): DownloadManyFilesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadManyFilesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DownloadManyFilesOptions] (val x: Self) extends AnyVal {
      
      inline def setConcurrencyLimit(value: Double): Self = StObject.set(x, "concurrencyLimit", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyLimitUndefined: Self = StObject.set(x, "concurrencyLimit", js.undefined)
      
      inline def setPassthroughOptions(value: DownloadOptions): Self = StObject.set(x, "passthroughOptions", value.asInstanceOf[js.Any])
      
      inline def setPassthroughOptionsUndefined: Self = StObject.set(x, "passthroughOptions", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setStripPrefix(value: String): Self = StObject.set(x, "stripPrefix", value.asInstanceOf[js.Any])
      
      inline def setStripPrefixUndefined: Self = StObject.set(x, "stripPrefix", js.undefined)
    }
  }
  
  trait UploadManyFilesOptions extends StObject {
    
    var concurrencyLimit: js.UndefOr[Double] = js.undefined
    
    var passthroughOptions: js.UndefOr[OmitUploadOptionsdestinat] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var skipIfExists: js.UndefOr[Boolean] = js.undefined
  }
  object UploadManyFilesOptions {
    
    inline def apply(): UploadManyFilesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadManyFilesOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UploadManyFilesOptions] (val x: Self) extends AnyVal {
      
      inline def setConcurrencyLimit(value: Double): Self = StObject.set(x, "concurrencyLimit", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyLimitUndefined: Self = StObject.set(x, "concurrencyLimit", js.undefined)
      
      inline def setPassthroughOptions(value: OmitUploadOptionsdestinat): Self = StObject.set(x, "passthroughOptions", value.asInstanceOf[js.Any])
      
      inline def setPassthroughOptionsUndefined: Self = StObject.set(x, "passthroughOptions", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSkipIfExists(value: Boolean): Self = StObject.set(x, "skipIfExists", value.asInstanceOf[js.Any])
      
      inline def setSkipIfExistsUndefined: Self = StObject.set(x, "skipIfExists", js.undefined)
    }
  }
}
