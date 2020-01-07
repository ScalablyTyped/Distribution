package typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A bounding polygon for the detected image annotation.
  */
@js.native
trait Schema$BoundingPoly extends js.Object {
  /**
    * The bounding polygon normalized vertices.
    */
  var normalizedVertices: js.UndefOr[js.Array[Schema$NormalizedVertex]] = js.native
  /**
    * The bounding polygon vertices.
    */
  var vertices: js.UndefOr[js.Array[Schema$Vertex]] = js.native
}

object Schema$BoundingPoly {
  @scala.inline
  def apply(
    normalizedVertices: js.Array[Schema$NormalizedVertex] = null,
    vertices: js.Array[Schema$Vertex] = null
  ): Schema$BoundingPoly = {
    val __obj = js.Dynamic.literal()
    if (normalizedVertices != null) __obj.updateDynamic("normalizedVertices")(normalizedVertices.asInstanceOf[js.Any])
    if (vertices != null) __obj.updateDynamic("vertices")(vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BoundingPoly]
  }
}

