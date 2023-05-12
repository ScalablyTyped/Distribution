package typings.fullcalendarCore.anon

import typings.fullcalendarCore.fullcalendarCoreStrings.PREV
import typings.fullcalendarCore.internalCommonMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: how to link this to CalendarOptions?
trait `0`
  extends StObject
     with Action {
  
  var `type`: PREV
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("PREV")
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setType(value: PREV): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
