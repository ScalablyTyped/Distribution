package typings.gapiClientAnalyticsreporting.gapi.client.analyticsreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentDimensionFilter extends js.Object {
  /** Should the match be case sensitive, ignored for `IN_LIST` operator. */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  /** Name of the dimension for which the filter is being applied. */
  var dimensionName: js.UndefOr[String] = js.native
  /** The list of expressions, only the first element is used for all operators */
  var expressions: js.UndefOr[js.Array[String]] = js.native
  /** Maximum comparison values for `BETWEEN` match type. */
  var maxComparisonValue: js.UndefOr[String] = js.native
  /** Minimum comparison values for `BETWEEN` match type. */
  var minComparisonValue: js.UndefOr[String] = js.native
  /** The operator to use to match the dimension with the expressions. */
  var operator: js.UndefOr[String] = js.native
}

object SegmentDimensionFilter {
  @scala.inline
  def apply(): SegmentDimensionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentDimensionFilter]
  }
  @scala.inline
  implicit class SegmentDimensionFilterOps[Self <: SegmentDimensionFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    @scala.inline
    def setDimensionName(value: String): Self = this.set("dimensionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionName: Self = this.set("dimensionName", js.undefined)
    @scala.inline
    def setExpressionsVarargs(value: String*): Self = this.set("expressions", js.Array(value :_*))
    @scala.inline
    def setExpressions(value: js.Array[String]): Self = this.set("expressions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpressions: Self = this.set("expressions", js.undefined)
    @scala.inline
    def setMaxComparisonValue(value: String): Self = this.set("maxComparisonValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxComparisonValue: Self = this.set("maxComparisonValue", js.undefined)
    @scala.inline
    def setMinComparisonValue(value: String): Self = this.set("minComparisonValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinComparisonValue: Self = this.set("minComparisonValue", js.undefined)
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
  }
  
}

