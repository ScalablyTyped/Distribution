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
  def apply(maxSize: js.UndefOr[Double] = js.undefined, minSize: js.UndefOr[Double] = js.undefined): SchemaNodeGroupAutoscalingPolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxSize)) __obj.updateDynamic("maxSize")(maxSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSize)) __obj.updateDynamic("minSize")(minSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNodeGroupAutoscalingPolicy]
  }
}

