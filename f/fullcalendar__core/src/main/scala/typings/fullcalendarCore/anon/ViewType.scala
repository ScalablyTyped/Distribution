package typings.fullcalendarCore.anon

import typings.fullcalendarCore.fullcalendarCoreStrings.CHANGE_VIEW_TYPE
import typings.fullcalendarCore.internalCommonMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewType
  extends StObject
     with Action {
  
  var dateMarker: js.UndefOr[js.Date] = js.undefined
  
  var `type`: CHANGE_VIEW_TYPE
  
  var viewType: String
}
object ViewType {
  
  inline def apply(viewType: String): ViewType = {
    val __obj = js.Dynamic.literal(viewType = viewType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CHANGE_VIEW_TYPE")
    __obj.asInstanceOf[ViewType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewType] (val x: Self) extends AnyVal {
    
    inline def setDateMarker(value: js.Date): Self = StObject.set(x, "dateMarker", value.asInstanceOf[js.Any])
    
    inline def setDateMarkerUndefined: Self = StObject.set(x, "dateMarker", js.undefined)
    
    inline def setType(value: CHANGE_VIEW_TYPE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setViewType(value: String): Self = StObject.set(x, "viewType", value.asInstanceOf[js.Any])
  }
}
