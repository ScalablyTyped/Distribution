package typings.googleDotVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlWrapperOptions extends js.Object {
  var containerId: String
  var controlType: String
  var options: js.UndefOr[js.Object] = js.undefined
  var state: js.UndefOr[js.Object] = js.undefined
}

object ControlWrapperOptions {
  @scala.inline
  def apply(containerId: String, controlType: String, options: js.Object = null, state: js.Object = null): ControlWrapperOptions = {
    val __obj = js.Dynamic.literal(containerId = containerId.asInstanceOf[js.Any], controlType = controlType.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlWrapperOptions]
  }
}

