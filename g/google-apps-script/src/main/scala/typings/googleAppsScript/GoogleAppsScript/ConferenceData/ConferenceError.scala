package typings.googleAppsScript.GoogleAppsScript.ConferenceData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Error that occurred in a conferencing add-on. Example usage:
  *
  *     var conferenceError = ConferenceDataService.newConferenceError()
  *         .setConferenceErrorType(ConferenceErrorType.PERMANENT);
  *
  *     var state = ScriptApp.newStateToken()
  *         .withMethod('myLoginCallbackFunction');
  *         .withTimeout(3600)
  *         .createToken();
  *
  *     var authenticationUrl = 'https://script.google.com/a/google.com/d/'
  *         + ScriptApp.getScriptId()
  *         + '/usercallback?state='
  *         + state;
  *
  *     var conferenceError = ConferenceDataService.newConferenceError()
  *         .setConferenceErrorType(ConferenceErrorType.UNAUTHENTICATED)
  *         .setAuthenticationUrl(authenticationUrl);
  */
@js.native
trait ConferenceError extends js.Object {
  
  /**
    * If the error type is AUTHENTICATION, the add-on must
    * provide a URL calling back into the add-on to allow users to log in. The maximum length for
    * this field is 1800 characters.
    * https://developers.google.com/apps-script/reference/conference-data/conference-error#setAuthenticationUrl(String)
    * @param authenticationUrl The authentication URL to set.
    */
  def setAuthenticationUrl(authenticationUrl: String): ConferenceError = js.native
  
  /**
    * Sets the error type of this ConferenceError.
    * https://developers.google.com/apps-script/reference/conference-data/conference-error#setConferenceErrorType(ConferenceErrorType)
    * @param conferenceErrorType The type of error to set.
    */
  def setConferenceErrorType(conferenceErrorType: ConferenceErrorType): ConferenceError = js.native
}
object ConferenceError {
  
  @scala.inline
  def apply(
    setAuthenticationUrl: String => ConferenceError,
    setConferenceErrorType: ConferenceErrorType => ConferenceError
  ): ConferenceError = {
    val __obj = js.Dynamic.literal(setAuthenticationUrl = js.Any.fromFunction1(setAuthenticationUrl), setConferenceErrorType = js.Any.fromFunction1(setConferenceErrorType))
    __obj.asInstanceOf[ConferenceError]
  }
  
  @scala.inline
  implicit class ConferenceErrorOps[Self <: ConferenceError] (val x: Self) extends AnyVal {
    
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
    def setSetAuthenticationUrl(value: String => ConferenceError): Self = this.set("setAuthenticationUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetConferenceErrorType(value: ConferenceErrorType => ConferenceError): Self = this.set("setConferenceErrorType", js.Any.fromFunction1(value))
  }
}
