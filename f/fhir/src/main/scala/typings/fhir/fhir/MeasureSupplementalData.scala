package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * What other data should be reported with the measure
  */
trait MeasureSupplementalData
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'criteria'.
    */
  var _criteria: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.undefined
  
  /**
    * Expression describing additional data to be reported
    */
  var criteria: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier, unique within the measure
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Path to the supplemental data element
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * supplemental-data | risk-adjustment-factor
    */
  var usage: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}
object MeasureSupplementalData {
  
  inline def apply(): MeasureSupplementalData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureSupplementalData]
  }
  
  extension [Self <: MeasureSupplementalData](x: Self) {
    
    inline def setCriteria(value: String): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setUsage(value: js.Array[CodeableConcept]): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "usage", js.undefined)
    
    inline def setUsageVarargs(value: CodeableConcept*): Self = StObject.set(x, "usage", js.Array(value :_*))
    
    inline def set_criteria(value: Element): Self = StObject.set(x, "_criteria", value.asInstanceOf[js.Any])
    
    inline def set_criteriaUndefined: Self = StObject.set(x, "_criteria", js.undefined)
    
    inline def set_path(value: Element): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    inline def set_pathUndefined: Self = StObject.set(x, "_path", js.undefined)
  }
}
