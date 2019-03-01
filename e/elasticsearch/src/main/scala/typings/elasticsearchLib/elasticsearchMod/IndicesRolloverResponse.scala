package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesRolloverResponse extends js.Object {
  var acknowledged: scala.Boolean
  var conditions: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  var dry_run: scala.Boolean
  var new_index: java.lang.String
  var old_index: java.lang.String
  var rolled_over: scala.Boolean
  var shards_acknowledged: scala.Boolean
}

object IndicesRolloverResponse {
  @scala.inline
  def apply(
    acknowledged: scala.Boolean,
    conditions: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    dry_run: scala.Boolean,
    new_index: java.lang.String,
    old_index: java.lang.String,
    rolled_over: scala.Boolean,
    shards_acknowledged: scala.Boolean
  ): IndicesRolloverResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acknowledged")(acknowledged)
    __obj.updateDynamic("conditions")(conditions)
    __obj.updateDynamic("dry_run")(dry_run)
    __obj.updateDynamic("new_index")(new_index)
    __obj.updateDynamic("old_index")(old_index)
    __obj.updateDynamic("rolled_over")(rolled_over)
    __obj.updateDynamic("shards_acknowledged")(shards_acknowledged)
    __obj.asInstanceOf[IndicesRolloverResponse]
  }
}

