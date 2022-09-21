package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchTimeout extends StObject {
  
  /**
    * Specifies whether searching is enabled in the header filter.
    */
  var allowSearch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the height of the popup menu containing filtering values.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a delay in milliseconds between when a user finishes typing in the header filter&apos;s search panel, and when the search is executed.
    */
  var searchTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether to show all field values or only those that satisfy the other applied filters.
    */
  var showRelevantValues: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures the texts of the popup menu&apos;s elements.
    */
  var texts: js.UndefOr[EmptyValue] = js.undefined
  
  /**
    * Specifies the width of the popup menu containing filtering values.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object SearchTimeout {
  
  inline def apply(): SearchTimeout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchTimeout]
  }
  
  extension [Self <: SearchTimeout](x: Self) {
    
    inline def setAllowSearch(value: Boolean): Self = StObject.set(x, "allowSearch", value.asInstanceOf[js.Any])
    
    inline def setAllowSearchUndefined: Self = StObject.set(x, "allowSearch", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSearchTimeout(value: Double): Self = StObject.set(x, "searchTimeout", value.asInstanceOf[js.Any])
    
    inline def setSearchTimeoutUndefined: Self = StObject.set(x, "searchTimeout", js.undefined)
    
    inline def setShowRelevantValues(value: Boolean): Self = StObject.set(x, "showRelevantValues", value.asInstanceOf[js.Any])
    
    inline def setShowRelevantValuesUndefined: Self = StObject.set(x, "showRelevantValues", js.undefined)
    
    inline def setTexts(value: EmptyValue): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
