package typings.googleDashAppsDashScript.GoogleAppsScript.Data_Studio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder to create a setCredentials() response for your script project.
  *
  *     function setCredentials(request) {
  *       var isValid = checkForValidCreds(request);
  *
  *       if (isValid) {
  *         // store the creds somewhere.
  *       }
  *
  *       return cc.newSetCredentialsResponse()
  *         .setIsValid(isValid)
  *         .build();
  *     }
  */
trait SetCredentialsResponse extends js.Object {
  def build(): js.Any
  def printJson(): String
  def setIsValid(isValid: Boolean): SetCredentialsResponse
}

object SetCredentialsResponse {
  @scala.inline
  def apply(build: () => js.Any, printJson: () => String, setIsValid: Boolean => SetCredentialsResponse): SetCredentialsResponse = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), printJson = js.Any.fromFunction0(printJson), setIsValid = js.Any.fromFunction1(setIsValid))
  
    __obj.asInstanceOf[SetCredentialsResponse]
  }
}

