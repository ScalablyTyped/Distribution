package typings.devextreme.mod.DevExpress.common.grids

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPanel extends StObject {
  
  /**
    * Notifies the UI component whether search is case-sensitive to ensure that search results are highlighted correctly. Applies only if highlightSearchText is true.
    */
  var highlightCaseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether found substrings should be highlighted.
    */
  var highlightSearchText: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies a placeholder for the search panel.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the UI component should search against all columns or only visible ones.
    */
  var searchVisibleColumnsOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets a search string for the search panel.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the search panel is visible or not.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the width of the search panel in pixels.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object SearchPanel {
  
  inline def apply(): SearchPanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchPanel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchPanel] (val x: Self) extends AnyVal {
    
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
