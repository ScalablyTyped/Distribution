package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNodeGroupAutoscalingPolicy extends js.Object {
  var maxSize: js.UndefOr[Double] = js.native
  var minSize: js.UndefOr[Double] = js.native
}

object SchemaNodeGroupAutoscalingPolicy {
  @scala.inline
  def apply(): SchemaNodeGroupAutoscalingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeGroupAutoscalingPolicy]
  }
  @scala.inline
  implicit class SchemaNodeGroupAutoscalingPolicyOps[Self <: SchemaNodeGroupAutoscalingPolicy] (val x: Self) extends AnyVal {
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
    def setMaxSize(value: Double): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    @scala.inline
    def setMinSize(value: Double): Self = this.set("minSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
  }
  
}

