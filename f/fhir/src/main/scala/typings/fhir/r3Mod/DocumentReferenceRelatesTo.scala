package typings.fhir.r3Mod

import typings.fhir.fhirStrings.appends
import typings.fhir.fhirStrings.replaces
import typings.fhir.fhirStrings.signs
import typings.fhir.fhirStrings.transforms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentReferenceRelatesTo
  extends StObject
     with BackboneElement {
  
  var _code: js.UndefOr[Element] = js.undefined
  
  /**
    * If this document appends another document, then the document cannot be fully understood without also accessing the referenced document.
    */
  var code: replaces | transforms | signs | appends
  
  /**
    * The target document of this relationship.
    */
  var target: Reference
}
object DocumentReferenceRelatesTo {
  
  inline def apply(code: replaces | transforms | signs | appends, target: Reference): DocumentReferenceRelatesTo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentReferenceRelatesTo]
  }
  
  extension [Self <: DocumentReferenceRelatesTo](x: Self) {
    
    inline def setCode(value: replaces | transforms | signs | appends): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Reference): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def set_code(value: Element): Self = StObject.set(x, "_code", value.asInstanceOf[js.Any])
    
    inline def set_codeUndefined: Self = StObject.set(x, "_code", js.undefined)
  }
}
