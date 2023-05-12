package typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.deviceRequestPrompted
import typings.devtoolsProtocol.mod.Protocol.DeviceAccess.CancelPromptRequest
import typings.devtoolsProtocol.mod.Protocol.DeviceAccess.DeviceRequestPromptedEvent
import typings.devtoolsProtocol.mod.Protocol.DeviceAccess.SelectPromptRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceAccessApi extends StObject {
  
  /**
    * Cancel a prompt in response to a DeviceAccess.deviceRequestPrompted event.
    */
  def cancelPrompt(params: CancelPromptRequest): js.Promise[Unit]
  
  /**
    * Disable events in this domain.
    */
  def disable(): js.Promise[Unit]
  
  /**
    * Enable events in this domain.
    */
  def enable(): js.Promise[Unit]
  
  /**
    * A device request opened a user prompt to select a device. Respond with the
    * selectPrompt or cancelPrompt command.
    */
  @JSName("on")
  def on_deviceRequestPrompted(
    event: deviceRequestPrompted,
    listener: js.Function1[/* params */ DeviceRequestPromptedEvent, Unit]
  ): Unit
  
  /**
    * Select a device in response to a DeviceAccess.deviceRequestPrompted event.
    */
  def selectPrompt(params: SelectPromptRequest): js.Promise[Unit]
}
object DeviceAccessApi {
  
  inline def apply(
    cancelPrompt: CancelPromptRequest => js.Promise[Unit],
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    on: (deviceRequestPrompted, js.Function1[/* params */ DeviceRequestPromptedEvent, Unit]) => Unit,
    selectPrompt: SelectPromptRequest => js.Promise[Unit]
  ): DeviceAccessApi = {
    val __obj = js.Dynamic.literal(cancelPrompt = js.Any.fromFunction1(cancelPrompt), disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), on = js.Any.fromFunction2(on), selectPrompt = js.Any.fromFunction1(selectPrompt))
    __obj.asInstanceOf[DeviceAccessApi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceAccessApi] (val x: Self) extends AnyVal {
    
    inline def setCancelPrompt(value: CancelPromptRequest => js.Promise[Unit]): Self = StObject.set(x, "cancelPrompt", js.Any.fromFunction1(value))
    
    inline def setDisable(value: () => js.Promise[Unit]): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    inline def setEnable(value: () => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setOn(
      value: (deviceRequestPrompted, js.Function1[/* params */ DeviceRequestPromptedEvent, Unit]) => Unit
    ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setSelectPrompt(value: SelectPromptRequest => js.Promise[Unit]): Self = StObject.set(x, "selectPrompt", js.Any.fromFunction1(value))
  }
}
