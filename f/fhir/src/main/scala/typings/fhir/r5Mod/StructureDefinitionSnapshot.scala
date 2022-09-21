package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructureDefinitionSnapshot
  extends StObject
     with BackboneElement {
  
  /**
    * Captures constraints on each element within the resource.
    */
  var element: js.Array[ElementDefinition]
}
object StructureDefinitionSnapshot {
  
  inline def apply(element: js.Array[ElementDefinition]): StructureDefinitionSnapshot = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureDefinitionSnapshot]
  }
  
  extension [Self <: StructureDefinitionSnapshot](x: Self) {
    
    inline def setElement(value: js.Array[ElementDefinition]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementVarargs(value: ElementDefinition*): Self = StObject.set(x, "element", js.Array(value*))
  }
}
