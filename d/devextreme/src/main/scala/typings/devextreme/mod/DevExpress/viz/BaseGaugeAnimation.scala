package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.easeOutCubic
import typings.devextreme.devextremeStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:BaseGauge.Options.animation]
  */
@js.native
trait BaseGaugeAnimation extends js.Object {
  
  /**
    * [descr:BaseGauge.Options.animation.duration]
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * [descr:BaseGauge.Options.animation.easing]
    */
  var easing: js.UndefOr[easeOutCubic | linear] = js.native
  
  /**
    * [descr:BaseGauge.Options.animation.enabled]
    */
  var enabled: js.UndefOr[Boolean] = js.native
}
object BaseGaugeAnimation {
  
  @scala.inline
  def apply(): BaseGaugeAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseGaugeAnimation]
  }
  
  @scala.inline
  implicit class BaseGaugeAnimationOps[Self <: BaseGaugeAnimation] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEasing(value: easeOutCubic | linear): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
}
