package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecimenCollection
  extends StObject
     with BackboneElement {
  
  var _collectedDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * If the use case requires  BodySite to be handled as a separate resource instead of an inline coded element (e.g. to identify and track separately)  then use the standard extension [body-site-instance](extension-body-site-instance.html).
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpecimenCollection] (val x: Self) extends AnyVal {
    
    inline def setBodySite(value: CodeableConcept): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    inline def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    inline def setCollectedDateTime(value: String): Self = StObject.set(x, "collectedDateTime", value.asInstanceOf[js.Any])
    
    inline def setCollectedDateTimeUndefined: Self = StObject.set(x, "collectedDateTime", js.undefined)
    
    inline def setCollectedPeriod(value: Period): Self = StObject.set(x, "collectedPeriod", value.asInstanceOf[js.Any])
    
    inline def setCollectedPeriodUndefined: Self = StObject.set(x, "collectedPeriod", js.undefined)
    
    inline def setCollector(value: Reference): Self = StObject.set(x, "collector", value.asInstanceOf[js.Any])
    
    inline def setCollectorUndefined: Self = StObject.set(x, "collector", js.undefined)
    
    inline def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def set_collectedDateTime(value: Element): Self = StObject.set(x, "_collectedDateTime", value.asInstanceOf[js.Any])
    
    inline def set_collectedDateTimeUndefined: Self = StObject.set(x, "_collectedDateTime", js.undefined)
  }
}
