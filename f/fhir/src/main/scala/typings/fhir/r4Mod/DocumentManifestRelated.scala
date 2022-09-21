package typings.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentManifestRelated
  extends StObject
     with BackboneElement {
  
  /**
    * If both identifier and ref elements are present they shall refer to the same thing.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * If both identifier and ref elements are present they shall refer to the same thing.
    */
  var ref: js.UndefOr[Reference] = js.undefined
}
object DocumentManifestRelated {
  
  inline def apply(): DocumentManifestRelated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentManifestRelated]
  }
  
  extension [Self <: DocumentManifestRelated](x: Self) {
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setRef(value: Reference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
