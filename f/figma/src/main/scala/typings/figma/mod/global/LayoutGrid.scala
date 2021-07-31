package typings.figma.mod.global

import typings.figma.figmaStrings.CENTER
import typings.figma.figmaStrings.COLUMNS
import typings.figma.figmaStrings.MAX
import typings.figma.figmaStrings.MIN
import typings.figma.figmaStrings.ROWS
import typings.figma.figmaStrings.STRETCH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.figma.mod.global.RowsColsLayoutGrid
  - typings.figma.mod.global.GridLayoutGrid
*/
trait LayoutGrid extends StObject
object LayoutGrid {
  
  @scala.inline
  def GridLayoutGrid(sectionSize: Double): typings.figma.mod.global.GridLayoutGrid = {
    val __obj = js.Dynamic.literal(pattern = "GRID", sectionSize = sectionSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.figma.mod.global.GridLayoutGrid]
  }
  
  @scala.inline
  def RowsColsLayoutGrid(
    alignment: MIN | MAX | STRETCH | CENTER,
    count: Double,
    gutterSize: Double,
    pattern: ROWS | COLUMNS
  ): typings.figma.mod.global.RowsColsLayoutGrid = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], gutterSize = gutterSize.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.figma.mod.global.RowsColsLayoutGrid]
  }
}
