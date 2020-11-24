package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Qualifications obtained by training and certification
  */
@js.native
trait PractitionerQualification extends BackboneElement {
  
  /**
    * Coded representation of the qualification
    */
  var code: CodeableConcept = js.native
  
  /**
    * An identifier for this qualification for the practitioner
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Organization that regulates and issues the qualification
    */
  var issuer: js.UndefOr[Reference] = js.native
  
  /**
    * Period during which the qualification is valid
    */
  var period: js.UndefOr[Period] = js.native
}
object PractitionerQualification {
  
  @scala.inline
  def apply(code: CodeableConcept): PractitionerQualification = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[PractitionerQualification]
  }
  
  @scala.inline
  implicit class PractitionerQualificationOps[Self <: PractitionerQualification] (val x: Self) extends AnyVal {
    
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
    def setCode(value: CodeableConcept): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = this.set("identifier", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setIssuer(value: Reference): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
    
    @scala.inline
    def setPeriod(value: Period): Self = this.set("period", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeriod: Self = this.set("period", js.undefined)
  }
}
