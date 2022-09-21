package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImmunizationProtocolApplied
  extends StObject
     with BackboneElement {
  
  var _doseNumber: js.UndefOr[Element] = js.undefined
  
  var _series: js.UndefOr[Element] = js.undefined
  
  var _seriesDoses: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates the authority who published the protocol (e.g. ACIP) that is being followed.
    */
  var authority: js.UndefOr[Reference] = js.undefined
  
  /**
    * The use of an integer is preferred if known. Text should only be used in cases where an integer is not available (such as when documenting a recurring booster dose).
    */
  var doseNumber: String
  
  /**
    * One possible path to achieve presumed immunity against a disease - within the context of an authority.
    */
  var series: js.UndefOr[String] = js.undefined
  
  /**
    * The use of an integer is preferred if known.
    */
  var seriesDoses: js.UndefOr[String] = js.undefined
  
  /**
    * The vaccine preventable disease the dose is being administered against.
    */
  var targetDisease: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object ImmunizationProtocolApplied {
  
  inline def apply(doseNumber: String): ImmunizationProtocolApplied = {
    val __obj = js.Dynamic.literal(doseNumber = doseNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmunizationProtocolApplied]
  }
  
  extension [Self <: ImmunizationProtocolApplied](x: Self) {
    
    inline def setAuthority(value: Reference): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    inline def setDoseNumber(value: String): Self = StObject.set(x, "doseNumber", value.asInstanceOf[js.Any])
    
    inline def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesDoses(value: String): Self = StObject.set(x, "seriesDoses", value.asInstanceOf[js.Any])
    
    inline def setSeriesDosesUndefined: Self = StObject.set(x, "seriesDoses", js.undefined)
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setTargetDisease(value: js.Array[CodeableConcept]): Self = StObject.set(x, "targetDisease", value.asInstanceOf[js.Any])
    
    inline def setTargetDiseaseUndefined: Self = StObject.set(x, "targetDisease", js.undefined)
    
    inline def setTargetDiseaseVarargs(value: CodeableConcept*): Self = StObject.set(x, "targetDisease", js.Array(value*))
    
    inline def set_doseNumber(value: Element): Self = StObject.set(x, "_doseNumber", value.asInstanceOf[js.Any])
    
    inline def set_doseNumberUndefined: Self = StObject.set(x, "_doseNumber", js.undefined)
    
    inline def set_series(value: Element): Self = StObject.set(x, "_series", value.asInstanceOf[js.Any])
    
    inline def set_seriesDoses(value: Element): Self = StObject.set(x, "_seriesDoses", value.asInstanceOf[js.Any])
    
    inline def set_seriesDosesUndefined: Self = StObject.set(x, "_seriesDoses", js.undefined)
    
    inline def set_seriesUndefined: Self = StObject.set(x, "_series", js.undefined)
  }
}
