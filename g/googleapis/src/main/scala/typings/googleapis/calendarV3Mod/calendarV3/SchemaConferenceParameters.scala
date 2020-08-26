package typings.googleapis.calendarV3Mod.calendarV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaConferenceParameters extends js.Object {
  /**
    * Additional add-on specific data.
    */
  var addOnParameters: js.UndefOr[SchemaConferenceParametersAddOnParameters] = js.native
}

object SchemaConferenceParameters {
  @scala.inline
  def apply(): SchemaConferenceParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConferenceParameters]
  }
  @scala.inline
  implicit class SchemaConferenceParametersOps[Self <: SchemaConferenceParameters] (val x: Self) extends AnyVal {
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
    def setAddOnParameters(value: SchemaConferenceParametersAddOnParameters): Self = this.set("addOnParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddOnParameters: Self = this.set("addOnParameters", js.undefined)
  }
  
}

