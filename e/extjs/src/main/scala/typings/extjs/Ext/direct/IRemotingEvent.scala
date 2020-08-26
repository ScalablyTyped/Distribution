package typings.extjs.Ext.direct

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRemotingEvent extends IEvent {
  /** [Method] Get the transaction associated with this event
    * @returns Ext.direct.Transaction The transaction
    */
  var getTransaction: js.UndefOr[js.Function0[ITransaction]] = js.native
}

object IRemotingEvent {
  @scala.inline
  def apply(): IRemotingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRemotingEvent]
  }
  @scala.inline
  implicit class IRemotingEventOps[Self <: IRemotingEvent] (val x: Self) extends AnyVal {
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
    def setGetTransaction(value: () => ITransaction): Self = this.set("getTransaction", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetTransaction: Self = this.set("getTransaction", js.undefined)
  }
  
}

