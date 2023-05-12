package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BiologicallyDerivedProductProcessing
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _timeDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Substance added during processing.
    */
  var additive: js.UndefOr[Reference] = js.undefined
  
  /**
    * Description of of processing.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Procesing code.
    */
  var procedure: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Time of processing.
    */
  var timeDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Time of processing.
    */
  var timePeriod: js.UndefOr[Period] = js.undefined
}
object BiologicallyDerivedProductProcessing {
  
  inline def apply(): BiologicallyDerivedProductProcessing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BiologicallyDerivedProductProcessing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BiologicallyDerivedProductProcessing] (val x: Self) extends AnyVal {
    
    inline def setAdditive(value: Reference): Self = StObject.set(x, "additive", value.asInstanceOf[js.Any])
    
    inline def setAdditiveUndefined: Self = StObject.set(x, "additive", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setProcedure(value: CodeableConcept): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
    
    inline def setProcedureUndefined: Self = StObject.set(x, "procedure", js.undefined)
    
    inline def setTimeDateTime(value: String): Self = StObject.set(x, "timeDateTime", value.asInstanceOf[js.Any])
    
    inline def setTimeDateTimeUndefined: Self = StObject.set(x, "timeDateTime", js.undefined)
    
    inline def setTimePeriod(value: Period): Self = StObject.set(x, "timePeriod", value.asInstanceOf[js.Any])
    
    inline def setTimePeriodUndefined: Self = StObject.set(x, "timePeriod", js.undefined)
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_timeDateTime(value: Element): Self = StObject.set(x, "_timeDateTime", value.asInstanceOf[js.Any])
    
    inline def set_timeDateTimeUndefined: Self = StObject.set(x, "_timeDateTime", js.undefined)
  }
}
