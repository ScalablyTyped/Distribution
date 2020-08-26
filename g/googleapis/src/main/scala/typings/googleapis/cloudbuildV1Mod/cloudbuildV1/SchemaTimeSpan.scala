package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Start and end times for a build execution phase.
  */
@js.native
trait SchemaTimeSpan extends js.Object {
  /**
    * End of time span.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Start of time span.
    */
  var startTime: js.UndefOr[String] = js.native
}

object SchemaTimeSpan {
  @scala.inline
  def apply(): SchemaTimeSpan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeSpan]
  }
  @scala.inline
  implicit class SchemaTimeSpanOps[Self <: SchemaTimeSpan] (val x: Self) extends AnyVal {
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
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
  
}

