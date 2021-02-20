package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
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
  implicit class ExplanationOfBenefitInsuranceMutableBuilder[Self <: ExplanationOfBenefitInsurance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoverage(value: Reference): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoverageUndefined: Self = StObject.set(x, "coverage", js.undefined)
    
    @scala.inline
    def setPreAuthRef(value: js.Array[String]): Self = StObject.set(x, "preAuthRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreAuthRefUndefined: Self = StObject.set(x, "preAuthRef", js.undefined)
    
    @scala.inline
    def setPreAuthRefVarargs(value: String*): Self = StObject.set(x, "preAuthRef", js.Array(value :_*))
    
    @scala.inline
    def set_preAuthRef(value: js.Array[Element]): Self = StObject.set(x, "_preAuthRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_preAuthRefUndefined: Self = StObject.set(x, "_preAuthRef", js.undefined)
    
    @scala.inline
    def set_preAuthRefVarargs(value: Element*): Self = StObject.set(x, "_preAuthRef", js.Array(value :_*))
  }
}
