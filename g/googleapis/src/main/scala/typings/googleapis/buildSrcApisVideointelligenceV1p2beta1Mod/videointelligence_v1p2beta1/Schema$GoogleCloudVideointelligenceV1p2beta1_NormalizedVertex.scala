package typings.googleapis.buildSrcApisVideointelligenceV1p2beta1Mod.videointelligence_v1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A vertex represents a 2D point in the image. NOTE: the normalized vertex
  * coordinates are relative to the original image and range from 0 to 1.
  */
@js.native
trait Schema$GoogleCloudVideointelligenceV1p2beta1_NormalizedVertex extends js.Object {
  /**
    * X coordinate.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * Y coordinate.
    */
  var y: js.UndefOr[Double] = js.native
}

object Schema$GoogleCloudVideointelligenceV1p2beta1_NormalizedVertex {
  @scala.inline
  def apply(x: Int | Double = null, y: Int | Double = null): Schema$GoogleCloudVideointelligenceV1p2beta1_NormalizedVertex = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVideointelligenceV1p2beta1_NormalizedVertex]
  }
}

