package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPostCalendarEvents[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var calendar_id: String
}
object MlPostCalendarEvents {
  
  @scala.inline
  def apply[T](body: T, calendar_id: String): MlPostCalendarEvents[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], calendar_id = calendar_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPostCalendarEvents[T]]
  }
  
  @scala.inline
  implicit class MlPostCalendarEventsMutableBuilder[Self <: MlPostCalendarEvents[?], T] (val x: Self & MlPostCalendarEvents[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendar_id(value: String): Self = StObject.set(x, "calendar_id", value.asInstanceOf[js.Any])
  }
}
