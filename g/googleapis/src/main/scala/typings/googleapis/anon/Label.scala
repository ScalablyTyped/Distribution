package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Label extends js.Object {
  var label: js.UndefOr[String] = js.native
  var temperature: js.UndefOr[Double] = js.native
}

object Label {
  @scala.inline
  def apply(label: String = null, temperature: js.UndefOr[Double] = js.undefined): Label = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(temperature)) __obj.updateDynamic("temperature")(temperature.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}

