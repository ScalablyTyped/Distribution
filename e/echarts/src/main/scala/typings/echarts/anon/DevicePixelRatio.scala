package typings.echarts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevicePixelRatio extends StObject {
  
  var devicePixelRatio: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var renderer: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
}
object DevicePixelRatio {
  
  @scala.inline
  def apply(): DevicePixelRatio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevicePixelRatio]
  }
  
  @scala.inline
  implicit class DevicePixelRatioMutableBuilder[Self <: DevicePixelRatio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevicePixelRatio(value: Double): Self = StObject.set(x, "devicePixelRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicePixelRatioUndefined: Self = StObject.set(x, "devicePixelRatio", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setRenderer(value: String): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
