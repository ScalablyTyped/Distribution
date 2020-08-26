package typings.googleAppsScript.GoogleAppsScript.Mirror.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItem extends js.Object {
  var action: js.UndefOr[String] = js.native
  var contextual_command: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var payload: js.UndefOr[String] = js.native
  var removeWhenSelected: js.UndefOr[Boolean] = js.native
  var values: js.UndefOr[js.Array[MenuValue]] = js.native
}

object MenuItem {
  @scala.inline
  def apply(): MenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItem]
  }
  @scala.inline
  implicit class MenuItemOps[Self <: MenuItem] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setContextual_command(value: String): Self = this.set("contextual_command", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextual_command: Self = this.set("contextual_command", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setPayload(value: String): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setRemoveWhenSelected(value: Boolean): Self = this.set("removeWhenSelected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveWhenSelected: Self = this.set("removeWhenSelected", js.undefined)
    @scala.inline
    def setValuesVarargs(value: MenuValue*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[MenuValue]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

