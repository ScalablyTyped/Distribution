package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetCalendarsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var calendar_id: js.UndefOr[Id] = js.undefined
  
  var from: js.UndefOr[integer] = js.undefined
  
  var page: js.UndefOr[MlPage] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
}
object MlGetCalendarsRequest {
  
  inline def apply(): MlGetCalendarsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetCalendarsRequest]
  }
  
  extension [Self <: MlGetCalendarsRequest](x: Self) {
    
    inline def setCalendar_id(value: Id): Self = StObject.set(x, "calendar_id", value.asInstanceOf[js.Any])
    
    inline def setCalendar_idUndefined: Self = StObject.set(x, "calendar_id", js.undefined)
    
    inline def setFrom(value: integer): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setPage(value: MlPage): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
