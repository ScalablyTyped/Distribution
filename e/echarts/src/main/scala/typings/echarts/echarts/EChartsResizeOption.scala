package typings.echarts.echarts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EChartsResizeOption extends StObject {
  
  /**
    * Chart height.
    */
  var height: js.UndefOr[Double | String] = js.undefined
  
  /**
    * Specify whether or not to prevent triggering events.
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Chart width.
    */
  var width: js.UndefOr[Double | String] = js.undefined
}
object EChartsResizeOption {
  
  @scala.inline
  def apply(): EChartsResizeOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EChartsResizeOption]
  }
  
  @scala.inline
  implicit class EChartsResizeOptionMutableBuilder[Self <: EChartsResizeOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
