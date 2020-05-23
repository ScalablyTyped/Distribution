package typings.ejWebAll.ej.PivotGrid

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
    scrollerSize: js.UndefOr[Double] = js.undefined
  ): FrozenHeaderSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableFrozenColumnHeaders)) __obj.updateDynamic("enableFrozenColumnHeaders")(enableFrozenColumnHeaders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFrozenHeaders)) __obj.updateDynamic("enableFrozenHeaders")(enableFrozenHeaders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFrozenRowHeaders)) __obj.updateDynamic("enableFrozenRowHeaders")(enableFrozenRowHeaders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollerSize)) __obj.updateDynamic("scrollerSize")(scrollerSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrozenHeaderSettings]
  }
}

