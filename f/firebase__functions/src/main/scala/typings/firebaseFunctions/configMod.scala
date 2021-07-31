package typings.firebaseFunctions

import typings.firebaseAppTypes.privateMod.FirebaseNamespace
import typings.firebaseFunctions.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  @JSImport("@firebase/functions/dist/src/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def registerFunctions(instance: FirebaseNamespace, fetchImpl: FnCall): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFunctions")(instance.asInstanceOf[js.Any], fetchImpl.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
