package typings.googleapis.buildSrcApisVisionV1p1beta1Mod.vision_v1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A vertex represents a 2D point in the image. NOTE: the vertex coordinates
  * are in the same scale as the original image.
  */
@js.native
trait Schema$GoogleCloudVisionV1p3beta1Vertex extends js.Object {
  /**
    * X coordinate.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * Y coordinate.
    */
  var y: js.UndefOr[Double] = js.native
}

object Schema$GoogleCloudVisionV1p3beta1Vertex {
  @scala.inline
  def apply(x: Int | Double = null, y: Int | Double = null): Schema$GoogleCloudVisionV1p3beta1Vertex = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleCloudVisionV1p3beta1Vertex]
  }
}

