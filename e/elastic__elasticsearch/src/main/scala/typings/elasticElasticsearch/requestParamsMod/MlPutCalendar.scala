package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlPutCalendar[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
  
  var calendar_id: String = js.native
}
object MlPutCalendar {
  
  @scala.inline
  def apply[T](calendar_id: String): MlPutCalendar[T] = {
    val __obj = js.Dynamic.literal(calendar_id = calendar_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutCalendar[T]]
  }
  
  @scala.inline
  implicit class MlPutCalendarMutableBuilder[Self <: MlPutCalendar[_], T] (val x: Self with MlPutCalendar[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCalendar_id(value: String): Self = StObject.set(x, "calendar_id", value.asInstanceOf[js.Any])
  }
}
