package typings.elasticsearch.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesRolloverResponse extends js.Object {
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
  implicit class IndicesRolloverResponseOps[Self <: IndicesRolloverResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAcknowledged(value: Boolean): Self = this.set("acknowledged", value.asInstanceOf[js.Any])
    @scala.inline
    def setConditions(value: StringDictionary[Boolean]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDry_run(value: Boolean): Self = this.set("dry_run", value.asInstanceOf[js.Any])
    @scala.inline
    def setNew_index(value: String): Self = this.set("new_index", value.asInstanceOf[js.Any])
    @scala.inline
    def setOld_index(value: String): Self = this.set("old_index", value.asInstanceOf[js.Any])
    @scala.inline
    def setRolled_over(value: Boolean): Self = this.set("rolled_over", value.asInstanceOf[js.Any])
    @scala.inline
    def setShards_acknowledged(value: Boolean): Self = this.set("shards_acknowledged", value.asInstanceOf[js.Any])
  }
  
}

