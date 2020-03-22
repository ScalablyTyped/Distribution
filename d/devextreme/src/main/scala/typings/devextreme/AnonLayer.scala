package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLayer extends js.Object {
  var grouping: js.UndefOr[String] = js.undefined
  var layer: js.UndefOr[String] = js.undefined
}

object AnonLayer {
  @scala.inline
  def apply(grouping: String = null, layer: String = null): AnonLayer = {
    val __obj = js.Dynamic.literal()
    if (grouping != null) __obj.updateDynamic("grouping")(grouping.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLayer]
  }
}

