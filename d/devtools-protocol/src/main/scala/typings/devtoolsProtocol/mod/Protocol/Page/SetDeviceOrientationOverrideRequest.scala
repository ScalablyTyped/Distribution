package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetDeviceOrientationOverrideRequest extends StObject {
  
  /**
    * Mock alpha
    */
  var alpha: Double
  
  /**
    * Mock beta
    */
  var beta: Double
  
  /**
    * Mock gamma
    */
  var gamma: Double
}
object SetDeviceOrientationOverrideRequest {
  
  inline def apply(alpha: Double, beta: Double, gamma: Double): SetDeviceOrientationOverrideRequest = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], gamma = gamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDeviceOrientationOverrideRequest]
  }
  
  extension [Self <: SetDeviceOrientationOverrideRequest](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setBeta(value: Double): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
    
    inline def setGamma(value: Double): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
  }
}
