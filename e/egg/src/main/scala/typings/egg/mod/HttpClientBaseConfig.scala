package typings.egg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpClientBaseConfig extends StObject {
  
  /** Free socket after keepalive timeout */
  var freeSocketKeepAliveTimeout: js.UndefOr[Double] = js.undefined
  
  /** Free socket after request timeout */
  var freeSocketTimeout: js.UndefOr[Double] = js.undefined
  
  /** Whether use http keepalive */
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  
  /** The maximum number of sockets that will be left open in the free state */
  var maxFreeSockets: js.UndefOr[Double] = js.undefined
  
  /** Determines how many concurrent sockets the agent can have open per origin */
  var maxSockets: js.UndefOr[Double] = js.undefined
  
  /** Request timeout */
  var timeout: js.UndefOr[Double] = js.undefined
}
object HttpClientBaseConfig {
  
  inline def apply(): HttpClientBaseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpClientBaseConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpClientBaseConfig] (val x: Self) extends AnyVal {
    
    inline def setFreeSocketKeepAliveTimeout(value: Double): Self = StObject.set(x, "freeSocketKeepAliveTimeout", value.asInstanceOf[js.Any])
    
    inline def setFreeSocketKeepAliveTimeoutUndefined: Self = StObject.set(x, "freeSocketKeepAliveTimeout", js.undefined)
    
    inline def setFreeSocketTimeout(value: Double): Self = StObject.set(x, "freeSocketTimeout", value.asInstanceOf[js.Any])
    
    inline def setFreeSocketTimeoutUndefined: Self = StObject.set(x, "freeSocketTimeout", js.undefined)
    
    inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
    
    inline def setMaxFreeSockets(value: Double): Self = StObject.set(x, "maxFreeSockets", value.asInstanceOf[js.Any])
    
    inline def setMaxFreeSocketsUndefined: Self = StObject.set(x, "maxFreeSockets", js.undefined)
    
    inline def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
    
    inline def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
