package typings.gapiClientWebmasters.gapi.client.webmasters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiDimensionFilter extends js.Object {
  var dimension: js.UndefOr[String] = js.undefined
  var expression: js.UndefOr[String] = js.undefined
  var operator: js.UndefOr[String] = js.undefined
}

object ApiDimensionFilter {
  @scala.inline
  def apply(dimension: String = null, expression: String = null, operator: String = null): ApiDimensionFilter = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiDimensionFilter]
  }
}

