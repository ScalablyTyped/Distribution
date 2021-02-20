package typings.devtoolsProtocol.mod.Protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DeviceOrientation {
  
  @js.native
  trait SetDeviceOrientationOverrideRequest extends StObject {
    
    /**
      * Mock alpha
      */
    var alpha: Double = js.native
    
    /**
      * Mock beta
      */
    var beta: Double = js.native
    
    /**
      * Mock gamma
      */
    var gamma: Double = js.native
  }
  object SetDeviceOrientationOverrideRequest {
    
    @scala.inline
    def apply(alpha: Double, beta: Double, gamma: Double): SetDeviceOrientationOverrideRequest = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], beta = beta.asInstanceOf[js.Any], gamma = gamma.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetDeviceOrientationOverrideRequest]
    }
    
    @scala.inline
    implicit class SetDeviceOrientationOverrideRequestMutableBuilder[Self <: SetDeviceOrientationOverrideRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeta(value: Double): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGamma(value: Double): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
    }
  }
}
