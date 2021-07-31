package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Differential view of the structure
  */
trait StructureDefinitionDifferential
  extends StObject
     with BackboneElement {
  
  /**
    * Definition of elements in the resource (if no StructureDefinition)
    */
  var element: js.Array[ElementDefinition]
}
object StructureDefinitionDifferential {
  
  @scala.inline
  def apply(element: js.Array[ElementDefinition]): StructureDefinitionDifferential = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureDefinitionDifferential]
  }
  
  @scala.inline
  implicit class StructureDefinitionDifferentialMutableBuilder[Self <: StructureDefinitionDifferential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: js.Array[ElementDefinition]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementVarargs(value: ElementDefinition*): Self = StObject.set(x, "element", js.Array(value :_*))
  }
}
