package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreemapChartColorScale extends js.Object {
  
  var maxValueColor: js.UndefOr[Color] = js.native
  
  var midValueColor: js.UndefOr[Color] = js.native
  
  var minValueColor: js.UndefOr[Color] = js.native
  
  var noDataColor: js.UndefOr[Color] = js.native
}
object TreemapChartColorScale {
  
  @scala.inline
  def apply(): TreemapChartColorScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreemapChartColorScale]
  }
  
  @scala.inline
  implicit class TreemapChartColorScaleOps[Self <: TreemapChartColorScale] (val x: Self) extends AnyVal {
    
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
    def setMaxValueColor(value: Color): Self = this.set("maxValueColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValueColor: Self = this.set("maxValueColor", js.undefined)
    
    @scala.inline
    def setMidValueColor(value: Color): Self = this.set("midValueColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMidValueColor: Self = this.set("midValueColor", js.undefined)
    
    @scala.inline
    def setMinValueColor(value: Color): Self = this.set("minValueColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValueColor: Self = this.set("minValueColor", js.undefined)
    
    @scala.inline
    def setNoDataColor(value: Color): Self = this.set("noDataColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDataColor: Self = this.set("noDataColor", js.undefined)
  }
}
