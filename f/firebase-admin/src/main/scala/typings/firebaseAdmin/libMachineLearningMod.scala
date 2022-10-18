package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMachineLearningMod {
  
  @JSImport("firebase-admin/lib/machine-learning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase-admin/lib/machine-learning", "MachineLearning")
  @js.native
  open class MachineLearning ()
    extends typings.firebaseAdmin.libMachineLearningMachineLearningMod.MachineLearning
  
  @JSImport("firebase-admin/lib/machine-learning", "Model")
  @js.native
  open class Model ()
    extends typings.firebaseAdmin.libMachineLearningMachineLearningMod.Model
  /* static members */
  object Model {
    
    @JSImport("firebase-admin/lib/machine-learning", "Model")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("firebase-admin/lib/machine-learning", "Model.validateAndClone")
    @js.native
    def validateAndClone: Any = js.native
    inline def validateAndClone_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateAndClone")(x.asInstanceOf[js.Any])
  }
  
  inline def getMachineLearning(): typings.firebaseAdmin.libMachineLearningMachineLearningMod.MachineLearning = ^.asInstanceOf[js.Dynamic].applyDynamic("getMachineLearning")().asInstanceOf[typings.firebaseAdmin.libMachineLearningMachineLearningMod.MachineLearning]
  inline def getMachineLearning(app: App): typings.firebaseAdmin.libMachineLearningMachineLearningMod.MachineLearning = ^.asInstanceOf[js.Dynamic].applyDynamic("getMachineLearning")(app.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseAdmin.libMachineLearningMachineLearningMod.MachineLearning]
}
