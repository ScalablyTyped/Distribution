package typings.fullcalendarCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  var forcedTzo: js.UndefOr[Double] = js.undefined
}
object `8` {
  
  inline def apply(): `8` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`8`]
  }
  
  extension [Self <: `8`](x: Self) {
    
    inline def setForcedTzo(value: Double): Self = StObject.set(x, "forcedTzo", value.asInstanceOf[js.Any])
    
    inline def setForcedTzoUndefined: Self = StObject.set(x, "forcedTzo", js.undefined)
  }
}
