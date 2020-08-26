package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pivot extends js.Object {
  var dimensionFilterClauses: js.UndefOr[js.Array[DimensionFilterClause]] = js.native
  var dimensions: js.UndefOr[js.Array[Dimension]] = js.native
  var maxGroupCount: js.UndefOr[Double] = js.native
  var metrics: js.UndefOr[js.Array[Metric]] = js.native
  var startGroup: js.UndefOr[Double] = js.native
}

object Pivot {
  @scala.inline
  def apply(): Pivot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pivot]
  }
  @scala.inline
  implicit class PivotOps[Self <: Pivot] (val x: Self) extends AnyVal {
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
    def setDimensionFilterClausesVarargs(value: DimensionFilterClause*): Self = this.set("dimensionFilterClauses", js.Array(value :_*))
    @scala.inline
    def setDimensionFilterClauses(value: js.Array[DimensionFilterClause]): Self = this.set("dimensionFilterClauses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensionFilterClauses: Self = this.set("dimensionFilterClauses", js.undefined)
    @scala.inline
    def setDimensionsVarargs(value: Dimension*): Self = this.set("dimensions", js.Array(value :_*))
    @scala.inline
    def setDimensions(value: js.Array[Dimension]): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    @scala.inline
    def setMaxGroupCount(value: Double): Self = this.set("maxGroupCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxGroupCount: Self = this.set("maxGroupCount", js.undefined)
    @scala.inline
    def setMetricsVarargs(value: Metric*): Self = this.set("metrics", js.Array(value :_*))
    @scala.inline
    def setMetrics(value: js.Array[Metric]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    @scala.inline
    def setStartGroup(value: Double): Self = this.set("startGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartGroup: Self = this.set("startGroup", js.undefined)
  }
  
}

