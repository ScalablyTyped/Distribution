package typings.fineUploader

import typings.fineUploader.coreMod.ChunkingOptions
import typings.fineUploader.coreMod.CoreOptions
import typings.fineUploader.coreMod.CorsOptions
import typings.fineUploader.coreMod.PromiseOptions
import typings.fineUploader.coreMod.RequestOptions
import typings.fineUploader.coreMod.ResumableFileObject
import typings.fineUploader.mod.UIOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object azureMod {
  
  object azure {
    
    @JSImport("fine-uploader/lib/azure", "azure.FineUploader")
    @js.native
    /**
      * The FineUploader Azure Core + UI constructor
      */
    class FineUploader ()
      extends typings.fineUploader.mod.FineUploader {
      def this(fineuploaderOptions: AzureUIOptions) = this()
      
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
    
    type AzureBlobPropertyNameFunction = js.Function1[/* id */ Double, PromiseOptions | String]
    
    @js.native
    trait AzureBlobPropertyOptions extends StObject {
      
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
      var name: js.UndefOr[String | AzureBlobPropertyNameFunction] = js.native
    }
    object AzureBlobPropertyOptions {
      
      @scala.inline
      def apply(): AzureBlobPropertyOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AzureBlobPropertyOptions]
      }
      
      @scala.inline
      implicit class AzureBlobPropertyOptionsMutableBuilder[Self <: AzureBlobPropertyOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setName(value: String | AzureBlobPropertyNameFunction): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameFunction1(value: /* id */ Double => PromiseOptions | String): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
    
    @js.native
    trait AzureChunkingOptions extends ChunkingOptions {
      
      /**
        * Files smaller than this value will not be chunked.
        *
        * @default `4000001`
        */
      var minFileSize: js.UndefOr[Double] = js.native
      
      /**
        * The maximum size of each part, in bytes
        *
        * @default `5242880`
        */
      @JSName("partSize")
      var partSize_AzureChunkingOptions: js.UndefOr[Double] = js.native
    }
    object AzureChunkingOptions {
      
      @scala.inline
      def apply(): AzureChunkingOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AzureChunkingOptions]
      }
      
      @scala.inline
      implicit class AzureChunkingOptionsMutableBuilder[Self <: AzureChunkingOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMinFileSize(value: Double): Self = StObject.set(x, "minFileSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinFileSizeUndefined: Self = StObject.set(x, "minFileSize", js.undefined)
        
        @scala.inline
        def setPartSize(value: Double): Self = StObject.set(x, "partSize", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPartSizeUndefined: Self = StObject.set(x, "partSize", js.undefined)
      }
    }
    
    @js.native
    trait AzureCoreOptions extends CoreOptions {
      
      /**
        * blobProperties
        */
      var blobProperties: js.UndefOr[AzureBlobPropertyOptions] = js.native
      
      /**
        * chunking options
        */
      @JSName("chunking")
      var chunking_AzureCoreOptions: js.UndefOr[AzureChunkingOptions] = js.native
      
      /**
        * cors options
        */
      @JSName("cors")
      var cors_AzureCoreOptions: js.UndefOr[AzureCorsOptions] = js.native
      
      /**
        * RequestOptions
        */
      @JSName("request")
      var request_AzureCoreOptions: js.UndefOr[AzureRequestOptions] = js.native
      
      /**
        * AzureSignatureOptions
        */
      var signature: js.UndefOr[AzureSignatureOptions] = js.native
      
      /**
        * AzureUploadSuccessOptions
        */
      var uploadSuccess: js.UndefOr[AzureUploadSuccessOptions] = js.native
    }
    object AzureCoreOptions {
      
      @scala.inline
      def apply(): AzureCoreOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AzureCoreOptions]
      }
      
      @scala.inline
      implicit class AzureCoreOptionsMutableBuilder[Self <: AzureCoreOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBlobProperties(value: AzureBlobPropertyOptions): Self = StObject.set(x, "blobProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlobPropertiesUndefined: Self = StObject.set(x, "blobProperties", js.undefined)
        
        @scala.inline
        def setChunking(value: AzureChunkingOptions): Self = StObject.set(x, "chunking", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChunkingUndefined: Self = StObject.set(x, "chunking", js.undefined)
        
        @scala.inline
        def setCors(value: AzureCorsOptions): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
        
        @scala.inline
        def setRequest(value: AzureRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
        
        @scala.inline
        def setSignature(value: AzureSignatureOptions): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
        
        @scala.inline
        def setUploadSuccess(value: AzureUploadSuccessOptions): Self = StObject.set(x, "uploadSuccess", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUploadSuccessUndefined: Self = StObject.set(x, "uploadSuccess", js.undefined)
      }
    }
    
    @js.native
    trait AzureCorsOptions extends CorsOptions
    object AzureCorsOptions {
      
      @scala.inline
      def apply(): AzureCorsOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AzureCorsOptions]
      }
    }
    
    type AzureCustomHeaderFunction = js.Function1[/* id */ Double, Unit]
    
    @js.native
    trait AzureFailedUploadTextDisplayOptions extends StObject {
      
      /**
        * You will most likely want to keep this at the default value of 'custom'. See the UI options documentation for more info on this option.
        *
        * @default `'custom'`
        */
      var mode: js.UndefOr[String] = js.native
    }
    object AzureFailedUploadTextDisplayOptions {
      
      @scala.inline
      def apply(): AzureFailedUploadTextDisplayOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AzureFailedUploadTextDisplayOptions]
      }
      
      @scala.inline
      implicit class AzureFailedUploadTextDisplayOptionsMutableBuilder[Self <: AzureFailedUploadTextDisplayOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      }
    }
    
    @js.native
    trait AzureRequestOptions extends RequestOptions {
      
      /**
        * URL for your Azure Blob Storage container
        *
        * @default `null`
        */
      var containerUrl: js.UndefOr[String] = js.native
    }
    object AzureRequestOptions {
      
      @scala.inline
      def apply(): AzureRequestOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AzureRequestOptions]
      }
      
      @scala.inline
      implicit class AzureRequestOptionsMutableBuilder[Self <: AzureRequestOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContainerUrl(value: String): Self = StObject.set(x, "containerUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContainerUrlUndefined: Self = StObject.set(x, "containerUrl", js.undefined)
      }
    }
    
    @js.native
    trait AzureResumableFileObject extends ResumableFileObject {
      
      /**
        * The associated file's blob name in Azure Blob Storage
        */
      var key: js.UndefOr[String] = js.native
    }
    object AzureResumableFileObject {
      
      @scala.inline
      def apply(): AzureResumableFileObject = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AzureResumableFileObject]
      }
      
      @scala.inline
      implicit class AzureResumableFileObjectMutableBuilder[Self <: AzureResumableFileObject] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      }
    }
    
    @js.native
    trait AzureSignatureOptions extends StObject {
      
      /**
        * Additional headers sent along with each signature request.
        *
        * If you declare a function as the value, the associated file's ID will be passed to your function when it is invoked
        *
        * @default `{}`
        */
      var customHeaders: js.UndefOr[js.Any | AzureCustomHeaderFunction] = js.native
      
      /**
        * The endpoint that Fine Uploader can use to send GET for a SAS before sending requests off to Azure.
        *
        * The blob URL and underlying method type associated with the underlying REST request will be included in the query string
        *
        * @default `null`
        */
      var endpoint: js.UndefOr[String] = js.native
    }
    object AzureSignatureOptions {
      
      @scala.inline
      def apply(): AzureSignatureOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AzureSignatureOptions]
      }
      
      @scala.inline
      implicit class AzureSignatureOptionsMutableBuilder[Self <: AzureSignatureOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCustomHeaders(value: js.Any | AzureCustomHeaderFunction): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomHeadersFunction1(value: /* id */ Double => Unit): Self = StObject.set(x, "customHeaders", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
        
        @scala.inline
        def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      }
    }
    
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.fineUploader.coreMod.CoreOptions because Already inherited
    - typings.fineUploader.azureMod.azure.AzureCoreOptions because var conflicts: autoUpload, blobs, button, callbacks, camera, chunking, cors, debug, deleteFile, disableCancelForFormUploads, extraButtons, form, formatFileName, maxConnections, messages, multiple, paste, request, resume, scaling, session, text, validation, warnBeforeUnload, workarounds. Inlined blobProperties, signature, uploadSuccess */ @js.native
    trait AzureUIOptions extends UIOptions {
      
      /**
        * blobProperties
        */
      var blobProperties: js.UndefOr[AzureBlobPropertyOptions] = js.native
      
      /**
        * chunking options
        */
      @JSName("chunking")
      var chunking_AzureUIOptions: js.UndefOr[AzureChunkingOptions] = js.native
      
      /**
        * cors options
        */
      @JSName("cors")
      var cors_AzureUIOptions: js.UndefOr[AzureCorsOptions] = js.native
      
      /**
        * failedUploadText options
        */
      @JSName("failedUploadTextDisplay")
      var failedUploadTextDisplay_AzureUIOptions: js.UndefOr[AzureFailedUploadTextDisplayOptions] = js.native
      
      /**
        * RequestOptions
        */
      @JSName("request")
      var request_AzureUIOptions: js.UndefOr[AzureRequestOptions] = js.native
      
      /**
        * AzureSignatureOptions
        */
      var signature: js.UndefOr[AzureSignatureOptions] = js.native
      
      /**
        * AzureUploadSuccessOptions
        */
      var uploadSuccess: js.UndefOr[AzureUploadSuccessOptions] = js.native
    }
    object AzureUIOptions {
      
      @scala.inline
      def apply(): AzureUIOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AzureUIOptions]
      }
      
      @scala.inline
      implicit class AzureUIOptionsMutableBuilder[Self <: AzureUIOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBlobProperties(value: AzureBlobPropertyOptions): Self = StObject.set(x, "blobProperties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBlobPropertiesUndefined: Self = StObject.set(x, "blobProperties", js.undefined)
        
        @scala.inline
        def setChunking(value: AzureChunkingOptions): Self = StObject.set(x, "chunking", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setChunkingUndefined: Self = StObject.set(x, "chunking", js.undefined)
        
        @scala.inline
        def setCors(value: AzureCorsOptions): Self = StObject.set(x, "cors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCorsUndefined: Self = StObject.set(x, "cors", js.undefined)
        
        @scala.inline
        def setFailedUploadTextDisplay(value: AzureFailedUploadTextDisplayOptions): Self = StObject.set(x, "failedUploadTextDisplay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFailedUploadTextDisplayUndefined: Self = StObject.set(x, "failedUploadTextDisplay", js.undefined)
        
        @scala.inline
        def setRequest(value: AzureRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
        
        @scala.inline
        def setSignature(value: AzureSignatureOptions): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
        
        @scala.inline
        def setUploadSuccess(value: AzureUploadSuccessOptions): Self = StObject.set(x, "uploadSuccess", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUploadSuccessUndefined: Self = StObject.set(x, "uploadSuccess", js.undefined)
      }
    }
    
    @js.native
    trait AzureUploadSuccessOptions extends StObject {
      
      /**
        * Additional headers sent along with each signature request
        *
        * @default `{}`
        */
      var customHeaders: js.UndefOr[js.Any] = js.native
      
      /**
        * An endpoint that Fine Uploader should POST to when a file has been successfully uploaded to Azure Blob Storage.
        *
        * @default `null`
        */
      var endpoint: js.UndefOr[String] = js.native
      
      /**
        * The request method (i.e. POST/PUT)
        *
        * @default `POST`
        */
      var method: js.UndefOr[String] = js.native
      
      /**
        * Any additional parameters to attach to upload success file requests.
        *
        * ###Note:
        * Fine Uploader will still send the `bucket`, `key`, `filename`, `UUID`, and `etag` (if available) as well
        *
        * @default `{}`
        */
      var params: js.UndefOr[js.Any] = js.native
    }
    object AzureUploadSuccessOptions {
      
      @scala.inline
      def apply(): AzureUploadSuccessOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AzureUploadSuccessOptions]
      }
      
      @scala.inline
      implicit class AzureUploadSuccessOptionsMutableBuilder[Self <: AzureUploadSuccessOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCustomHeaders(value: js.Any): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
        
        @scala.inline
        def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
        
        @scala.inline
        def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
        
        @scala.inline
        def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      }
    }
  }
}
