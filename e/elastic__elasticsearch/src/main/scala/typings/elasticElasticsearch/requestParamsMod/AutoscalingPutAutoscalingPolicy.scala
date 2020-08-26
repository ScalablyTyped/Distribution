package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoscalingPutAutoscalingPolicy[T] extends Generic {
  var body: T = js.native
  var name: String = js.native
}

object AutoscalingPutAutoscalingPolicy {
  @scala.inline
  def apply[T](body: T, name: String): AutoscalingPutAutoscalingPolicy[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoscalingPutAutoscalingPolicy[T]]
  }
  @scala.inline
  implicit class AutoscalingPutAutoscalingPolicyOps[Self <: AutoscalingPutAutoscalingPolicy[_], T] (val x: Self with AutoscalingPutAutoscalingPolicy[T]) extends AnyVal {
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
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

