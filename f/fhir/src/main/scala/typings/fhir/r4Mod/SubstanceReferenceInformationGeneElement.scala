package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstanceReferenceInformationGeneElement
  extends StObject
     with BackboneElement {
  
  /**
    * Todo.
    */
  var element: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Todo.
    */
  var source: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Todo.
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
}
object SubstanceReferenceInformationGeneElement {
  
  inline def apply(): SubstanceReferenceInformationGeneElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubstanceReferenceInformationGeneElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubstanceReferenceInformationGeneElement] (val x: Self) extends AnyVal {
    
    inline def setElement(value: Identifier): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setSource(value: js.Array[Reference]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: Reference*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
