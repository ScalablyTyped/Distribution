package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryXAxisScrollbarSettings extends js.Object {
  /** Controls whether scrollbar has to be responsive in the chart.
    * @Default {false}
    */
  var canResize: js.UndefOr[Boolean] = js.undefined
  /** The maximum number of points to be displayed in the scrollbar.
    * @Default {null}
    */
  var pointsLength: js.UndefOr[Double] = js.undefined
  /** Options to customize the range for the scrollbar in the axis.
    */
  var range: js.UndefOr[PrimaryXAxisScrollbarSettingsRange] = js.undefined
  /** Specifies to enables or disables the scroll bar.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object PrimaryXAxisScrollbarSettings {
  @scala.inline
  def apply(
    canResize: js.UndefOr[Boolean] = js.undefined,
    pointsLength: Int | Double = null,
    range: PrimaryXAxisScrollbarSettingsRange = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): PrimaryXAxisScrollbarSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canResize)) __obj.updateDynamic("canResize")(canResize.asInstanceOf[js.Any])
    if (pointsLength != null) __obj.updateDynamic("pointsLength")(pointsLength.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryXAxisScrollbarSettings]
  }
}

