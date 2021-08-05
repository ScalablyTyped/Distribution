package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * External specification that the content is mapped to
  */
trait StructureDefinitionMapping
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'identity'.
    */
  var _identity: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'uri'.
    */
  var _uri: js.UndefOr[Element] = js.undefined
  
  /**
    * Versions, Issues, Scope limitations etc.
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * Internal id when this mapping is used
    */
  var identity: id
  
  /**
    * Names what this mapping refers to
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what this mapping refers to
    */
  var uri: js.UndefOr[typings.fhir.fhir.uri] = js.undefined
}
object StructureDefinitionMapping {
  
  inline def apply(identity: id): StructureDefinitionMapping = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureDefinitionMapping]
  }
  
  extension [Self <: StructureDefinitionMapping](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setIdentity(value: id): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUri(value: uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def set_comment(value: Element): Self = StObject.set(x, "_comment", value.asInstanceOf[js.Any])
    
    inline def set_commentUndefined: Self = StObject.set(x, "_comment", js.undefined)
    
    inline def set_identity(value: Element): Self = StObject.set(x, "_identity", value.asInstanceOf[js.Any])
    
    inline def set_identityUndefined: Self = StObject.set(x, "_identity", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_uri(value: Element): Self = StObject.set(x, "_uri", value.asInstanceOf[js.Any])
    
    inline def set_uriUndefined: Self = StObject.set(x, "_uri", js.undefined)
  }
}
