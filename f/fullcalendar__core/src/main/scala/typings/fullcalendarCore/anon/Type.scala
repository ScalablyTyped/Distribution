package typings.fullcalendarCore.anon

import typings.fullcalendarCore.fullcalendarCoreStrings.NOTHING
import typings.fullcalendarCore.internalCommonMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type
  extends StObject
     with Action {
  
  var `type`: NOTHING
}
object Type {
  
  inline def apply(): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("NOTHING")
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    inline def setType(value: NOTHING): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
