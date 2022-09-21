package typings.dmx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketioDriverOptions extends StObject {
  
  /** @default false */
  var debug: js.UndefOr[Boolean] = js.undefined
  
  /** @default 18909 */
  var port: js.UndefOr[Double] = js.undefined
}
object SocketioDriverOptions {
  
  inline def apply(): SocketioDriverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketioDriverOptions]
  }
  
  extension [Self <: SocketioDriverOptions](x: Self) {
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
