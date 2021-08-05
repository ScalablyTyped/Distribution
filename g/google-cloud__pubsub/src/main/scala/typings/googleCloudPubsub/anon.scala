package typings.googleCloudPubsub

import typings.googleCloudPubsub.pubsubMod.RequestCallback
import typings.googleCloudPubsub.pubsubMod.RequestConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T, R](config: RequestConfig, callback: RequestCallback[T, R]): Unit = js.native
  }
  
  trait MaxDelayMillis extends StObject {
    
    var maxDelayMillis: Double
    
    var maxOutstandingBytes: Double
    
    var maxOutstandingMessages: Double
  }
  object MaxDelayMillis {
    
    inline def apply(maxDelayMillis: Double, maxOutstandingBytes: Double, maxOutstandingMessages: Double): MaxDelayMillis = {
      val __obj = js.Dynamic.literal(maxDelayMillis = maxDelayMillis.asInstanceOf[js.Any], maxOutstandingBytes = maxOutstandingBytes.asInstanceOf[js.Any], maxOutstandingMessages = maxOutstandingMessages.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxDelayMillis]
    }
    
    extension [Self <: MaxDelayMillis](x: Self) {
      
      inline def setMaxDelayMillis(value: Double): Self = StObject.set(x, "maxDelayMillis", value.asInstanceOf[js.Any])
      
      inline def setMaxOutstandingBytes(value: Double): Self = StObject.set(x, "maxOutstandingBytes", value.asInstanceOf[js.Any])
      
      inline def setMaxOutstandingMessages(value: Double): Self = StObject.set(x, "maxOutstandingMessages", value.asInstanceOf[js.Any])
    }
  }
  
  trait MaxExtensionMinutes extends StObject {
    
    var maxExtensionMinutes: Double
    
    var maxOutstandingBytes: Double
    
    var maxOutstandingMessages: Double
    
    var maxStreams: Double
  }
  object MaxExtensionMinutes {
    
    inline def apply(
      maxExtensionMinutes: Double,
      maxOutstandingBytes: Double,
      maxOutstandingMessages: Double,
      maxStreams: Double
    ): MaxExtensionMinutes = {
      val __obj = js.Dynamic.literal(maxExtensionMinutes = maxExtensionMinutes.asInstanceOf[js.Any], maxOutstandingBytes = maxOutstandingBytes.asInstanceOf[js.Any], maxOutstandingMessages = maxOutstandingMessages.asInstanceOf[js.Any], maxStreams = maxStreams.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxExtensionMinutes]
    }
    
    extension [Self <: MaxExtensionMinutes](x: Self) {
      
      inline def setMaxExtensionMinutes(value: Double): Self = StObject.set(x, "maxExtensionMinutes", value.asInstanceOf[js.Any])
      
      inline def setMaxOutstandingBytes(value: Double): Self = StObject.set(x, "maxOutstandingBytes", value.asInstanceOf[js.Any])
      
      inline def setMaxOutstandingMessages(value: Double): Self = StObject.set(x, "maxOutstandingMessages", value.asInstanceOf[js.Any])
      
      inline def setMaxStreams(value: Double): Self = StObject.set(x, "maxStreams", value.asInstanceOf[js.Any])
    }
  }
}
