package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about an accident
  */
@js.native
trait ClaimAccident extends BackboneElement {
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  
  /**
    * When the accident occurred
    * see information codes
    * see information codes
    */
  var date: typings.fhir.fhir.date = js.native
  
  /**
    * Accident Place
    */
  var locationAddress: js.UndefOr[Address] = js.native
  
  /**
    * Accident Place
    */
  var locationReference: js.UndefOr[Reference] = js.native
  
  /**
    * The nature of the accident
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}
object ClaimAccident {
  
  @scala.inline
  def apply(date: date): ClaimAccident = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimAccident]
  }
  
  @scala.inline
  implicit class ClaimAccidentOps[Self <: ClaimAccident] (val x: Self) extends AnyVal {
    
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
    def setDate(value: date): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_date(value: Element): Self = this.set("_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_date: Self = this.set("_date", js.undefined)
    
    @scala.inline
    def setLocationAddress(value: Address): Self = this.set("locationAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationAddress: Self = this.set("locationAddress", js.undefined)
    
    @scala.inline
    def setLocationReference(value: Reference): Self = this.set("locationReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationReference: Self = this.set("locationReference", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
