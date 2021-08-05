package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Related identifiers or resources
  */
trait DocumentReferenceContextRelated
  extends StObject
     with BackboneElement {
  
  /**
    * Identifier of related objects or events
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Related Resource
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
