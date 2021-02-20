package typings.googleAppsScript.GoogleAppsScript.Script

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows scripts to create state tokens that can be used in callback APIs (like OAuth flows).
  *
  *     // Reusable function to generate a callback URL, assuming the script has been published as a
  *     // web app (necessary to obtain the URL programmatically). If the script has not been published
  *     // as a web app, set `var url` in the first line to the URL of your script project (which
  *     // cannot be obtained programmatically).
  *     function getCallbackURL(callbackFunction){
  *       var url = ScriptApp.getService().getUrl();      // Ends in /exec (for a web app)
  *       url = url.slice(0, -4) + 'usercallback?state='; // Change /exec to /usercallback
  *       var stateToken = ScriptApp.newStateToken()
  *           .withMethod(callbackFunction)
  *           .withTimeout(120)
  *           .createToken();
  *       return url + stateToken;
  *     }
  */
@js.native
trait StateTokenBuilder extends StObject {
  
  def createToken(): String = js.native
  
  def withArgument(name: String, value: String): StateTokenBuilder = js.native
  
  def withMethod(method: String): StateTokenBuilder = js.native
  
  def withTimeout(seconds: Integer): StateTokenBuilder = js.native
}
object StateTokenBuilder {
  
  @scala.inline
  def apply(
    createToken: () => String,
    withArgument: (String, String) => StateTokenBuilder,
    withMethod: String => StateTokenBuilder,
    withTimeout: Integer => StateTokenBuilder
  ): StateTokenBuilder = {
    val __obj = js.Dynamic.literal(createToken = js.Any.fromFunction0(createToken), withArgument = js.Any.fromFunction2(withArgument), withMethod = js.Any.fromFunction1(withMethod), withTimeout = js.Any.fromFunction1(withTimeout))
    __obj.asInstanceOf[StateTokenBuilder]
  }
  
  @scala.inline
  implicit class StateTokenBuilderMutableBuilder[Self <: StateTokenBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateToken(value: () => String): Self = StObject.set(x, "createToken", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWithArgument(value: (String, String) => StateTokenBuilder): Self = StObject.set(x, "withArgument", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWithMethod(value: String => StateTokenBuilder): Self = StObject.set(x, "withMethod", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithTimeout(value: Integer => StateTokenBuilder): Self = StObject.set(x, "withTimeout", js.Any.fromFunction1(value))
  }
}
