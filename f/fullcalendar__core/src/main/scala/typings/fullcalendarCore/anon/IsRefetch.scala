package typings.fullcalendarCore.anon

import typings.fullcalendarCore.fullcalendarCoreStrings.FETCH_EVENT_SOURCES
import typings.fullcalendarCore.internalCommonMod.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsRefetch
  extends StObject
     with Action {
  
  var isRefetch: js.UndefOr[Boolean] = js.undefined
  
  var sourceIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var `type`: FETCH_EVENT_SOURCES
}
object IsRefetch {
  
  inline def apply(): IsRefetch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("FETCH_EVENT_SOURCES")
    __obj.asInstanceOf[IsRefetch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsRefetch] (val x: Self) extends AnyVal {
    
    inline def setIsRefetch(value: Boolean): Self = StObject.set(x, "isRefetch", value.asInstanceOf[js.Any])
    
    inline def setIsRefetchUndefined: Self = StObject.set(x, "isRefetch", js.undefined)
    
    inline def setSourceIds(value: js.Array[String]): Self = StObject.set(x, "sourceIds", value.asInstanceOf[js.Any])
    
    inline def setSourceIdsUndefined: Self = StObject.set(x, "sourceIds", js.undefined)
    
    inline def setSourceIdsVarargs(value: String*): Self = StObject.set(x, "sourceIds", js.Array(value*))
    
    inline def setType(value: FETCH_EVENT_SOURCES): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
