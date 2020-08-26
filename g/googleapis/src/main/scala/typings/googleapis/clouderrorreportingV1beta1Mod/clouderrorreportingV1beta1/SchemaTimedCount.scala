package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The number of errors in a given time period. All numbers are approximate
  * since the error events are sampled before counting them.
  */
@js.native
trait SchemaTimedCount extends js.Object {
  /**
    * Approximate number of occurrences in the given time period.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * End of the time period to which `count` refers (excluded).
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Start of the time period to which `count` refers (included).
    */
  var startTime: js.UndefOr[String] = js.native
}

object SchemaTimedCount {
  @scala.inline
  def apply(): SchemaTimedCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimedCount]
  }
  @scala.inline
  implicit class SchemaTimedCountOps[Self <: SchemaTimedCount] (val x: Self) extends AnyVal {
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
    def setCount(value: String): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
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

