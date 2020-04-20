package typings.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder to create a getAuthType() response for your script project.
  *
  *     function getAuthType() {
  *       var cc = DataStudioApp.createCommunityConnector();
  *       var authTypes = cc.AuthType;
  *
  *       return cc.newGetAuthTypeResponse()
  *         .setAuthType(authTypes.USER_PASS)
  *         .setHelpUrl("https://www.example.org/connector-auth-help")
  *         .build();
  *     }
  */
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

