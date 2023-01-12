package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherGetWatchResponse extends StObject {
  
  var _id: Id
  
  var _primary_term: js.UndefOr[integer] = js.undefined
  
  var _seq_no: js.UndefOr[SequenceNumber] = js.undefined
  
  var _version: js.UndefOr[VersionNumber] = js.undefined
  
  var found: Boolean
  
  var status: js.UndefOr[WatcherWatchStatus] = js.undefined
  
  var watch: js.UndefOr[WatcherWatch] = js.undefined
}
object WatcherGetWatchResponse {
  
  inline def apply(_id: Id, found: Boolean): WatcherGetWatchResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherGetWatchResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherGetWatchResponse] (val x: Self) extends AnyVal {
    
    inline def setFound(value: Boolean): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: WatcherWatchStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setWatch(value: WatcherWatch): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    
    inline def set_id(value: Id): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_primary_term(value: integer): Self = StObject.set(x, "_primary_term", value.asInstanceOf[js.Any])
    
    inline def set_primary_termUndefined: Self = StObject.set(x, "_primary_term", js.undefined)
    
    inline def set_seq_no(value: SequenceNumber): Self = StObject.set(x, "_seq_no", value.asInstanceOf[js.Any])
    
    inline def set_seq_noUndefined: Self = StObject.set(x, "_seq_no", js.undefined)
    
    inline def set_version(value: VersionNumber): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
