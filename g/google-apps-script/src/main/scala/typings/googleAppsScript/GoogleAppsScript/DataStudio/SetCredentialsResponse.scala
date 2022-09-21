package typings.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait SetCredentialsResponse extends StObject {
  
  def build(): Any
  
  def printJson(): String
  
  def setIsValid(isValid: Boolean): SetCredentialsResponse
}
object SetCredentialsResponse {
  
  inline def apply(build: () => Any, printJson: () => String, setIsValid: Boolean => SetCredentialsResponse): SetCredentialsResponse = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), printJson = js.Any.fromFunction0(printJson), setIsValid = js.Any.fromFunction1(setIsValid))
    __obj.asInstanceOf[SetCredentialsResponse]
  }
  
  extension [Self <: SetCredentialsResponse](x: Self) {
    
    inline def setBuild(value: () => Any): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setPrintJson(value: () => String): Self = StObject.set(x, "printJson", js.Any.fromFunction0(value))
    
    inline def setSetIsValid(value: Boolean => SetCredentialsResponse): Self = StObject.set(x, "setIsValid", js.Any.fromFunction1(value))
  }
}
