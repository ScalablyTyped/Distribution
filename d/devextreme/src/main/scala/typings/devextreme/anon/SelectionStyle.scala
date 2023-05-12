package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionStyle extends StObject {
  
  /**
    * Configures the tile borders.
    */
  var border: js.UndefOr[ColorWidth] = js.undefined
  
  /**
    * Specifies a single color for all tiles.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the appearance of tiles in the hover state.
    */
  var hoverStyle: js.UndefOr[`8`] = js.undefined
  
  /**
    * Configures the tile labels.
    */
  var label: js.UndefOr[WordWrap] = js.undefined
  
  /**
    * Specifies the appearance of tiles in the selected state.
    */
  var selectionStyle: js.UndefOr[`8`] = js.undefined
}
object SelectionStyle {
  
  inline def apply(): SelectionStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectionStyle] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: ColorWidth): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setHoverStyle(value: `8`): Self = StObject.set(x, "hoverStyle", value.asInstanceOf[js.Any])
    
    inline def setHoverStyleUndefined: Self = StObject.set(x, "hoverStyle", js.undefined)
    
    inline def setLabel(value: WordWrap): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSelectionStyle(value: `8`): Self = StObject.set(x, "selectionStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectionStyleUndefined: Self = StObject.set(x, "selectionStyle", js.undefined)
  }
}
