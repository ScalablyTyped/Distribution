package typings.fullcalendarCore.anon

import typings.fullcalendarCore.fullcalendarCoreStrings.UNSELECT_DATES
import typings.fullcalendarCore.internalCommonMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2`
  extends StObject
     with Action {
  
  var `type`: UNSELECT_DATES
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UNSELECT_DATES")
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def setType(value: UNSELECT_DATES): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
