package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdministrableProductDefinitionRouteOfAdministration
  extends StObject
     with BackboneElement {
  
  /**
    * Coded expression for the route.
    */
  var code: CodeableConcept
  
  /**
    * The first dose (dose quantity) administered can be specified for the product, using a numerical value and its unit of measurement.
    */
  var firstDose: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The maximum dose per day (maximum dose quantity to be administered in any one 24-h period) that can be administered.
    */
  var maxDosePerDay: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The maximum dose per treatment period that can be administered.
    */
  var maxDosePerTreatmentPeriod: js.UndefOr[Ratio] = js.undefined
  
  /**
    * The maximum single dose that can be administered, specified using a numerical value and its unit of measurement.
    */
  var maxSingleDose: js.UndefOr[Quantity] = js.undefined
  
  /**
    * The maximum treatment period during which the product can be administered.
    */
  var maxTreatmentPeriod: js.UndefOr[Duration] = js.undefined
  
  /**
    * A species for which this route applies.
    */
  var targetSpecies: js.UndefOr[js.Array[AdministrableProductDefinitionRouteOfAdministrationTargetSpecies]] = js.undefined
}
object AdministrableProductDefinitionRouteOfAdministration {
  
  inline def apply(code: CodeableConcept): AdministrableProductDefinitionRouteOfAdministration = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdministrableProductDefinitionRouteOfAdministration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdministrableProductDefinitionRouteOfAdministration] (val x: Self) extends AnyVal {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setFirstDose(value: Quantity): Self = StObject.set(x, "firstDose", value.asInstanceOf[js.Any])
    
    inline def setFirstDoseUndefined: Self = StObject.set(x, "firstDose", js.undefined)
    
    inline def setMaxDosePerDay(value: Quantity): Self = StObject.set(x, "maxDosePerDay", value.asInstanceOf[js.Any])
    
    inline def setMaxDosePerDayUndefined: Self = StObject.set(x, "maxDosePerDay", js.undefined)
    
    inline def setMaxDosePerTreatmentPeriod(value: Ratio): Self = StObject.set(x, "maxDosePerTreatmentPeriod", value.asInstanceOf[js.Any])
    
    inline def setMaxDosePerTreatmentPeriodUndefined: Self = StObject.set(x, "maxDosePerTreatmentPeriod", js.undefined)
    
    inline def setMaxSingleDose(value: Quantity): Self = StObject.set(x, "maxSingleDose", value.asInstanceOf[js.Any])
    
    inline def setMaxSingleDoseUndefined: Self = StObject.set(x, "maxSingleDose", js.undefined)
    
    inline def setMaxTreatmentPeriod(value: Duration): Self = StObject.set(x, "maxTreatmentPeriod", value.asInstanceOf[js.Any])
    
    inline def setMaxTreatmentPeriodUndefined: Self = StObject.set(x, "maxTreatmentPeriod", js.undefined)
    
    inline def setTargetSpecies(value: js.Array[AdministrableProductDefinitionRouteOfAdministrationTargetSpecies]): Self = StObject.set(x, "targetSpecies", value.asInstanceOf[js.Any])
    
    inline def setTargetSpeciesUndefined: Self = StObject.set(x, "targetSpecies", js.undefined)
    
    inline def setTargetSpeciesVarargs(value: AdministrableProductDefinitionRouteOfAdministrationTargetSpecies*): Self = StObject.set(x, "targetSpecies", js.Array(value*))
  }
}
