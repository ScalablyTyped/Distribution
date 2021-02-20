package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlDeleteCalendar extends Generic {
  
  var calendar_id: String = js.native
}
object MlDeleteCalendar {
  
  @scala.inline
  def apply(calendar_id: String): MlDeleteCalendar = {
    val __obj = js.Dynamic.literal(calendar_id = calendar_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDeleteCalendar]
  }
  
  @scala.inline
  implicit class MlDeleteCalendarMutableBuilder[Self <: MlDeleteCalendar] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendar_id(value: String): Self = StObject.set(x, "calendar_id", value.asInstanceOf[js.Any])
  }
}
