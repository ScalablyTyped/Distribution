package typings.fineUploader.azureMod.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fine-uploader/lib/azure", "azure.FineUploaderBasic")
@js.native
/**
  * The FineUploader Azure Core only constructor
  */
class FineUploaderBasic ()
  extends typings.fineUploader.coreMod.FineUploaderBasic {
  def this(fineuploaderOptions: AzureCoreOptions) = this()
  
  /**
    * Retrieve the blob name with the associated ID
    *
    * @param number : An ID corresponding to a file
    * @returns string : The blob name associated with the file ID
    */
  def getBlobName(fileId: Double): String = js.native
  
  /**
    * Modify the endpoint that Fine Uploader should POST to when a file has been successfully uploaded to Azure Blob Storage.
    *
    * @param string endpoint : An endpoint that Fine Uploader should POST to when a file has been successfully uploaded to Azure Blob Storage
    * @param number id : An ID corresponding to a file
    */
  def setUploadSuccessEndpoint(endpoint: String): Unit = js.native
  def setUploadSuccessEndpoint(endpoint: String, id: Double): Unit = js.native
  
  /**
    * Set additional parameters for the upload success request.
    * ###Note:
    * Fine Uploader will still send the `container URL`, `blob name`, `filename`, and `UUID` as well
    *
    * @param object newParams : The additional parameters set for the upload request
    * @param number id : A file id to apply these upload success parameters to
    */
  def setUploadSuccessParams(newParams: js.Any): Unit = js.native
  def setUploadSuccessParams(newParams: js.Any, id: Double): Unit = js.native
}
