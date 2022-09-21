package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectTiming extends StObject {
  
  /**
    * Timing's requestTime is a baseline in seconds, while the other numbers are ticks in
    * milliseconds relatively to this requestTime. Matches ResourceTiming's requestTime for
    * the same request (but not for redirected requests).
    */
  var requestTime: Double
}
object ConnectTiming {
  
  inline def apply(requestTime: Double): ConnectTiming = {
    val __obj = js.Dynamic.literal(requestTime = requestTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectTiming]
  }
  
  extension [Self <: ConnectTiming](x: Self) {
    
    inline def setRequestTime(value: Double): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
  }
}
