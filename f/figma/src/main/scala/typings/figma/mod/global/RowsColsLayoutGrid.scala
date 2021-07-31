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

trait RowsColsLayoutGrid
  extends StObject
     with LayoutGrid {
  
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
    pattern: ROWS | COLUMNS
  ): RowsColsLayoutGrid = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], gutterSize = gutterSize.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowsColsLayoutGrid]
  }
  
  @scala.inline
  implicit class RowsColsLayoutGridMutableBuilder[Self <: RowsColsLayoutGrid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: MIN | MAX | STRETCH | CENTER): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: RGBA): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGutterSize(value: Double): Self = StObject.set(x, "gutterSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPattern(value: ROWS | COLUMNS): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionSize(value: Double): Self = StObject.set(x, "sectionSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionSizeUndefined: Self = StObject.set(x, "sectionSize", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
