package typings.fullcalendarCore.anon

import typings.fullcalendarCore.fullcalendarCoreStrings.REMOVE_ALL_EVENTS
import typings.fullcalendarCore.internalCommonMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7`
  extends StObject
     with Action {
  
  var `type`: REMOVE_ALL_EVENTS
}
object `7` {
  
  inline def apply(): `7` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("REMOVE_ALL_EVENTS")
    __obj.asInstanceOf[`7`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `7`] (val x: Self) extends AnyVal {
    
    inline def setType(value: REMOVE_ALL_EVENTS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
