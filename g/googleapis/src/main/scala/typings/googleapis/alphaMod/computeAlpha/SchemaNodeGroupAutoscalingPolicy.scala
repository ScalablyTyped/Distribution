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
  def apply(maxSize: Int | Double = null, minSize: Int | Double = null): SchemaNodeGroupAutoscalingPolicy = {
    val __obj = js.Dynamic.literal()
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNodeGroupAutoscalingPolicy]
  }
}

