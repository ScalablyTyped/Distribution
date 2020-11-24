package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details of how medication was taken
  */
@js.native
trait MedicationAdministrationDosage extends BackboneElement {
  
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  
  /**
    * Amount of medication per dose
    */
  var dose: js.UndefOr[Quantity] = js.native
  
  /**
    * How drug was administered
    */
  var method: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Dose quantity per unit of time
    */
  var rateQuantity: js.UndefOr[Quantity] = js.native
  
  /**
    * Dose quantity per unit of time
    */
  var rateRatio: js.UndefOr[Ratio] = js.native
  
  /**
    * Path of substance into body
    */
  var route: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Body site administered to
    */
  var site: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Free text dosage instructions e.g. SIG
    */
  var text: js.UndefOr[String] = js.native
}
object MedicationAdministrationDosage {
  
  @scala.inline
  def apply(): MedicationAdministrationDosage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MedicationAdministrationDosage]
  }
  
  @scala.inline
  implicit class MedicationAdministrationDosageOps[Self <: MedicationAdministrationDosage] (val x: Self) extends AnyVal {
    
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
    def set_text(value: Element): Self = this.set("_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_text: Self = this.set("_text", js.undefined)
    
    @scala.inline
    def setDose(value: Quantity): Self = this.set("dose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDose: Self = this.set("dose", js.undefined)
    
    @scala.inline
    def setMethod(value: CodeableConcept): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setRateQuantity(value: Quantity): Self = this.set("rateQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRateQuantity: Self = this.set("rateQuantity", js.undefined)
    
    @scala.inline
    def setRateRatio(value: Ratio): Self = this.set("rateRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRateRatio: Self = this.set("rateRatio", js.undefined)
    
    @scala.inline
    def setRoute(value: CodeableConcept): Self = this.set("route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoute: Self = this.set("route", js.undefined)
    
    @scala.inline
    def setSite(value: CodeableConcept): Self = this.set("site", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSite: Self = this.set("site", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
