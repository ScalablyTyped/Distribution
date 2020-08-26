package typings.googleAppsScript.GoogleAppsScript.Calendar.Schema

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConferenceParametersAddOnParameters extends js.Object {
  var parameters: js.UndefOr[Record[String, String]] = js.native
}

object ConferenceParametersAddOnParameters {
  @scala.inline
  def apply(): ConferenceParametersAddOnParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceParametersAddOnParameters]
  }
  @scala.inline
  implicit class ConferenceParametersAddOnParametersOps[Self <: ConferenceParametersAddOnParameters] (val x: Self) extends AnyVal {
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
    def setParameters(value: Record[String, String]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
  
}

