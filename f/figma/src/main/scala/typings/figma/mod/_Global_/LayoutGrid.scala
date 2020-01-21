package typings.figma.mod._Global_

import typings.figma.figmaStrings.CENTER
import typings.figma.figmaStrings.COLUMNS
import typings.figma.figmaStrings.GRID
import typings.figma.figmaStrings.MAX
import typings.figma.figmaStrings.MIN
import typings.figma.figmaStrings.ROWS
import typings.figma.figmaStrings.STRETCH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.figma.mod._Global_.RowsColsLayoutGrid
  - typings.figma.mod._Global_.GridLayoutGrid
*/
trait LayoutGrid extends js.Object

object LayoutGrid {
  @scala.inline
  def RowsColsLayoutGrid(
    alignment: MIN | MAX | STRETCH | CENTER,
    count: Double,
    gutterSize: Double,
    pattern: ROWS | COLUMNS,
    color: RGBA = null,
    offset: Int | Double = null,
    sectionSize: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): LayoutGrid = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], gutterSize = gutterSize.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (sectionSize != null) __obj.updateDynamic("sectionSize")(sectionSize.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutGrid]
  }
  @scala.inline
  def GridLayoutGrid(
    pattern: GRID,
    sectionSize: Double,
    color: RGBA = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): LayoutGrid = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], sectionSize = sectionSize.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutGrid]
  }
}

