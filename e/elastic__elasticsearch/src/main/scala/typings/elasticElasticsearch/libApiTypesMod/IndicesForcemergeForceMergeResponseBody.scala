package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesForcemergeForceMergeResponseBody
  extends StObject
     with ShardsOperationResponseBase {
  
  var task: js.UndefOr[String] = js.undefined
}
object IndicesForcemergeForceMergeResponseBody {
  
  inline def apply(_shards: ShardStatistics): IndicesForcemergeForceMergeResponseBody = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesForcemergeForceMergeResponseBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesForcemergeForceMergeResponseBody] (val x: Self) extends AnyVal {
    
    inline def setTask(value: String): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
  }
}
