package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlGetCalendars[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
  
  var calendar_id: js.UndefOr[String] = js.native
  
  var from: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
}
object MlGetCalendars {
  
  @scala.inline
  def apply[T](): MlGetCalendars[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetCalendars[T]]
  }
  
  @scala.inline
  implicit class MlGetCalendarsMutableBuilder[Self <: MlGetCalendars[_], T] (val x: Self with MlGetCalendars[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCalendar_id(value: String): Self = StObject.set(x, "calendar_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendar_idUndefined: Self = StObject.set(x, "calendar_id", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
