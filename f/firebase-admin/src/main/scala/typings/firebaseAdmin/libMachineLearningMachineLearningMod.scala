package typings.firebaseAdmin

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAdmin.libAppCoreMod.App
import typings.firebaseAdmin.libMachineLearningMachineLearningApiClientMod.ListModelsOptions
import typings.firebaseAdmin.libMachineLearningMachineLearningApiClientMod.ModelOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMachineLearningMachineLearningMod {
  
  @JSImport("firebase-admin/lib/machine-learning/machine-learning", "MachineLearning")
  @js.native
  open class MachineLearning () extends StObject {
    
    /**
      *  The {@link firebase-admin.app#App} associated with the current `MachineLearning`
      *  service instance.
      */
    def app: App = js.native
    
    /* private */ val appInternal: Any = js.native
    
    /* private */ val client: Any = js.native
    
    /**
      * Creates a model in the current Firebase project.
      *
      * @param model - The model to create.
      *
      * @returns A Promise fulfilled with the created model.
      */
    def createModel(model: ModelOptions): js.Promise[Model] = js.native
    
    /**
      * Deletes a model from the current project.
      *
      * @param modelId - The ID of the model to delete.
      */
    def deleteModel(modelId: String): js.Promise[Unit] = js.native
    
    /**
      * Gets the model specified by the given ID.
      *
      * @param modelId - The ID of the model to get.
      *
      * @returns A Promise fulfilled with the model object.
      */
    def getModel(modelId: String): js.Promise[Model] = js.native
    
    /**
      * Lists the current project's models.
      *
      * @param options - The listing options.
      *
      * @returns A promise that
      *     resolves with the current (filtered) list of models and the next page
      *     token. For the last page, an empty list of models and no page token
      *     are returned.
      */
    def listModels(): js.Promise[ListModelsResult] = js.native
    def listModels(options: ListModelsOptions): js.Promise[ListModelsResult] = js.native
    
    /**
      * Publishes a Firebase ML model.
      *
      * A published model can be downloaded to client apps.
      *
      * @param modelId - The ID of the model to publish.
      *
      * @returns A Promise fulfilled with the published model.
      */
    def publishModel(modelId: String): js.Promise[Model] = js.native
    
    /* private */ var setPublishStatus: Any = js.native
    
    /* private */ var signUrl: Any = js.native
    
    /* private */ var signUrlIfPresent: Any = js.native
    
    /**
      * Unpublishes a Firebase ML model.
      *
      * @param modelId - The ID of the model to unpublish.
      *
      * @returns A Promise fulfilled with the unpublished model.
      */
    def unpublishModel(modelId: String): js.Promise[Model] = js.native
    
    /**
      * Updates a model's metadata or model file.
      *
      * @param modelId - The ID of the model to update.
      * @param model - The model fields to update.
      *
      * @returns A Promise fulfilled with the updated model.
      */
    def updateModel(modelId: String, model: ModelOptions): js.Promise[Model] = js.native
  }
  
  @JSImport("firebase-admin/lib/machine-learning/machine-learning", "Model")
  @js.native
  open class Model () extends StObject {
    
    /* private */ val client: Any = js.native
    
    /** The timestamp of the model's creation. */
    def createTime: String = js.native
    
    /**
      * The model's name. This is the name you use from your app to load the
      * model.
      */
    def displayName: String = js.native
    
    /**
      * The ETag identifier of the current version of the model. This value
      * changes whenever you update any of the model's properties.
      */
    def etag: String = js.native
    
    /**
      * True if the model is locked by a server-side operation. You can't make
      * changes to a locked model. See {@link Model.waitForUnlocked}.
      */
    def locked: Boolean = js.native
    
    /* private */ var model: Any = js.native
    
    /**
      * The hash of the model's `tflite` file. This value changes only when
      * you upload a new TensorFlow Lite model.
      */
    def modelHash: js.UndefOr[String] = js.native
    
    /** The ID of the model. */
    def modelId: String = js.native
    
    /** True if the model is published. */
    def published: Boolean = js.native
    
    /**
      * The model's tags, which can be used to group or filter models in list
      * operations.
      */
    def tags: js.Array[String] = js.native
    
    /** Metadata about the model's TensorFlow Lite model file. */
    def tfliteModel: js.UndefOr[TFLiteModel] = js.native
    
    /**
      * Return the model as a JSON object.
      */
    def toJSON(): StringDictionary[Any] = js.native
    
    /** The timestamp of the model's most recent update. */
    def updateTime: String = js.native
    
    /** Error message when model validation fails. */
    def validationError: js.UndefOr[String] = js.native
    
    /**
      * Wait for the model to be unlocked.
      *
      * @param maxTimeMillis - The maximum time in milliseconds to wait.
      *     If not specified, a default maximum of 2 minutes is used.
      *
      * @returns A promise that resolves when the model is unlocked
      *   or the maximum wait time has passed.
      */
    def waitForUnlocked(): js.Promise[Unit] = js.native
    def waitForUnlocked(maxTimeMillis: Double): js.Promise[Unit] = js.native
  }
  /* static members */
  object Model {
    
    @JSImport("firebase-admin/lib/machine-learning/machine-learning", "Model")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("firebase-admin/lib/machine-learning/machine-learning", "Model.validateAndClone")
    @js.native
    def validateAndClone: Any = js.native
    inline def validateAndClone_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateAndClone")(x.asInstanceOf[js.Any])
  }
  
  trait ListModelsResult extends StObject {
    
    /** A list of models in your project. */
    val models: js.Array[Model]
    
    /**
      * A token you can use to retrieve the next page of results. If null, the
      * current page is the final page.
      */
    val pageToken: js.UndefOr[String] = js.undefined
  }
  object ListModelsResult {
    
    inline def apply(models: js.Array[Model]): ListModelsResult = {
      val __obj = js.Dynamic.literal(models = models.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListModelsResult]
    }
    
    extension [Self <: ListModelsResult](x: Self) {
      
      inline def setModels(value: js.Array[Model]): Self = StObject.set(x, "models", value.asInstanceOf[js.Any])
      
      inline def setModelsVarargs(value: Model*): Self = StObject.set(x, "models", js.Array(value*))
      
      inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    }
  }
  
  trait TFLiteModel extends StObject {
    
    /**
      * The AutoML model reference from which the model was originally provided
      * to Firebase.
      */
    val automlModel: js.UndefOr[String] = js.undefined
    
    /** The URI from which the model was originally provided to Firebase. */
    val gcsTfliteUri: js.UndefOr[String] = js.undefined
    
    /** The size of the model. */
    val sizeBytes: Double
  }
  object TFLiteModel {
    
    inline def apply(sizeBytes: Double): TFLiteModel = {
      val __obj = js.Dynamic.literal(sizeBytes = sizeBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[TFLiteModel]
    }
    
    extension [Self <: TFLiteModel](x: Self) {
      
      inline def setAutomlModel(value: String): Self = StObject.set(x, "automlModel", value.asInstanceOf[js.Any])
      
      inline def setAutomlModelUndefined: Self = StObject.set(x, "automlModel", js.undefined)
      
      inline def setGcsTfliteUri(value: String): Self = StObject.set(x, "gcsTfliteUri", value.asInstanceOf[js.Any])
      
      inline def setGcsTfliteUriUndefined: Self = StObject.set(x, "gcsTfliteUri", js.undefined)
      
      inline def setSizeBytes(value: Double): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    }
  }
}
