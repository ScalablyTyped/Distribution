package typings.exceljs.mod

import typings.exceljs.anon.PartialColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderDiagonal
  extends StObject
     with Border {
  
  var down: Boolean
  
  var up: Boolean
}
object BorderDiagonal {
  
  @scala.inline
  def apply(color: PartialColor, down: Boolean, style: BorderStyle, up: Boolean): BorderDiagonal = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], down = down.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderDiagonal]
  }
  
  @scala.inline
  implicit class BorderDiagonalMutableBuilder[Self <: BorderDiagonal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDown(value: Boolean): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUp(value: Boolean): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
  }
}
