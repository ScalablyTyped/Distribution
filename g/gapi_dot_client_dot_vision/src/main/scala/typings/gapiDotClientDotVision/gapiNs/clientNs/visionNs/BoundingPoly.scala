package typings.gapiDotClientDotVision.gapiNs.clientNs.visionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoundingPoly extends js.Object {
  /** The bounding polygon vertices. */
  var vertices: js.UndefOr[js.Array[Vertex]] = js.undefined
}

object BoundingPoly {
  @scala.inline
  def apply(vertices: js.Array[Vertex] = null): BoundingPoly = {
    val __obj = js.Dynamic.literal()
    if (vertices != null) __obj.updateDynamic("vertices")(vertices)
    __obj.asInstanceOf[BoundingPoly]
  }
}

