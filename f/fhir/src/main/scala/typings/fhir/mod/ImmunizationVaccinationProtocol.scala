package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImmunizationVaccinationProtocol
  extends StObject
     with BackboneElement {
  
  var _description: js.UndefOr[Element] = js.undefined
  
  var _series: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates the authority who published the protocol.  E.g. ACIP.
    */
  var authority: js.UndefOr[Reference] = js.undefined
  
  /**
    * Contains the description about the protocol under which the vaccine was administered.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Nominal position in a series.
    */
  var doseSequence: Double
  
  /**
    * Indicates if the immunization event should "count" against  the protocol.
    */
  var doseStatus: CodeableConcept
  
  /**
    * Provides an explanation as to why an immunization event should or should not count against the protocol.
    */
  var doseStatusReason: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * One possible path to achieve presumed immunity against a disease - within the context of an authority.
    */
  var series: js.UndefOr[String] = js.undefined
  
  /**
    * The recommended number of doses to achieve immunity.
    */
  var seriesDoses: js.UndefOr[Double] = js.undefined
  
  /**
    * The targeted disease.
    */
  var targetDisease: js.Array[CodeableConcept]
}
object ImmunizationVaccinationProtocol {
  
  inline def apply(doseSequence: Double, doseStatus: CodeableConcept, targetDisease: js.Array[CodeableConcept]): ImmunizationVaccinationProtocol = {
    val __obj = js.Dynamic.literal(doseSequence = doseSequence.asInstanceOf[js.Any], doseStatus = doseStatus.asInstanceOf[js.Any], targetDisease = targetDisease.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmunizationVaccinationProtocol]
  }
  
  extension [Self <: ImmunizationVaccinationProtocol](x: Self) {
    
    inline def setAuthority(value: Reference): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDoseSequence(value: Double): Self = StObject.set(x, "doseSequence", value.asInstanceOf[js.Any])
    
    inline def setDoseStatus(value: CodeableConcept): Self = StObject.set(x, "doseStatus", value.asInstanceOf[js.Any])
    
    inline def setDoseStatusReason(value: CodeableConcept): Self = StObject.set(x, "doseStatusReason", value.asInstanceOf[js.Any])
    
    inline def setDoseStatusReasonUndefined: Self = StObject.set(x, "doseStatusReason", js.undefined)
    
    inline def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesDoses(value: Double): Self = StObject.set(x, "seriesDoses", value.asInstanceOf[js.Any])
    
    inline def setSeriesDosesUndefined: Self = StObject.set(x, "seriesDoses", js.undefined)
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setTargetDisease(value: js.Array[CodeableConcept]): Self = StObject.set(x, "targetDisease", value.asInstanceOf[js.Any])
    
    inline def setTargetDiseaseVarargs(value: CodeableConcept*): Self = StObject.set(x, "targetDisease", js.Array(value*))
    
    inline def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    inline def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    inline def set_series(value: Element): Self = StObject.set(x, "_series", value.asInstanceOf[js.Any])
    
    inline def set_seriesUndefined: Self = StObject.set(x, "_series", js.undefined)
  }
}
