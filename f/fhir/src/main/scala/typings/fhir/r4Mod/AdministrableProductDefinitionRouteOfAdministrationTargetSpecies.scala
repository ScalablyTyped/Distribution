package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdministrableProductDefinitionRouteOfAdministrationTargetSpecies
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
    js.Array[AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriod]
  ] = js.undefined
}
object AdministrableProductDefinitionRouteOfAdministrationTargetSpecies {
  
  inline def apply(code: CodeableConcept): AdministrableProductDefinitionRouteOfAdministrationTargetSpecies = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdministrableProductDefinitionRouteOfAdministrationTargetSpecies]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdministrableProductDefinitionRouteOfAdministrationTargetSpecies] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setWithdrawalPeriod(value: js.Array[AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriod]): Self = StObject.set(x, "withdrawalPeriod", value.asInstanceOf[js.Any])
    
    inline def setWithdrawalPeriodUndefined: Self = StObject.set(x, "withdrawalPeriod", js.undefined)
    
    inline def setWithdrawalPeriodVarargs(value: AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriod*): Self = StObject.set(x, "withdrawalPeriod", js.Array(value*))
  }
}
