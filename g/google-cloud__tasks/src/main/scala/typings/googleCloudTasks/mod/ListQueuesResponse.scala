package typings.googleCloudTasks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListQueuesResponse extends StObject {
  
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  var queues: js.Array[Queue]
}
object ListQueuesResponse {
  
  inline def apply(queues: js.Array[Queue]): ListQueuesResponse = {
    val __obj = js.Dynamic.literal(queues = queues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueuesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListQueuesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setQueues(value: js.Array[Queue]): Self = StObject.set(x, "queues", value.asInstanceOf[js.Any])
    
    inline def setQueuesVarargs(value: Queue*): Self = StObject.set(x, "queues", js.Array(value*))
  }
}
