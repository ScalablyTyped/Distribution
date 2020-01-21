package typings.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplaySettings extends js.Object {
  /** Allows you to customize the display of the pivot chart and pivot grid widgets in the tabs or tiles.
    * @Default {ej.PivotClient.ControlPlacement.Tab}
    */
  var controlPlacement: js.UndefOr[ControlPlacement | String] = js.undefined
  /** Allows you to set either the chart or grid as the start-up widget.
    * @Default {ej.PivotClient.DefaultView.Grid}
    */
  var defaultView: js.UndefOr[DefaultView | String] = js.undefined
  /** Allows you to switch to full screen view of the pivot chart and the pivot grid from default view in the pivot client.
    * @Default {false}
    */
  var enableFullScreen: js.UndefOr[Boolean] = js.undefined
  /** Enables an option to enhance the space for the pivot grid and pivot chart by hiding the cube browser and the axis element builder.
    * @Default {false}
    */
  var enableTogglePanel: js.UndefOr[Boolean] = js.undefined
  /** Sets the display mode (only chart/only grid/both) in the pivot client.
    * @Default {ej.PivotClient.DisplayMode.ChartAndGrid}
    */
  var mode: js.UndefOr[DisplayMode | String] = js.undefined
}

object DisplaySettings {
  @scala.inline
  def apply(
    controlPlacement: ControlPlacement | String = null,
    defaultView: DefaultView | String = null,
    enableFullScreen: js.UndefOr[Boolean] = js.undefined,
    enableTogglePanel: js.UndefOr[Boolean] = js.undefined,
    mode: DisplayMode | String = null
  ): DisplaySettings = {
    val __obj = js.Dynamic.literal()
    if (controlPlacement != null) __obj.updateDynamic("controlPlacement")(controlPlacement.asInstanceOf[js.Any])
    if (defaultView != null) __obj.updateDynamic("defaultView")(defaultView.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFullScreen)) __obj.updateDynamic("enableFullScreen")(enableFullScreen.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTogglePanel)) __obj.updateDynamic("enableTogglePanel")(enableTogglePanel.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplaySettings]
  }
}

