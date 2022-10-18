package typings.firebaseAdmin

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAdmin.anon.AutomlModel
import typings.firebaseAdmin.anon.GcsTfliteUri
import typings.firebaseAdmin.anon.Published
import typings.firebaseAdmin.anon.SizeBytes
import typings.firebaseAdmin.anon.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMachineLearningMachineLearningApiClientMod {
  
  @JSImport("firebase-admin/lib/machine-learning/machine-learning-api-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isGcsTfliteModelOptions(options: ModelOptions): /* is firebase-admin.firebase-admin/lib/machine-learning/machine-learning-api-client.GcsTfliteModelOptions */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGcsTfliteModelOptions")(options.asInstanceOf[js.Any]).asInstanceOf[/* is firebase-admin.firebase-admin/lib/machine-learning/machine-learning-api-client.GcsTfliteModelOptions */ Boolean]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.firebaseAdmin.libMachineLearningMachineLearningApiClientMod.ModelOptions because Already inherited */ trait AutoMLTfliteModelOptions
    extends StObject
       with ModelOptionsBase {
    
    var tfliteModel: AutomlModel
  }
  object AutoMLTfliteModelOptions {
    
    inline def apply(tfliteModel: AutomlModel): AutoMLTfliteModelOptions = {
      val __obj = js.Dynamic.literal(tfliteModel = tfliteModel.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoMLTfliteModelOptions]
    }
    
    extension [Self <: AutoMLTfliteModelOptions](x: Self) {
      
      inline def setTfliteModel(value: AutomlModel): Self = StObject.set(x, "tfliteModel", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.firebaseAdmin.libMachineLearningMachineLearningApiClientMod.ModelOptions because Already inherited */ trait GcsTfliteModelOptions
    extends StObject
       with ModelOptionsBase {
    
    var tfliteModel: GcsTfliteUri
  }
  object GcsTfliteModelOptions {
    
    inline def apply(tfliteModel: GcsTfliteUri): GcsTfliteModelOptions = {
      val __obj = js.Dynamic.literal(tfliteModel = tfliteModel.asInstanceOf[js.Any])
      __obj.asInstanceOf[GcsTfliteModelOptions]
    }
    
    extension [Self <: GcsTfliteModelOptions](x: Self) {
      
      inline def setTfliteModel(value: GcsTfliteUri): Self = StObject.set(x, "tfliteModel", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListModelsOptions extends StObject {
    
    /**
      * An expression that specifies how to filter the results.
      *
      * Examples:
      *
      * ```
      * display_name = your_model
      * display_name : experimental_*
      * tags: face_detector AND tags: experimental
      * state.published = true
      * ```
      *
      * See https://firebase.google.com/docs/ml/manage-hosted-models#list_your_projects_models
      */
    var filter: js.UndefOr[String] = js.undefined
    
    /** The number of results to return in each page. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /** A token that specifies the result page to return. */
    var pageToken: js.UndefOr[String] = js.undefined
  }
  object ListModelsOptions {
    
    inline def apply(): ListModelsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListModelsOptions]
    }
    
    extension [Self <: ListModelsOptions](x: Self) {
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait ListModelsResponse extends StObject {
    
    val models: js.UndefOr[js.Array[ModelResponse]] = js.undefined
    
    val nextPageToken: js.UndefOr[String] = js.undefined
  }
  object ListModelsResponse {
    
    inline def apply(): ListModelsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListModelsResponse]
    }
    
    extension [Self <: ListModelsResponse](x: Self) {
      
      inline def setModels(value: js.Array[ModelResponse]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
      
      inline def setModelsUndefined: Self = StObject.set(x, "models", js.undefined)
      
      inline def setModelsVarargs(value: ModelResponse*): Self = StObject.set(x, "models", js.Array(value*))
      
      inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
      
      inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    }
  }
  
  trait ModelContent extends StObject {
    
    val displayName: js.UndefOr[String] = js.undefined
    
    val state: js.UndefOr[Published] = js.undefined
    
    val tags: js.UndefOr[js.Array[String]] = js.undefined
    
    val tfliteModel: js.UndefOr[SizeBytes] = js.undefined
  }
  object ModelContent {
    
    inline def apply(): ModelContent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelContent]
    }
    
    extension [Self <: ModelContent](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setState(value: Published): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
      
      inline def setTfliteModel(value: SizeBytes): Self = StObject.set(x, "tfliteModel", value.asInstanceOf[js.Any])
      
      inline def setTfliteModelUndefined: Self = StObject.set(x, "tfliteModel", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAdmin.libMachineLearningMachineLearningApiClientMod.ModelOptionsBase
    - typings.firebaseAdmin.libMachineLearningMachineLearningApiClientMod.GcsTfliteModelOptions
    - typings.firebaseAdmin.libMachineLearningMachineLearningApiClientMod.AutoMLTfliteModelOptions
  */
  trait ModelOptions extends StObject
  object ModelOptions {
    
    inline def AutoMLTfliteModelOptions(tfliteModel: AutomlModel): typings.firebaseAdmin.libMachineLearningMachineLearningApiClientMod.AutoMLTfliteModelOptions = {
      val __obj = js.Dynamic.literal(tfliteModel = tfliteModel.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firebaseAdmin.libMachineLearningMachineLearningApiClientMod.AutoMLTfliteModelOptions]
    }
    
    inline def GcsTfliteModelOptions(tfliteModel: GcsTfliteUri): typings.firebaseAdmin.libMachineLearningMachineLearningApiClientMod.GcsTfliteModelOptions = {
      val __obj = js.Dynamic.literal(tfliteModel = tfliteModel.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firebaseAdmin.libMachineLearningMachineLearningApiClientMod.GcsTfliteModelOptions]
    }
    
    inline def ModelOptionsBase(): typings.firebaseAdmin.libMachineLearningMachineLearningApiClientMod.ModelOptionsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.firebaseAdmin.libMachineLearningMachineLearningApiClientMod.ModelOptionsBase]
    }
  }
  
  trait ModelOptionsBase
    extends StObject
       with ModelOptions {
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ModelOptionsBase {
    
    inline def apply(): ModelOptionsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelOptionsBase]
    }
    
    extension [Self <: ModelOptionsBase](x: Self) {
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  trait ModelResponse
    extends StObject
       with ModelContent {
    
    val activeOperations: js.UndefOr[js.Array[OperationResponse]] = js.undefined
    
    val createTime: String
    
    val etag: String
    
    val modelHash: js.UndefOr[String] = js.undefined
    
    val name: String
    
    val updateTime: String
  }
  object ModelResponse {
    
    inline def apply(createTime: String, etag: String, name: String, updateTime: String): ModelResponse = {
      val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelResponse]
    }
    
    extension [Self <: ModelResponse](x: Self) {
      
      inline def setActiveOperations(value: js.Array[OperationResponse]): Self = StObject.set(x, "activeOperations", value.asInstanceOf[js.Any])
      
      inline def setActiveOperationsUndefined: Self = StObject.set(x, "activeOperations", js.undefined)
      
      inline def setActiveOperationsVarargs(value: OperationResponse*): Self = StObject.set(x, "activeOperations", js.Array(value*))
      
      inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
      
      inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setModelHash(value: String): Self = StObject.set(x, "modelHash", value.asInstanceOf[js.Any])
      
      inline def setModelHashUndefined: Self = StObject.set(x, "modelHash", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    }
  }
  
  type ModelUpdateOptions = ModelOptions & State
  
  trait OperationResponse extends StObject {
    
    val done: Boolean
    
    val error: js.UndefOr[StatusErrorResponse] = js.undefined
    
    val metadata: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    val name: js.UndefOr[String] = js.undefined
    
    val response: js.UndefOr[ModelResponse] = js.undefined
  }
  object OperationResponse {
    
    inline def apply(done: Boolean): OperationResponse = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
      __obj.asInstanceOf[OperationResponse]
    }
    
    extension [Self <: OperationResponse](x: Self) {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setError(value: StatusErrorResponse): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setResponse(value: ModelResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
    }
  }
  
  trait StatusErrorResponse extends StObject {
    
    val code: Double
    
    val message: String
  }
  object StatusErrorResponse {
    
    inline def apply(code: Double, message: String): StatusErrorResponse = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatusErrorResponse]
    }
    
    extension [Self <: StatusErrorResponse](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
