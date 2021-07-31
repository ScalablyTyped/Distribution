package typings.figma.mod.global

import typings.figma.figmaStrings.GRID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridLayoutGrid
  extends StObject
     with LayoutGrid {
  
  val color: js.UndefOr[RGBA] = js.undefined
  
  val pattern: GRID
  
  val sectionSize: Double
  
  val visible: js.UndefOr[Boolean] = js.undefined
}
object GridLayoutGrid {
  
  @scala.inline
  def apply(sectionSize: Double): GridLayoutGrid = {
    val __obj = js.Dynamic.literal(pattern = "GRID", sectionSize = sectionSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLayoutGrid]
  }
  
  @scala.inline
  implicit class GridLayoutGridMutableBuilder[Self <: GridLayoutGrid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: RGBA): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setPattern(value: GRID): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSectionSize(value: Double): Self = StObject.set(x, "sectionSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
