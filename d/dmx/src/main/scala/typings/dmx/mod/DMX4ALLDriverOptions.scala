package typings.dmx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DMX4ALLDriverOptions extends StObject {
  
  /** @default 33 */
  var dmx_speed: js.UndefOr[Double] = js.undefined
}
object DMX4ALLDriverOptions {
  
  inline def apply(): DMX4ALLDriverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DMX4ALLDriverOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DMX4ALLDriverOptions] (val x: Self) extends AnyVal {
    
    inline def setDmx_speed(value: Double): Self = StObject.set(x, "dmx_speed", value.asInstanceOf[js.Any])
    
    inline def setDmx_speedUndefined: Self = StObject.set(x, "dmx_speed", js.undefined)
  }
}
