package typings.googleAppsScript.GoogleAppsScript.Events

import typings.googleAppsScript.GoogleAppsScript.Base.User
import typings.googleAppsScript.GoogleAppsScript.Document.Document
import typings.googleAppsScript.GoogleAppsScript.Script.AuthMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocsOnOpen
  extends StObject
     with AppsScriptEvent {
  
  var source: Document
}
object DocsOnOpen {
  
  @scala.inline
  def apply(authMode: AuthMode, source: Document, triggerUid: String, user: User): DocsOnOpen = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocsOnOpen]
  }
  
  @scala.inline
  implicit class DocsOnOpenMutableBuilder[Self <: DocsOnOpen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: Document): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
