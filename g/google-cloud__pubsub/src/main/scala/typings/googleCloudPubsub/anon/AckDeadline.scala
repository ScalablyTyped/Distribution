package typings.googleCloudPubsub.anon

import typings.googleCloudPubsub.temporalMod.Duration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AckDeadline extends StObject {
  
  var ackDeadline: Double
  
  var maxAckDeadline: Duration
  
  var maxExtensionMinutes: Double
  
  var maxOutstandingBytes: Double
  
  var maxOutstandingMessages: Double
  
  var maxStreams: Double
  
  var minAckDeadline: Unit
}
object AckDeadline {
  
  inline def apply(
    ackDeadline: Double,
    maxAckDeadline: Duration,
    maxExtensionMinutes: Double,
    maxOutstandingBytes: Double,
    maxOutstandingMessages: Double,
    maxStreams: Double,
    minAckDeadline: Unit
  ): AckDeadline = {
    val __obj = js.Dynamic.literal(ackDeadline = ackDeadline.asInstanceOf[js.Any], maxAckDeadline = maxAckDeadline.asInstanceOf[js.Any], maxExtensionMinutes = maxExtensionMinutes.asInstanceOf[js.Any], maxOutstandingBytes = maxOutstandingBytes.asInstanceOf[js.Any], maxOutstandingMessages = maxOutstandingMessages.asInstanceOf[js.Any], maxStreams = maxStreams.asInstanceOf[js.Any], minAckDeadline = minAckDeadline.asInstanceOf[js.Any])
    __obj.asInstanceOf[AckDeadline]
  }
  
  extension [Self <: AckDeadline](x: Self) {
    
    inline def setAckDeadline(value: Double): Self = StObject.set(x, "ackDeadline", value.asInstanceOf[js.Any])
    
    inline def setMaxAckDeadline(value: Duration): Self = StObject.set(x, "maxAckDeadline", value.asInstanceOf[js.Any])
    
    inline def setMaxExtensionMinutes(value: Double): Self = StObject.set(x, "maxExtensionMinutes", value.asInstanceOf[js.Any])
    
    inline def setMaxOutstandingBytes(value: Double): Self = StObject.set(x, "maxOutstandingBytes", value.asInstanceOf[js.Any])
    
    inline def setMaxOutstandingMessages(value: Double): Self = StObject.set(x, "maxOutstandingMessages", value.asInstanceOf[js.Any])
    
    inline def setMaxStreams(value: Double): Self = StObject.set(x, "maxStreams", value.asInstanceOf[js.Any])
    
    inline def setMinAckDeadline(value: Unit): Self = StObject.set(x, "minAckDeadline", value.asInstanceOf[js.Any])
  }
}
