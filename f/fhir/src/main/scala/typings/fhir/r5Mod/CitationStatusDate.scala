package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CitationStatusDate
  extends StObject
     with BackboneElement {
  
  var _actual: js.UndefOr[Element] = js.undefined
  
  /**
    * Classification of the status.
    */
  var activity: CodeableConcept
  
  /**
    * Either occurred or expected.
    */
  var actual: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For an instance, place the same value in both start and end elements.
    */
  var period: Period
}
object CitationStatusDate {
  
  inline def apply(activity: CodeableConcept, period: Period): CitationStatusDate = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], period = period.asInstanceOf[js.Any])
    __obj.asInstanceOf[CitationStatusDate]
  }
  
  extension [Self <: CitationStatusDate](x: Self) {
    
    inline def setActivity(value: CodeableConcept): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setActual(value: Boolean): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    inline def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def set_actual(value: Element): Self = StObject.set(x, "_actual", value.asInstanceOf[js.Any])
    
    inline def set_actualUndefined: Self = StObject.set(x, "_actual", js.undefined)
  }
}
