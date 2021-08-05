package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Collection details
  */
trait SpecimenCollection
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'collectedDateTime'.
    */
  var _collectedDateTime: js.UndefOr[Element] = js.undefined
  
  /**
    * Anatomical collection site
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Collection time
    */
  var collectedDateTime: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Collection time
    */
  var collectedPeriod: js.UndefOr[Period] = js.undefined
  
  /**
    * Who collected the specimen
    */
  var collector: js.UndefOr[Reference] = js.undefined
  
  /**
    * Technique used to perform collection
    */
  var method: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * The quantity of specimen collected
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
    
    inline def setCollectedDateTime(value: dateTime): Self = StObject.set(x, "collectedDateTime", value.asInstanceOf[js.Any])
    
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
