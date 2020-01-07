package typings.googleapis.buildSrcApisPolyV1Mod.poly_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information on the complexity of this Format.
  */
@js.native
trait Schema$FormatComplexity extends js.Object {
  /**
    * A non-negative integer that represents the level of detail (LOD) of this
    * format relative to other formats of the same asset with the same
    * format_type. This hint allows you to sort formats from the most-detailed
    * (0) to least-detailed (integers greater than 0).
    */
  var lodHint: js.UndefOr[Double] = js.native
  /**
    * The estimated number of triangles.
    */
  var triangleCount: js.UndefOr[String] = js.native
}

object Schema$FormatComplexity {
  @scala.inline
  def apply(lodHint: Int | Double = null, triangleCount: String = null): Schema$FormatComplexity = {
    val __obj = js.Dynamic.literal()
    if (lodHint != null) __obj.updateDynamic("lodHint")(lodHint.asInstanceOf[js.Any])
    if (triangleCount != null) __obj.updateDynamic("triangleCount")(triangleCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$FormatComplexity]
  }
}

