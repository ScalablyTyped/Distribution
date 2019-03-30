package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingUnderscoreV3Underscore3Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserDefinedVariableConfiguration extends js.Object {
  var dataType: js.UndefOr[java.lang.String] = js.undefined
  var reportName: js.UndefOr[java.lang.String] = js.undefined
  var variableType: js.UndefOr[java.lang.String] = js.undefined
}

object UserDefinedVariableConfiguration {
  @scala.inline
  def apply(
    dataType: java.lang.String = null,
    reportName: java.lang.String = null,
    variableType: java.lang.String = null
  ): UserDefinedVariableConfiguration = {
    val __obj = js.Dynamic.literal()
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (reportName != null) __obj.updateDynamic("reportName")(reportName)
    if (variableType != null) __obj.updateDynamic("variableType")(variableType)
    __obj.asInstanceOf[UserDefinedVariableConfiguration]
  }
}

