package typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A bounding polygon for the detected image annotation.
  */
@js.native
trait Schema$GoogleCloudVisionV1p3beta1BoundingPoly extends js.Object {
  /**
    * The bounding polygon normalized vertices.
    */
  var normalizedVertices: js.UndefOr[js.Array[Schema$GoogleCloudVisionV1p3beta1NormalizedVertex]] = js.native
  /**
    * The bounding polygon vertices.
    */
  var vertices: js.UndefOr[js.Array[Schema$GoogleCloudVisionV1p3beta1Vertex]] = js.native
}

object Schema$GoogleCloudVisionV1p3beta1BoundingPoly {
  @scala.inline
  def apply(
    normalizedVertices: js.Array[Schema$GoogleCloudVisionV1p3beta1NormalizedVertex] = null,
    vertices: js.Array[Schema$GoogleCloudVisionV1p3beta1Vertex] = null
  ): Schema$GoogleCloudVisionV1p3beta1BoundingPoly = {
    val __obj = js.Dynamic.literal()
    if (normalizedVertices != null) __obj.updateDynamic("normalizedVertices")(normalizedVertices.asInstanceOf[js.Any])
    if (vertices != null) __obj.updateDynamic("vertices")(vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p3beta1BoundingPoly]
  }
}

