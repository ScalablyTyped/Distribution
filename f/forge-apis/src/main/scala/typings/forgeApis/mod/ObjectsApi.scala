package typings.forgeApis.mod

import typings.forgeApis.anon.Access
import typings.forgeApis.anon.BeginsWith
import typings.forgeApis.anon.ChunkSize
import typings.forgeApis.anon.ContentDisposition
import typings.forgeApis.anon.Data
import typings.forgeApis.anon.ETags
import typings.forgeApis.anon.FirstParts
import typings.forgeApis.anon.IfMatch
import typings.forgeApis.anon.IfNoneMatch
import typings.forgeApis.anon.MaxBatches
import typings.forgeApis.anon.MinutesExpiration
import typings.forgeApis.anon.PublicResourceFallback
import typings.forgeApis.anon.Range
import typings.forgeApis.anon.Requests
import typings.forgeApis.anon.RequestsArray
import typings.forgeApis.anon.ResponseType
import typings.forgeApis.anon.UseAcceleration
import typings.forgeApis.anon.With
import typings.forgeApis.anon.XAdsMetaCacheControl
import typings.forgeApis.anon.`1`
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forge-apis", "ObjectsApi")
@js.native
open class ObjectsApi () extends StObject {
  def this(apiClient: Any) = this()
  
  /**
    * Instructs OSS to complete the object creation process after the bytes have been uploaded directly to S3.
    * @param bucketKey bucket key (will be URL-encoded automatically)
    * @param objectKey object key (will be URL-encoded automatically)
    * @param body
    * @param body.uploadKey The identifier of the upload session, which was provided by OSS in the response to the Get Upload URL/s request.
    * @param body.size The expected size of the uploaded object. If provided, OSS will check this against the blob in S3 and return
    * an error if the size does not match.
    * @param body.eTags An array of eTags. S3 returns an eTag to each upload request, be it for a chunk or an entire file.
    * For a single-part upload, this array contains the expected eTag of the entire object. For a multipart upload, this array contains the expected
    * eTag of each part of the upload; the index of an eTag in the array corresponds to its part number in the upload. If provided, OSS will validate
    * these eTags against the content in S3, and return an error if the eTags do not match (indicating some form of data corruption).
    * @param opts Optional parameters
    * @param opts.xAdsMetaContentType (x-ads-meta-Content-Type) The Content-Type value that OSS will store in the record for the uploaded object.
    * @param opts.xAdsMetaContentDisposition (x-ads-meta-Content-Disposition) The Content-Disposition value that OSS will store in the record for the uploaded object.
    * @param opts.xAdsMetaContentEncoding (x-ads-meta-Content-Encoding) The Content-Encoding value that OSS will store in the record for the uploaded object.
    * @param opts.xAdsMetaCacheControl (x-ads-meta-Cache-Control) The Cache-Control value that OSS will store in the record for the uploaded object.
    * @param oauth2client oauth2client for the call
    * @param credentials credentials for the call
    * @remark https://forge.autodesk.com/en/docs/data/v2/reference/http/buckets-:bucketKey-objects-:objectKey-signeds3upload-POST/
    * @async
    */
  def completeS3Upload(
    bucketKey: String,
    objectKey: String,
    body: ETags,
    opts: XAdsMetaCacheControl,
    oauth2client: AuthClient,
    credentials: AuthToken
  ): js.Promise[Any] = js.native
  
  /**
    * Instructs OSS to complete the object creation process for numerous objects after their bytes have been uploaded directly to S3.
    * @param bucketKey bucket key (will be URL-encoded automatically)
    * @param body body parameter
    * @param body.requests An array of objects representing each request to get an S3 URL to download from.
    * @param body.requests[].objectKey The key/name of the object for which to complete an upload.
    * @param body.requests[].uploadKey The identifier of the upload session, which was provided by OSS in the response to the Get Upload URL/s request.
    * @param body.requests[].size The expected size of the uploaded object. If provided, OSS will check this against the blob in S3 and return
    * an error if the size does not match.
    * @param body.requests[].eTags An array of eTags. S3 returns an eTag to each upload request, be it for a chunk or an entire file.
    * For a single-part upload, this array contains the expected eTag of the entire object. For a multipart upload, this array contains the expected
    * eTag of each part of the upload; the index of an eTag in the array corresponds to its part number in the upload. If provided, OSS will validate
    * these eTags against the content in S3, and return an error if the eTags do not match (indicating some form of data corruption).
    * @param body.requests[].xAdsMetaContentType (x-ads-meta-Content-Type) The Content-Type value that OSS will store in the record for the uploaded object.
    * @param body.requests[].xAdsMetaContentDisposition (x-ads-meta-Content-Disposition) The Content-Disposition value that OSS will store in the record for the uploaded object.
    * @param body.requests[].xAdsMetaContentEncoding (x-ads-meta-Content-Encoding) The Content-Encoding value that OSS will store in the record for the uploaded object.
    * @param body.requests[].xAdsMetaCacheControl (x-ads-meta-Cache-Control) The Cache-Control value that OSS will store in the record for the uploaded object.
    * @param opts Optional parameters
    * @param oauth2client oauth2client for the call
    * @param credentials credentials for the call
    * @remark https://forge.autodesk.com/en/docs/data/v2/reference/http/buckets-:bucketKey-objects-:objectKey-batchcompleteupload-POST/
    * @async
    */
  def completeS3Uploads(bucketKey: String, body: `1`, oauth2client: AuthClient, credentials: AuthToken): js.Promise[Any] = js.native
  
  /**
    * Copies an object to another object name in the same bucket.
    */
  def copyTo(
    bucketKey: String,
    objectName: String,
    newObjName: String,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  /**
    * This endpoint creates a signed URL that can be used to download an object within the specified expiration time. Be aware that
    * if the object the signed URL points to is deleted or expires before the signed URL expires, then the signed URL will no longer
    * be valid. A successful call to this endpoint requires bucket owner access.
    */
  def createSignedResource(
    bucketKey: String,
    objectName: String,
    postBucketsSigned: PostBucketsSigned,
    opts: Access,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  /**
    * Deletes an object from the bucket.
    */
  def deleteObject(bucketKey: String, objectName: String, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  /**
    * Delete a signed URL. A successful call to this endpoint requires bucket owner access.
    */
  def deleteSignedResource(id: String, region: String): js.Promise[ApiResponse] = js.native
  
  /**
    * Download a resource.
    * @param bucketKey bucket key (will be URL-encoded automatically)
    * @param objects Object or Object array of resource to upload with their parameters
    * @param object[].objectKey object key
    * @param object[].responseType Resource to upload
    * If String, it is the expected response type (defaults to json) ['arraybuffer', 'document', 'json', 'text', 'stream']
    * If you 'stream', you need to provide a writable stream ('data'), the method will pipe content into it.
    * @param opts Optional parameters
    * @param [opts.publicResourceFallback=false] Allows fallback to OSS signed URLs in case of unmerged resumable uploads.
    * @param [opts.useCdn=true] Will generate a CloudFront URL for the S3 object.
    * @param [opts.minutesExpiration=2] The custom expiration time within the 1 to 60 minutes range, if not specified, default is 2 minutes.
    * @param opts.chunkSize Chunk size in Mb. Should not be below 5Mb. Default is 0, download file in one piece.
    * @param opts.onDownloadProgress (progressEvent) => {}
    * @param opts.onRefreshToken () => {}
    * @param oauth2client oauth2client for the call
    * @param credentials credentials for the call
    * @async
    */
  def downloadResources(
    bucketKey: String,
    objects: js.Array[ResponseType],
    opts: ChunkSize,
    oauth2client: AuthClient,
    credentials: AuthToken
  ): js.Promise[js.Array[DownloadedResource]] = js.native
  
  /**
    * @deprecated Use {@link getObjects} instead.
    * Download an object.
    */
  def getObject(
    bucketKey: String,
    objectName: String,
    opts: IfNoneMatch,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  /**
    * Returns object details in JSON format.
    */
  def getObjectDetails(
    bucketKey: String,
    objectName: String,
    opts: With,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  /**
    * List objects in a bucket. It is only available to the bucket creator.
    */
  def getObjects(bucketKey: String, opts: BeginsWith, oauth2Client: AuthClient, credentials: AuthToken): js.Promise[ApiResponse] = js.native
  
  // New S3 Stuff
  /**
    * Returns a signed S3 URL.
    * @param bucketKey bucket key (will be URL-encoded automatically)
    * @param objectKey bucobjectket key (will be URL-encoded automatically)
    * @param opts Optional parameters
    * @param opts.ifNoneMatch If the value of this header matches the ETag of the object, an entity will not be returned from the server;
    * instead a 304 (not modified) response will be returned without any message-body.
    * @param opts.ifModifiedSince If the requested object has not been modified since the time specified in this field,
    * an entity will not be returned from the server; instead, a 304 (not modified) response will be returned without any message-body.
    * @param opts.responseContentType Value of the Content-Type header that the client expects to receive.
    * If this attribute is not provided, it defaults to the value corresponding to the object.
    * @param opts.responseContentDisposition Value of the Content Disposition header the client expects to receive.
    * If this attribute is not provided, it defaults to the value corresponding to the object.
    * @param opts.responseCacheControl Value of the Cache-Control header that the client expects to receive.
    * If this attribute is not provided, it defaults to the value corresponding to the object.
    * @param [opts.publicResourceFallback=false] Allows fallback to OSS signed URLs in case of unmerged resumable uploads.
    * @param [opts.useCdn=true] Will generate a CloudFront URL for the S3 object.
    * @param [opts.minutesExpiration=2] The custom expiration time within the 1 to 60 minutes range, if not specified, default is 2 minutes.
    * data is of type: {module:model/ObjectS3Download}
    * @param oauth2client oauth2client for the call
    * @param credentials credentials for the call
    * @remark https://forge.autodesk.com/en/docs/data/v2/reference/http/buckets-:bucketKey-objects-:objectKey-signeds3download-GET/
    * @async
    */
  def getS3DownloadURL(
    bucketKey: String,
    objectKey: String,
    opts: MinutesExpiration,
    oauth2client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ObjectS3Download] = js.native
  
  /**
    * Gets one or more signed URLs to objects. The signed URLs can be used to download the objects directly from S3, skipping OSS servers.
    * Be aware that expiration time for the signed URL(s) is just 60 seconds. So, a request to the URL(s) must begin within 60 seconds; the transfer
    * of the data can exceed 60 seconds.
    * A successful call to this endpoint requires bucket owner access.
    * Note that resumable uploads store each chunk individually. After upload completes, an async process merges all the chunks and creates the
    * definitive OSS file. This async process can take time. If you request an S3 download URL before the async process completes, the response returns
    * a map of S3 URLs, one per chunk where the key is the corresponding range bytes. In case you don’t want multiple URLs in the response, you can use
    * OSS signed URL functionality, with the public-resource-fallback query parameter set to true.
    * Note: While this endpoint does not support range headers, the returned URL(s) can be used for ranged downloads. This way, downloads can be
    * parallelized using multiple ranges for maximum speed.
    * @param bucketKey bucket key (will be URL-encoded automatically)
    * @param body body parameter
    * @param body.requests An array of objects representing each request to get an S3 URL to download from.
    * @param body.requests[].objectKey Object name to create a download S3 signed URL for
    * @param body.requests[].response-content-type Value of the Content-Type header that the client expects to receive.
    * If this attribute is not provided, it defaults to the value corresponding to the object.
    * @param body.requests[].response-content-disposition Value of the Content Disposition header the client expects to receive.
    * If this attribute is not provided, it defaults to the value corresponding to the object.
    * @param body.requests[].response-cache-control Value of the Cache-Control header that the client expects to receive.
    * If this attribute is not provided, it defaults to the value corresponding to the object.
    * @param body.requests[].If-None-Match The value of this attribute is compared to the ETAG of the object.
    * If they match, the response body will show the status of this item as “skipped” with the reason as “Not modified”.
    * @param body.requests[].If-Modified-Since If the requested object has not been modified since the time specified in this attribute,
    * the response body will show the status of this item as “skipped” with the reason as “Not modified”.
    * @param opts Optional parameters
    * @param [opts.publicResourceFallback=false] (public-resource-fallback) Allows fallback to OSS signed URLs in case of unmerged resumable uploads.
    * @param [opts.useCdn=true] Will generate a CloudFront URL for the S3 object.
    * @param [opts.minutesExpiration=2] The custom expiration time within the 1 to 60 minutes range, if not specified, default is 2 minutes.
    * data is of type: {Object.<module:model/ObjectS3Download>}
    * @param oauth2client oauth2client for the call
    * @param credentials credentials for the call
    * @remark https://forge.autodesk.com/en/docs/data/v2/reference/http/buckets-:bucketKey-objects-batchsigneds3download-POST/
    * @async
    */
  def getS3DownloadURLs(
    bucketKey: String,
    body: Requests,
    opts: PublicResourceFallback,
    oauth2client: AuthClient,
    credentials: AuthToken
  ): js.Promise[Any] = js.native
  
  /**
    * Requests an S3 signed URL with which to upload an object, or an array of signed URLs with which to upload an object in multiple parts.
    * @param bucketKey bucket key (will be URL-encoded automatically)
    * @param objectKey object key (will be URL-encoded automatically)
    * @param opts Optional parameters
    * @param opts.uploadKey Get a new set of signed urls if the ones that were generated before have already expired and the user
    * still needs to upload some of them.
    * @param [opts.firstParts=1] For a multipart upload, is the starting index when getting upload part URL.
    * If this parameter is not specified the default value is firstPart = 1.
    * Example: To retrieve the parts from 10 to 15 you should pass firstPart = 10 and parts = 6, this will retrieve the parts 10, 11, 12, 13, 14 and 15.
    * @param [opts.parts=1] For a multipart upload, is the starting index when getting upload part URL.
    * If this parameter is not specified the default value is firstPart = 1.
    * Example: To retrieve the parts from 10 to 15 you should pass firstPart = 10 and parts = 6, this will retrieve the parts 10, 11, 12, 13, 14 and 15.
    * @param opts.useAcceleration Whether or not to generate an accelerated signed URL (ie: URLs of
    * the form …s3-accelerate.amazonaws.com… vs …s3.amazonaws.com…).
    * When not specified, defaults to true. Providing non-boolean values will result in a 400 error.
    * @param opts.minutesExpiration The custom expiration time within the 1 to 60 minutes range, if not specified, default is 2 minutes.
    * @param oauth2client oauth2client for the call
    * @param credentials credentials for the call
    * @remark https://forge.autodesk.com/en/docs/data/v2/reference/http/buckets-:bucketKey-objects-:objectKey-signeds3upload-GET/
    * @async
    */
  def getS3UploadURL(
    bucketKey: String,
    objectKey: String,
    opts: FirstParts,
    oauth2client: AuthClient,
    credentials: AuthToken
  ): js.Promise[Any] = js.native
  
  /**
    * Requests a batch of S3 signed URL with which to upload multiple objects or chunks of multiple objects.
    * @param bucketKey bucket key (will be URL-encoded automatically)
    * @param body body parameter
    * @param body.requests An array of objects representing each request to get an S3 URL to download from.
    * @param body.requests[].objectKey The key/name of the object for which to create an S3 upload URL. If neither the “part” nor “parts”
    * attribute is provided, OSS will return a single upload URL with which to upload the entire object.
    * @param body.requests[].uploadKey Get a new set of signed urls if the ones that were generated before have already expired and the user
    * still needs to upload some of them.
    * @param [body.requests[].firstParts=1] For a multipart upload, is the starting index when getting upload part URL.
    * If this parameter is not specified the default value is firstPart = 1.
    * Example: To retrieve the parts from 10 to 15 you should pass firstPart = 10 and parts = 6, this will retrieve the parts 10, 11, 12, 13, 14 and 15.
    * @param [body.requests[].parts=1] For a multipart upload, is the starting index when getting upload part URL.
    * If this parameter is not specified the default value is firstPart = 1.
    * Example: To retrieve the parts from 10 to 15 you should pass firstPart = 10 and parts = 6, this will retrieve the parts 10, 11, 12, 13, 14 and 15.
    * @param opts Optional parameters
    * @param [opts.useAcceleration=true] Whether or not to generate an accelerated signed URL (ie: URLs of
    * the form …s3-accelerate.amazonaws.com… vs …s3.amazonaws.com…).
    * When not specified, defaults to true. Providing non-boolean values will result in a 400 error.
    * @param [opts.minutesExpiration=2] The custom expiration time within the 1 to 60 minutes range, if not specified, default is 2 minutes.
    * @param oauth2client oauth2client for the call
    * @param credentials credentials for the call
    * @remark https://forge.autodesk.com/en/docs/data/v2/reference/http/buckets-:bucketKey-objects-:objectKey-batchsigneds3upload-POST/
    * @async
    */
  def getS3UploadURLs(
    bucketKey: String,
    body: RequestsArray,
    opts: UseAcceleration,
    oauth2client: AuthClient,
    credentials: AuthToken
  ): js.Promise[Any] = js.native
  
  /**
    * @deprecated Use {@link getS3DownloadURL} or {@link getS3UploadURL} instead.
    * Download an object using a signed URL.
    */
  def getSignedResource(id: String, opts: Range): js.Promise[ApiResponse] = js.native
  
  /**
    * This endpoint returns status information about a resumable upload.
    */
  def getStatusBySessionId(
    bucketKey: String,
    objectName: String,
    sessionId: String,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  /**
    * @deprecated use {@link ObjectS3Upload} instead
    * This endpoint allows resumable uploads for large files in chunks.
    */
  def uploadChunk(
    bucketKey: String,
    objectName: String,
    contentLength: Double,
    contentRange: String,
    sessionId: String,
    body: String,
    opts: ContentDisposition,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  def uploadChunk(
    bucketKey: String,
    objectName: String,
    contentLength: Double,
    contentRange: String,
    sessionId: String,
    body: Buffer,
    opts: ContentDisposition,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  /**
    * @deprecated use {@link ObjectS3Upload} instead
    * Upload an object. If the specified object name already exists in the bucket, the uploaded content will
    * overwrite the existing content for the bucket name/object name combination.
    */
  def uploadObject(
    bucketKey: String,
    objectName: String,
    contentLength: Double,
    body: String,
    opts: ContentDisposition,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  def uploadObject(
    bucketKey: String,
    objectName: String,
    contentLength: Double,
    body: Buffer,
    opts: ContentDisposition,
    oauth2Client: AuthClient,
    credentials: AuthToken
  ): js.Promise[ApiResponse] = js.native
  
  /**
    * Upload a resource. If the specified object name already exists in the bucket, the uploaded content will overwrite the existing content for the bucket name/object name combination.
    * @param bucketKey bucket key (will be URL-encoded automatically)
    * @param objects Object or Object array of resource to upload with their parameters
    * @param object[].objectKey object key
    * @param object[].data Resource to upload (String| Buffer | Stream)
    * @param object[].eTags An array of eTags. S3 returns an eTag to each upload request, be it for a chunk or an entire file.
    * For a single-part upload, this array contains the expected eTag of the entire object. For a multipart upload, this array contains the expected
    * eTag of each part of the upload; the index of an eTag in the array corresponds to its part number in the upload. If provided, OSS will validate
    * these eTags against the content in S3, and return an error if the eTags do not match (indicating some form of data corruption).
    * @param object[].xAdsMetaContentType (x-ads-meta-Content-Type) The Content-Type value that OSS will store in the record for the uploaded object.
    * @param object[].xAdsMetaContentDisposition (x-ads-meta-Content-Disposition) The Content-Disposition value that OSS will store in the record for the uploaded object.
    * @param object[].xAdsMetaContentEncoding (x-ads-meta-Content-Encoding) The Content-Encoding value that OSS will store in the record for the uploaded object.
    * @param object[].xAdsMetaCacheControl (x-ads-meta-Cache-Control) The Cache-Control value that OSS will store in the record for the uploaded object.
    * @param opts Optional parameters
    * @param chunkSize Chunk size in Mb. Should not be below 5Mb.
    * @param maxBatches Maximum batch to produces. Should not be above 25 or below 1.
    * @param opts.useAcceleration Whether or not to generate an accelerated signed URL (ie: URLs of the form …s3-accelerate.amazonaws.com… vs …s3.amazonaws.com…).
    * When not specified, defaults to true. Providing non-boolean values will result in a 400 error.
    * @param opts.minutesExpiration The custom expiration time within the 1 to 60 minutes range, if not specified, default is 2 minutes.
    * @param opts.onUploadProgress (progressEvent) => {}
    * @param opts.onRefreshToken () => {}
    * @param oauth2client oauth2client for the call
    * @param credentials credentials for the call
    * @async
    */
  def uploadResources(
    bucketKey: String,
    objects: js.Array[Data],
    opts: MaxBatches,
    oauth2client: AuthClient,
    credentials: AuthToken
  ): js.Promise[js.Array[UploadedResource]] = js.native
  
  /**
    * @deprecated use {@link ObjectS3Upload} instead
    * Overwrite a existing object using a signed URL. Conditions to call this operation: Object is available Expiration
    * period is valid Signed URL should be created with `write` or `readwrite`.
    */
  def uploadSignedResource(id: String, contentLength: Double, body: String, opts: IfMatch): js.Promise[ApiResponse] = js.native
  def uploadSignedResource(id: String, contentLength: Double, body: Buffer, opts: IfMatch): js.Promise[ApiResponse] = js.native
  
  /**
    * @deprecated use {@link ObjectS3Upload} instead
    * Resumable upload for signed URLs.
    */
  def uploadSignedResourcesChunk(id: String, contentRange: Double, sessionId: String, body: String, opts: IfMatch): js.Promise[ApiResponse] = js.native
  def uploadSignedResourcesChunk(id: String, contentRange: Double, sessionId: String, body: Buffer, opts: IfMatch): js.Promise[ApiResponse] = js.native
}
