package typings.googleapis.buildSrcApisHealthcareV1alpha2Mod.healthcare_v1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Image annotation.
  */
@js.native
trait Schema$ImageAnnotation extends js.Object {
  /**
    * The list of polygons outlining the sensitive regions in the image.
    */
  var boundingPolys: js.UndefOr[js.Array[Schema$BoundingPoly]] = js.native
}

object Schema$ImageAnnotation {
  @scala.inline
  def apply(boundingPolys: js.Array[Schema$BoundingPoly] = null): Schema$ImageAnnotation = {
    val __obj = js.Dynamic.literal()
    if (boundingPolys != null) __obj.updateDynamic("boundingPolys")(boundingPolys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ImageAnnotation]
  }
}

