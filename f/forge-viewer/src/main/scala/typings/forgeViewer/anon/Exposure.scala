package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exposure extends StObject {
  
  var exposure: Double
  
  var lightMultiplier: Double
  
  var method: Double
}
object Exposure {
  
  inline def apply(exposure: Double, lightMultiplier: Double, method: Double): Exposure = {
    val __obj = js.Dynamic.literal(exposure = exposure.asInstanceOf[js.Any], lightMultiplier = lightMultiplier.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exposure]
  }
  
  extension [Self <: Exposure](x: Self) {
    
    inline def setExposure(value: Double): Self = StObject.set(x, "exposure", value.asInstanceOf[js.Any])
    
    inline def setLightMultiplier(value: Double): Self = StObject.set(x, "lightMultiplier", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: Double): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
