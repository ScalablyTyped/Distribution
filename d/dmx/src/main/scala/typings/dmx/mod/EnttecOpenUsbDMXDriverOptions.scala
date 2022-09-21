package typings.dmx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnttecOpenUsbDMXDriverOptions extends StObject {
  
  /** @default 1000 / 46 */
  var dmx_speed: js.UndefOr[Double] = js.undefined
}
object EnttecOpenUsbDMXDriverOptions {
  
  inline def apply(): EnttecOpenUsbDMXDriverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnttecOpenUsbDMXDriverOptions]
  }
  
  extension [Self <: EnttecOpenUsbDMXDriverOptions](x: Self) {
    
    inline def setDmx_speed(value: Double): Self = StObject.set(x, "dmx_speed", value.asInstanceOf[js.Any])
    
    inline def setDmx_speedUndefined: Self = StObject.set(x, "dmx_speed", js.undefined)
  }
}
