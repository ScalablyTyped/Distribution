package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesRolloverResponse extends StObject {
  
  var acknowledged: Boolean
  
  var conditions: Record[String, Boolean]
  
  var dry_run: Boolean
  
  var new_index: String
  
  var old_index: String
  
  var rolled_over: Boolean
  
  var shards_acknowledged: Boolean
}
object IndicesRolloverResponse {
  
  inline def apply(
    acknowledged: Boolean,
    conditions: Record[String, Boolean],
    dry_run: Boolean,
    new_index: String,
    old_index: String,
    rolled_over: Boolean,
    shards_acknowledged: Boolean
  ): IndicesRolloverResponse = {
    val __obj = js.Dynamic.literal(acknowledged = acknowledged.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], dry_run = dry_run.asInstanceOf[js.Any], new_index = new_index.asInstanceOf[js.Any], old_index = old_index.asInstanceOf[js.Any], rolled_over = rolled_over.asInstanceOf[js.Any], shards_acknowledged = shards_acknowledged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesRolloverResponse]
  }
  
  extension [Self <: IndicesRolloverResponse](x: Self) {
    
    inline def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    inline def setConditions(value: Record[String, Boolean]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setDry_run(value: Boolean): Self = StObject.set(x, "dry_run", value.asInstanceOf[js.Any])
    
    inline def setNew_index(value: String): Self = StObject.set(x, "new_index", value.asInstanceOf[js.Any])
    
    inline def setOld_index(value: String): Self = StObject.set(x, "old_index", value.asInstanceOf[js.Any])
    
    inline def setRolled_over(value: Boolean): Self = StObject.set(x, "rolled_over", value.asInstanceOf[js.Any])
    
    inline def setShards_acknowledged(value: Boolean): Self = StObject.set(x, "shards_acknowledged", value.asInstanceOf[js.Any])
  }
}
