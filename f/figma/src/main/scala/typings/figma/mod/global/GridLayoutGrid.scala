package typings.figma.mod.global

import typings.figma.figmaStrings.GRID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridLayoutGrid extends LayoutGrid {
  
  val color: js.UndefOr[RGBA] = js.native
  
  val pattern: GRID = js.native
  
  val sectionSize: Double = js.native
  
  val visible: js.UndefOr[Boolean] = js.native
}
object GridLayoutGrid {
  
  @scala.inline
  def apply(pattern: GRID, sectionSize: Double): GridLayoutGrid = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], sectionSize = sectionSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLayoutGrid]
  }
  
  @scala.inline
  implicit class GridLayoutGridOps[Self <: GridLayoutGrid] (val x: Self) extends AnyVal {
    
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
    def setPattern(value: GRID): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionSize(value: Double): Self = this.set("sectionSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: RGBA): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
