package typings.elasticsearch.elasticsearchMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesRolloverResponse extends js.Object {
  var acknowledged: Boolean
  var conditions: StringDictionary[Boolean]
  var dry_run: Boolean
  var new_index: String
  var old_index: String
  var rolled_over: Boolean
  var shards_acknowledged: Boolean
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
    val __obj = js.Dynamic.literal(acknowledged = acknowledged, conditions = conditions, dry_run = dry_run, new_index = new_index, old_index = old_index, rolled_over = rolled_over, shards_acknowledged = shards_acknowledged)
  
    __obj.asInstanceOf[IndicesRolloverResponse]
  }
}

