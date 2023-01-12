package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherExecuteWatchResponse extends StObject {
  
  var _id: Id
  
  var watch_record: WatcherExecuteWatchWatchRecord
}
object WatcherExecuteWatchResponse {
  
  inline def apply(_id: Id, watch_record: WatcherExecuteWatchWatchRecord): WatcherExecuteWatchResponse = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], watch_record = watch_record.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherExecuteWatchResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherExecuteWatchResponse] (val x: Self) extends AnyVal {
    
    inline def setWatch_record(value: WatcherExecuteWatchWatchRecord): Self = StObject.set(x, "watch_record", value.asInstanceOf[js.Any])
    
    inline def set_id(value: Id): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
