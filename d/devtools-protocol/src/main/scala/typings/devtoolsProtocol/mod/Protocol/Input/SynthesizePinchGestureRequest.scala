package typings.devtoolsProtocol.mod.Protocol.Input

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SynthesizePinchGestureRequest extends js.Object {
  /**
    * Which type of input events to be generated (default: 'default', which queries the platform
    * for the preferred input type).
    */
  var gestureSourceType: js.UndefOr[GestureSourceType] = js.native
  /**
    * Relative pointer speed in pixels per second (default: 800).
    */
  var relativeSpeed: js.UndefOr[integer] = js.native
  /**
    * Relative scale factor after zooming (>1.0 zooms in, <1.0 zooms out).
    */
  var scaleFactor: Double = js.native
  /**
    * X coordinate of the start of the gesture in CSS pixels.
    */
  var x: Double = js.native
  /**
    * Y coordinate of the start of the gesture in CSS pixels.
    */
  var y: Double = js.native
}

object SynthesizePinchGestureRequest {
  @scala.inline
  def apply(scaleFactor: Double, x: Double, y: Double): SynthesizePinchGestureRequest = {
    val __obj = js.Dynamic.literal(scaleFactor = scaleFactor.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SynthesizePinchGestureRequest]
  }
  @scala.inline
  implicit class SynthesizePinchGestureRequestOps[Self <: SynthesizePinchGestureRequest] (val x: Self) extends AnyVal {
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
    def setScaleFactor(value: Double): Self = this.set("scaleFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setGestureSourceType(value: GestureSourceType): Self = this.set("gestureSourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGestureSourceType: Self = this.set("gestureSourceType", js.undefined)
    @scala.inline
    def setRelativeSpeed(value: integer): Self = this.set("relativeSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelativeSpeed: Self = this.set("relativeSpeed", js.undefined)
  }
  
}

