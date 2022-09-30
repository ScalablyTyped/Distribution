package typings.googleCloudPubsub

import typings.googleCloudPubsub.protosMod.google.pubsub.v1.IPubsubMessage
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pubsubMessageMod {
  
  @JSImport("@google-cloud/pubsub/build/src/publisher/pubsub-message", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def calculateMessageSize(message: IPubsubMessage): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateMessageSize")(message.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def calculateMessageSize(message: PubsubMessage): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateMessageSize")(message.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  type Attributes = Record[String, String]
  
  trait PubsubMessage
    extends StObject
       with IPubsubMessage {
    
    /**
      * If we've calculated the size of this message, it will be cached here.
      * This is done to avoid having to build up the attribute size over and over.
      *
      * This field should not be used outside of this library. Its implementation
      * may change, and it may disappear later.
      *
      * @private
      */
    var calculatedSize: js.UndefOr[Double] = js.undefined
  }
  object PubsubMessage {
    
    inline def apply(): PubsubMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PubsubMessage]
    }
    
    extension [Self <: PubsubMessage](x: Self) {
      
      inline def setCalculatedSize(value: Double): Self = StObject.set(x, "calculatedSize", value.asInstanceOf[js.Any])
      
      inline def setCalculatedSizeUndefined: Self = StObject.set(x, "calculatedSize", js.undefined)
    }
  }
}
