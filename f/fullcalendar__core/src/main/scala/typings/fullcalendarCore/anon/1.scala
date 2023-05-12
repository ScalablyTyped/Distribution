package typings.fullcalendarCore.anon

import typings.fullcalendarCore.fullcalendarCoreStrings.NEXT
import typings.fullcalendarCore.internalCommonMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`
  extends StObject
     with Action {
  
  var `type`: NEXT
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NEXT")
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
    
    inline def setType(value: NEXT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
