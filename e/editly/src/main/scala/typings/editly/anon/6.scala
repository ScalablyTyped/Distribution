package typings.editly.anon

import typings.editly.editlyStrings.`rainbow-colors`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var `type`: `rainbow-colors`
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("rainbow-colors")
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setType(value: `rainbow-colors`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
