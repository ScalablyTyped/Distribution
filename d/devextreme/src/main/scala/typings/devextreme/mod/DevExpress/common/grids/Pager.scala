package typings.devextreme.mod.DevExpress.common.grids

import typings.devextreme.mod.DevExpress.common.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pager extends StObject {
  
  /**
    * Specifies the available page sizes in the page size selector.
    */
  var allowedPageSizes: js.UndefOr[(js.Array[Double | PagerPageSize]) | Mode] = js.undefined
  
  /**
    * Specifies the pager&apos;s display mode.
    */
  var displayMode: js.UndefOr[PagerDisplayMode] = js.undefined
  
  /**
    * Specifies the page information text.
    */
  var infoText: js.UndefOr[String] = js.undefined
  
  /**
    * 
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether to show the page information.
    */
  var showInfo: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to show navigation buttons.
    */
  var showNavigationButtons: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to show the page size selector.
    */
  var showPageSizeSelector: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the pager is visible.
    */
  var visible: js.UndefOr[Boolean | Mode] = js.undefined
}
object Pager {
  
  inline def apply(): Pager = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pager] (val x: Self) extends AnyVal {
    
    inline def setAllowedPageSizes(value: (js.Array[Double | PagerPageSize]) | Mode): Self = StObject.set(x, "allowedPageSizes", value.asInstanceOf[js.Any])
    
    inline def setAllowedPageSizesUndefined: Self = StObject.set(x, "allowedPageSizes", js.undefined)
    
    inline def setAllowedPageSizesVarargs(value: (Double | PagerPageSize)*): Self = StObject.set(x, "allowedPageSizes", js.Array(value*))
    
    inline def setDisplayMode(value: PagerDisplayMode): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
    
    inline def setInfoText(value: String): Self = StObject.set(x, "infoText", value.asInstanceOf[js.Any])
    
    inline def setInfoTextUndefined: Self = StObject.set(x, "infoText", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setShowInfo(value: Boolean): Self = StObject.set(x, "showInfo", value.asInstanceOf[js.Any])
    
    inline def setShowInfoUndefined: Self = StObject.set(x, "showInfo", js.undefined)
    
    inline def setShowNavigationButtons(value: Boolean): Self = StObject.set(x, "showNavigationButtons", value.asInstanceOf[js.Any])
    
    inline def setShowNavigationButtonsUndefined: Self = StObject.set(x, "showNavigationButtons", js.undefined)
    
    inline def setShowPageSizeSelector(value: Boolean): Self = StObject.set(x, "showPageSizeSelector", value.asInstanceOf[js.Any])
    
    inline def setShowPageSizeSelectorUndefined: Self = StObject.set(x, "showPageSizeSelector", js.undefined)
    
    inline def setVisible(value: Boolean | Mode): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
