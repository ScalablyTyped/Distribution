package typings.elasticElasticsearch.requestParamsMod

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
  implicit class MlGetCalendarsOps[Self <: MlGetCalendars[_], T] (val x: Self with MlGetCalendars[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setCalendar_id(value: String): Self = this.set("calendar_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendar_id: Self = this.set("calendar_id", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
