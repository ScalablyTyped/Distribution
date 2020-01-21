package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLayers extends js.Object {
  var layers: js.UndefOr[js.Array[AnonLayerId]] = js.native
}

object AnonLayers {
  @scala.inline
  def apply(layers: js.Array[AnonLayerId] = null): AnonLayers = {
    val __obj = js.Dynamic.literal()
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLayers]
  }
}

