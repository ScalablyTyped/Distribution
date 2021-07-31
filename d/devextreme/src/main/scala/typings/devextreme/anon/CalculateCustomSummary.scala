package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculateCustomSummary extends StObject {
  
  var calculateCustomSummary: js.UndefOr[js.Function1[/* options */ TotalValue, js.Any]] = js.undefined
  
  var groupItems: js.UndefOr[js.Array[AlignByColumn]] = js.undefined
  
  var recalculateWhileEditing: js.UndefOr[Boolean] = js.undefined
  
  var skipEmptyValues: js.UndefOr[Boolean] = js.undefined
  
  var texts: js.UndefOr[Avg] = js.undefined
  
  var totalItems: js.UndefOr[js.Array[Alignment]] = js.undefined
}
object CalculateCustomSummary {
  
  @scala.inline
  def apply(): CalculateCustomSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalculateCustomSummary]
  }
  
  @scala.inline
  implicit class CalculateCustomSummaryMutableBuilder[Self <: CalculateCustomSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalculateCustomSummary(value: /* options */ TotalValue => js.Any): Self = StObject.set(x, "calculateCustomSummary", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCalculateCustomSummaryUndefined: Self = StObject.set(x, "calculateCustomSummary", js.undefined)
    
    @scala.inline
    def setGroupItems(value: js.Array[AlignByColumn]): Self = StObject.set(x, "groupItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupItemsUndefined: Self = StObject.set(x, "groupItems", js.undefined)
    
    @scala.inline
    def setGroupItemsVarargs(value: AlignByColumn*): Self = StObject.set(x, "groupItems", js.Array(value :_*))
    
    @scala.inline
    def setRecalculateWhileEditing(value: Boolean): Self = StObject.set(x, "recalculateWhileEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecalculateWhileEditingUndefined: Self = StObject.set(x, "recalculateWhileEditing", js.undefined)
    
    @scala.inline
    def setSkipEmptyValues(value: Boolean): Self = StObject.set(x, "skipEmptyValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipEmptyValuesUndefined: Self = StObject.set(x, "skipEmptyValues", js.undefined)
    
    @scala.inline
    def setTexts(value: Avg): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    
    @scala.inline
    def setTotalItems(value: js.Array[Alignment]): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
    
    @scala.inline
    def setTotalItemsVarargs(value: Alignment*): Self = StObject.set(x, "totalItems", js.Array(value :_*))
  }
}
