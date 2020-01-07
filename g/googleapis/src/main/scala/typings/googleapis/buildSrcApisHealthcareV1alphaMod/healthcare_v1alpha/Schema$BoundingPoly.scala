package typings.googleapis.buildSrcApisHealthcareV1alphaMod.healthcare_v1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A bounding polygon for the detected image annotation.
  */
@js.native
trait Schema$BoundingPoly extends js.Object {
  var label: js.UndefOr[String] = js.native
  var vertices: js.UndefOr[js.Array[Schema$Vertex]] = js.native
}

object Schema$BoundingPoly {
  @scala.inline
  def apply(label: String = null, vertices: js.Array[Schema$Vertex] = null): Schema$BoundingPoly = {
    val __obj = js.Dynamic.literal()
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (vertices != null) __obj.updateDynamic("vertices")(vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BoundingPoly]
  }
}

