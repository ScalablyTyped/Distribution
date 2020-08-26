package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxModel extends js.Object {
  /**
    * Border box
    */
  var border: Quad = js.native
  /**
    * Content box
    */
  var content: Quad = js.native
  /**
    * Node height
    */
  var height: integer = js.native
  /**
    * Margin box
    */
  var margin: Quad = js.native
  /**
    * Padding box
    */
  var padding: Quad = js.native
  /**
    * Shape outside coordinates
    */
  var shapeOutside: js.UndefOr[ShapeOutsideInfo] = js.native
  /**
    * Node width
    */
  var width: integer = js.native
}

object BoxModel {
  @scala.inline
  def apply(border: Quad, content: Quad, height: integer, margin: Quad, padding: Quad, width: integer): BoxModel = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxModel]
  }
  @scala.inline
  implicit class BoxModelOps[Self <: BoxModel] (val x: Self) extends AnyVal {
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
    def setBorderVarargs(value: Double*): Self = this.set("border", js.Array(value :_*))
    @scala.inline
    def setBorder(value: Quad): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentVarargs(value: Double*): Self = this.set("content", js.Array(value :_*))
    @scala.inline
    def setContent(value: Quad): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: integer): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginVarargs(value: Double*): Self = this.set("margin", js.Array(value :_*))
    @scala.inline
    def setMargin(value: Quad): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = this.set("padding", js.Array(value :_*))
    @scala.inline
    def setPadding(value: Quad): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: integer): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setShapeOutside(value: ShapeOutsideInfo): Self = this.set("shapeOutside", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShapeOutside: Self = this.set("shapeOutside", js.undefined)
  }
  
}

