package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentMetricFilter extends js.Object {
  
  var comparisonValue: js.UndefOr[String] = js.native
  
  var maxComparisonValue: js.UndefOr[String] = js.native
  
  var metricName: js.UndefOr[String] = js.native
  
  var operator: js.UndefOr[String] = js.native
  
  var scope: js.UndefOr[String] = js.native
}
object SegmentMetricFilter {
  
  @scala.inline
  def apply(): SegmentMetricFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentMetricFilter]
  }
  
  @scala.inline
  implicit class SegmentMetricFilterOps[Self <: SegmentMetricFilter] (val x: Self) extends AnyVal {
    
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
    def setComparisonValue(value: String): Self = this.set("comparisonValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparisonValue: Self = this.set("comparisonValue", js.undefined)
    
    @scala.inline
    def setMaxComparisonValue(value: String): Self = this.set("maxComparisonValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxComparisonValue: Self = this.set("maxComparisonValue", js.undefined)
    
    @scala.inline
    def setMetricName(value: String): Self = this.set("metricName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricName: Self = this.set("metricName", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperator: Self = this.set("operator", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
  }
}
