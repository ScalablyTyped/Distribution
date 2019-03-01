package typings
package gapiDotClientDotWebmastersLib.gapiNs.clientNs.webmastersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiDimensionFilter extends js.Object {
  var dimension: js.UndefOr[java.lang.String] = js.undefined
  var expression: js.UndefOr[java.lang.String] = js.undefined
  var operator: js.UndefOr[java.lang.String] = js.undefined
}

object ApiDimensionFilter {
  @scala.inline
  def apply(
    dimension: java.lang.String = null,
    expression: java.lang.String = null,
    operator: java.lang.String = null
  ): ApiDimensionFilter = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (operator != null) __obj.updateDynamic("operator")(operator)
    __obj.asInstanceOf[ApiDimensionFilter]
  }
}

