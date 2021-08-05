package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Distance extends StObject {
  
  /** @default 20 */
  var distance: js.UndefOr[Double] = js.undefined
  
  /** @default 30 */
  var threshold: js.UndefOr[Double] = js.undefined
}
object Distance {
  
  inline def apply(): Distance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Distance]
  }
  
  extension [Self <: Distance](x: Self) {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
