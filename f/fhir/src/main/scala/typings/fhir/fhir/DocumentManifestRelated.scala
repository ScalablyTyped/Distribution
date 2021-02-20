package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Related things
  */
@js.native
trait DocumentManifestRelated extends BackboneElement {
  
  /**
    * Identifiers of things that are related
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Related Resource
    */
  var ref: js.UndefOr[Reference] = js.native
}
object DocumentManifestRelated {
  
  @scala.inline
  def apply(): DocumentManifestRelated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentManifestRelated]
  }
  
  @scala.inline
  implicit class DocumentManifestRelatedMutableBuilder[Self <: DocumentManifestRelated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setRef(value: Reference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
