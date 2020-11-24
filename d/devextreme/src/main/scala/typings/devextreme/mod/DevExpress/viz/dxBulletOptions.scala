package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxBulletOptions extends BaseSparklineOptions[dxBullet] {
  
  /**
    * [descr:dxBullet.Options.color]
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxBullet.Options.endScaleValue]
    */
  var endScaleValue: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxBullet.Options.showTarget]
    */
  var showTarget: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxBullet.Options.showZeroLevel]
    */
  var showZeroLevel: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxBullet.Options.startScaleValue]
    */
  var startScaleValue: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxBullet.Options.target]
    */
  var target: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxBullet.Options.targetColor]
    */
  var targetColor: js.UndefOr[String] = js.native
  
  /**
    * [descr:dxBullet.Options.targetWidth]
    */
  var targetWidth: js.UndefOr[Double] = js.native
  
  /**
    * [descr:dxBullet.Options.value]
    */
  var value: js.UndefOr[Double] = js.native
}
object dxBulletOptions {
  
  @scala.inline
  def apply(): dxBulletOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxBulletOptions]
  }
  
  @scala.inline
  implicit class dxBulletOptionsOps[Self <: dxBulletOptions] (val x: Self) extends AnyVal {
    
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
    def setEndScaleValue(value: Double): Self = this.set("endScaleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndScaleValue: Self = this.set("endScaleValue", js.undefined)
    
    @scala.inline
    def setShowTarget(value: Boolean): Self = this.set("showTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTarget: Self = this.set("showTarget", js.undefined)
    
    @scala.inline
    def setShowZeroLevel(value: Boolean): Self = this.set("showZeroLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowZeroLevel: Self = this.set("showZeroLevel", js.undefined)
    
    @scala.inline
    def setStartScaleValue(value: Double): Self = this.set("startScaleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartScaleValue: Self = this.set("startScaleValue", js.undefined)
    
    @scala.inline
    def setTarget(value: Double): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetColor(value: String): Self = this.set("targetColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetColor: Self = this.set("targetColor", js.undefined)
    
    @scala.inline
    def setTargetWidth(value: Double): Self = this.set("targetWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetWidth: Self = this.set("targetWidth", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
