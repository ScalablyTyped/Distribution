package typings.googleAppsScript.GoogleAppsScript.AdminReports.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityId extends js.Object {
  var applicationName: js.UndefOr[String] = js.native
  var customerId: js.UndefOr[String] = js.native
  var time: js.UndefOr[String] = js.native
  var uniqueQualifier: js.UndefOr[String] = js.native
}

object ActivityId {
  @scala.inline
  def apply(): ActivityId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityId]
  }
  @scala.inline
  implicit class ActivityIdOps[Self <: ActivityId] (val x: Self) extends AnyVal {
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
    def setApplicationName(value: String): Self = this.set("applicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationName: Self = this.set("applicationName", js.undefined)
    @scala.inline
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
    @scala.inline
    def setUniqueQualifier(value: String): Self = this.set("uniqueQualifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniqueQualifier: Self = this.set("uniqueQualifier", js.undefined)
  }
  
}

