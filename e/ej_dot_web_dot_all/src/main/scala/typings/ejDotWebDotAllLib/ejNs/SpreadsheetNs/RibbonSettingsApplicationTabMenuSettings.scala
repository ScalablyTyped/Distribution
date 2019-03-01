package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RibbonSettingsApplicationTabMenuSettings extends js.Object {
  /** Specifies the data source to append in application tab.
    * @Default {[]}
    */
  var dataSource: js.UndefOr[js.Array[_]] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable isAppend property in ribbon settings.
    * @Default {false}
    */
  var isAppend: js.UndefOr[scala.Boolean] = js.undefined
}

object RibbonSettingsApplicationTabMenuSettings {
  @scala.inline
  def apply(dataSource: js.Array[_] = null, isAppend: js.UndefOr[scala.Boolean] = js.undefined): RibbonSettingsApplicationTabMenuSettings = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (!js.isUndefined(isAppend)) __obj.updateDynamic("isAppend")(isAppend)
    __obj.asInstanceOf[RibbonSettingsApplicationTabMenuSettings]
  }
}

