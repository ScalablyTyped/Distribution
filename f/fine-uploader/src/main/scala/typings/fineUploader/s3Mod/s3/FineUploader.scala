package typings.fineUploader.s3Mod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fine-uploader/lib/s3", "s3.FineUploader")
@js.native
class FineUploader ()
  extends typings.fineUploader.mod.FineUploader {
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
