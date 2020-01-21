package typings.glReact.mod

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
    val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], rebootId = rebootId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SurfaceState]
  }
}

