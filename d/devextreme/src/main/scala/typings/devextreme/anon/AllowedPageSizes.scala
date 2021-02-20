package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowedPageSizes extends StObject {
  
  var allowedPageSizes: js.UndefOr[js.Array[Double] | auto] = js.native
  
  var infoText: js.UndefOr[String] = js.native
  
  var showInfo: js.UndefOr[Boolean] = js.native
  
  var showNavigationButtons: js.UndefOr[Boolean] = js.native
  
  var showPageSizeSelector: js.UndefOr[Boolean] = js.native
  
  var visible: js.UndefOr[Boolean | auto] = js.native
}
object AllowedPageSizes {
  
  @scala.inline
  def apply(): AllowedPageSizes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedPageSizes]
  }
  
  @scala.inline
  implicit class AllowedPageSizesMutableBuilder[Self <: AllowedPageSizes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedPageSizes(value: js.Array[Double] | auto): Self = StObject.set(x, "allowedPageSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedPageSizesUndefined: Self = StObject.set(x, "allowedPageSizes", js.undefined)
    
    @scala.inline
    def setAllowedPageSizesVarargs(value: Double*): Self = StObject.set(x, "allowedPageSizes", js.Array(value :_*))
    
    @scala.inline
    def setInfoText(value: String): Self = StObject.set(x, "infoText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTextUndefined: Self = StObject.set(x, "infoText", js.undefined)
    
    @scala.inline
    def setShowInfo(value: Boolean): Self = StObject.set(x, "showInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInfoUndefined: Self = StObject.set(x, "showInfo", js.undefined)
    
    @scala.inline
    def setShowNavigationButtons(value: Boolean): Self = StObject.set(x, "showNavigationButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNavigationButtonsUndefined: Self = StObject.set(x, "showNavigationButtons", js.undefined)
    
    @scala.inline
    def setShowPageSizeSelector(value: Boolean): Self = StObject.set(x, "showPageSizeSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPageSizeSelectorUndefined: Self = StObject.set(x, "showPageSizeSelector", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean | auto): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
