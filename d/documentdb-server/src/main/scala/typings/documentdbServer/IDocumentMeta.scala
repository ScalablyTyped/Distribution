package typings.documentdbServer

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDocumentMeta
  extends StObject
     with Object {
  
  var _attachments: js.UndefOr[String] = js.undefined
  
  var _etag: js.UndefOr[String] = js.undefined
  
  var _rid: js.UndefOr[String] = js.undefined
  
  var _self: String
  
  var _ts: String
  
  var id: String
}
object IDocumentMeta {
  
  inline def apply(
    _self: String,
    _ts: String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    id: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): IDocumentMeta = {
    val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any], _ts = _ts.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[IDocumentMeta]
  }
  
  extension [Self <: IDocumentMeta](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def set_attachments(value: String): Self = StObject.set(x, "_attachments", value.asInstanceOf[js.Any])
    
    inline def set_attachmentsUndefined: Self = StObject.set(x, "_attachments", js.undefined)
    
    inline def set_etag(value: String): Self = StObject.set(x, "_etag", value.asInstanceOf[js.Any])
    
    inline def set_etagUndefined: Self = StObject.set(x, "_etag", js.undefined)
    
    inline def set_rid(value: String): Self = StObject.set(x, "_rid", value.asInstanceOf[js.Any])
    
    inline def set_ridUndefined: Self = StObject.set(x, "_rid", js.undefined)
    
    inline def set_self(value: String): Self = StObject.set(x, "_self", value.asInstanceOf[js.Any])
    
    inline def set_ts(value: String): Self = StObject.set(x, "_ts", value.asInstanceOf[js.Any])
  }
}
