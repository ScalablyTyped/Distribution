package typings
package fineDashUploaderLib.libAzureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fine-uploader/lib/azure", "azure")
@js.native
object azureNs extends js.Object {
  trait AzureBlobPropertyOptions extends js.Object {
    /**
      * Describes the blob name used to identify the file in your Azure Blob Storage container.
      *
      * Possible values are
      * * `'uuid'`
      * * `'filename'`
      * * `function`
      *
      * If the value is a function, Fine Uploader Azure will pass the associated file ID as a parameter when invoking your function.
      * If the value is a function it may return one of a `qq.Promise` or a `String`
      *
      * @default `'uuid'`
      */
    var name: js.UndefOr[java.lang.String | AzureBlobPropertyNameFunction] = js.undefined
  }
  
  trait AzureChunkingOptions
    extends fineDashUploaderLib.libCoreMod.ChunkingOptions {
    /**
      * Files smaller than this value will not be chunked.
      *
      * @default `4000001`
      */
    var minFileSize: js.UndefOr[scala.Double] = js.undefined
    /**
      * The maximum size of each part, in bytes
      *
      * @default `5242880`
      */
    @JSName("partSize")
    var partSize_AzureChunkingOptions: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait AzureCoreOptions
    extends fineDashUploaderLib.libCoreMod.CoreOptions {
    /**
      * blobProperties
      */
    var blobProperties: js.UndefOr[AzureBlobPropertyOptions] = js.undefined
    /**
      * chunking options
      */
    @JSName("chunking")
    var chunking_AzureCoreOptions: js.UndefOr[AzureChunkingOptions] = js.undefined
    /**
      * cors options
      */
    @JSName("cors")
    var cors_AzureCoreOptions: js.UndefOr[AzureCorsOptions] = js.undefined
    /**
      * RequestOptions
      */
    @JSName("request")
    var request_AzureCoreOptions: js.UndefOr[AzureRequestOptions] = js.undefined
    /**
      * AzureSignatureOptions
      */
    var signature: js.UndefOr[AzureSignatureOptions] = js.undefined
    /**
      * AzureUploadSuccessOptions
      */
    var uploadSuccess: js.UndefOr[AzureUploadSuccessOptions] = js.undefined
  }
  
  trait AzureCorsOptions
    extends fineDashUploaderLib.libCoreMod.CorsOptions
  
  trait AzureFailedUploadTextDisplayOptions extends js.Object {
    /**
      * You will most likely want to keep this at the default value of 'custom'. See the UI options documentation for more info on this option.
      *
      * @default `'custom'`
      */
    var mode: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait AzureRequestOptions
    extends fineDashUploaderLib.libCoreMod.RequestOptions {
    /**
      * URL for your Azure Blob Storage container
      *
      * @default `null`
      */
    var containerUrl: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait AzureResumableFileObject
    extends fineDashUploaderLib.libCoreMod.ResumableFileObject {
    /**
      * The associated file's blob name in Azure Blob Storage
      */
    var key: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait AzureSignatureOptions extends js.Object {
    /**
      * Additional headers sent along with each signature request.
      *
      * If you declare a function as the value, the associated file's ID will be passed to your function when it is invoked
      *
      * @default `{}`
      */
    var customHeaders: js.UndefOr[js.Any | AzureCustomHeaderFunction] = js.undefined
    /**
      * The endpoint that Fine Uploader can use to send GET for a SAS before sending requests off to Azure.
      *
      * The blob URL and underlying method type associated with the underlying REST request will be included in the query string
      *
      * @default `null`
      */
    var endpoint: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /* RemoveMultipleInheritance: Dropped parents List(fineDashUploaderLib.libAzureMod.azureNs.AzureCoreOptions because Would inherit conflicting mutable fields List(autoUpload, blobs, button, callbacks, camera, chunking, cors, debug, deleteFile, disableCancelForFormUploads, extraButtons, form, formatFileName, maxConnections, messages, multiple, paste, request, resume, scaling, session, text, validation, warnBeforeUnload, workarounds))*/
  trait AzureUIOptions
    extends fineDashUploaderLib.fineDashUploaderMod.UIOptions {
    /**
      * chunking options
      */
    @JSName("chunking")
    var chunking_AzureUIOptions: js.UndefOr[AzureChunkingOptions] = js.undefined
    /**
      * cors options
      */
    @JSName("cors")
    var cors_AzureUIOptions: js.UndefOr[AzureCorsOptions] = js.undefined
    /**
      * failedUploadText options
      */
    @JSName("failedUploadTextDisplay")
    var failedUploadTextDisplay_AzureUIOptions: js.UndefOr[AzureFailedUploadTextDisplayOptions] = js.undefined
    /**
      * RequestOptions
      */
    @JSName("request")
    var request_AzureUIOptions: js.UndefOr[AzureRequestOptions] = js.undefined
  }
  
  trait AzureUploadSuccessOptions extends js.Object {
    /**
      * Additional headers sent along with each signature request
      *
      * @default `{}`
      */
    var customHeaders: js.UndefOr[js.Any] = js.undefined
    /**
      * An endpoint that Fine Uploader should POST to when a file has been successfully uploaded to Azure Blob Storage.
      *
      * @default `null`
      */
    var endpoint: js.UndefOr[java.lang.String] = js.undefined
    /**
      * The request method (i.e. POST/PUT)
      *
      * @default `POST`
      */
    var method: js.UndefOr[java.lang.String] = js.undefined
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
  
  @js.native
  /**
    * The FineUploader Azure Core + UI constructor
    */
  class FineUploader ()
    extends fineDashUploaderLib.fineDashUploaderMod.FineUploader {
    def this(fineuploaderOptions: AzureUIOptions) = this()
    /**
      * Retrieve the blob name with the associated ID
      *
      * @param number : An ID corresponding to a file
      * @returns string : The blob name associated with the file ID
      */
    def getBlobName(fileId: scala.Double): java.lang.String = js.native
    /**
      * Modify the endpoint that Fine Uploader should POST to when a file has been successfully uploaded to Azure Blob Storage.
      *
      * @param string endpoint : An endpoint that Fine Uploader should POST to when a file has been successfully uploaded to Azure Blob Storage
      * @param number id : An ID corresponding to a file
      */
    def setUploadSuccessEndpoint(endpoint: java.lang.String): scala.Unit = js.native
    def setUploadSuccessEndpoint(endpoint: java.lang.String, id: scala.Double): scala.Unit = js.native
    /**
      * Set additional parameters for the upload success request.
      * ###Note:
      * Fine Uploader will still send the `container URL`, `blob name`, `filename`, and `UUID` as well
      *
      * @param object newParams : The additional parameters set for the upload request
      * @param number id : A file id to apply these upload success parameters to
      */
    def setUploadSuccessParams(newParams: js.Any): scala.Unit = js.native
    def setUploadSuccessParams(newParams: js.Any, id: scala.Double): scala.Unit = js.native
  }
  
  @js.native
  /**
    * The FineUploader Azure Core only constructor
    */
  class FineUploaderBasic ()
    extends fineDashUploaderLib.libCoreMod.FineUploaderBasic {
    def this(fineuploaderOptions: AzureCoreOptions) = this()
    /**
      * Retrieve the blob name with the associated ID
      *
      * @param number : An ID corresponding to a file
      * @returns string : The blob name associated with the file ID
      */
    def getBlobName(fileId: scala.Double): java.lang.String = js.native
    /**
      * Modify the endpoint that Fine Uploader should POST to when a file has been successfully uploaded to Azure Blob Storage.
      *
      * @param string endpoint : An endpoint that Fine Uploader should POST to when a file has been successfully uploaded to Azure Blob Storage
      * @param number id : An ID corresponding to a file
      */
    def setUploadSuccessEndpoint(endpoint: java.lang.String): scala.Unit = js.native
    def setUploadSuccessEndpoint(endpoint: java.lang.String, id: scala.Double): scala.Unit = js.native
    /**
      * Set additional parameters for the upload success request.
      * ###Note:
      * Fine Uploader will still send the `container URL`, `blob name`, `filename`, and `UUID` as well
      *
      * @param object newParams : The additional parameters set for the upload request
      * @param number id : A file id to apply these upload success parameters to
      */
    def setUploadSuccessParams(newParams: js.Any): scala.Unit = js.native
    def setUploadSuccessParams(newParams: js.Any, id: scala.Double): scala.Unit = js.native
  }
  
  type AzureBlobPropertyNameFunction = js.Function1[
    /* id */ scala.Double, 
    fineDashUploaderLib.libCoreMod.PromiseOptions | java.lang.String
  ]
  type AzureCustomHeaderFunction = js.Function1[/* id */ scala.Double, scala.Unit]
}

