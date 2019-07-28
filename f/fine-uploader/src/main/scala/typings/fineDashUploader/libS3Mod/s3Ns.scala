package typings.fineDashUploader.libS3Mod

import typings.fineDashUploader.fineDashUploaderMod.UIOptions
import typings.fineDashUploader.libCoreMod.ChunkingOptions
import typings.fineDashUploader.libCoreMod.CoreEvents
import typings.fineDashUploader.libCoreMod.CoreOptions
import typings.fineDashUploader.libCoreMod.CorsOptions
import typings.fineDashUploader.libCoreMod.PromiseOptions
import typings.fineDashUploader.libCoreMod.RequestOptions
import typings.fineDashUploader.libCoreMod.ResumableFileObject
import typings.fineDashUploader.libS3Mod.s3Ns.BucketFunction
import typings.fineDashUploader.libS3Mod.s3Ns.HostFunction
import typings.fineDashUploader.libS3Mod.s3Ns.KeyFunction
import typings.fineDashUploader.libS3Mod.s3Ns.OnCredentialsExpired
import typings.fineDashUploader.libS3Mod.s3Ns.S3ChunkingOptions
import typings.fineDashUploader.libS3Mod.s3Ns.S3CoreOptions
import typings.fineDashUploader.libS3Mod.s3Ns.S3CorsOptions
import typings.fineDashUploader.libS3Mod.s3Ns.S3CredentialsOptions
import typings.fineDashUploader.libS3Mod.s3Ns.S3CustomHeaderFunction
import typings.fineDashUploader.libS3Mod.s3Ns.S3FailedUploadTextDisplayOptions
import typings.fineDashUploader.libS3Mod.s3Ns.S3ObjectPropertyOptions
import typings.fineDashUploader.libS3Mod.s3Ns.S3RequestOptions
import typings.fineDashUploader.libS3Mod.s3Ns.S3SignatureOptions
import typings.fineDashUploader.libS3Mod.s3Ns.S3UIOptions
import typings.fineDashUploader.libS3Mod.s3Ns.S3UploadSuccessOptions
import typings.fineDashUploader.libS3Mod.s3Ns.S3iFrameSupportOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fine-uploader/lib/s3", "s3")
@js.native
object s3Ns extends js.Object {
  @js.native
  class FineUploader ()
    extends typings.fineDashUploader.fineDashUploaderMod.FineUploader {
    def this(fineuploaderOptions: S3UIOptions) = this()
    /**
      * Retrieve the S3 bucket name associated with the passed file (id). Note that the bucket name is not available before the file has started uploading
      *
      * @param number fileId : An ID corresponding to a file
      * @returns string : The S3 bucket name associated with the passed file (id)
      */
    def getBucket(fileId: Double): String = js.native
    /**
      * Retrieve the S3 object key associated with the passed file (id). Note that the key is not available before the file has started uploading.
      *
      * @param number fileId : An ID corresponding to a file
      * @returns string : The S3 object key associated with the passed file (id)
      */
    def getKey(fileId: Double): String = js.native
    /**
      * Set/update the ACL to be used for one or all file uploads. If the ID is omitted, the new ACL targets all future files that have not yet been uploaded
      *
      * @param any newAcl : Canned ACL value to be sent with the upload request. Used by S3
      * @param number id : File ID to target the ACL
      */
    def setAcl(newAcl: js.Any): Unit = js.native
    def setAcl(newAcl: js.Any, id: Double): Unit = js.native
    /**
      * Pass new or initial credentials. This is used to support the no-server workflow
      *
      * @param any newCredentials : The new or initial credentials to set for server-less uploads
      */
    def setCredentials(newCredentials: js.Any): Unit = js.native
    /**
      * Modify the endpoint that Fine Uploader should POST to when a file has been successfully uploaded to S3
      *
      * @param string endpoint : An endpoint that Fine Uploader should POST to when a file has been successfully uploaded to S3
      * @param number id : An ID corresponding to a file
      */
    def setUploadSuccessEndpoint(endpoint: String): Unit = js.native
    def setUploadSuccessEndpoint(endpoint: String, id: Double): Unit = js.native
    /**
      * Set additional parameters for the upload success request.
      *
      * ###Note:
      * Fine Uploader will still send the `bucket`, `name`, `key`, `filename`, `UUID`, and `etag` (if available) as well
      *
      * @param object newParams : The additional parameters set for the upload request
      * @param number id : A file id to apply these upload success parameters to
      */
    def setUploadSuccessParams(newParams: js.Any): Unit = js.native
    def setUploadSuccessParams(newParams: js.Any, id: Double): Unit = js.native
  }
  
  @js.native
  class FineUploaderBasic ()
    extends typings.fineDashUploader.libCoreMod.FineUploaderBasic {
    def this(fineuploaderOptions: S3CoreOptions) = this()
    /**
      * Retrieve the S3 bucket name associated with the passed file (id). Note that the bucket name is not available before the file has started uploading
      *
      * @param number fileId : An ID corresponding to a file
      * @returns string : The S3 bucket name associated with the passed file (id)
      */
    def getBucket(fileId: Double): String = js.native
    /**
      * Retrieve the S3 object key associated with the passed file (id). Note that the key is not available before the file has started uploading.
      *
      * @param number fileId : An ID corresponding to a file
      * @returns string : The S3 object key associated with the passed file (id)
      */
    def getKey(fileId: Double): String = js.native
    /**
      * Set/update the ACL to be used for one or all file uploads. If the ID is omitted, the new ACL targets all future files that have not yet been uploaded
      *
      * @param any newAcl : Canned ACL value to be sent with the upload request. Used by S3
      * @param number id : File ID to target the ACL
      */
    def setAcl(newAcl: js.Any): Unit = js.native
    def setAcl(newAcl: js.Any, id: Double): Unit = js.native
    /**
      * Pass new or initial credentials. This is used to support the no-server workflow
      *
      * @param any newCredentials : The new or initial credentials to set for server-less uploads
      */
    def setCredentials(newCredentials: js.Any): Unit = js.native
    /**
      * Modify the endpoint that Fine Uploader should POST to when a file has been successfully uploaded to S3
      *
      * @param string endpoint : An endpoint that Fine Uploader should POST to when a file has been successfully uploaded to S3
      * @param number id : An ID corresponding to a file
      */
    def setUploadSuccessEndpoint(endpoint: String): Unit = js.native
    def setUploadSuccessEndpoint(endpoint: String, id: Double): Unit = js.native
    /**
      * Set additional parameters for the upload success request.
      *
      * ###Note:
      * Fine Uploader will still send the `bucket`, `name`, `key`, `filename`, `UUID`, and `etag` (if available) as well
      *
      * @param object newParams : The additional parameters set for the upload request
      * @param number id : A file id to apply these upload success parameters to
      */
    def setUploadSuccessParams(newParams: js.Any): Unit = js.native
    def setUploadSuccessParams(newParams: js.Any, id: Double): Unit = js.native
  }
  
  trait S3ChunkingOptions extends ChunkingOptions {
    /**
      * The maximum size of each part, in bytes
      *
      * @default `5242880`
      */
    @JSName("partSize")
    var partSize_S3ChunkingOptions: js.UndefOr[Double] = js.undefined
  }
  
  trait S3CoreOptions extends CoreOptions {
    /**
      * chunking options
      */
    @JSName("chunking")
    var chunking_S3CoreOptions: js.UndefOr[S3ChunkingOptions] = js.undefined
    /**
      * cors options
      */
    @JSName("cors")
    var cors_S3CoreOptions: js.UndefOr[S3CorsOptions] = js.undefined
    /**
      * credentials
      */
    var credentials: js.UndefOr[S3CredentialsOptions] = js.undefined
    /**
      * iframeSupport options
      */
    var iframeSupport: js.UndefOr[S3iFrameSupportOptions] = js.undefined
    /**
      * objectProperties
      */
    var objectProperties: js.UndefOr[S3ObjectPropertyOptions] = js.undefined
    /**
      * request options
      */
    @JSName("request")
    var request_S3CoreOptions: js.UndefOr[S3RequestOptions] = js.undefined
    /**
      * signature options
      */
    var signature: js.UndefOr[S3SignatureOptions] = js.undefined
    /**
      * upload success options
      */
    var uploadSuccess: js.UndefOr[S3UploadSuccessOptions] = js.undefined
  }
  
  trait S3CorsOptions extends CorsOptions
  
  trait S3CredentialsOptions extends js.Object {
    /**
      * Temporary public AWS key
      *
      * @default `null`
      */
    var accessKey: js.UndefOr[String] = js.undefined
    /**
      * Expiration date for temporary credentials. May be an ISO 8601 String or a `Date` object.
      *
      * @default `null`
      */
    var expiration: js.UndefOr[String | Date] = js.undefined
    /**
      * Temporary secret AWS key
      *
      * @default `null`
      */
    var secretKey: js.UndefOr[String] = js.undefined
    /**
      * Session token associated with the temporary credentials
      *
      * @default `null`
      */
    var sessionToken: js.UndefOr[String] = js.undefined
  }
  
  trait S3Events extends CoreEvents {
    /**
      * Called before a request is sent to S3 if the temporary credentials have expired.
      *
      * You must return a promise. If your attempt to refresh the temporary credentials is successful, you must fulfill the promise via the success method, passing the new credentials object.
      * Otherwise, call failure with a descriptive reason.
      */
    var onCredentialsExpired: js.UndefOr[OnCredentialsExpired] = js.undefined
  }
  
  trait S3FailedUploadTextDisplayOptions extends js.Object {
    /**
      * You will most likely want to keep this at the default value of 'custom'. See the UI options documentation for more info on this option.
      *
      * @default `'custom'`
      */
    var mode: js.UndefOr[String] = js.undefined
  }
  
  trait S3ObjectPropertyOptions extends js.Object {
    /**
      * This value corresponds to a canned ACL
      *
      * @default `'private'`
      */
    var acl: js.UndefOr[String] = js.undefined
    /**
      * Describes the name of the bucket used to house the file in S3.
      *
      * This is required if the bucket cannot be determined by examining the endpoint (such as if you are using a CDN as an endpoint).
      * Possible values are a string representing the bucket name, or a function.
      *
      * If the value is a function, Fine Uploader S3 will pass the associated file ID as a parameter when invoking your function.
      * If the value is a function it may return a `promise` or a `String`
      *
      * @default `(assumes the bucket can be determined by parsing the endpoint string)`
      */
    var bucket: js.UndefOr[String | BucketFunction] = js.undefined
    /**
      * The hostname of your S3 bucket.
      *
      * This is required if you are using version 4 signatures and sending files through a CDN.
      * Possible values are a string representing the host name, or a function.
      *
      * If the value is a function, Fine Uploader S3 will pass the associated file ID as a parameter when invoking your function.
      * If the value is a function it may return a `promise` or a `String`.
      *
      * @default `(uses the request endpoint to determine the hostname)`
      */
    var host: js.UndefOr[String | HostFunction] = js.undefined
    /**
      * Describes the object key used to identify the file in your S3 bucket.
      *
      * Possible values are 'uuid', 'filename' or a function.
      *
      * If the value is a function, Fine Uploader S3 will pass the associated file ID as a parameter when invoking your function.
      * If the value is a function it may return one of a `promise` or a `String`.
      *
      * @default `'uuid'`
      */
    var key: js.UndefOr[String | KeyFunction] = js.undefined
    /**
      * Set this to true if you would like to use the reduced redundancy storage class for all objects uploaded to S3
      *
      * @default `false`
      */
    var reducedRedundancy: js.UndefOr[Boolean] = js.undefined
    /**
      * Version 4 signatures only: The S3 region identifier for the target bucket
      *
      * @default `'us-east-1'`
      */
    var region: js.UndefOr[String] = js.undefined
    /**
      * Set this to true if you would like all uploaded files to be encrypted by AWS
      *
      * @default `false`
      */
    var serverSideEncryption: js.UndefOr[Boolean] = js.undefined
  }
  
  trait S3RequestOptions extends RequestOptions {
    /**
      * Your AWS public key. NOT YOUR SECRET KEY. Ignored if `credentials` have been set
      *
      * @default `null`
      */
    var accessKey: js.UndefOr[String] = js.undefined
    /**
      * Number of milliseconds to add to the `x-amz-date` header and the policy expiration date to account for clock drift on the browser/client machine
      *
      * @default `0`
      */
    var clockDrift: js.UndefOr[Double] = js.undefined
  }
  
  trait S3ResumableFileObject extends ResumableFileObject {
    /**
      * The associated object's S3 key
      */
    var key: js.UndefOr[String] = js.undefined
  }
  
  trait S3SignatureOptions extends js.Object {
    /**
      * Additional headers sent along with each signature request.
      *
      * If you declare a function as the value, the associated file's ID will be passed to your function when it is invoked
      *
      * @default `{}`
      */
    var customHeaders: js.UndefOr[js.Any | S3CustomHeaderFunction] = js.undefined
    /**
      * The endpoint that Fine Uploader can use to send policy documents (HTML form uploads) or other strings to sign (REST requests) before sending requests off to S3
      *
      * @default `null`
      */
    var endpoint: js.UndefOr[String] = js.undefined
    /**
      * The AWS/S3 signature version to use. Currently supported values are `2` and `4`. Directly related to `objectProperties.region`
      *
      * @default `2`
      */
    var version: js.UndefOr[Double] = js.undefined
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.fineDashUploader.libS3Mod.s3Ns.S3CoreOptions because var conflicts: autoUpload, blobs, button, callbacks, camera, chunking, cors, debug, deleteFile, disableCancelForFormUploads, extraButtons, form, formatFileName, maxConnections, messages, multiple, paste, request, resume, scaling, session, text, validation, warnBeforeUnload, workarounds. Inlined credentials, iframeSupport, objectProperties, signature, uploadSuccess */ trait S3UIOptions extends UIOptions {
    /**
      * chunking options
      */
    @JSName("chunking")
    var chunking_S3UIOptions: js.UndefOr[S3ChunkingOptions] = js.undefined
    /**
      * cors options
      */
    @JSName("cors")
    var cors_S3UIOptions: js.UndefOr[S3CorsOptions] = js.undefined
    /**
      * credentials
      */
    var credentials: js.UndefOr[S3CredentialsOptions] = js.undefined
    /**
      * failedUploadText options
      */
    @JSName("failedUploadTextDisplay")
    var failedUploadTextDisplay_S3UIOptions: js.UndefOr[S3FailedUploadTextDisplayOptions] = js.undefined
    /**
      * iframeSupport options
      */
    var iframeSupport: js.UndefOr[S3iFrameSupportOptions] = js.undefined
    /**
      * objectProperties
      */
    var objectProperties: js.UndefOr[S3ObjectPropertyOptions] = js.undefined
    /**
      * request options
      */
    @JSName("request")
    var request_S3UIOptions: js.UndefOr[S3RequestOptions] = js.undefined
    /**
      * signature options
      */
    var signature: js.UndefOr[S3SignatureOptions] = js.undefined
    /**
      * upload success options
      */
    var uploadSuccess: js.UndefOr[S3UploadSuccessOptions] = js.undefined
  }
  
  trait S3UploadSuccessOptions extends js.Object {
    /**
      * Additional headers sent along with each signature request
      *
      * @default `{}`
      */
    var customHeaders: js.UndefOr[js.Any] = js.undefined
    /**
      * An endpoint that Fine Uploader should POST to when a file has been successfully uploaded to S3
      *
      * @default `null`
      */
    var endpoint: js.UndefOr[String] = js.undefined
    /**
      * The request method (i.e. POST/PUT)
      *
      * @default `POST`
      */
    var method: js.UndefOr[String] = js.undefined
    /**
      * Any additional parameters to attach to upload success file requests.
      *
      * ###Note:
      * Fine Uploader will still send the `bucket`, `key`, `filename`, `UUID`, and `etag` (if available) as well
      *
      * @default `{}`
      */
    var params: js.UndefOr[js.Any] = js.undefined
  }
  
  trait S3iFrameSupportOptions extends js.Object {
    /**
      * This is required if you plan on supporting browsers that do not implement the File API, such as IE9 and older.
      * This must point to a blank page on the same origin/domain as the page hosting Fine Uploader
      *
      * @default `null`
      */
    var localBlankPagePath: js.UndefOr[String] = js.undefined
  }
  
  type BucketFunction = js.Function1[/* id */ Double, PromiseOptions | String]
  type HostFunction = js.Function1[/* id */ Double, PromiseOptions | String]
  type KeyFunction = js.Function1[/* id */ Double, PromiseOptions | String]
  type OnCredentialsExpired = js.Function0[PromiseOptions]
  type S3CustomHeaderFunction = js.Function1[/* id */ Double, Unit]
}

