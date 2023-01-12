package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatcherExecutionResultInput extends StObject {
  
  var payload: Record[String, Any]
  
  var status: WatcherActionStatusOptions
  
  var `type`: WatcherInputType
}
object WatcherExecutionResultInput {
  
  inline def apply(payload: Record[String, Any], status: WatcherActionStatusOptions, `type`: WatcherInputType): WatcherExecutionResultInput = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherExecutionResultInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatcherExecutionResultInput] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: Record[String, Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: WatcherActionStatusOptions): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: WatcherInputType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
