package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsurancePlanCoverage
  extends StObject
     with BackboneElement {
  
  /**
    * Specific benefits under this type of coverage.
    */
  var benefit: js.Array[InsurancePlanCoverageBenefit]
  
  /**
    * Networks are represented as a hierarchy of organization resources.
    */
  var network: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Type of coverage  (Medical; Dental; Mental Health; Substance Abuse; Vision; Drug; Short Term; Long Term Care; Hospice; Home Health).
    */
  var `type`: CodeableConcept
}
object InsurancePlanCoverage {
  
  inline def apply(benefit: js.Array[InsurancePlanCoverageBenefit], `type`: CodeableConcept): InsurancePlanCoverage = {
    val __obj = js.Dynamic.literal(benefit = benefit.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsurancePlanCoverage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsurancePlanCoverage] (val x: Self) extends AnyVal {
    
    inline def setBenefit(value: js.Array[InsurancePlanCoverageBenefit]): Self = StObject.set(x, "benefit", value.asInstanceOf[js.Any])
    
    inline def setBenefitVarargs(value: InsurancePlanCoverageBenefit*): Self = StObject.set(x, "benefit", js.Array(value*))
    
    inline def setNetwork(value: js.Array[Reference]): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setNetworkVarargs(value: Reference*): Self = StObject.set(x, "network", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
