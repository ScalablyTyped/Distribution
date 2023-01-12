package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentManifestRelated
  extends StObject
     with BackboneElement {
  
  /**
    * Related identifier to this DocumentManifest.  For example, Order numbers, accession numbers, XDW workflow numbers.
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Related Resource to this DocumentManifest. For example, Order, DiagnosticOrder,  Procedure, EligibilityRequest, etc.
    */
  var ref: js.UndefOr[Reference] = js.undefined
}
object DocumentManifestRelated {
  
  inline def apply(): DocumentManifestRelated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentManifestRelated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentManifestRelated] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setRef(value: Reference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
