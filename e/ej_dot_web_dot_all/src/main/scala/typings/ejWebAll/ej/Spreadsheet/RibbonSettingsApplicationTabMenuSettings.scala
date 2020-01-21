package typings.ejWebAll.ej.Spreadsheet

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
  var isAppend: js.UndefOr[Boolean] = js.undefined
}

object RibbonSettingsApplicationTabMenuSettings {
  @scala.inline
  def apply(dataSource: js.Array[_] = null, isAppend: js.UndefOr[Boolean] = js.undefined): RibbonSettingsApplicationTabMenuSettings = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(isAppend)) __obj.updateDynamic("isAppend")(isAppend.asInstanceOf[js.Any])
    __obj.asInstanceOf[RibbonSettingsApplicationTabMenuSettings]
  }
}

