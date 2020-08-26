package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShapeOutsideInfo extends js.Object {
  /**
    * Shape bounds
    */
  var bounds: Quad = js.native
  /**
    * Margin shape bounds
    */
  var marginShape: js.Array[_] = js.native
  /**
    * Shape coordinate details
    */
  var shape: js.Array[_] = js.native
}

object ShapeOutsideInfo {
  @scala.inline
  def apply(bounds: Quad, marginShape: js.Array[_], shape: js.Array[_]): ShapeOutsideInfo = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], marginShape = marginShape.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeOutsideInfo]
  }
  @scala.inline
  implicit class ShapeOutsideInfoOps[Self <: ShapeOutsideInfo] (val x: Self) extends AnyVal {
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
    def setBoundsVarargs(value: Double*): Self = this.set("bounds", js.Array(value :_*))
    @scala.inline
    def setBounds(value: Quad): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarginShapeVarargs(value: js.Any*): Self = this.set("marginShape", js.Array(value :_*))
    @scala.inline
    def setMarginShape(value: js.Array[_]): Self = this.set("marginShape", value.asInstanceOf[js.Any])
    @scala.inline
    def setShapeVarargs(value: js.Any*): Self = this.set("shape", js.Array(value :_*))
    @scala.inline
    def setShape(value: js.Array[_]): Self = this.set("shape", value.asInstanceOf[js.Any])
  }
  
}

