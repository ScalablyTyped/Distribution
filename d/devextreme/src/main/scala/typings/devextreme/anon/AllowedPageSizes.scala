package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedPageSizes extends StObject {
  
  var allowedPageSizes: js.UndefOr[js.Array[Double] | auto] = js.undefined
  
  var infoText: js.UndefOr[String] = js.undefined
  
  var showInfo: js.UndefOr[Boolean] = js.undefined
  
  var showNavigationButtons: js.UndefOr[Boolean] = js.undefined
  
  var showPageSizeSelector: js.UndefOr[Boolean] = js.undefined
  
  var visible: js.UndefOr[Boolean | auto] = js.undefined
}
object AllowedPageSizes {
  
  inline def apply(): AllowedPageSizes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedPageSizes]
  }
  
  extension [Self <: AllowedPageSizes](x: Self) {
    
    inline def setAllowedPageSizes(value: js.Array[Double] | auto): Self = StObject.set(x, "allowedPageSizes", value.asInstanceOf[js.Any])
    
    inline def setAllowedPageSizesUndefined: Self = StObject.set(x, "allowedPageSizes", js.undefined)
    
    inline def setAllowedPageSizesVarargs(value: Double*): Self = StObject.set(x, "allowedPageSizes", js.Array(value :_*))
    
    inline def setInfoText(value: String): Self = StObject.set(x, "infoText", value.asInstanceOf[js.Any])
    
    inline def setInfoTextUndefined: Self = StObject.set(x, "infoText", js.undefined)
    
    inline def setShowInfo(value: Boolean): Self = StObject.set(x, "showInfo", value.asInstanceOf[js.Any])
    
    inline def setShowInfoUndefined: Self = StObject.set(x, "showInfo", js.undefined)
    
    inline def setShowNavigationButtons(value: Boolean): Self = StObject.set(x, "showNavigationButtons", value.asInstanceOf[js.Any])
    
    inline def setShowNavigationButtonsUndefined: Self = StObject.set(x, "showNavigationButtons", js.undefined)
    
    inline def setShowPageSizeSelector(value: Boolean): Self = StObject.set(x, "showPageSizeSelector", value.asInstanceOf[js.Any])
    
    inline def setShowPageSizeSelectorUndefined: Self = StObject.set(x, "showPageSizeSelector", js.undefined)
    
    inline def setVisible(value: Boolean | auto): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
