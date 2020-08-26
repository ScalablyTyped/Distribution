package typings.devtoolsProtocol.mod.Protocol.Overlay

import typings.devtoolsProtocol.mod.Protocol.DOM.Quad
import typings.devtoolsProtocol.mod.Protocol.DOM.RGBA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightQuadRequest extends js.Object {
  /**
    * The highlight fill color (default: transparent).
    */
  var color: js.UndefOr[RGBA] = js.native
  /**
    * The highlight outline color (default: transparent).
    */
  var outlineColor: js.UndefOr[RGBA] = js.native
  /**
    * Quad to highlight
    */
  var quad: Quad = js.native
}

object HighlightQuadRequest {
  @scala.inline
  def apply(quad: Quad): HighlightQuadRequest = {
    val __obj = js.Dynamic.literal(quad = quad.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightQuadRequest]
  }
  @scala.inline
  implicit class HighlightQuadRequestOps[Self <: HighlightQuadRequest] (val x: Self) extends AnyVal {
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
    def setQuadVarargs(value: Double*): Self = this.set("quad", js.Array(value :_*))
    @scala.inline
    def setQuad(value: Quad): Self = this.set("quad", value.asInstanceOf[js.Any])
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

