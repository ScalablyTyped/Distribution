package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RibbonSettings extends js.Object {
  /** Gets or sets an object that indicates application tab settings in Spreadsheet.
    */
  var applicationTab: js.UndefOr[RibbonSettingsApplicationTab] = js.undefined
}

object RibbonSettings {
  @scala.inline
  def apply(applicationTab: RibbonSettingsApplicationTab = null): RibbonSettings = {
    val __obj = js.Dynamic.literal()
    if (applicationTab != null) __obj.updateDynamic("applicationTab")(applicationTab)
    __obj.asInstanceOf[RibbonSettings]
  }
}

