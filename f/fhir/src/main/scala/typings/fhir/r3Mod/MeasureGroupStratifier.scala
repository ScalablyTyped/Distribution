package typings.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeasureGroupStratifier
  extends StObject
     with BackboneElement {
  
  var _criteria: js.UndefOr[Element] = js.undefined
  
  var _path: js.UndefOr[Element] = js.undefined
  
  /**
    * The criteria for the stratifier. This must be the name of an expression defined within a referenced library.
    */
  var criteria: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the stratifier used to coordinate the reported data back to this stratifier.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * The path to an element that defines the stratifier, specified as a valid FHIR resource path.
    */
  var path: js.UndefOr[String] = js.undefined
}
object MeasureGroupStratifier {
  
  inline def apply(): MeasureGroupStratifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeasureGroupStratifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeasureGroupStratifier] (val x: Self) extends AnyVal {
    
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
