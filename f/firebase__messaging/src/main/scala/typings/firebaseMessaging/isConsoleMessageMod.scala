package typings.firebaseMessaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isConsoleMessageMod {
  
  @JSImport("@firebase/messaging/dist/esm/src/helpers/is-console-message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isConsoleMessage(data: Any): /* is @firebase/messaging.@firebase/messaging/dist/esm/src/interfaces/internal-message-payload.ConsoleMessageData */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConsoleMessage")(data.asInstanceOf[js.Any]).asInstanceOf[/* is @firebase/messaging.@firebase/messaging/dist/esm/src/interfaces/internal-message-payload.ConsoleMessageData */ Boolean]
}
