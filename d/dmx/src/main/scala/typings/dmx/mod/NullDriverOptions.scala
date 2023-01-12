package typings.dmx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullDriverOptions extends StObject {
  
  /** @default 1 */
  var dmx_speed: js.UndefOr[Double] = js.undefined
}
object NullDriverOptions {
  
  inline def apply(): NullDriverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NullDriverOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NullDriverOptions] (val x: Self) extends AnyVal {
    
    inline def setDmx_speed(value: Double): Self = StObject.set(x, "dmx_speed", value.asInstanceOf[js.Any])
    
    inline def setDmx_speedUndefined: Self = StObject.set(x, "dmx_speed", js.undefined)
  }
}
