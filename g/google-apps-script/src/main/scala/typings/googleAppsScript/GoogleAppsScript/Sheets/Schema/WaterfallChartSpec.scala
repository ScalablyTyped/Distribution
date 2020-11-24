package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaterfallChartSpec extends js.Object {
  
  var connectorLineStyle: js.UndefOr[LineStyle] = js.native
  
  var domain: js.UndefOr[WaterfallChartDomain] = js.native
  
  var firstValueIsTotal: js.UndefOr[Boolean] = js.native
  
  var hideConnectorLines: js.UndefOr[Boolean] = js.native
  
  var series: js.UndefOr[js.Array[WaterfallChartSeries]] = js.native
  
  var stackedType: js.UndefOr[String] = js.native
}
object WaterfallChartSpec {
  
  @scala.inline
  def apply(): WaterfallChartSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaterfallChartSpec]
  }
  
  @scala.inline
  implicit class WaterfallChartSpecOps[Self <: WaterfallChartSpec] (val x: Self) extends AnyVal {
    
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
    def setConnectorLineStyle(value: LineStyle): Self = this.set("connectorLineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectorLineStyle: Self = this.set("connectorLineStyle", js.undefined)
    
    @scala.inline
    def setDomain(value: WaterfallChartDomain): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setFirstValueIsTotal(value: Boolean): Self = this.set("firstValueIsTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstValueIsTotal: Self = this.set("firstValueIsTotal", js.undefined)
    
    @scala.inline
    def setHideConnectorLines(value: Boolean): Self = this.set("hideConnectorLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideConnectorLines: Self = this.set("hideConnectorLines", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: WaterfallChartSeries*): Self = this.set("series", js.Array(value :_*))
    
    @scala.inline
    def setSeries(value: js.Array[WaterfallChartSeries]): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setStackedType(value: String): Self = this.set("stackedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackedType: Self = this.set("stackedType", js.undefined)
  }
}
