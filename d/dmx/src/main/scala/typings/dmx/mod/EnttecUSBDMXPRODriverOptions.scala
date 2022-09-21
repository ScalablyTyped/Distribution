package typings.dmx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnttecUSBDMXPRODriverOptions extends StObject {
  
  /** @default 40 */
  var dmx_speed: js.UndefOr[Double] = js.undefined
}
object EnttecUSBDMXPRODriverOptions {
  
  inline def apply(): EnttecUSBDMXPRODriverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnttecUSBDMXPRODriverOptions]
  }
  
  extension [Self <: EnttecUSBDMXPRODriverOptions](x: Self) {
    
    inline def setDmx_speed(value: Double): Self = StObject.set(x, "dmx_speed", value.asInstanceOf[js.Any])
    
    inline def setDmx_speedUndefined: Self = StObject.set(x, "dmx_speed", js.undefined)
  }
}
