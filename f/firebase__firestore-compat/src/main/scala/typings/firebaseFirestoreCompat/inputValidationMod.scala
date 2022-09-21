package typings.firebaseFirestoreCompat

import typings.firebaseFirestoreTypes.mod.SetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputValidationMod {
  
  @JSImport("@firebase/firestore-compat/dist/src/util/input_validation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateSetOptions(methodName: String): SetOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("validateSetOptions")(methodName.asInstanceOf[js.Any]).asInstanceOf[SetOptions]
  inline def validateSetOptions(methodName: String, options: SetOptions): SetOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("validateSetOptions")(methodName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SetOptions]
}
