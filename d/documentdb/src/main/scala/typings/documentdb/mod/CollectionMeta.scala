package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.documentdb.mod.UniqueId because Already inherited
- typings.documentdb.mod.AbstractMeta because var conflicts: id. Inlined _self, _ts, _rid, _etag, _attachments */ trait CollectionMeta
  extends StObject
     with Collection {
  
  var _attachments: js.UndefOr[String] = js.undefined
  
  var _etag: js.UndefOr[String] = js.undefined
  
  var _rid: js.UndefOr[String] = js.undefined
  
  /** The self link. */
  var _self: String
  
  /** The time the object was created. */
  var _ts: Double
}
object CollectionMeta {
  
  inline def apply(_self: String, _ts: Double, id: String): CollectionMeta = {
    val __obj = js.Dynamic.literal(_self = _self.asInstanceOf[js.Any], _ts = _ts.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionMeta]
  }
  
  extension [Self <: CollectionMeta](x: Self) {
    
    inline def set_attachments(value: String): Self = StObject.set(x, "_attachments", value.asInstanceOf[js.Any])
    
    inline def set_attachmentsUndefined: Self = StObject.set(x, "_attachments", js.undefined)
    
    inline def set_etag(value: String): Self = StObject.set(x, "_etag", value.asInstanceOf[js.Any])
    
    inline def set_etagUndefined: Self = StObject.set(x, "_etag", js.undefined)
    
    inline def set_rid(value: String): Self = StObject.set(x, "_rid", value.asInstanceOf[js.Any])
    
    inline def set_ridUndefined: Self = StObject.set(x, "_rid", js.undefined)
    
    inline def set_self(value: String): Self = StObject.set(x, "_self", value.asInstanceOf[js.Any])
    
    inline def set_ts(value: Double): Self = StObject.set(x, "_ts", value.asInstanceOf[js.Any])
  }
}
