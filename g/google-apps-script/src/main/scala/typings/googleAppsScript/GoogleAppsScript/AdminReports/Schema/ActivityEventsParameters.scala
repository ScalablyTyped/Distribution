package typings.googleAppsScript.GoogleAppsScript.AdminReports.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityEventsParameters extends js.Object {
  var boolValue: js.UndefOr[Boolean] = js.native
  var intValue: js.UndefOr[String] = js.native
  var multiIntValue: js.UndefOr[js.Array[String]] = js.native
  var multiValue: js.UndefOr[js.Array[String]] = js.native
  var name: js.UndefOr[String] = js.native
  var value: js.UndefOr[String] = js.native
}

object ActivityEventsParameters {
  @scala.inline
  def apply(): ActivityEventsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityEventsParameters]
  }
  @scala.inline
  implicit class ActivityEventsParametersOps[Self <: ActivityEventsParameters] (val x: Self) extends AnyVal {
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
    def setBoolValue(value: Boolean): Self = this.set("boolValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoolValue: Self = this.set("boolValue", js.undefined)
    @scala.inline
    def setIntValue(value: String): Self = this.set("intValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntValue: Self = this.set("intValue", js.undefined)
    @scala.inline
    def setMultiIntValueVarargs(value: String*): Self = this.set("multiIntValue", js.Array(value :_*))
    @scala.inline
    def setMultiIntValue(value: js.Array[String]): Self = this.set("multiIntValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiIntValue: Self = this.set("multiIntValue", js.undefined)
    @scala.inline
    def setMultiValueVarargs(value: String*): Self = this.set("multiValue", js.Array(value :_*))
    @scala.inline
    def setMultiValue(value: js.Array[String]): Self = this.set("multiValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiValue: Self = this.set("multiValue", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

