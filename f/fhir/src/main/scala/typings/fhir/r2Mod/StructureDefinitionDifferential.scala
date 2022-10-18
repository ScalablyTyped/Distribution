package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructureDefinitionDifferential
  extends StObject
     with BackboneElement {
  
  /**
    * Captures constraints on each element within the resource.
    */
  var element: js.Array[ElementDefinition]
}
object StructureDefinitionDifferential {
  
  inline def apply(element: js.Array[ElementDefinition]): StructureDefinitionDifferential = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureDefinitionDifferential]
  }
  
  extension [Self <: StructureDefinitionDifferential](x: Self) {
    
    inline def setElement(value: js.Array[ElementDefinition]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementVarargs(value: ElementDefinition*): Self = StObject.set(x, "element", js.Array(value*))
  }
}
