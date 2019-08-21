package typings.figma

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
    val __obj = js.Dynamic.literal(pattern = pattern, sectionSize = sectionSize)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[GridLayoutGrid]
  }
}

