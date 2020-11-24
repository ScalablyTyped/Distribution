package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Insurance or medical plan
  */
@js.native
trait ExplanationOfBenefitInsurance extends BackboneElement {
  
  /**
    * Contains extended information for property 'preAuthRef'.
    */
  var _preAuthRef: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Insurance information
    */
  var coverage: js.UndefOr[Reference] = js.native
  
  /**
    * Pre-Authorization/Determination Reference
    */
  var preAuthRef: js.UndefOr[js.Array[String]] = js.native
}
object ExplanationOfBenefitInsurance {
  
  @scala.inline
  def apply(): ExplanationOfBenefitInsurance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplanationOfBenefitInsurance]
  }
  
  @scala.inline
  implicit class ExplanationOfBenefitInsuranceOps[Self <: ExplanationOfBenefitInsurance] (val x: Self) extends AnyVal {
    
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
    def set_preAuthRefVarargs(value: Element*): Self = this.set("_preAuthRef", js.Array(value :_*))
    
    @scala.inline
    def set_preAuthRef(value: js.Array[Element]): Self = this.set("_preAuthRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_preAuthRef: Self = this.set("_preAuthRef", js.undefined)
    
    @scala.inline
    def setCoverage(value: Reference): Self = this.set("coverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverage: Self = this.set("coverage", js.undefined)
    
    @scala.inline
    def setPreAuthRefVarargs(value: String*): Self = this.set("preAuthRef", js.Array(value :_*))
    
    @scala.inline
    def setPreAuthRef(value: js.Array[String]): Self = this.set("preAuthRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreAuthRef: Self = this.set("preAuthRef", js.undefined)
  }
}
