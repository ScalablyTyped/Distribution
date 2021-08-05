package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Insurance or medical plan
  */
trait ExplanationOfBenefitInsurance
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'preAuthRef'.
    */
  var _preAuthRef: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Insurance information
    */
  var coverage: js.UndefOr[Reference] = js.undefined
  
  /**
    * Pre-Authorization/Determination Reference
    */
  var preAuthRef: js.UndefOr[js.Array[String]] = js.undefined
}
object ExplanationOfBenefitInsurance {
  
  inline def apply(): ExplanationOfBenefitInsurance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExplanationOfBenefitInsurance]
  }
  
  extension [Self <: ExplanationOfBenefitInsurance](x: Self) {
    
    inline def setCoverage(value: Reference): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
    
    inline def setCoverageUndefined: Self = StObject.set(x, "coverage", js.undefined)
    
    inline def setPreAuthRef(value: js.Array[String]): Self = StObject.set(x, "preAuthRef", value.asInstanceOf[js.Any])
    
    inline def setPreAuthRefUndefined: Self = StObject.set(x, "preAuthRef", js.undefined)
    
    inline def setPreAuthRefVarargs(value: String*): Self = StObject.set(x, "preAuthRef", js.Array(value :_*))
    
    inline def set_preAuthRef(value: js.Array[Element]): Self = StObject.set(x, "_preAuthRef", value.asInstanceOf[js.Any])
    
    inline def set_preAuthRefUndefined: Self = StObject.set(x, "_preAuthRef", js.undefined)
    
    inline def set_preAuthRefVarargs(value: Element*): Self = StObject.set(x, "_preAuthRef", js.Array(value :_*))
  }
}
