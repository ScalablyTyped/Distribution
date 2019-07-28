package typings.glDashReact.glDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceState extends js.Object {
  var debug: Boolean
  var ready: Boolean
  var rebootId: Double
}

object SurfaceState {
  @scala.inline
  def apply(debug: Boolean, ready: Boolean, rebootId: Double): SurfaceState = {
    val __obj = js.Dynamic.literal(debug = debug, ready = ready, rebootId = rebootId)
  
    __obj.asInstanceOf[SurfaceState]
  }
}

