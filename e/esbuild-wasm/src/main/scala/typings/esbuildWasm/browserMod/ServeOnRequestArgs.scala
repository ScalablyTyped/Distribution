package typings.esbuildWasm.browserMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServeOnRequestArgs extends StObject {
  
  var method: String
  
  var path: String
  
  var remoteAddress: String
  
  var status: Double
  
  /** The time to generate the response, not to send it */
  var timeInMS: Double
}
object ServeOnRequestArgs {
  
  inline def apply(method: String, path: String, remoteAddress: String, status: Double, timeInMS: Double): ServeOnRequestArgs = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timeInMS = timeInMS.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServeOnRequestArgs]
  }
  
  extension [Self <: ServeOnRequestArgs](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRemoteAddress(value: String): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTimeInMS(value: Double): Self = StObject.set(x, "timeInMS", value.asInstanceOf[js.Any])
  }
}
