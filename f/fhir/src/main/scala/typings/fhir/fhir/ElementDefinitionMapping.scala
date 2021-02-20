package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Map element to another set of definitions
  */
@js.native
trait ElementDefinitionMapping extends Element {
  
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'identity'.
    */
  var _identity: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'map'.
    */
  var _map: js.UndefOr[Element] = js.native
  
  /**
    * Comments about the mapping or its use
    */
  var comment: js.UndefOr[String] = js.native
  
  /**
    * Reference to mapping declaration
    */
  var identity: id = js.native
  
  /**
    * Computable language of mapping
    */
  var language: js.UndefOr[code] = js.native
  
  /**
    * Details of the mapping
    */
  var map: String = js.native
}
object ElementDefinitionMapping {
  
  @scala.inline
  def apply(identity: id, map: String): ElementDefinitionMapping = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementDefinitionMapping]
  }
  
  @scala.inline
  implicit class ElementDefinitionMappingMutableBuilder[Self <: ElementDefinitionMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setIdentity(value: id): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: code): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setMap(value: String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
    
    @scala.inline
    def set_identity(value: Element): Self = StObject.set(x, "_identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_identityUndefined: Self = StObject.set(x, "_identity", js.undefined)
    
    @scala.inline
    def set_language(value: Element): Self = StObject.set(x, "_language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_languageUndefined: Self = StObject.set(x, "_language", js.undefined)
    
    @scala.inline
    def set_map(value: Element): Self = StObject.set(x, "_map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_mapUndefined: Self = StObject.set(x, "_map", js.undefined)
  }
}
