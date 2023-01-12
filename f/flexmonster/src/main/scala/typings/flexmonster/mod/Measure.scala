package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Measure extends StObject {
  
  var active: js.UndefOr[Boolean] = js.undefined
  
  var aggregation: js.UndefOr[String] = js.undefined
  
  var availableAggregations: js.UndefOr[js.Array[String]] = js.undefined
  
  var caption: js.UndefOr[String] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var formula: js.UndefOr[String] = js.undefined
  
  var grandTotalCaption: js.UndefOr[String] = js.undefined
  
  var uniqueName: js.UndefOr[String] = js.undefined
}
object Measure {
  
  inline def apply(): Measure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Measure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Measure] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setAggregation(value: String): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
    
    inline def setAvailableAggregations(value: js.Array[String]): Self = StObject.set(x, "availableAggregations", value.asInstanceOf[js.Any])
    
    inline def setAvailableAggregationsUndefined: Self = StObject.set(x, "availableAggregations", js.undefined)
    
    inline def setAvailableAggregationsVarargs(value: String*): Self = StObject.set(x, "availableAggregations", js.Array(value*))
    
    inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    inline def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    inline def setGrandTotalCaption(value: String): Self = StObject.set(x, "grandTotalCaption", value.asInstanceOf[js.Any])
    
    inline def setGrandTotalCaptionUndefined: Self = StObject.set(x, "grandTotalCaption", js.undefined)
    
    inline def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    inline def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
  }
}
