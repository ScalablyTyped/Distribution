package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Insurance or medical plan
  */
@js.native
trait ClaimResponseInsurance extends BackboneElement {
  
  /**
    * Contains extended information for property 'businessArrangement'.
    */
  var _businessArrangement: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'focal'.
    */
  var _focal: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'preAuthRef'.
    */
  var _preAuthRef: js.UndefOr[js.Array[Element]] = js.native
  
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.native
  
  /**
    * Business agreement
    */
  var businessArrangement: js.UndefOr[String] = js.native
  
  /**
    * Adjudication results
    */
  var claimResponse: js.UndefOr[Reference] = js.native
  
  /**
    * Insurance information
    */
  var coverage: Reference = js.native
  
  /**
    * Is the focal Coverage
    */
  var focal: Boolean = js.native
  
  /**
    * Pre-Authorization/Determination Reference
    */
  var preAuthRef: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Service instance identifier
    */
  var sequence: positiveInt = js.native
}
object ClaimResponseInsurance {
  
  @scala.inline
  def apply(coverage: Reference, focal: Boolean, sequence: positiveInt): ClaimResponseInsurance = {
    val __obj = js.Dynamic.literal(coverage = coverage.asInstanceOf[js.Any], focal = focal.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseInsurance]
  }
  
  @scala.inline
  implicit class ClaimResponseInsuranceOps[Self <: ClaimResponseInsurance] (val x: Self) extends AnyVal {
    
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
    def setCoverage(value: Reference): Self = this.set("coverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocal(value: Boolean): Self = this.set("focal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequence(value: positiveInt): Self = this.set("sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_businessArrangement(value: Element): Self = this.set("_businessArrangement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_businessArrangement: Self = this.set("_businessArrangement", js.undefined)
    
    @scala.inline
    def set_focal(value: Element): Self = this.set("_focal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_focal: Self = this.set("_focal", js.undefined)
    
    @scala.inline
    def set_preAuthRefVarargs(value: Element*): Self = this.set("_preAuthRef", js.Array(value :_*))
    
    @scala.inline
    def set_preAuthRef(value: js.Array[Element]): Self = this.set("_preAuthRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_preAuthRef: Self = this.set("_preAuthRef", js.undefined)
    
    @scala.inline
    def set_sequence(value: Element): Self = this.set("_sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_sequence: Self = this.set("_sequence", js.undefined)
    
    @scala.inline
    def setBusinessArrangement(value: String): Self = this.set("businessArrangement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusinessArrangement: Self = this.set("businessArrangement", js.undefined)
    
    @scala.inline
    def setClaimResponse(value: Reference): Self = this.set("claimResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaimResponse: Self = this.set("claimResponse", js.undefined)
    
    @scala.inline
    def setPreAuthRefVarargs(value: String*): Self = this.set("preAuthRef", js.Array(value :_*))
    
    @scala.inline
    def setPreAuthRef(value: js.Array[String]): Self = this.set("preAuthRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreAuthRef: Self = this.set("preAuthRef", js.undefined)
  }
}
