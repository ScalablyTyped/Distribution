package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.onClick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyFilter extends StObject {
  
  var applyFilter: js.UndefOr[auto | onClick] = js.native
  
  var applyFilterText: js.UndefOr[String] = js.native
  
  var betweenEndText: js.UndefOr[String] = js.native
  
  var betweenStartText: js.UndefOr[String] = js.native
  
  var operationDescriptions: js.UndefOr[Between] = js.native
  
  var resetOperationText: js.UndefOr[String] = js.native
  
  var showAllText: js.UndefOr[String] = js.native
  
  var showOperationChooser: js.UndefOr[Boolean] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object ApplyFilter {
  
  @scala.inline
  def apply(): ApplyFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyFilter]
  }
  
  @scala.inline
  implicit class ApplyFilterMutableBuilder[Self <: ApplyFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyFilter(value: auto | onClick): Self = StObject.set(x, "applyFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyFilterText(value: String): Self = StObject.set(x, "applyFilterText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyFilterTextUndefined: Self = StObject.set(x, "applyFilterText", js.undefined)
    
    @scala.inline
    def setApplyFilterUndefined: Self = StObject.set(x, "applyFilter", js.undefined)
    
    @scala.inline
    def setBetweenEndText(value: String): Self = StObject.set(x, "betweenEndText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBetweenEndTextUndefined: Self = StObject.set(x, "betweenEndText", js.undefined)
    
    @scala.inline
    def setBetweenStartText(value: String): Self = StObject.set(x, "betweenStartText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBetweenStartTextUndefined: Self = StObject.set(x, "betweenStartText", js.undefined)
    
    @scala.inline
    def setOperationDescriptions(value: Between): Self = StObject.set(x, "operationDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationDescriptionsUndefined: Self = StObject.set(x, "operationDescriptions", js.undefined)
    
    @scala.inline
    def setResetOperationText(value: String): Self = StObject.set(x, "resetOperationText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetOperationTextUndefined: Self = StObject.set(x, "resetOperationText", js.undefined)
    
    @scala.inline
    def setShowAllText(value: String): Self = StObject.set(x, "showAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAllTextUndefined: Self = StObject.set(x, "showAllText", js.undefined)
    
    @scala.inline
    def setShowOperationChooser(value: Boolean): Self = StObject.set(x, "showOperationChooser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOperationChooserUndefined: Self = StObject.set(x, "showOperationChooser", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
