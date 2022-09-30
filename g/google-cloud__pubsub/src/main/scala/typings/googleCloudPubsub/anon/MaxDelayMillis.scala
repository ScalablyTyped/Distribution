package typings.googleCloudPubsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
