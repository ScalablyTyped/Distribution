package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoverageCostToBeneficiaryException
  extends StObject
     with BackboneElement {
  
  /**
    * The timeframe during when the exception is in force.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * The code for the specific exception.
    */
  var `type`: CodeableConcept
}
object CoverageCostToBeneficiaryException {
  
  inline def apply(`type`: CodeableConcept): CoverageCostToBeneficiaryException = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageCostToBeneficiaryException]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CoverageCostToBeneficiaryException] (val x: Self) extends AnyVal {
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
