package typings.googleAppsScript.GoogleAppsScript.Events

import typings.googleAppsScript.GoogleAppsScript.Base.User
import typings.googleAppsScript.GoogleAppsScript.Forms.Form
import typings.googleAppsScript.GoogleAppsScript.Forms.FormResponse
import typings.googleAppsScript.GoogleAppsScript.Script.AuthMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormsOnFormSubmit
  extends StObject
     with AppsScriptEvent {
  
  var response: FormResponse
  
  var source: Form
}
object FormsOnFormSubmit {
  
  @scala.inline
  def apply(authMode: AuthMode, response: FormResponse, source: Form, triggerUid: String, user: User): FormsOnFormSubmit = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormsOnFormSubmit]
  }
  
  @scala.inline
  implicit class FormsOnFormSubmitMutableBuilder[Self <: FormsOnFormSubmit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponse(value: FormResponse): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Form): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
