package typings.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait GetAuthTypeResponse extends StObject {
  
  def build(): GetAuthTypeResponse = js.native
  
  def printJson(): String = js.native
  
  def setAuthType(authType: AuthType): GetAuthTypeResponse = js.native
  
  def setHelpUrl(helpUrl: String): GetAuthTypeResponse = js.native
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
  
  @scala.inline
  implicit class GetAuthTypeResponseMutableBuilder[Self <: GetAuthTypeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: () => GetAuthTypeResponse): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrintJson(value: () => String): Self = StObject.set(x, "printJson", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetAuthType(value: AuthType => GetAuthTypeResponse): Self = StObject.set(x, "setAuthType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHelpUrl(value: String => GetAuthTypeResponse): Self = StObject.set(x, "setHelpUrl", js.Any.fromFunction1(value))
  }
}
