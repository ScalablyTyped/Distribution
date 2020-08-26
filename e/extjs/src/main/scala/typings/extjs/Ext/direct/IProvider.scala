package typings.extjs.Ext.direct

import typings.extjs.Ext.Array
import typings.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProvider extends IObservable {
  /** [Method] Abstract method for subclasses to implement  */
  var connect: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Abstract method for subclasses to implement  */
  var disconnect: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String) */
  var id: js.UndefOr[String] = js.native
  /** [Method] Returns whether or not the server side is currently connected  */
  var isConnected: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String[]) */
  var relayedEvents: js.UndefOr[Array] = js.native
}

object IProvider {
  @scala.inline
  def apply(): IProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProvider]
  }
  @scala.inline
  implicit class IProviderOps[Self <: IProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnect(value: () => Unit): Self = this.set("connect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteConnect: Self = this.set("connect", js.undefined)
    @scala.inline
    def setDisconnect(value: () => Unit): Self = this.set("disconnect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDisconnect: Self = this.set("disconnect", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIsConnected(value: () => Unit): Self = this.set("isConnected", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsConnected: Self = this.set("isConnected", js.undefined)
    @scala.inline
    def setRelayedEvents(value: Array): Self = this.set("relayedEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelayedEvents: Self = this.set("relayedEvents", js.undefined)
  }
  
}

