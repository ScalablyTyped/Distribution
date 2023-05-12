package typings.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import typings.devtoolsProtocol.devtoolsProtocolStrings.dialogShown
import typings.devtoolsProtocol.mod.Protocol.FedCm.DialogShownEvent
import typings.devtoolsProtocol.mod.Protocol.FedCm.DismissDialogRequest
import typings.devtoolsProtocol.mod.Protocol.FedCm.EnableRequest
import typings.devtoolsProtocol.mod.Protocol.FedCm.SelectAccountRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FedCmApi extends StObject {
  
  def disable(): js.Promise[Unit]
  
  def dismissDialog(params: DismissDialogRequest): js.Promise[Unit]
  
  def enable(params: EnableRequest): js.Promise[Unit]
  
  @JSName("on")
  def on_dialogShown(event: dialogShown, listener: js.Function1[/* params */ DialogShownEvent, Unit]): Unit
  
  /**
    * Resets the cooldown time, if any, to allow the next FedCM call to show
    * a dialog even if one was recently dismissed by the user.
    */
  def resetCooldown(): js.Promise[Unit]
  
  def selectAccount(params: SelectAccountRequest): js.Promise[Unit]
}
object FedCmApi {
  
  inline def apply(
    disable: () => js.Promise[Unit],
    dismissDialog: DismissDialogRequest => js.Promise[Unit],
    enable: EnableRequest => js.Promise[Unit],
    on: (dialogShown, js.Function1[/* params */ DialogShownEvent, Unit]) => Unit,
    resetCooldown: () => js.Promise[Unit],
    selectAccount: SelectAccountRequest => js.Promise[Unit]
  ): FedCmApi = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), dismissDialog = js.Any.fromFunction1(dismissDialog), enable = js.Any.fromFunction1(enable), on = js.Any.fromFunction2(on), resetCooldown = js.Any.fromFunction0(resetCooldown), selectAccount = js.Any.fromFunction1(selectAccount))
    __obj.asInstanceOf[FedCmApi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FedCmApi] (val x: Self) extends AnyVal {
    
    inline def setDisable(value: () => js.Promise[Unit]): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    inline def setDismissDialog(value: DismissDialogRequest => js.Promise[Unit]): Self = StObject.set(x, "dismissDialog", js.Any.fromFunction1(value))
    
    inline def setEnable(value: EnableRequest => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction1(value))
    
    inline def setOn(value: (dialogShown, js.Function1[/* params */ DialogShownEvent, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setResetCooldown(value: () => js.Promise[Unit]): Self = StObject.set(x, "resetCooldown", js.Any.fromFunction0(value))
    
    inline def setSelectAccount(value: SelectAccountRequest => js.Promise[Unit]): Self = StObject.set(x, "selectAccount", js.Any.fromFunction1(value))
  }
}
