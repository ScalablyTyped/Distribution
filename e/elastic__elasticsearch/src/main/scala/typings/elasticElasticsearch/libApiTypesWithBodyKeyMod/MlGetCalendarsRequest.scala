package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetCalendarsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Page] = js.undefined
  
  var calendar_id: js.UndefOr[Id] = js.undefined
  
  var from: js.UndefOr[integer] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
}
object MlGetCalendarsRequest {
  
  inline def apply(): MlGetCalendarsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetCalendarsRequest]
  }
  
  extension [Self <: MlGetCalendarsRequest](x: Self) {
    
    inline def setBody(value: Page): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCalendar_id(value: Id): Self = StObject.set(x, "calendar_id", value.asInstanceOf[js.Any])
    
    inline def setCalendar_idUndefined: Self = StObject.set(x, "calendar_id", js.undefined)
    
    inline def setFrom(value: integer): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
