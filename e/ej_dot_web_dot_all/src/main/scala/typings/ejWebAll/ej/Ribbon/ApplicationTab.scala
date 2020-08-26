package typings.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationTab extends js.Object {
  /** Specifies the ribbon backstage page items.
    * @Default {Object}
    */
  var backstageSettings: js.UndefOr[ApplicationTabBackstageSettings] = js.native
  /** Specifies the ID of ul list to create application menu in the ribbon control.
    * @Default {null}
    */
  var menuItemID: js.UndefOr[String] = js.native
  /** Specifies the menu members, events by using the menu settings for the menu in the application tab.
    * @Default {Object}
    */
  var menuSettings: js.UndefOr[js.Any] = js.native
  /** Specifies the application menu or backstage page. Specify the type of application tab as &quot;ej.Ribbon.ApplicationTabType.Menu&quot; to render the application menu or
    * &quot;ej.Ribbon.ApplicationTabType.Backstage&quot; to render backstage page in the ribbon control.
    * @Default {ej.Ribbon.ApplicationTabType.Menu}
    */
  var `type`: js.UndefOr[ApplicationTabType | String] = js.native
}

object ApplicationTab {
  @scala.inline
  def apply(): ApplicationTab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationTab]
  }
  @scala.inline
  implicit class ApplicationTabOps[Self <: ApplicationTab] (val x: Self) extends AnyVal {
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
    def setBackstageSettings(value: ApplicationTabBackstageSettings): Self = this.set("backstageSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackstageSettings: Self = this.set("backstageSettings", js.undefined)
    @scala.inline
    def setMenuItemID(value: String): Self = this.set("menuItemID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuItemID: Self = this.set("menuItemID", js.undefined)
    @scala.inline
    def setMenuSettings(value: js.Any): Self = this.set("menuSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMenuSettings: Self = this.set("menuSettings", js.undefined)
    @scala.inline
    def setType(value: ApplicationTabType | String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

