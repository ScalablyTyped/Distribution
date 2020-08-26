package typings.devtoolsProtocol.mod.Protocol.Emulation

import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetDefaultBackgroundColorOverrideRequest extends js.Object {
  /**
    * RGBA of the default background color. If not specified, any existing override will be
    * cleared.
    */
  var color: js.UndefOr[RGBA] = js.native
}

object SetDefaultBackgroundColorOverrideRequest {
  @scala.inline
  def apply(): SetDefaultBackgroundColorOverrideRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetDefaultBackgroundColorOverrideRequest]
  }
  @scala.inline
  implicit class SetDefaultBackgroundColorOverrideRequestOps[Self <: SetDefaultBackgroundColorOverrideRequest] (val x: Self) extends AnyVal {
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
    def setColor(value: RGBA): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
  }
  
}

