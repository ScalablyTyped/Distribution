package typings.dmx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BBDMXDriverOptions extends StObject {
  
  /** @default 1000 / 24 */
  var dmx_speed: js.UndefOr[Double] = js.undefined
  
  /** @default 9930 */
  var port: js.UndefOr[Double] = js.undefined
}
object BBDMXDriverOptions {
  
  inline def apply(): BBDMXDriverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BBDMXDriverOptions]
  }
  
  extension [Self <: BBDMXDriverOptions](x: Self) {
    
    inline def setDmx_speed(value: Double): Self = StObject.set(x, "dmx_speed", value.asInstanceOf[js.Any])
    
    inline def setDmx_speedUndefined: Self = StObject.set(x, "dmx_speed", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
