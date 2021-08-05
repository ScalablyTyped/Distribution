package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchTimeout extends StObject {
  
  var allowSearch: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var searchTimeout: js.UndefOr[Double] = js.undefined
  
  var showRelevantValues: js.UndefOr[Boolean] = js.undefined
  
  var texts: js.UndefOr[Cancel] = js.undefined
  
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
    
    inline def setTexts(value: Cancel): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
