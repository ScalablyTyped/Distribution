package typings.atFrctlFractal.atFrctlFractalMod.fractal.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusInfo extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var label: String
}

object StatusInfo {
  @scala.inline
  def apply(label: String, color: String = null, description: String = null): StatusInfo = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusInfo]
  }
}

