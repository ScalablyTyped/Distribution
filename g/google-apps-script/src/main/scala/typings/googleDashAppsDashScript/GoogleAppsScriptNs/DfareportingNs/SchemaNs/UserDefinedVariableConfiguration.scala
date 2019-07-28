package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDefinedVariableConfiguration extends js.Object {
  var dataType: js.UndefOr[String] = js.undefined
  var reportName: js.UndefOr[String] = js.undefined
  var variableType: js.UndefOr[String] = js.undefined
}

object UserDefinedVariableConfiguration {
  @scala.inline
  def apply(dataType: String = null, reportName: String = null, variableType: String = null): UserDefinedVariableConfiguration = {
    val __obj = js.Dynamic.literal()
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (reportName != null) __obj.updateDynamic("reportName")(reportName)
    if (variableType != null) __obj.updateDynamic("variableType")(variableType)
    __obj.asInstanceOf[UserDefinedVariableConfiguration]
  }
}

