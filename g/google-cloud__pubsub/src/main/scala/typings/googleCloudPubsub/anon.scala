package typings.googleCloudPubsub

import typings.googleCloudPubsub.pubsubMod.RequestCallback
import typings.googleCloudPubsub.pubsubMod.RequestConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T, R](config: RequestConfig, callback: RequestCallback[T, R]): Unit = js.native
  }
  
  @js.native
  trait MaxDelayMillis extends StObject {
    
    var maxDelayMillis: Double = js.native
    
    var maxOutstandingBytes: Double = js.native
    
    var maxOutstandingMessages: Double = js.native
  }
  object MaxDelayMillis {
    
    @scala.inline
    def apply(maxDelayMillis: Double, maxOutstandingBytes: Double, maxOutstandingMessages: Double): MaxDelayMillis = {
      val __obj = js.Dynamic.literal(maxDelayMillis = maxDelayMillis.asInstanceOf[js.Any], maxOutstandingBytes = maxOutstandingBytes.asInstanceOf[js.Any], maxOutstandingMessages = maxOutstandingMessages.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxDelayMillis]
    }
    
    @scala.inline
    implicit class MaxDelayMillisMutableBuilder[Self <: MaxDelayMillis] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxDelayMillis(value: Double): Self = StObject.set(x, "maxDelayMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxOutstandingBytes(value: Double): Self = StObject.set(x, "maxOutstandingBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxOutstandingMessages(value: Double): Self = StObject.set(x, "maxOutstandingMessages", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MaxExtensionMinutes extends StObject {
    
    var maxExtensionMinutes: Double = js.native
    
    var maxOutstandingBytes: Double = js.native
    
    var maxOutstandingMessages: Double = js.native
    
    var maxStreams: Double = js.native
  }
  object MaxExtensionMinutes {
    
    @scala.inline
    def apply(
      maxExtensionMinutes: Double,
      maxOutstandingBytes: Double,
      maxOutstandingMessages: Double,
      maxStreams: Double
    ): MaxExtensionMinutes = {
      val __obj = js.Dynamic.literal(maxExtensionMinutes = maxExtensionMinutes.asInstanceOf[js.Any], maxOutstandingBytes = maxOutstandingBytes.asInstanceOf[js.Any], maxOutstandingMessages = maxOutstandingMessages.asInstanceOf[js.Any], maxStreams = maxStreams.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxExtensionMinutes]
    }
    
    @scala.inline
    implicit class MaxExtensionMinutesMutableBuilder[Self <: MaxExtensionMinutes] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxExtensionMinutes(value: Double): Self = StObject.set(x, "maxExtensionMinutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxOutstandingBytes(value: Double): Self = StObject.set(x, "maxOutstandingBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxOutstandingMessages(value: Double): Self = StObject.set(x, "maxOutstandingMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxStreams(value: Double): Self = StObject.set(x, "maxStreams", value.asInstanceOf[js.Any])
    }
  }
}
