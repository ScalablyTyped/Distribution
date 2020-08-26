package typings.forestExpressMongoose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregatedFilters extends js.Object {
  var aggregator: Aggregator = js.native
  var conditions: js.Array[Filter] = js.native
}

object AggregatedFilters {
  @scala.inline
  def apply(aggregator: Aggregator, conditions: js.Array[Filter]): AggregatedFilters = {
    val __obj = js.Dynamic.literal(aggregator = aggregator.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedFilters]
  }
  @scala.inline
  implicit class AggregatedFiltersOps[Self <: AggregatedFilters] (val x: Self) extends AnyVal {
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
    def setAggregator(value: Aggregator): Self = this.set("aggregator", value.asInstanceOf[js.Any])
    @scala.inline
    def setConditionsVarargs(value: Filter*): Self = this.set("conditions", js.Array(value :_*))
    @scala.inline
    def setConditions(value: js.Array[Filter]): Self = this.set("conditions", value.asInstanceOf[js.Any])
  }
  
}

