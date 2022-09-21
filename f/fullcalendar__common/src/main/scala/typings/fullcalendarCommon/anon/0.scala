package typings.fullcalendarCommon.anon

import typings.fullcalendarCommon.fullcalendarCommonStrings.PREV
import typings.fullcalendarCommon.mod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  extension [Self <: `0`](x: Self) {
    
    inline def setType(value: PREV): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
