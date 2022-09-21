package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentReferenceRelatesTo
  extends StObject
     with BackboneElement {
  
  /**
    * If this document appends another document, then the document cannot be fully understood without also accessing the referenced document.
    */
  var code: CodeableConcept
  
  /**
    * The target document of this relationship.
    */
  var target: Reference
}
object DocumentReferenceRelatesTo {
  
  inline def apply(code: CodeableConcept, target: Reference): DocumentReferenceRelatesTo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentReferenceRelatesTo]
  }
  
  extension [Self <: DocumentReferenceRelatesTo](x: Self) {
    
    inline def setCode(value: CodeableConcept): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Reference): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
