package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecimenCollection
  extends StObject
     with BackboneElement {
  
  var _collectedDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * If the use case requires  BodySite to be handled as a separate resource instead of an inline coded element (e.g. to identify and track separately)  then use the standard extension [bodySite](extension-bodysite.html).
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Time when specimen was collected from subject - the physiologically relevant time.
    */
  var collectedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Time when specimen was collected from subject - the physiologically relevant time.
    */
  var collectedPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Person who collected the specimen.
    */
  var collector: js.UndefOr[Reference] = js.undefined
  
  /**
    * The span of time over which the collection of a specimen occurred.
    */
  var duration: js.UndefOr[Duration] = js.undefined
  
  /**
    * Representing fasting status using this element is preferred to representing it with an observation using a 'pre-coordinated code'  such as  LOINC 2005-7 (Calcium [Moles/​time] in 2 hour Urine --12 hours fasting), or  using  a component observation ` such as `Observation.component code`  = LOINC 49541-6 (Fasting status - Reported).
    */
  var fastingStatusCodeableConcept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Representing fasting status using this element is preferred to representing it with an observation using a 'pre-coordinated code'  such as  LOINC 2005-7 (Calcium [Moles/​time] in 2 hour Urine --12 hours fasting), or  using  a component observation ` such as `Observation.component code`  = LOINC 49541-6 (Fasting status - Reported).
    */
  var fastingStatusDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * A coded value specifying the technique that is used to perform the procedure.
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The quantity of specimen collected; for instance the volume of a blood sample, or the physical measurement of an anatomic pathology sample.
    */
  var quantity: js.UndefOr[Quantity] = js.undefined
}
object SpecimenCollection {
  
  inline def apply(): SpecimenCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecimenCollection]
  }
  
  extension [Self <: SpecimenCollection](x: Self) {
    
    inline def setBodySite(value: CodeableConcept): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setCollectedDateTime(value: String): Self = StObject.set(x, "collectedDateTime", value.asInstanceOf[js.Any])
    
    inline def setCollectedDateTimeUndefined: Self = StObject.set(x, "collectedDateTime", js.undefined)
    
    inline def setCollectedPeriod(value: Period): Self = StObject.set(x, "collectedPeriod", value.asInstanceOf[js.Any])
    
    inline def setCollectedPeriodUndefined: Self = StObject.set(x, "collectedPeriod", js.undefined)
    
    inline def setCollector(value: Reference): Self = StObject.set(x, "collector", value.asInstanceOf[js.Any])
    
    inline def setCollectorUndefined: Self = StObject.set(x, "collector", js.undefined)
    
    inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setFastingStatusCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "fastingStatusCodeableConcept", value.asInstanceOf[js.Any])
    
    inline def setFastingStatusCodeableConceptUndefined: Self = StObject.set(x, "fastingStatusCodeableConcept", js.undefined)
    
    inline def setFastingStatusDuration(value: Duration): Self = StObject.set(x, "fastingStatusDuration", value.asInstanceOf[js.Any])
    
    inline def setFastingStatusDurationUndefined: Self = StObject.set(x, "fastingStatusDuration", js.undefined)
    
    inline def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def set_collectedDateTime(value: Element): Self = StObject.set(x, "_collectedDateTime", value.asInstanceOf[js.Any])
    
    inline def set_collectedDateTimeUndefined: Self = StObject.set(x, "_collectedDateTime", js.undefined)
  }
}
