package typings.firebaseApp

import typings.firebaseAppTypes.mod.FirebaseNamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerCoreComponentsMod {
  
  @JSImport("@firebase/app/dist/packages/app/src/registerCoreComponents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def registerCoreComponents(firebase: FirebaseNamespace): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerCoreComponents")(firebase.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def registerCoreComponents(firebase: FirebaseNamespace, variant: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerCoreComponents")(firebase.asInstanceOf[js.Any], variant.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
