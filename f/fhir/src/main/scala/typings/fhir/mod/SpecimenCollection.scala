package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecimenCollection
  extends StObject
     with BackboneElement {
  
  var _collectedDateTime: js.UndefOr[Element] = js.undefined
  
  var _comment: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Anatomical location from which the specimen was collected (if subject is a patient). This is the target site.  This element is not used for environmental specimens.
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
    * To communicate any details or issues encountered during the specimen collection procedure.
    */
  var comment: js.UndefOr[js.Array[String]] = js.undefined
  
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
    
    inline def setComment(value: js.Array[String]): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCommentVarargs(value: String*): Self = StObject.set(x, "comment", js.Array(value*))
    
    inline def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setQuantity(value: Quantity): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def set_collectedDateTime(value: Element): Self = StObject.set(x, "_collectedDateTime", value.asInstanceOf[js.Any])
    
    inline def set_collectedDateTimeUndefined: Self = StObject.set(x, "_collectedDateTime", js.undefined)
    
    inline def set_comment(value: js.Array[Element]): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    inline def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
    
    inline def set_commentVarargs(value: Element*): Self = StObject.set(x, "_comment", js.Array(value*))
  }
}
