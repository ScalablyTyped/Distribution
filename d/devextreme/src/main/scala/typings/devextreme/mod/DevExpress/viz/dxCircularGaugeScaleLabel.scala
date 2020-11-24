package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.first
import typings.devextreme.devextremeStrings.last
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxCircularGaugeScaleLabel extends BaseGaugeScaleLabel {
  
  /**
    * [descr:dxCircularGauge.Options.scale.label.hideFirstOrLast]
    */
  var hideFirstOrLast: js.UndefOr[first | last] = js.native
  
  /**
    * [descr:dxCircularGauge.Options.scale.label.indentFromTick]
    */
  var indentFromTick: js.UndefOr[Double] = js.native
}
object dxCircularGaugeScaleLabel {
  
  @scala.inline
  def apply(): dxCircularGaugeScaleLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxCircularGaugeScaleLabel]
  }
  
  @scala.inline
  implicit class dxCircularGaugeScaleLabelOps[Self <: dxCircularGaugeScaleLabel] (val x: Self) extends AnyVal {
    
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
    def setHideFirstOrLast(value: first | last): Self = this.set("hideFirstOrLast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideFirstOrLast: Self = this.set("hideFirstOrLast", js.undefined)
    
    @scala.inline
    def setIndentFromTick(value: Double): Self = this.set("indentFromTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentFromTick: Self = this.set("indentFromTick", js.undefined)
  }
}
