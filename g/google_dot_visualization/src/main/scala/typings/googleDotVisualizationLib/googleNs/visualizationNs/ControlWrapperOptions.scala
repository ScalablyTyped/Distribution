package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlWrapperOptions extends js.Object {
  var containerId: java.lang.String
  var controlType: java.lang.String
  var options: js.UndefOr[js.Object] = js.undefined
  var state: js.UndefOr[js.Object] = js.undefined
}

object ControlWrapperOptions {
  @scala.inline
  def apply(
    containerId: java.lang.String,
    controlType: java.lang.String,
    options: js.Object = null,
    state: js.Object = null
  ): ControlWrapperOptions = {
    val __obj = js.Dynamic.literal(containerId = containerId, controlType = controlType)
    if (options != null) __obj.updateDynamic("options")(options)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[ControlWrapperOptions]
  }
}

