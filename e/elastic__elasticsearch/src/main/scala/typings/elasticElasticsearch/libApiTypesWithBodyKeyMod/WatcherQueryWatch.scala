package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherQueryWatch extends StObject {
  
  var _id: Id
  
  var _primary_term: js.UndefOr[integer] = js.undefined
  
  var _seq_no: js.UndefOr[SequenceNumber] = js.undefined
  
  var status: js.UndefOr[WatcherWatchStatus] = js.undefined
  
  var watch: js.UndefOr[WatcherWatch] = js.undefined
}
object WatcherQueryWatch {
  
  inline def apply(_id: Id): WatcherQueryWatch = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherQueryWatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherQueryWatch] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: WatcherWatchStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setWatch(value: WatcherWatch): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
    
    inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    
    inline def set_id(value: Id): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_primary_term(value: integer): Self = StObject.set(x, "_primary_term", value.asInstanceOf[js.Any])
    
    inline def set_primary_termUndefined: Self = StObject.set(x, "_primary_term", js.undefined)
    
    inline def set_seq_no(value: SequenceNumber): Self = StObject.set(x, "_seq_no", value.asInstanceOf[js.Any])
    
    inline def set_seq_noUndefined: Self = StObject.set(x, "_seq_no", js.undefined)
  }
}
