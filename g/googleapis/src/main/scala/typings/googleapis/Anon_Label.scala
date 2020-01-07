package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Label extends js.Object {
  var label: js.UndefOr[String] = js.native
  var temperature: js.UndefOr[Double] = js.native
}

object Anon_Label {
  @scala.inline
  def apply(label: String = null, temperature: Int | Double = null): Anon_Label = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (temperature != null) __obj.updateDynamic("temperature")(temperature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Label]
  }
}

