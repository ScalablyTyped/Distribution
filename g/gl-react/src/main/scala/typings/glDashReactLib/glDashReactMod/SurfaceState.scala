package typings
package glDashReactLib.glDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceState extends js.Object {
  var debug: scala.Boolean
  var ready: scala.Boolean
  var rebootId: scala.Double
}

object SurfaceState {
  @scala.inline
  def apply(debug: scala.Boolean, ready: scala.Boolean, rebootId: scala.Double): SurfaceState = {
    val __obj = js.Dynamic.literal(debug = debug, ready = ready, rebootId = rebootId)
  
    __obj.asInstanceOf[SurfaceState]
  }
}

