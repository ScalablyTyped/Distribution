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
    build: () => js.Object,
    printJson: () => java.lang.String,
    setAuthType: AuthType => GetAuthTypeResponse,
    setHelpUrl: java.lang.String => GetAuthTypeResponse
  ): GetAuthTypeResponse = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), printJson = js.Any.fromFunction0(printJson), setAuthType = js.Any.fromFunction1(setAuthType), setHelpUrl = js.Any.fromFunction1(setHelpUrl))
  
    __obj.asInstanceOf[GetAuthTypeResponse]
  }
}

