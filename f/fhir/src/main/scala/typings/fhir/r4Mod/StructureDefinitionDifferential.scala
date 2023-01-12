package typings.fhir.r4Mod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StructureDefinitionDifferential] (val x: Self) extends AnyVal {
    
    inline def setElement(value: js.Array[ElementDefinition]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementVarargs(value: ElementDefinition*): Self = StObject.set(x, "element", js.Array(value*))
  }
}
