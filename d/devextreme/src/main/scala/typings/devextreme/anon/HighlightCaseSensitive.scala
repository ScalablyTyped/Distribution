package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightCaseSensitive extends StObject {
  
  var highlightCaseSensitive: js.UndefOr[Boolean] = js.undefined
  
  var highlightSearchText: js.UndefOr[Boolean] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var searchVisibleColumnsOnly: js.UndefOr[Boolean] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object HighlightCaseSensitive {
  
  inline def apply(): HighlightCaseSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightCaseSensitive]
  }
  
  extension [Self <: HighlightCaseSensitive](x: Self) {
    
    inline def setHighlightCaseSensitive(value: Boolean): Self = StObject.set(x, "highlightCaseSensitive", value.asInstanceOf[js.Any])
    
    inline def setHighlightCaseSensitiveUndefined: Self = StObject.set(x, "highlightCaseSensitive", js.undefined)
    
    inline def setHighlightSearchText(value: Boolean): Self = StObject.set(x, "highlightSearchText", value.asInstanceOf[js.Any])
    
    inline def setHighlightSearchTextUndefined: Self = StObject.set(x, "highlightSearchText", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSearchVisibleColumnsOnly(value: Boolean): Self = StObject.set(x, "searchVisibleColumnsOnly", value.asInstanceOf[js.Any])
    
    inline def setSearchVisibleColumnsOnlyUndefined: Self = StObject.set(x, "searchVisibleColumnsOnly", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
