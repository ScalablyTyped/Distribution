package typings.elasticsearch.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndicesRolloverResponse extends StObject {
  
  var acknowledged: Boolean = js.native
  
  var conditions: StringDictionary[Boolean] = js.native
  
  var dry_run: Boolean = js.native
  
  var new_index: String = js.native
  
  var old_index: String = js.native
  
  var rolled_over: Boolean = js.native
  
  var shards_acknowledged: Boolean = js.native
}
object IndicesRolloverResponse {
  
  @scala.inline
  def apply(
    acknowledged: Boolean,
    conditions: StringDictionary[Boolean],
    dry_run: Boolean,
    new_index: String,
    old_index: String,
    rolled_over: Boolean,
    shards_acknowledged: Boolean
  ): IndicesRolloverResponse = {
    val __obj = js.Dynamic.literal(acknowledged = acknowledged.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], dry_run = dry_run.asInstanceOf[js.Any], new_index = new_index.asInstanceOf[js.Any], old_index = old_index.asInstanceOf[js.Any], rolled_over = rolled_over.asInstanceOf[js.Any], shards_acknowledged = shards_acknowledged.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesRolloverResponse]
  }
  
  @scala.inline
  implicit class IndicesRolloverResponseMutableBuilder[Self <: IndicesRolloverResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcknowledged(value: Boolean): Self = StObject.set(x, "acknowledged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditions(value: StringDictionary[Boolean]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDry_run(value: Boolean): Self = StObject.set(x, "dry_run", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_index(value: String): Self = StObject.set(x, "new_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOld_index(value: String): Self = StObject.set(x, "old_index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolled_over(value: Boolean): Self = StObject.set(x, "rolled_over", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShards_acknowledged(value: Boolean): Self = StObject.set(x, "shards_acknowledged", value.asInstanceOf[js.Any])
  }
}
