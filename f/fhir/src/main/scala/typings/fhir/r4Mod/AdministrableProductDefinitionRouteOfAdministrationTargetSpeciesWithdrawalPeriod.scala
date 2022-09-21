package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriod
  extends StObject
     with BackboneElement {
  
  var _supportingInformation: js.UndefOr[Element] = js.undefined
  
  /**
    * Extra information about the withdrawal period.
    */
  var supportingInformation: js.UndefOr[String] = js.undefined
  
  /**
    * Coded expression for the type of tissue for which the withdrawal period applues, e.g. meat, milk.
    */
  var tissue: CodeableConcept
  
  /**
    * A value for the time.
    */
  var value: Quantity
}
object AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriod {
  
  inline def apply(tissue: CodeableConcept, value: Quantity): AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriod = {
    val __obj = js.Dynamic.literal(tissue = tissue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriod]
  }
  
  extension [Self <: AdministrableProductDefinitionRouteOfAdministrationTargetSpeciesWithdrawalPeriod](x: Self) {
    
    inline def setSupportingInformation(value: String): Self = StObject.set(x, "supportingInformation", value.asInstanceOf[js.Any])
    
    inline def setSupportingInformationUndefined: Self = StObject.set(x, "supportingInformation", js.undefined)
    
    inline def setTissue(value: CodeableConcept): Self = StObject.set(x, "tissue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Quantity): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_supportingInformation(value: Element): Self = StObject.set(x, "_supportingInformation", value.asInstanceOf[js.Any])
    
    inline def set_supportingInformationUndefined: Self = StObject.set(x, "_supportingInformation", js.undefined)
  }
}
