package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a time of day. The date and time zone are either not significant
  * or are specified elsewhere. An API may choose to allow leap seconds.
  * Related types are google.type.Date and `google.protobuf.Timestamp`.
  */
@js.native
trait SchemaTimeOfDay extends js.Object {
  
  /**
    * Hours of day in 24 hour format. Should be from 0 to 23. An API may choose
    * to allow the value &quot;24:00:00&quot; for scenarios like business
    * closing time.
    */
  var hours: js.UndefOr[Double] = js.native
  
  /**
    * Minutes of hour of day. Must be from 0 to 59.
    */
  var minutes: js.UndefOr[Double] = js.native
  
  /**
    * Fractions of seconds in nanoseconds. Must be from 0 to 999,999,999.
    */
  var nanos: js.UndefOr[Double] = js.native
  
  /**
    * Seconds of minutes of the time. Must normally be from 0 to 59. An API may
    * allow the value 60 if it allows leap-seconds.
    */
  var seconds: js.UndefOr[Double] = js.native
}
object SchemaTimeOfDay {
  
  @scala.inline
  def apply(): SchemaTimeOfDay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeOfDay]
  }
  
  @scala.inline
  implicit class SchemaTimeOfDayOps[Self <: SchemaTimeOfDay] (val x: Self) extends AnyVal {
    
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
    def setHours(value: Double): Self = this.set("hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHours: Self = this.set("hours", js.undefined)
    
    @scala.inline
    def setMinutes(value: Double): Self = this.set("minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinutes: Self = this.set("minutes", js.undefined)
    
    @scala.inline
    def setNanos(value: Double): Self = this.set("nanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNanos: Self = this.set("nanos", js.undefined)
    
    @scala.inline
    def setSeconds(value: Double): Self = this.set("seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeconds: Self = this.set("seconds", js.undefined)
  }
}
