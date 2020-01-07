package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$NodeGroupAutoscalingPolicy extends js.Object {
  var maxSize: js.UndefOr[Double] = js.native
  var minSize: js.UndefOr[Double] = js.native
}

object Schema$NodeGroupAutoscalingPolicy {
  @scala.inline
  def apply(maxSize: Int | Double = null, minSize: Int | Double = null): Schema$NodeGroupAutoscalingPolicy = {
    val __obj = js.Dynamic.literal()
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NodeGroupAutoscalingPolicy]
  }
}

