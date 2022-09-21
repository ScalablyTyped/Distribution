package typings.firebaseMessaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object registerMod {
  
  @JSImport("@firebase/messaging/dist/esm/src/helpers/register", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerMessagingInSw(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerMessagingInSw")().asInstanceOf[Unit]
  
  inline def registerMessagingInWindow(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerMessagingInWindow")().asInstanceOf[Unit]
}
