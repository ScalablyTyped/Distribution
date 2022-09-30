package typings.editly.anon

import typings.editly.editlyStrings.`fill-color`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11` extends StObject {
  
  var `type`: `fill-color`
}
object `11` {
  
  inline def apply(): `11` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("fill-color")
    __obj.asInstanceOf[`11`]
  }
  
  extension [Self <: `11`](x: Self) {
    
    inline def setType(value: `fill-color`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
