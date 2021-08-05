package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Label extends StObject {
  
  var label: js.UndefOr[CustomizeTextFormat] = js.undefined
  
  var separatorHeight: js.UndefOr[Double] = js.undefined
  
  var textLeftIndent: js.UndefOr[Double] = js.undefined
  
  var textTopIndent: js.UndefOr[Double] = js.undefined
  
  var topIndent: js.UndefOr[Double] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object Label {
  
  inline def apply(): Label = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Label]
  }
  
  extension [Self <: Label](x: Self) {
    
    inline def setLabel(value: CustomizeTextFormat): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSeparatorHeight(value: Double): Self = StObject.set(x, "separatorHeight", value.asInstanceOf[js.Any])
    
    inline def setSeparatorHeightUndefined: Self = StObject.set(x, "separatorHeight", js.undefined)
    
    inline def setTextLeftIndent(value: Double): Self = StObject.set(x, "textLeftIndent", value.asInstanceOf[js.Any])
    
    inline def setTextLeftIndentUndefined: Self = StObject.set(x, "textLeftIndent", js.undefined)
    
    inline def setTextTopIndent(value: Double): Self = StObject.set(x, "textTopIndent", value.asInstanceOf[js.Any])
    
    inline def setTextTopIndentUndefined: Self = StObject.set(x, "textTopIndent", js.undefined)
    
    inline def setTopIndent(value: Double): Self = StObject.set(x, "topIndent", value.asInstanceOf[js.Any])
    
    inline def setTopIndentUndefined: Self = StObject.set(x, "topIndent", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
