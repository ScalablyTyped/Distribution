package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.area
import typings.devextreme.devextremeStrings.bar
import typings.devextreme.devextremeStrings.line
import typings.devextreme.devextremeStrings.scatter
import typings.devextreme.devextremeStrings.stackedbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolarChartSeries extends dxPolarChartSeriesTypesCommonPolarChartSeries {
  
  /**
    * [descr:PolarChartSeries.name]
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * [descr:PolarChartSeries.tag]
    */
  var tag: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:PolarChartSeries.type]
    */
  var `type`: js.UndefOr[area | bar | line | scatter | stackedbar] = js.native
}
object PolarChartSeries {
  
  @scala.inline
  def apply(): PolarChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolarChartSeries]
  }
  
  @scala.inline
  implicit class PolarChartSeriesOps[Self <: PolarChartSeries] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setTag(value: js.Any): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    
    @scala.inline
    def setType(value: area | bar | line | scatter | stackedbar): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
