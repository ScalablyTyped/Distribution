package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionStyle extends StObject {
  
  var border: js.UndefOr[ColorWidth] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var hoverStyle: js.UndefOr[`30`] = js.native
  
  var label: js.UndefOr[WordWrap] = js.native
  
  var selectionStyle: js.UndefOr[`30`] = js.native
}
object SelectionStyle {
  
  @scala.inline
  def apply(): SelectionStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionStyle]
  }
  
  @scala.inline
  implicit class SelectionStyleMutableBuilder[Self <: SelectionStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: ColorWidth): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setHoverStyle(value: `30`): Self = StObject.set(x, "hoverStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverStyleUndefined: Self = StObject.set(x, "hoverStyle", js.undefined)
    
    @scala.inline
    def setLabel(value: WordWrap): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setSelectionStyle(value: `30`): Self = StObject.set(x, "selectionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionStyleUndefined: Self = StObject.set(x, "selectionStyle", js.undefined)
  }
}
