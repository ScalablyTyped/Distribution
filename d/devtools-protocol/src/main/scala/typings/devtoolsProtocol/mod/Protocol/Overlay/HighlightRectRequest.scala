package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightRectRequest extends js.Object {
  /**
    * The highlight fill color (default: transparent).
    */
  var color: js.UndefOr[RGBA] = js.native
  /**
    * Rectangle height
    */
  var height: integer = js.native
  /**
    * The highlight outline color (default: transparent).
    */
  var outlineColor: js.UndefOr[RGBA] = js.native
  /**
    * Rectangle width
    */
  var width: integer = js.native
  /**
    * X coordinate
    */
  var x: integer = js.native
  /**
    * Y coordinate
    */
  var y: integer = js.native
}

object HighlightRectRequest {
  @scala.inline
  def apply(height: integer, width: integer, x: integer, y: integer): HighlightRectRequest = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightRectRequest]
  }
  @scala.inline
  implicit class HighlightRectRequestOps[Self <: HighlightRectRequest] (val x: Self) extends AnyVal {
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
    def setHeight(value: integer): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: integer): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: integer): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: integer): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: RGBA): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setOutlineColor(value: RGBA): Self = this.set("outlineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlineColor: Self = this.set("outlineColor", js.undefined)
  }
  
}

