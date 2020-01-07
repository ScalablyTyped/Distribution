package typings.googleapis.buildSrcApisWebmastersV3Mod.webmasters_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ApiDimensionFilter extends js.Object {
  var dimension: js.UndefOr[String] = js.native
  var expression: js.UndefOr[String] = js.native
  var operator: js.UndefOr[String] = js.native
}

object Schema$ApiDimensionFilter {
  @scala.inline
  def apply(dimension: String = null, expression: String = null, operator: String = null): Schema$ApiDimensionFilter = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ApiDimensionFilter]
  }
}

