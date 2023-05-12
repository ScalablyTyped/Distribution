package typings.fullcalendarCore.anon

import typings.fullcalendarCore.fullcalendarCoreStrings.UNSELECT_EVENT
import typings.fullcalendarCore.internalCommonMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3`
  extends StObject
     with Action {
  
  var `type`: UNSELECT_EVENT
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UNSELECT_EVENT")
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `3`] (val x: Self) extends AnyVal {
    
    inline def setType(value: UNSELECT_EVENT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
