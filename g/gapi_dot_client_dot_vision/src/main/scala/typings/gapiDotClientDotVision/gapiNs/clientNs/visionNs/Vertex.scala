package typings.gapiDotClientDotVision.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vertex extends js.Object {
  /** X coordinate. */
  var x: js.UndefOr[Double] = js.undefined
  /** Y coordinate. */
  var y: js.UndefOr[Double] = js.undefined
}

object Vertex {
  @scala.inline
  def apply(x: Int | Double = null, y: Int | Double = null): Vertex = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vertex]
  }
}

