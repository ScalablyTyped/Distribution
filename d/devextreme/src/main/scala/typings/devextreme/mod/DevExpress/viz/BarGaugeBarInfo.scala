package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BarGaugeBarInfo extends js.Object {
  
  /**
    * [descr:BarGaugeBarInfo.color]
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * [descr:BarGaugeBarInfo.index]
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * [descr:BarGaugeBarInfo.value]
    */
  var value: js.UndefOr[Double] = js.native
}
object BarGaugeBarInfo {
  
  @scala.inline
  def apply(): BarGaugeBarInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarGaugeBarInfo]
  }
  
  @scala.inline
  implicit class BarGaugeBarInfoOps[Self <: BarGaugeBarInfo] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
