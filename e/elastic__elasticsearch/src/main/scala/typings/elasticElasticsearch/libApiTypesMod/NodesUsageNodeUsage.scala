package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesUsageNodeUsage extends StObject {
  
  var aggregations: Record[String, Any]
  
  var rest_actions: Record[String, integer]
  
  var since: EpochTime[UnitMillis]
  
  var timestamp: EpochTime[UnitMillis]
}
object NodesUsageNodeUsage {
  
  inline def apply(
    aggregations: Record[String, Any],
    rest_actions: Record[String, integer],
    since: EpochTime[UnitMillis],
    timestamp: EpochTime[UnitMillis]
  ): NodesUsageNodeUsage = {
    val __obj = js.Dynamic.literal(aggregations = aggregations.asInstanceOf[js.Any], rest_actions = rest_actions.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesUsageNodeUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesUsageNodeUsage] (val x: Self) extends AnyVal {
    
    inline def setAggregations(value: Record[String, Any]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    inline def setRest_actions(value: Record[String, integer]): Self = StObject.set(x, "rest_actions", value.asInstanceOf[js.Any])
    
    inline def setSince(value: EpochTime[UnitMillis]): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: EpochTime[UnitMillis]): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
