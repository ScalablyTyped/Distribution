package typings.fhir.fhir

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
  implicit class SpecimenCollectionOps[Self <: SpecimenCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_collectedDateTime(value: Element): Self = this.set("_collectedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_collectedDateTime: Self = this.set("_collectedDateTime", js.undefined)
    
    @scala.inline
    def setBodySite(value: CodeableConcept): Self = this.set("bodySite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBodySite: Self = this.set("bodySite", js.undefined)
    
    @scala.inline
    def setCollectedDateTime(value: dateTime): Self = this.set("collectedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectedDateTime: Self = this.set("collectedDateTime", js.undefined)
    
    @scala.inline
    def setCollectedPeriod(value: Period): Self = this.set("collectedPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectedPeriod: Self = this.set("collectedPeriod", js.undefined)
    
    @scala.inline
    def setCollector(value: Reference): Self = this.set("collector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollector: Self = this.set("collector", js.undefined)
    
    @scala.inline
    def setMethod(value: CodeableConcept): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setQuantity(value: Quantity): Self = this.set("quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
  }
}
