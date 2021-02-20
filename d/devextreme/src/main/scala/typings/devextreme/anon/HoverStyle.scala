package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoverStyle extends StObject {
  
  var border: js.UndefOr[ColorVisible] = js.native
  
  var hoverStyle: js.UndefOr[Border] = js.native
  
  var selectionStyle: js.UndefOr[Border] = js.native
}
object HoverStyle {
  
  @scala.inline
  def apply(): HoverStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoverStyle]
  }
  
  @scala.inline
  implicit class HoverStyleMutableBuilder[Self <: HoverStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: ColorVisible): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setHoverStyle(value: Border): Self = StObject.set(x, "hoverStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverStyleUndefined: Self = StObject.set(x, "hoverStyle", js.undefined)
    
    @scala.inline
    def setSelectionStyle(value: Border): Self = StObject.set(x, "selectionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionStyleUndefined: Self = StObject.set(x, "selectionStyle", js.undefined)
  }
}
