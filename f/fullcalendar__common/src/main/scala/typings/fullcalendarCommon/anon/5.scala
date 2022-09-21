package typings.fullcalendarCommon.anon

import typings.fullcalendarCommon.fullcalendarCommonStrings.UNSET_EVENT_RESIZE
import typings.fullcalendarCommon.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5`
  extends StObject
     with Action {
  
  var `type`: UNSET_EVENT_RESIZE
}
object `5` {
  
  inline def apply(): `5` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UNSET_EVENT_RESIZE")
    __obj.asInstanceOf[`5`]
  }
  
  extension [Self <: `5`](x: Self) {
    
    inline def setType(value: UNSET_EVENT_RESIZE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
