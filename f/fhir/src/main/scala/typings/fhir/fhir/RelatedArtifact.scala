package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Related artifacts for a knowledge resource
  */
@js.native
trait RelatedArtifact extends Element {
  
  /**
    * Contains extended information for property 'citation'.
    */
  var _citation: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.native
  
  /**
    * Bibliographic citation for the artifact
    */
  var citation: js.UndefOr[String] = js.native
  
  /**
    * Brief description of the related artifact
    */
  var display: js.UndefOr[String] = js.native
  
  /**
    * What document is being referenced
    */
  var document: js.UndefOr[Attachment] = js.native
  
  /**
    * What resource is being referenced
    */
  var resource: js.UndefOr[Reference] = js.native
  
  /**
    * documentation | justification | citation | predecessor | successor | derived-from | depends-on | composed-of
    */
  var `type`: code = js.native
  
  /**
    * Where the artifact can be accessed
    */
  var url: js.UndefOr[uri] = js.native
}
object RelatedArtifact {
  
  @scala.inline
  def apply(`type`: code): RelatedArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelatedArtifact]
  }
  
  @scala.inline
  implicit class RelatedArtifactMutableBuilder[Self <: RelatedArtifact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCitation(value: String): Self = StObject.set(x, "citation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCitationUndefined: Self = StObject.set(x, "citation", js.undefined)
    
    @scala.inline
    def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    @scala.inline
    def setDocument(value: Attachment): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setResource(value: Reference): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setType(value: code): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: uri): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def set_citation(value: Element): Self = StObject.set(x, "_citation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_citationUndefined: Self = StObject.set(x, "_citation", js.undefined)
    
    @scala.inline
    def set_display(value: Element): Self = StObject.set(x, "_display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_displayUndefined: Self = StObject.set(x, "_display", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
    
    @scala.inline
    def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
  }
}
