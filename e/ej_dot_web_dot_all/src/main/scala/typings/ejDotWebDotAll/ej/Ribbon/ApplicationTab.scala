package typings.ejDotWebDotAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationTab extends js.Object {
  /** Specifies the ribbon backstage page items.
    * @Default {Object}
    */
  var backstageSettings: js.UndefOr[ApplicationTabBackstageSettings] = js.undefined
  /** Specifies the ID of ul list to create application menu in the ribbon control.
    * @Default {null}
    */
  var menuItemID: js.UndefOr[String] = js.undefined
  /** Specifies the menu members, events by using the menu settings for the menu in the application tab.
    * @Default {Object}
    */
  var menuSettings: js.UndefOr[js.Any] = js.undefined
  /** Specifies the application menu or backstage page. Specify the type of application tab as &quot;ej.Ribbon.ApplicationTabType.Menu&quot; to render the application menu or
    * &quot;ej.Ribbon.ApplicationTabType.Backstage&quot; to render backstage page in the ribbon control.
    * @Default {ej.Ribbon.ApplicationTabType.Menu}
    */
  var `type`: js.UndefOr[ApplicationTabType | String] = js.undefined
}

object ApplicationTab {
  @scala.inline
  def apply(
    backstageSettings: ApplicationTabBackstageSettings = null,
    menuItemID: String = null,
    menuSettings: js.Any = null,
    `type`: ApplicationTabType | String = null
  ): ApplicationTab = {
    val __obj = js.Dynamic.literal()
    if (backstageSettings != null) __obj.updateDynamic("backstageSettings")(backstageSettings)
    if (menuItemID != null) __obj.updateDynamic("menuItemID")(menuItemID)
    if (menuSettings != null) __obj.updateDynamic("menuSettings")(menuSettings)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationTab]
  }
}

