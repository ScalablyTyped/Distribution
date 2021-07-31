package typings.firebaseMessaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isConsoleMessageMod {
  
  @JSImport("@firebase/messaging/dist/helpers/is-console-message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isConsoleMessage(data: js.Any): /* is @firebase/messaging.@firebase/messaging/dist/interfaces/internal-message-payload.ConsoleMessageData */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConsoleMessage")(data.asInstanceOf[js.Any]).asInstanceOf[/* is @firebase/messaging.@firebase/messaging/dist/interfaces/internal-message-payload.ConsoleMessageData */ Boolean]
}
