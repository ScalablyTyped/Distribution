package typings.ejDotWebDotAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurePaneSettings extends js.Object {
  /** Shows or hides the configuration pane in ReportDesigner control.
    * @Default {true}
    */
  var showConfigurePane: js.UndefOr[Boolean] = js.undefined
}

object ConfigurePaneSettings {
  @scala.inline
  def apply(showConfigurePane: js.UndefOr[Boolean] = js.undefined): ConfigurePaneSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showConfigurePane)) __obj.updateDynamic("showConfigurePane")(showConfigurePane)
    __obj.asInstanceOf[ConfigurePaneSettings]
  }
}

