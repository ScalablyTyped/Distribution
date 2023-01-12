package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDeleteCalendarRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var calendar_id: Id
}
object MlDeleteCalendarRequest {
  
  inline def apply(calendar_id: Id): MlDeleteCalendarRequest = {
    val __obj = js.Dynamic.literal(calendar_id = calendar_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDeleteCalendarRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlDeleteCalendarRequest] (val x: Self) extends AnyVal {
    
    inline def setCalendar_id(value: Id): Self = StObject.set(x, "calendar_id", value.asInstanceOf[js.Any])
  }
}
