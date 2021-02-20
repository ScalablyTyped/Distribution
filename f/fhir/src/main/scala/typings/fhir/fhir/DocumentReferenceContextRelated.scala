package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Related identifiers or resources
  */
@js.native
trait DocumentReferenceContextRelated extends BackboneElement {
  
  /**
    * Identifier of related objects or events
    */
  var identifier: js.UndefOr[Identifier] = js.native
  
  /**
    * Related Resource
    */
  var ref: js.UndefOr[Reference] = js.native
}
object DocumentReferenceContextRelated {
  
  @scala.inline
  def apply(): DocumentReferenceContextRelated = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentReferenceContextRelated]
  }
  
  @scala.inline
  implicit class DocumentReferenceContextRelatedMutableBuilder[Self <: DocumentReferenceContextRelated] (val x: Self) extends AnyVal {
    
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
