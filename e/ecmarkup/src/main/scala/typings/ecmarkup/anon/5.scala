package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.`multi-line`
import typings.ecmarkup.ecmarkupStrings.`single-line`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  var `type`: `single-line` | `multi-line`
}
object `5` {
  
  inline def apply(`type`: `single-line` | `multi-line`): `5` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
  
  extension [Self <: `5`](x: Self) {
    
    inline def setType(value: `single-line` | `multi-line`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
