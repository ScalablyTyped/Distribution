package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesHotThreadsResponse extends StObject {
  
  var hot_threads: js.Array[NodesHotThreadsHotThread]
}
object NodesHotThreadsResponse {
  
  inline def apply(hot_threads: js.Array[NodesHotThreadsHotThread]): NodesHotThreadsResponse = {
    val __obj = js.Dynamic.literal(hot_threads = hot_threads.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesHotThreadsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesHotThreadsResponse] (val x: Self) extends AnyVal {
    
    inline def setHot_threads(value: js.Array[NodesHotThreadsHotThread]): Self = StObject.set(x, "hot_threads", value.asInstanceOf[js.Any])
    
    inline def setHot_threadsVarargs(value: NodesHotThreadsHotThread*): Self = StObject.set(x, "hot_threads", js.Array(value*))
  }
}
