package typings.ejWebAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurePaneSettings extends js.Object {
  /** Shows or hides the grouped items in the configuration pane with the help of enum ej.ReportDesigner.ConfigureItems
    * @Default {ej.ReportDesigner.ConfigureItems.All}
    */
  var items: js.UndefOr[ConfigureItems | String] = js.undefined
  /** Shows or hides the configuration pane in ReportDesigner control.
    * @Default {true}
    */
  var showConfigurePane: js.UndefOr[Boolean] = js.undefined
}

object ConfigurePaneSettings {
  @scala.inline
  def apply(items: ConfigureItems | String = null, showConfigurePane: js.UndefOr[Boolean] = js.undefined): ConfigurePaneSettings = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (!js.isUndefined(showConfigurePane)) __obj.updateDynamic("showConfigurePane")(showConfigurePane.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurePaneSettings]
  }
}

