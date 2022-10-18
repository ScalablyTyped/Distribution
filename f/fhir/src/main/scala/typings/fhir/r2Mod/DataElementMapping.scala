package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataElementMapping
  extends StObject
     with BackboneElement {
  
  var _comments: js.UndefOr[Element] = js.undefined
  
  var _identity: js.UndefOr[Element] = js.undefined
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _uri: js.UndefOr[Element] = js.undefined
  
  /**
    * Comments about this mapping, including version notes, issues, scope limitations, and other important notes for usage.
    */
  var comments: js.UndefOr[String] = js.undefined
  
  /**
    * An internal id that is used to identify this mapping set when specific mappings are made on a per-element basis.
    */
  var identity: String
  
  /**
    * A name for the specification that is being mapped to.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * An absolute URI that identifies the specification that this mapping is expressed to.
    */
  var uri: js.UndefOr[String] = js.undefined
}
object DataElementMapping {
  
  inline def apply(identity: String): DataElementMapping = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataElementMapping]
  }
  
  extension [Self <: DataElementMapping](x: Self) {
    
    inline def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setIdentity(value: String): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def set_comments(value: Element): Self = StObject.set(x, "_comments", value.asInstanceOf[js.Any])
    
    inline def set_commentsUndefined: Self = StObject.set(x, "_comments", js.undefined)
    
    inline def set_identity(value: Element): Self = StObject.set(x, "_identity", value.asInstanceOf[js.Any])
    
    inline def set_identityUndefined: Self = StObject.set(x, "_identity", js.undefined)
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_uri(value: Element): Self = StObject.set(x, "_uri", value.asInstanceOf[js.Any])
    
    inline def set_uriUndefined: Self = StObject.set(x, "_uri", js.undefined)
  }
}
