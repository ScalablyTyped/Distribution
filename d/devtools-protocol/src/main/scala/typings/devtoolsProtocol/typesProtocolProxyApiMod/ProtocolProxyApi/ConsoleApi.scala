package typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.messageAdded
import typings.devtoolsProtocol.mod.Protocol.Console.MessageAddedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsoleApi extends StObject {
  
  /**
    * Does nothing.
    */
  def clearMessages(): js.Promise[Unit]
  
  /**
    * Disables console domain, prevents further console messages from being reported to the client.
    */
  def disable(): js.Promise[Unit]
  
  /**
    * Enables console domain, sends the messages collected so far to the client by means of the
    * `messageAdded` notification.
    */
  def enable(): js.Promise[Unit]
  
  /**
    * Issued when new console message is added.
    */
  @JSName("on")
  def on_messageAdded(event: messageAdded, listener: js.Function1[/* params */ MessageAddedEvent, Unit]): Unit
}
object ConsoleApi {
  
  inline def apply(
    clearMessages: () => js.Promise[Unit],
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    on: (messageAdded, js.Function1[/* params */ MessageAddedEvent, Unit]) => Unit
  ): ConsoleApi = {
    val __obj = js.Dynamic.literal(clearMessages = js.Any.fromFunction0(clearMessages), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[ConsoleApi]
  }
  
  extension [Self <: ConsoleApi](x: Self) {
    
    inline def setClearMessages(value: () => js.Promise[Unit]): Self = StObject.set(x, "clearMessages", js.Any.fromFunction0(value))
    
    inline def setDisable(value: () => js.Promise[Unit]): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    inline def setEnable(value: () => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setOn(value: (messageAdded, js.Function1[/* params */ MessageAddedEvent, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
  }
}
