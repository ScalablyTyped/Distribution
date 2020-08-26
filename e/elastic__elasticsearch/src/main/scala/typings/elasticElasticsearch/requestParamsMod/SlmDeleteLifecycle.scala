package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlmDeleteLifecycle extends Generic {
  var policy_id: String = js.native
}

object SlmDeleteLifecycle {
  @scala.inline
  def apply(policy_id: String): SlmDeleteLifecycle = {
    val __obj = js.Dynamic.literal(policy_id = policy_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlmDeleteLifecycle]
  }
  @scala.inline
  implicit class SlmDeleteLifecycleOps[Self <: SlmDeleteLifecycle] (val x: Self) extends AnyVal {
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
    def setPolicy_id(value: String): Self = this.set("policy_id", value.asInstanceOf[js.Any])
  }
  
}

