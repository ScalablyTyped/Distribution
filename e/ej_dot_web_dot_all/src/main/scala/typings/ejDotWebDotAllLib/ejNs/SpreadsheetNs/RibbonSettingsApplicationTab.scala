package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RibbonSettingsApplicationTab extends js.Object {
  /** Gets or sets an object that indicates menu settings for application tab in Spreadsheet.
    */
  var menuSettings: js.UndefOr[RibbonSettingsApplicationTabMenuSettings] = js.undefined
  /** Gets or sets a value that indicates to set application tab type in Spreadsheet. It has two types, Menu and Backstage.
    * @Default {ej.Ribbon.ApplicationTabType.Backstage}
    */
  var `type`: js.UndefOr[ejDotWebDotAllLib.ejNs.RibbonNs.ApplicationTabType | java.lang.String] = js.undefined
}

object RibbonSettingsApplicationTab {
  @scala.inline
  def apply(
    menuSettings: RibbonSettingsApplicationTabMenuSettings = null,
    `type`: ejDotWebDotAllLib.ejNs.RibbonNs.ApplicationTabType | java.lang.String = null
  ): RibbonSettingsApplicationTab = {
    val __obj = js.Dynamic.literal()
    if (menuSettings != null) __obj.updateDynamic("menuSettings")(menuSettings)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RibbonSettingsApplicationTab]
  }
}

