package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeriesEmptyPointSettings extends js.Object {
  /** Specifies the mode of empty point.
    * @Default {gap}
    */
  var displayMode: js.UndefOr[EmptyPointMode | String] = js.undefined
  /** Options for customizing the color and border of the empty point in the series.
    */
  var style: js.UndefOr[SeriesEmptyPointSettingsStyle] = js.undefined
  /** Controls the visibility of the empty point.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object SeriesEmptyPointSettings {
  @scala.inline
  def apply(
    displayMode: EmptyPointMode | String = null,
    style: SeriesEmptyPointSettingsStyle = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): SeriesEmptyPointSettings = {
    val __obj = js.Dynamic.literal()
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesEmptyPointSettings]
  }
}

