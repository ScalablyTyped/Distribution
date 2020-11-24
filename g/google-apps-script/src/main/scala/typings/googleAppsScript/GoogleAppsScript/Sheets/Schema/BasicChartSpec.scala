package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicChartSpec extends js.Object {
  
  var axis: js.UndefOr[js.Array[BasicChartAxis]] = js.native
  
  var chartType: js.UndefOr[String] = js.native
  
  var compareMode: js.UndefOr[String] = js.native
  
  var domains: js.UndefOr[js.Array[BasicChartDomain]] = js.native
  
  var headerCount: js.UndefOr[Double] = js.native
  
  var interpolateNulls: js.UndefOr[Boolean] = js.native
  
  var legendPosition: js.UndefOr[String] = js.native
  
  var lineSmoothing: js.UndefOr[Boolean] = js.native
  
  var series: js.UndefOr[js.Array[BasicChartSeries]] = js.native
  
  var stackedType: js.UndefOr[String] = js.native
  
  var threeDimensional: js.UndefOr[Boolean] = js.native
}
object BasicChartSpec {
  
  @scala.inline
  def apply(): BasicChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicChartSpec]
  }
  
  @scala.inline
  implicit class BasicChartSpecOps[Self <: BasicChartSpec] (val x: Self) extends AnyVal {
    
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
    def setAxisVarargs(value: BasicChartAxis*): Self = this.set("axis", js.Array(value :_*))
    
    @scala.inline
    def setAxis(value: js.Array[BasicChartAxis]): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setChartType(value: String): Self = this.set("chartType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartType: Self = this.set("chartType", js.undefined)
    
    @scala.inline
    def setCompareMode(value: String): Self = this.set("compareMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompareMode: Self = this.set("compareMode", js.undefined)
    
    @scala.inline
    def setDomainsVarargs(value: BasicChartDomain*): Self = this.set("domains", js.Array(value :_*))
    
    @scala.inline
    def setDomains(value: js.Array[BasicChartDomain]): Self = this.set("domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomains: Self = this.set("domains", js.undefined)
    
    @scala.inline
    def setHeaderCount(value: Double): Self = this.set("headerCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderCount: Self = this.set("headerCount", js.undefined)
    
    @scala.inline
    def setInterpolateNulls(value: Boolean): Self = this.set("interpolateNulls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpolateNulls: Self = this.set("interpolateNulls", js.undefined)
    
    @scala.inline
    def setLegendPosition(value: String): Self = this.set("legendPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendPosition: Self = this.set("legendPosition", js.undefined)
    
    @scala.inline
    def setLineSmoothing(value: Boolean): Self = this.set("lineSmoothing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineSmoothing: Self = this.set("lineSmoothing", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: BasicChartSeries*): Self = this.set("series", js.Array(value :_*))
    
    @scala.inline
    def setSeries(value: js.Array[BasicChartSeries]): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setStackedType(value: String): Self = this.set("stackedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackedType: Self = this.set("stackedType", js.undefined)
    
    @scala.inline
    def setThreeDimensional(value: Boolean): Self = this.set("threeDimensional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreeDimensional: Self = this.set("threeDimensional", js.undefined)
  }
}
