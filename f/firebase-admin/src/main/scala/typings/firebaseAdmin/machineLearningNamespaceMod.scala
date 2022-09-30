package typings.firebaseAdmin

import typings.firebaseAdmin.coreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object machineLearningNamespaceMod {
  
  object machineLearning {
    
    inline def apply(): MachineLearning = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[MachineLearning]
    inline def apply(app: App): MachineLearning = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[MachineLearning]
    
    @JSImport("firebase-admin/lib/machine-learning/machine-learning-namespace", "machineLearning")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Type alias to {@link firebase-admin.machine-learning#AutoMLTfliteModelOptions}.
      */
    type AutoMLTfliteModelOptions = typings.firebaseAdmin.machineLearningApiClientMod.AutoMLTfliteModelOptions
    
    /**
      * Type alias to {@link firebase-admin.machine-learning#GcsTfliteModelOptions}.
      */
    type GcsTfliteModelOptions = typings.firebaseAdmin.machineLearningApiClientMod.GcsTfliteModelOptions
    
    /**
      * Type alias to {@link firebase-admin.machine-learning#ListModelsOptions}.
      */
    type ListModelsOptions = typings.firebaseAdmin.machineLearningApiClientMod.ListModelsOptions
    
    /**
      * Type alias to {@link firebase-admin.machine-learning#ListModelsResult}.
      */
    type ListModelsResult = typings.firebaseAdmin.machineLearningMachineLearningMod.ListModelsResult
    
    /**
      * Type alias to {@link firebase-admin.machine-learning#MachineLearning}.
      */
    type MachineLearning = typings.firebaseAdmin.machineLearningMachineLearningMod.MachineLearning
    
    /**
      * Type alias to {@link firebase-admin.machine-learning#Model}.
      */
    type Model = typings.firebaseAdmin.machineLearningMachineLearningMod.Model
    
    /**
      * Type alias to {@link firebase-admin.machine-learning#ModelOptions}.
      */
    type ModelOptions = typings.firebaseAdmin.machineLearningApiClientMod.ModelOptions
    
    /**
      * Type alias to {@link firebase-admin.machine-learning#ModelOptionsBase}.
      */
    type ModelOptionsBase = typings.firebaseAdmin.machineLearningApiClientMod.ModelOptionsBase
    
    /**
      * Type alias to {@link firebase-admin.machine-learning#TFLiteModel}.
      */
    type TFLiteModel = typings.firebaseAdmin.machineLearningMachineLearningMod.TFLiteModel
  }
}
