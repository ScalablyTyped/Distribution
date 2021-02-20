package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Collection details
  */
@js.native
trait SpecimenCollection extends BackboneElement {
  
  /**
    * Contains extended information for property 'collectedDateTime'.
    */
  var _collectedDateTime: js.UndefOr[Element] = js.native
  
  /**
    * Anatomical collection site
    */
  var bodySite: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Collection time
    */
  var collectedDateTime: js.UndefOr[dateTime] = js.native
  
  /**
    * Collection time
    */
  var collectedPeriod: js.UndefOr[Period] = js.native
  
  /**
    * Who collected the specimen
    */
  var collector: js.UndefOr[Reference] = js.native
  
  /**
    * Technique used to perform collection
    */
  var method: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * The quantity of specimen collected
    */
  var quantity: js.UndefOr[Quantity] = js.native
}
object SpecimenCollection {
  
  @scala.inline
  def apply(): SpecimenCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecimenCollection]
  }
  
  @scala.inline
  implicit class SpecimenCollectionMutableBuilder[Self <: SpecimenCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBodySite(value: CodeableConcept): Self = StObject.set(x, "bodySite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodySiteUndefined: Self = StObject.set(x, "bodySite", js.undefined)
    
    @scala.inline
    def setCollectedDateTime(value: dateTime): Self = StObject.set(x, "collectedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectedDateTimeUndefined: Self = StObject.set(x, "collectedDateTime", js.undefined)
    
    @scala.inline
    def setCollectedPeriod(value: Period): Self = StObject.set(x, "collectedPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectedPeriodUndefined: Self = StObject.set(x, "collectedPeriod", js.undefined)
    
    @scala.inline
    def setCollector(value: Reference): Self = StObject.set(x, "collector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectorUndefined: Self = StObject.set(x, "collector", js.undefined)
    
    @scala.inline
    def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def set_collectedDateTime(value: Element): Self = StObject.set(x, "_collectedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_collectedDateTimeUndefined: Self = StObject.set(x, "_collectedDateTime", js.undefined)
  }
}
