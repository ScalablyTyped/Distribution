package typings.echarts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevicePixelRatio extends js.Object {
  
  var devicePixelRatio: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var renderer: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object DevicePixelRatio {
  
  @scala.inline
  def apply(): DevicePixelRatio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevicePixelRatio]
  }
  
  @scala.inline
  implicit class DevicePixelRatioOps[Self <: DevicePixelRatio] (val x: Self) extends AnyVal {
    
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
    def setDevicePixelRatio(value: Double): Self = this.set("devicePixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevicePixelRatio: Self = this.set("devicePixelRatio", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setRenderer(value: String): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
