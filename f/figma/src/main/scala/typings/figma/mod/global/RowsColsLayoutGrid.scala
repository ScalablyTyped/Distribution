package typings.figma.mod.global

import typings.figma.figmaStrings.CENTER
import typings.figma.figmaStrings.COLUMNS
import typings.figma.figmaStrings.MAX
import typings.figma.figmaStrings.MIN
import typings.figma.figmaStrings.ROWS
import typings.figma.figmaStrings.STRETCH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowsColsLayoutGrid extends LayoutGrid {
  
  val alignment: MIN | MAX | STRETCH | CENTER = js.native
  
  val color: js.UndefOr[RGBA] = js.native
  
  val count: Double = js.native
  
  val gutterSize: Double = js.native
  
   // Not set for alignment: "STRETCH"
  val offset: js.UndefOr[Double] = js.native
  
  val pattern: ROWS | COLUMNS = js.native
  
   // Infinity when "Auto" is set in the UI
  val sectionSize: js.UndefOr[Double] = js.native
  
   // Not set for alignment: "CENTER"
  val visible: js.UndefOr[Boolean] = js.native
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
  implicit class RowsColsLayoutGridOps[Self <: RowsColsLayoutGrid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlignment(value: MIN | MAX | STRETCH | CENTER): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGutterSize(value: Double): Self = this.set("gutterSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: ROWS | COLUMNS): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: RGBA): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setSectionSize(value: Double): Self = this.set("sectionSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSectionSize: Self = this.set("sectionSize", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
