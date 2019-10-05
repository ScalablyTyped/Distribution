package typings.ejDotWebDotAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrozenHeaderSettings extends js.Object {
  /** Allows you to freeze the column headers alone when scrolling the vertical scroll bar.
    * @Default {false}
    */
  var enableFrozenColumnHeaders: js.UndefOr[Boolean] = js.undefined
  /** Allows you to freeze both row headers and column headers while scrolling.
    * @Default {false}
    */
  var enableFrozenHeaders: js.UndefOr[Boolean] = js.undefined
  /** Allows you to freeze the row headers alone when scrolling the horizontal scroll bar.
    * @Default {false}
    */
  var enableFrozenRowHeaders: js.UndefOr[Boolean] = js.undefined
  /** Allows you to set the size of the scrollbar (horizontal and vertical) that is visible in the PivotGrid.
    * @Default {18}
    */
  var scrollerSize: js.UndefOr[Double] = js.undefined
}

object FrozenHeaderSettings {
  @scala.inline
  def apply(
    enableFrozenColumnHeaders: js.UndefOr[Boolean] = js.undefined,
    enableFrozenHeaders: js.UndefOr[Boolean] = js.undefined,
    enableFrozenRowHeaders: js.UndefOr[Boolean] = js.undefined,
    scrollerSize: Int | Double = null
  ): FrozenHeaderSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableFrozenColumnHeaders)) __obj.updateDynamic("enableFrozenColumnHeaders")(enableFrozenColumnHeaders)
    if (!js.isUndefined(enableFrozenHeaders)) __obj.updateDynamic("enableFrozenHeaders")(enableFrozenHeaders)
    if (!js.isUndefined(enableFrozenRowHeaders)) __obj.updateDynamic("enableFrozenRowHeaders")(enableFrozenRowHeaders)
    if (scrollerSize != null) __obj.updateDynamic("scrollerSize")(scrollerSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrozenHeaderSettings]
  }
}

