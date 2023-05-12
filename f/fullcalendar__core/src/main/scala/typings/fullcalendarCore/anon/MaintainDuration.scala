package typings.fullcalendarCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaintainDuration extends StObject {
  
  var maintainDuration: js.UndefOr[Boolean] = js.undefined
}
object MaintainDuration {
  
  inline def apply(): MaintainDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintainDuration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaintainDuration] (val x: Self) extends AnyVal {
    
    inline def setMaintainDuration(value: Boolean): Self = StObject.set(x, "maintainDuration", value.asInstanceOf[js.Any])
    
    inline def setMaintainDurationUndefined: Self = StObject.set(x, "maintainDuration", js.undefined)
  }
}
