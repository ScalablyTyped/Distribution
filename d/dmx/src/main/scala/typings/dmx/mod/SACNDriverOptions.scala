package typings.dmx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SACNDriverOptions extends StObject {
  
  /** @default 1 */
  var universe: js.UndefOr[Double] = js.undefined
}
object SACNDriverOptions {
  
  inline def apply(): SACNDriverOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SACNDriverOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SACNDriverOptions] (val x: Self) extends AnyVal {
    
    inline def setUniverse(value: Double): Self = StObject.set(x, "universe", value.asInstanceOf[js.Any])
    
    inline def setUniverseUndefined: Self = StObject.set(x, "universe", js.undefined)
  }
}
