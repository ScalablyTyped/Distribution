package typings.googleapis.buildSrcApisVideointelligenceV1Mod.videointelligence_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Normalized bounding polygon for text (that might not be aligned with axis).
  * Contains list of the corner points in clockwise order starting from
  * top-left corner. For example, for a rectangular bounding box: When the text
  * is horizontal it might look like:         0----1         |    | 3----2 When
  * it&#39;s clockwise rotated 180 degrees around the top-left corner it
  * becomes:         2----3         |    |         1----0  and the vertex order
  * will still be (0, 1, 2, 3). Note that values can be less than 0, or greater
  * than 1 due to trignometric calculations for location of the box.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1p3beta1_NormalizedBoundingPoly extends js.Object {
  /**
    * Normalized vertices of the bounding polygon.
    */
  var vertices: js.UndefOr[js.Array[Schema$GoogleCloudVideointelligenceV1p3beta1_NormalizedVertex]] = js.native
}

object Schema$GoogleCloudVideointelligenceV1p3beta1_NormalizedBoundingPoly {
  @scala.inline
  def apply(vertices: js.Array[Schema$GoogleCloudVideointelligenceV1p3beta1_NormalizedVertex] = null): Schema$GoogleCloudVideointelligenceV1p3beta1_NormalizedBoundingPoly = {
    val __obj = js.Dynamic.literal()
    if (vertices != null) __obj.updateDynamic("vertices")(vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1p3beta1_NormalizedBoundingPoly]
  }
}

