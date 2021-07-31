package typings.echarts.echarts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EChartsOptionConfig extends StObject {
  
  var lazyUpdate: js.UndefOr[Boolean] = js.undefined
  
  var notMerge: js.UndefOr[Boolean] = js.undefined
  
  var silent: js.UndefOr[Boolean] = js.undefined
}
object EChartsOptionConfig {
  
  @scala.inline
  def apply(): EChartsOptionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EChartsOptionConfig]
  }
  
  @scala.inline
  implicit class EChartsOptionConfigMutableBuilder[Self <: EChartsOptionConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLazyUpdate(value: Boolean): Self = StObject.set(x, "lazyUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLazyUpdateUndefined: Self = StObject.set(x, "lazyUpdate", js.undefined)
    
    @scala.inline
    def setNotMerge(value: Boolean): Self = StObject.set(x, "notMerge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotMergeUndefined: Self = StObject.set(x, "notMerge", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
  }
}
