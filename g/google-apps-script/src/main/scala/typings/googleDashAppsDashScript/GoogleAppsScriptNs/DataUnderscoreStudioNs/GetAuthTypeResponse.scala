package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DataUnderscoreStudioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAuthTypeResponse extends js.Object {
  def build(): GetAuthTypeResponse
  def printJson(): String
  def setAuthType(authType: AuthType): GetAuthTypeResponse
  def setHelpUrl(helpUrl: String): GetAuthTypeResponse
}

object GetAuthTypeResponse {
  @scala.inline
  def apply(
    build: () => GetAuthTypeResponse,
    printJson: () => String,
    setAuthType: AuthType => GetAuthTypeResponse,
    setHelpUrl: String => GetAuthTypeResponse
  ): GetAuthTypeResponse = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), printJson = js.Any.fromFunction0(printJson), setAuthType = js.Any.fromFunction1(setAuthType), setHelpUrl = js.Any.fromFunction1(setHelpUrl))
  
    __obj.asInstanceOf[GetAuthTypeResponse]
  }
}

