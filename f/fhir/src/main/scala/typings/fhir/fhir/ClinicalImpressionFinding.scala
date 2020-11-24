package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Possible or likely findings and diagnoses
  */
@js.native
trait ClinicalImpressionFinding extends BackboneElement {
  
  /**
    * Contains extended information for property 'basis'.
    */
  var _basis: js.UndefOr[Element] = js.native
  
  /**
    * Which investigations support finding
    */
  var basis: js.UndefOr[String] = js.native
  
  /**
    * What was found
    */
  var itemCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * What was found
    */
  var itemReference: js.UndefOr[Reference] = js.native
}
object ClinicalImpressionFinding {
  
  @scala.inline
  def apply(): ClinicalImpressionFinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClinicalImpressionFinding]
  }
  
  @scala.inline
  implicit class ClinicalImpressionFindingOps[Self <: ClinicalImpressionFinding] (val x: Self) extends AnyVal {
    
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
    def set_basis(value: Element): Self = this.set("_basis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_basis: Self = this.set("_basis", js.undefined)
    
    @scala.inline
    def setBasis(value: String): Self = this.set("basis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasis: Self = this.set("basis", js.undefined)
    
    @scala.inline
    def setItemCodeableConcept(value: CodeableConcept): Self = this.set("itemCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemCodeableConcept: Self = this.set("itemCodeableConcept", js.undefined)
    
    @scala.inline
    def setItemReference(value: Reference): Self = this.set("itemReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemReference: Self = this.set("itemReference", js.undefined)
  }
}
