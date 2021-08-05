package typings.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMagellanOptions extends StObject {
  
  var activeClass: js.UndefOr[String] = js.undefined
  
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  var animationEasing: js.UndefOr[String] = js.undefined
  
  var barOffset: js.UndefOr[Double] = js.undefined
  
  var deepLinking: js.UndefOr[Boolean] = js.undefined
  
  var threshold: js.UndefOr[Double] = js.undefined
}
object IMagellanOptions {
  
  inline def apply(): IMagellanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMagellanOptions]
  }
  
  extension [Self <: IMagellanOptions](x: Self) {
    
    inline def setActiveClass(value: String): Self = StObject.set(x, "activeClass", value.asInstanceOf[js.Any])
    
    inline def setActiveClassUndefined: Self = StObject.set(x, "activeClass", js.undefined)
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setAnimationEasing(value: String): Self = StObject.set(x, "animationEasing", value.asInstanceOf[js.Any])
    
    inline def setAnimationEasingUndefined: Self = StObject.set(x, "animationEasing", js.undefined)
    
    inline def setBarOffset(value: Double): Self = StObject.set(x, "barOffset", value.asInstanceOf[js.Any])
    
    inline def setBarOffsetUndefined: Self = StObject.set(x, "barOffset", js.undefined)
    
    inline def setDeepLinking(value: Boolean): Self = StObject.set(x, "deepLinking", value.asInstanceOf[js.Any])
    
    inline def setDeepLinkingUndefined: Self = StObject.set(x, "deepLinking", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
