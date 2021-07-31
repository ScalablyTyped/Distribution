package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource with narrative, extensions, and contained resources
  */
trait DomainResource
  extends StObject
     with ResourceBase
     with Resource {
  
  /**
    * Contained, inline Resources
    */
  var contained: js.UndefOr[js.Array[Resource]] = js.undefined
  
  /**
    * Additional Content defined by implementations
    */
  var `extension`: js.UndefOr[js.Array[Extension]] = js.undefined
  
  /**
    * Extensions that cannot be ignored
    */
  var modifierExtension: js.UndefOr[js.Array[Extension]] = js.undefined
  
  /**
    * Text summary of the resource, for human interpretation
    */
  var text: js.UndefOr[Narrative] = js.undefined
}
object DomainResource {
  
  @scala.inline
  def apply(): DomainResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainResource]
  }
  
  @scala.inline
  implicit class DomainResourceMutableBuilder[Self <: DomainResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContained(value: js.Array[Resource]): Self = StObject.set(x, "contained", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainedUndefined: Self = StObject.set(x, "contained", js.undefined)
    
    @scala.inline
    def setContainedVarargs(value: Resource*): Self = StObject.set(x, "contained", js.Array(value :_*))
    
    @scala.inline
    def setExtension(value: js.Array[Extension]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setExtensionVarargs(value: Extension*): Self = StObject.set(x, "extension", js.Array(value :_*))
    
    @scala.inline
    def setModifierExtension(value: js.Array[Extension]): Self = StObject.set(x, "modifierExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierExtensionUndefined: Self = StObject.set(x, "modifierExtension", js.undefined)
    
    @scala.inline
    def setModifierExtensionVarargs(value: Extension*): Self = StObject.set(x, "modifierExtension", js.Array(value :_*))
    
    @scala.inline
    def setText(value: Narrative): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
