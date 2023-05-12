package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies
  extends StObject
     with BackboneElement {
  
  /**
    * Coded expression for the species.
    */
  var code: CodeableConcept
  
  /**
    * A species specific time during which consumption of animal product is not appropriate.
    */
  var withdrawalPeriod: js.UndefOr[
    js.Array[MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod]
  ] = js.undefined
}
object MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies {
  
  inline def apply(code: CodeableConcept): MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpecies] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setWithdrawalPeriod(value: js.Array[MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod]): Self = StObject.set(x, "withdrawalPeriod", value.asInstanceOf[js.Any])
    
    inline def setWithdrawalPeriodUndefined: Self = StObject.set(x, "withdrawalPeriod", js.undefined)
    
    inline def setWithdrawalPeriodVarargs(value: MedicinalProductPharmaceuticalRouteOfAdministrationTargetSpeciesWithdrawalPeriod*): Self = StObject.set(x, "withdrawalPeriod", js.Array(value*))
  }
}
