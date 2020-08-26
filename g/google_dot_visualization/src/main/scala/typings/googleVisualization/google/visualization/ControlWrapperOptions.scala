package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ControlWrapperOptions extends js.Object {
  var containerId: String = js.native
  var controlType: String = js.native
  var options: js.UndefOr[js.Object] = js.native
  var state: js.UndefOr[js.Object] = js.native
}

object ControlWrapperOptions {
  @scala.inline
  def apply(containerId: String, controlType: String): ControlWrapperOptions = {
    val __obj = js.Dynamic.literal(containerId = containerId.asInstanceOf[js.Any], controlType = controlType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlWrapperOptions]
  }
  @scala.inline
  implicit class ControlWrapperOptionsOps[Self <: ControlWrapperOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setControlType(value: String): Self = this.set("controlType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setState(value: js.Object): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

