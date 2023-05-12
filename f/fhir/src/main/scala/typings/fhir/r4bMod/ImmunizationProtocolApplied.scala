package typings.fhir.r4bMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImmunizationProtocolApplied
  extends StObject
     with BackboneElement {
  
  var _doseNumberString: js.UndefOr[Element] = js.undefined
  
  var _series: js.UndefOr[Element] = js.undefined
  
  var _seriesDosesString: js.UndefOr[Element] = js.undefined
  
  /**
    * Indicates the authority who published the protocol (e.g. ACIP) that is being followed.
    */
  var authority: js.UndefOr[Reference] = js.undefined
  
  /**
    * The use of an integer is preferred if known. A string should only be used in cases where an integer is not available (such as when documenting a recurring booster dose).
    */
  var doseNumberPositiveInt: js.UndefOr[Double] = js.undefined
  
  /**
    * The use of an integer is preferred if known. A string should only be used in cases where an integer is not available (such as when documenting a recurring booster dose).
    */
  var doseNumberString: js.UndefOr[String] = js.undefined
  
  /**
    * One possible path to achieve presumed immunity against a disease - within the context of an authority.
    */
  var series: js.UndefOr[String] = js.undefined
  
  /**
    * The use of an integer is preferred if known. A string should only be used in cases where an integer is not available (such as when documenting a recurring booster dose).
    */
  var seriesDosesPositiveInt: js.UndefOr[Double] = js.undefined
  
  /**
    * The use of an integer is preferred if known. A string should only be used in cases where an integer is not available (such as when documenting a recurring booster dose).
    */
  var seriesDosesString: js.UndefOr[String] = js.undefined
  
  /**
    * The vaccine preventable disease the dose is being administered against.
    */
  var targetDisease: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object ImmunizationProtocolApplied {
  
  inline def apply(): ImmunizationProtocolApplied = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImmunizationProtocolApplied]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImmunizationProtocolApplied] (val x: Self) extends AnyVal {
    
    inline def setAuthority(value: Reference): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
    
    inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
    
    inline def setDoseNumberPositiveInt(value: Double): Self = StObject.set(x, "doseNumberPositiveInt", value.asInstanceOf[js.Any])
    
    inline def setDoseNumberPositiveIntUndefined: Self = StObject.set(x, "doseNumberPositiveInt", js.undefined)
    
    inline def setDoseNumberString(value: String): Self = StObject.set(x, "doseNumberString", value.asInstanceOf[js.Any])
    
    inline def setDoseNumberStringUndefined: Self = StObject.set(x, "doseNumberString", js.undefined)
    
    inline def setSeries(value: String): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesDosesPositiveInt(value: Double): Self = StObject.set(x, "seriesDosesPositiveInt", value.asInstanceOf[js.Any])
    
    inline def setSeriesDosesPositiveIntUndefined: Self = StObject.set(x, "seriesDosesPositiveInt", js.undefined)
    
    inline def setSeriesDosesString(value: String): Self = StObject.set(x, "seriesDosesString", value.asInstanceOf[js.Any])
    
    inline def setSeriesDosesStringUndefined: Self = StObject.set(x, "seriesDosesString", js.undefined)
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setTargetDisease(value: js.Array[CodeableConcept]): Self = StObject.set(x, "targetDisease", value.asInstanceOf[js.Any])
    
    inline def setTargetDiseaseUndefined: Self = StObject.set(x, "targetDisease", js.undefined)
    
    inline def setTargetDiseaseVarargs(value: CodeableConcept*): Self = StObject.set(x, "targetDisease", js.Array(value*))
    
    inline def set_doseNumberString(value: Element): Self = StObject.set(x, "_doseNumberString", value.asInstanceOf[js.Any])
    
    inline def set_doseNumberStringUndefined: Self = StObject.set(x, "_doseNumberString", js.undefined)
    
    inline def set_series(value: Element): Self = StObject.set(x, "_series", value.asInstanceOf[js.Any])
    
    inline def set_seriesDosesString(value: Element): Self = StObject.set(x, "_seriesDosesString", value.asInstanceOf[js.Any])
    
    inline def set_seriesDosesStringUndefined: Self = StObject.set(x, "_seriesDosesString", js.undefined)
    
    inline def set_seriesUndefined: Self = StObject.set(x, "_series", js.undefined)
  }
}
