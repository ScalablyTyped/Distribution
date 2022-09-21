package typings.dmx.mod

import typings.dmx.dmxStrings.A
import typings.dmx.dmxStrings.B
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DMXKingUltraDMXProDriverOptions extends StObject {
  
  /** @default 40 */
  var dmx_speed: js.UndefOr[Double] = js.undefined
  
  /** @default undefined */
  var port: js.UndefOr[A | B] = js.undefined
}
object DMXKingUltraDMXProDriverOptions {
  
  inline def apply(): DMXKingUltraDMXProDriverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DMXKingUltraDMXProDriverOptions]
  }
  
  extension [Self <: DMXKingUltraDMXProDriverOptions](x: Self) {
    
    inline def setDmx_speed(value: Double): Self = StObject.set(x, "dmx_speed", value.asInstanceOf[js.Any])
    
    inline def setDmx_speedUndefined: Self = StObject.set(x, "dmx_speed", js.undefined)
    
    inline def setPort(value: A | B): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
