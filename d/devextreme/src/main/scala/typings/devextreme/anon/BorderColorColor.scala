package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderColorColor extends StObject {
  
  var borderColor: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String] = js.native
}
object BorderColorColor {
  
  @scala.inline
  def apply(): BorderColorColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderColorColor]
  }
  
  @scala.inline
  implicit class BorderColorColorMutableBuilder[Self <: BorderColorColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
