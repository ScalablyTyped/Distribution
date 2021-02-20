package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Snapshot view of the structure
  */
@js.native
trait StructureDefinitionSnapshot extends BackboneElement {
  
  /**
    * Definition of elements in the resource (if no StructureDefinition)
    */
  var element: js.Array[ElementDefinition] = js.native
}
object StructureDefinitionSnapshot {
  
  @scala.inline
  def apply(element: js.Array[ElementDefinition]): StructureDefinitionSnapshot = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureDefinitionSnapshot]
  }
  
  @scala.inline
  implicit class StructureDefinitionSnapshotMutableBuilder[Self <: StructureDefinitionSnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: js.Array[ElementDefinition]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementVarargs(value: ElementDefinition*): Self = StObject.set(x, "element", js.Array(value :_*))
  }
}
