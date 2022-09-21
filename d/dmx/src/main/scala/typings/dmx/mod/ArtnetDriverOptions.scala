package typings.dmx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtnetDriverOptions extends StObject {
  
  /** @default 1000 / 24 */
  var dmx_speed: js.UndefOr[Double] = js.undefined
  
  /** @default 6454 */
  var port: js.UndefOr[Double] = js.undefined
  
  /** @default 0 */
  var universe: js.UndefOr[Double] = js.undefined
}
object ArtnetDriverOptions {
  
  inline def apply(): ArtnetDriverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtnetDriverOptions]
  }
  
  extension [Self <: ArtnetDriverOptions](x: Self) {
    
    inline def setDmx_speed(value: Double): Self = StObject.set(x, "dmx_speed", value.asInstanceOf[js.Any])
    
    inline def setDmx_speedUndefined: Self = StObject.set(x, "dmx_speed", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setUniverse(value: Double): Self = StObject.set(x, "universe", value.asInstanceOf[js.Any])
    
    inline def setUniverseUndefined: Self = StObject.set(x, "universe", js.undefined)
  }
}
