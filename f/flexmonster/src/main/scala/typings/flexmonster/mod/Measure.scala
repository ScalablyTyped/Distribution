package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Measure extends StObject {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var aggregation: js.UndefOr[String] = js.native
  
  var availableAggregations: js.UndefOr[js.Array[String]] = js.native
  
  var caption: js.UndefOr[String] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var formula: js.UndefOr[String] = js.native
  
  var grandTotalCaption: js.UndefOr[String] = js.native
  
  var uniqueName: js.UndefOr[String] = js.native
}
object Measure {
  
  @scala.inline
  def apply(): Measure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Measure]
  }
  
  @scala.inline
  implicit class MeasureMutableBuilder[Self <: Measure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setAggregation(value: String): Self = StObject.set(x, "aggregation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationUndefined: Self = StObject.set(x, "aggregation", js.undefined)
    
    @scala.inline
    def setAvailableAggregations(value: js.Array[String]): Self = StObject.set(x, "availableAggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableAggregationsUndefined: Self = StObject.set(x, "availableAggregations", js.undefined)
    
    @scala.inline
    def setAvailableAggregationsVarargs(value: String*): Self = StObject.set(x, "availableAggregations", js.Array(value :_*))
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    @scala.inline
    def setGrandTotalCaption(value: String): Self = StObject.set(x, "grandTotalCaption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrandTotalCaptionUndefined: Self = StObject.set(x, "grandTotalCaption", js.undefined)
    
    @scala.inline
    def setUniqueName(value: String): Self = StObject.set(x, "uniqueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueNameUndefined: Self = StObject.set(x, "uniqueName", js.undefined)
  }
}
