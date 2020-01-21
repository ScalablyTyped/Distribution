package typings.figma.mod._Global_

import typings.figma.figmaStrings.CENTER
import typings.figma.figmaStrings.COLUMNS
import typings.figma.figmaStrings.MAX
import typings.figma.figmaStrings.MIN
import typings.figma.figmaStrings.ROWS
import typings.figma.figmaStrings.STRETCH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowsColsLayoutGrid extends LayoutGrid {
  val alignment: MIN | MAX | STRETCH | CENTER
  val color: js.UndefOr[RGBA] = js.undefined
  val count: Double
  val gutterSize: Double
   // Not set for alignment: "STRETCH"
  val offset: js.UndefOr[Double] = js.undefined
  val pattern: ROWS | COLUMNS
   // Infinity when "Auto" is set in the UI
  val sectionSize: js.UndefOr[Double] = js.undefined
   // Not set for alignment: "CENTER"
  val visible: js.UndefOr[Boolean] = js.undefined
}

object RowsColsLayoutGrid {
  @scala.inline
  def apply(
    alignment: MIN | MAX | STRETCH | CENTER,
    count: Double,
    gutterSize: Double,
    pattern: ROWS | COLUMNS,
    color: RGBA = null,
    offset: Int | Double = null,
    sectionSize: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): RowsColsLayoutGrid = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], gutterSize = gutterSize.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (sectionSize != null) __obj.updateDynamic("sectionSize")(sectionSize.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowsColsLayoutGrid]
  }
}

