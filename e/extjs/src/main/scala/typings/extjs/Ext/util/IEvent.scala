package typings.extjs.Ext.util

import typings.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEvent extends IBase {
  /** [Property] (Boolean) */
  var isEvent: js.UndefOr[Boolean] = js.native
}

object IEvent {
  @scala.inline
  def apply(): IEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEvent]
  }
  @scala.inline
  implicit class IEventOps[Self <: IEvent] (val x: Self) extends AnyVal {
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
    def setIsEvent(value: Boolean): Self = this.set("isEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEvent: Self = this.set("isEvent", js.undefined)
  }
  
}

