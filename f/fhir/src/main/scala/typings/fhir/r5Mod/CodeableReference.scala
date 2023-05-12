package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeableReference
  extends StObject
     with Element {
  
  /**
    * A reference to a concept - e.g. the information is identified by its general class to the degree of precision found in the terminology.
    */
  var concept: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * A reference to a resource the provides exact details about the information being referenced.
    */
  var reference: js.UndefOr[Reference] = js.undefined
}
object CodeableReference {
  
  inline def apply(): CodeableReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeableReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeableReference] (val x: Self) extends AnyVal {
    
    inline def setConcept(value: CodeableConcept): Self = StObject.set(x, "concept", value.asInstanceOf[js.Any])
    
    inline def setConceptUndefined: Self = StObject.set(x, "concept", js.undefined)
    
    inline def setReference(value: Reference): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
  }
}
