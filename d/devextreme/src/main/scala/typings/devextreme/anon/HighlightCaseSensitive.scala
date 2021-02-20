package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightCaseSensitive extends StObject {
  
  var highlightCaseSensitive: js.UndefOr[Boolean] = js.native
  
  var highlightSearchText: js.UndefOr[Boolean] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var searchVisibleColumnsOnly: js.UndefOr[Boolean] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object HighlightCaseSensitive {
  
  @scala.inline
  def apply(): HighlightCaseSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightCaseSensitive]
  }
  
  @scala.inline
  implicit class HighlightCaseSensitiveMutableBuilder[Self <: HighlightCaseSensitive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighlightCaseSensitive(value: Boolean): Self = StObject.set(x, "highlightCaseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightCaseSensitiveUndefined: Self = StObject.set(x, "highlightCaseSensitive", js.undefined)
    
    @scala.inline
    def setHighlightSearchText(value: Boolean): Self = StObject.set(x, "highlightSearchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightSearchTextUndefined: Self = StObject.set(x, "highlightSearchText", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setSearchVisibleColumnsOnly(value: Boolean): Self = StObject.set(x, "searchVisibleColumnsOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchVisibleColumnsOnlyUndefined: Self = StObject.set(x, "searchVisibleColumnsOnly", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
