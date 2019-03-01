package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAuthTypeResponse extends js.Object {
  def build(): js.Object
  def printJson(): java.lang.String
  def setAuthType(authType: AuthType): GetAuthTypeResponse
  def setHelpUrl(helpUrl: java.lang.String): GetAuthTypeResponse
}

object GetAuthTypeResponse {
  @scala.inline
  def apply(
    build: js.Function0[js.Object],
    printJson: js.Function0[java.lang.String],
    setAuthType: js.Function1[AuthType, GetAuthTypeResponse],
    setHelpUrl: js.Function1[java.lang.String, GetAuthTypeResponse]
  ): GetAuthTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("build")(build)
    __obj.updateDynamic("printJson")(printJson)
    __obj.updateDynamic("setAuthType")(setAuthType)
    __obj.updateDynamic("setHelpUrl")(setHelpUrl)
    __obj.asInstanceOf[GetAuthTypeResponse]
  }
}

