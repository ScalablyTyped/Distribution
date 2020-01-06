package typings.figma.figmaMod._Global_

import typings.figma.figmaStrings.GRID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridLayoutGrid extends LayoutGrid {
  val color: js.UndefOr[RGBA] = js.undefined
  val pattern: GRID
  val sectionSize: Double
  val visible: js.UndefOr[Boolean] = js.undefined
}

object GridLayoutGrid {
  @scala.inline
  def apply(
    pattern: GRID,
    sectionSize: Double,
    color: RGBA = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): GridLayoutGrid = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], sectionSize = sectionSize.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLayoutGrid]
  }
}

