package typings.devextreme.mod.DevExpress.common.grids

import typings.devextreme.mod.DevExpress.common.charts.ApplyFilterMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterRow extends StObject {
  
  /**
    * Specifies when to apply a filter.
    */
  var applyFilter: js.UndefOr[ApplyFilterMode] = js.undefined
  
  /**
    * Specifies text for a hint that appears when a user pauses on a button that applies the filter.
    */
  var applyFilterText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a placeholder for the editor that specifies the end of a range when a user selects the &apos;between&apos; filter operation.
    */
  var betweenEndText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies a placeholder for the editor that specifies the start of a range when a user selects the &apos;between&apos; filter operation.
    */
  var betweenStartText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies descriptions for filter operations on the filter list.
    */
  var operationDescriptions: js.UndefOr[FilterRowOperationDescriptions] = js.undefined
  
  /**
    * Specifies text for the reset operation on the filter list.
    */
  var resetOperationText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies text for the item that clears the applied filter. Used only when a cell of the filter row contains a select box.
    */
  var showAllText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether icons that open the filter lists are visible.
    */
  var showOperationChooser: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the filter row is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object FilterRow {
  
  inline def apply(): FilterRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterRow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterRow] (val x: Self) extends AnyVal {
    
    inline def setApplyFilter(value: ApplyFilterMode): Self = StObject.set(x, "applyFilter", value.asInstanceOf[js.Any])
    
    inline def setApplyFilterText(value: String): Self = StObject.set(x, "applyFilterText", value.asInstanceOf[js.Any])
    
    inline def setApplyFilterTextUndefined: Self = StObject.set(x, "applyFilterText", js.undefined)
    
    inline def setApplyFilterUndefined: Self = StObject.set(x, "applyFilter", js.undefined)
    
    inline def setBetweenEndText(value: String): Self = StObject.set(x, "betweenEndText", value.asInstanceOf[js.Any])
    
    inline def setBetweenEndTextUndefined: Self = StObject.set(x, "betweenEndText", js.undefined)
    
    inline def setBetweenStartText(value: String): Self = StObject.set(x, "betweenStartText", value.asInstanceOf[js.Any])
    
    inline def setBetweenStartTextUndefined: Self = StObject.set(x, "betweenStartText", js.undefined)
    
    inline def setOperationDescriptions(value: FilterRowOperationDescriptions): Self = StObject.set(x, "operationDescriptions", value.asInstanceOf[js.Any])
    
    inline def setOperationDescriptionsUndefined: Self = StObject.set(x, "operationDescriptions", js.undefined)
    
    inline def setResetOperationText(value: String): Self = StObject.set(x, "resetOperationText", value.asInstanceOf[js.Any])
    
    inline def setResetOperationTextUndefined: Self = StObject.set(x, "resetOperationText", js.undefined)
    
    inline def setShowAllText(value: String): Self = StObject.set(x, "showAllText", value.asInstanceOf[js.Any])
    
    inline def setShowAllTextUndefined: Self = StObject.set(x, "showAllText", js.undefined)
    
    inline def setShowOperationChooser(value: Boolean): Self = StObject.set(x, "showOperationChooser", value.asInstanceOf[js.Any])
    
    inline def setShowOperationChooserUndefined: Self = StObject.set(x, "showOperationChooser", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
