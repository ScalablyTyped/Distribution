package typings.devextreme.mod.DevExpress.viz

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseChartAnnotationConfig extends BaseWidgetAnnotationConfig {
  
  /**
    * [descr:BaseChartAnnotationConfig.argument]
    */
  var argument: js.UndefOr[Double | Date | String] = js.native
  
  /**
    * [descr:BaseChartAnnotationConfig.series]
    */
  var series: js.UndefOr[String] = js.native
  
  /**
    * [descr:BaseChartAnnotationConfig.value]
    */
  var value: js.UndefOr[Double | Date | String] = js.native
}
object BaseChartAnnotationConfig {
  
  @scala.inline
  def apply(): BaseChartAnnotationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseChartAnnotationConfig]
  }
  
  @scala.inline
  implicit class BaseChartAnnotationConfigOps[Self <: BaseChartAnnotationConfig] (val x: Self) extends AnyVal {
    
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
    def setArgument(value: Double | Date | String): Self = this.set("argument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgument: Self = this.set("argument", js.undefined)
    
    @scala.inline
    def setSeries(value: String): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    
    @scala.inline
    def setValue(value: Double | Date | String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
