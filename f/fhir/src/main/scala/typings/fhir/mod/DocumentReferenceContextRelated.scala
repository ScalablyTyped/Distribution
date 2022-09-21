package typings.fhir.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentReferenceContextRelated
  extends StObject
     with BackboneElement {
  
  /**
    * Related identifier to this DocumentReference. If both id and ref are present they shall refer to the same thing.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Related Resource to this DocumentReference. If both id and ref are present they shall refer to the same thing.
    */
  var ref: js.UndefOr[Reference] = js.undefined
}
object DocumentReferenceContextRelated {
  
  inline def apply(): DocumentReferenceContextRelated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentReferenceContextRelated]
  }
  
  extension [Self <: DocumentReferenceContextRelated](x: Self) {
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setRef(value: Reference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
