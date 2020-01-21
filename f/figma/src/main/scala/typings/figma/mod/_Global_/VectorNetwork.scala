package typings.figma.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorNetwork extends js.Object {
  val regions: js.UndefOr[js.Array[VectorRegion]] = js.undefined
  val segments: js.Array[VectorSegment]
  val vertices: js.Array[VectorVertex]
}

object VectorNetwork {
  @scala.inline
  def apply(
    segments: js.Array[VectorSegment],
    vertices: js.Array[VectorVertex],
    regions: js.Array[VectorRegion] = null
  ): VectorNetwork = {
    val __obj = js.Dynamic.literal(segments = segments.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorNetwork]
  }
}

