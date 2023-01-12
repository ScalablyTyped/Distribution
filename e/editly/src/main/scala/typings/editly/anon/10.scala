package typings.editly.anon

import typings.editly.editlyStrings.`linear-gradient`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  var `type`: `linear-gradient`
}
object `10` {
  
  inline def apply(): `10` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("linear-gradient")
    __obj.asInstanceOf[`10`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `10`] (val x: Self) extends AnyVal {
    
    inline def setType(value: `linear-gradient`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
