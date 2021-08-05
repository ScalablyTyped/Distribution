package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stratifier criteria for the measure
  */
trait MeasureGroupStratifier
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
    * How the measure should be stratified
    */
  var criteria: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the stratifier used to coordinate the reported data back to this stratifier
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Path to the stratifier
    */
  var path: js.UndefOr[String] = js.undefined
}
object MeasureGroupStratifier {
  
  inline def apply(): MeasureGroupStratifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureGroupStratifier]
  }
  
  extension [Self <: MeasureGroupStratifier](x: Self) {
    
    inline def setCriteria(value: String): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def set_criteria(value: Element): Self = StObject.set(x, "_criteria", value.asInstanceOf[js.Any])
    
    inline def set_criteriaUndefined: Self = StObject.set(x, "_criteria", js.undefined)
    
    inline def set_path(value: Element): Self = StObject.set(x, "_path", value.asInstanceOf[js.Any])
    
    inline def set_pathUndefined: Self = StObject.set(x, "_path", js.undefined)
  }
}
