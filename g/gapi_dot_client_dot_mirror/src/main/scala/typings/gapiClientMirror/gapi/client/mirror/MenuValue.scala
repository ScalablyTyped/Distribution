package typings.gapiClientMirror.gapi.client.mirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuValue extends js.Object {
  /**
    * The name to display for the menu item. If you specify this property for a built-in menu item, the default contextual voice command for that menu item
    * is not shown.
    */
  var displayName: js.UndefOr[String] = js.native
  /** URL of an icon to display with the menu item. */
  var iconUrl: js.UndefOr[String] = js.native
  /**
    * The state that this value applies to. Allowed values are:
    * - DEFAULT - Default value shown when displayed in the menuItems list.
    * - PENDING - Value shown when the menuItem has been selected by the user but can still be cancelled.
    * - CONFIRMED - Value shown when the menuItem has been selected by the user and can no longer be cancelled.
    */
  var state: js.UndefOr[String] = js.native
}

object MenuValue {
  @scala.inline
  def apply(): MenuValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuValue]
  }
  @scala.inline
  implicit class MenuValueOps[Self <: MenuValue] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconUrl: Self = this.set("iconUrl", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

