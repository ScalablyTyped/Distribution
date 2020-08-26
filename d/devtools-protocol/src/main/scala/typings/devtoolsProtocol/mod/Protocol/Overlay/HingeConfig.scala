package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import typings.devtoolsProtocol.mod.Protocol.DOM.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HingeConfig extends js.Object {
  /**
    * The content box highlight fill color (default: a dark color).
    */
  var contentColor: js.UndefOr[RGBA] = js.native
  /**
    * The content box highlight outline color (default: transparent).
    */
  var outlineColor: js.UndefOr[RGBA] = js.native
  /**
    * A rectangle represent hinge
    */
  var rect: Rect = js.native
}

object HingeConfig {
  @scala.inline
  def apply(rect: Rect): HingeConfig = {
    val __obj = js.Dynamic.literal(rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[HingeConfig]
  }
  @scala.inline
  implicit class HingeConfigOps[Self <: HingeConfig] (val x: Self) extends AnyVal {
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
    def setRect(value: Rect): Self = this.set("rect", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentColor(value: RGBA): Self = this.set("contentColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentColor: Self = this.set("contentColor", js.undefined)
    @scala.inline
    def setOutlineColor(value: RGBA): Self = this.set("outlineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlineColor: Self = this.set("outlineColor", js.undefined)
  }
  
}

