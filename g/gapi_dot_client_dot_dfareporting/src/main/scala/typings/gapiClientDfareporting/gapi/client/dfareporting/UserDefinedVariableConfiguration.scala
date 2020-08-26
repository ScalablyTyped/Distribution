package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserDefinedVariableConfiguration extends js.Object {
  /** Data type for the variable. This is a required field. */
  var dataType: js.UndefOr[String] = js.native
  /**
    * User-friendly name for the variable which will appear in reports. This is a required field, must be less than 64 characters long, and cannot contain
    * the following characters: ""<>".
    */
  var reportName: js.UndefOr[String] = js.native
  /** Variable name in the tag. This is a required field. */
  var variableType: js.UndefOr[String] = js.native
}

object UserDefinedVariableConfiguration {
  @scala.inline
  def apply(): UserDefinedVariableConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserDefinedVariableConfiguration]
  }
  @scala.inline
  implicit class UserDefinedVariableConfigurationOps[Self <: UserDefinedVariableConfiguration] (val x: Self) extends AnyVal {
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
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    @scala.inline
    def setReportName(value: String): Self = this.set("reportName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportName: Self = this.set("reportName", js.undefined)
    @scala.inline
    def setVariableType(value: String): Self = this.set("variableType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariableType: Self = this.set("variableType", js.undefined)
  }
  
}

