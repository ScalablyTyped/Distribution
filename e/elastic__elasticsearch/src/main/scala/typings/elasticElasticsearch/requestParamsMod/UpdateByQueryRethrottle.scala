package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateByQueryRethrottle extends Generic {
  var requests_per_second: Double = js.native
  var task_id: String = js.native
}

object UpdateByQueryRethrottle {
  @scala.inline
  def apply(requests_per_second: Double, task_id: String): UpdateByQueryRethrottle = {
    val __obj = js.Dynamic.literal(requests_per_second = requests_per_second.asInstanceOf[js.Any], task_id = task_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateByQueryRethrottle]
  }
  @scala.inline
  implicit class UpdateByQueryRethrottleOps[Self <: UpdateByQueryRethrottle] (val x: Self) extends AnyVal {
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
    def setRequests_per_second(value: Double): Self = this.set("requests_per_second", value.asInstanceOf[js.Any])
    @scala.inline
    def setTask_id(value: String): Self = this.set("task_id", value.asInstanceOf[js.Any])
  }
  
}

