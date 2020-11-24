package typings.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait SetCredentialsResponse extends js.Object {
  
  def build(): js.Any = js.native
  
  def printJson(): String = js.native
  
  def setIsValid(isValid: Boolean): SetCredentialsResponse = js.native
}
object SetCredentialsResponse {
  
  @scala.inline
  def apply(build: () => js.Any, printJson: () => String, setIsValid: Boolean => SetCredentialsResponse): SetCredentialsResponse = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), printJson = js.Any.fromFunction0(printJson), setIsValid = js.Any.fromFunction1(setIsValid))
    __obj.asInstanceOf[SetCredentialsResponse]
  }
  
  @scala.inline
  implicit class SetCredentialsResponseOps[Self <: SetCredentialsResponse] (val x: Self) extends AnyVal {
    
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
    def setBuild(value: () => js.Any): Self = this.set("build", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrintJson(value: () => String): Self = this.set("printJson", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetIsValid(value: Boolean => SetCredentialsResponse): Self = this.set("setIsValid", js.Any.fromFunction1(value))
  }
}
