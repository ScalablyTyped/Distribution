package typings.documentdbServer

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDocumentMeta extends Object {
  
  var _attachments: js.UndefOr[String] = js.native
  
  var _etag: js.UndefOr[String] = js.native
  
  var _rid: js.UndefOr[String] = js.native
  
  var _self: String = js.native
  
  var _ts: String = js.native
  
  var id: String = js.native
}
object IDocumentMeta {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IDocumentMetaMutableBuilder[Self <: IDocumentMeta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_attachments(value: String): Self = StObject.set(x, "_attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_attachmentsUndefined: Self = StObject.set(x, "_attachments", js.undefined)
    
    @scala.inline
    def set_etag(value: String): Self = StObject.set(x, "_etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_etagUndefined: Self = StObject.set(x, "_etag", js.undefined)
    
    @scala.inline
    def set_rid(value: String): Self = StObject.set(x, "_rid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ridUndefined: Self = StObject.set(x, "_rid", js.undefined)
    
    @scala.inline
    def set_self(value: String): Self = StObject.set(x, "_self", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_ts(value: String): Self = StObject.set(x, "_ts", value.asInstanceOf[js.Any])
  }
}
