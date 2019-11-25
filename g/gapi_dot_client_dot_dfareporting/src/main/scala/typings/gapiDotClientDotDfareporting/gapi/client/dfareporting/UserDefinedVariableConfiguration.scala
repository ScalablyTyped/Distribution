package typings.gapiDotClientDotDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDefinedVariableConfiguration extends js.Object {
  /** Data type for the variable. This is a required field. */
  var dataType: js.UndefOr[String] = js.undefined
  /**
    * User-friendly name for the variable which will appear in reports. This is a required field, must be less than 64 characters long, and cannot contain
    * the following characters: ""<>".
    */
  var reportName: js.UndefOr[String] = js.undefined
  /** Variable name in the tag. This is a required field. */
  var variableType: js.UndefOr[String] = js.undefined
}

object UserDefinedVariableConfiguration {
  @scala.inline
  def apply(dataType: String = null, reportName: String = null, variableType: String = null): UserDefinedVariableConfiguration = {
    val __obj = js.Dynamic.literal()
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (reportName != null) __obj.updateDynamic("reportName")(reportName.asInstanceOf[js.Any])
    if (variableType != null) __obj.updateDynamic("variableType")(variableType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDefinedVariableConfiguration]
  }
}

