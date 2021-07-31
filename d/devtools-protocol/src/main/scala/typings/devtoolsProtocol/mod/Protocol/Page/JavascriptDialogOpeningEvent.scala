package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JavascriptDialogOpeningEvent extends StObject {
  
  /**
    * Default dialog prompt.
    */
  var defaultPrompt: js.UndefOr[String] = js.undefined
  
  /**
    * True iff browser is capable showing or acting on the given dialog. When browser has no
    * dialog handler for given target, calling alert while Page domain is engaged will stall
    * the page execution. Execution can be resumed via calling Page.handleJavaScriptDialog.
    */
  var hasBrowserHandler: Boolean
  
  /**
    * Message that will be displayed by the dialog.
    */
  var message: String
  
  /**
    * Dialog type.
    */
  var `type`: DialogType
  
  /**
    * Frame url.
    */
  var url: String
}
object JavascriptDialogOpeningEvent {
  
  @scala.inline
  def apply(hasBrowserHandler: Boolean, message: String, `type`: DialogType, url: String): JavascriptDialogOpeningEvent = {
    val __obj = js.Dynamic.literal(hasBrowserHandler = hasBrowserHandler.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JavascriptDialogOpeningEvent]
  }
  
  @scala.inline
  implicit class JavascriptDialogOpeningEventMutableBuilder[Self <: JavascriptDialogOpeningEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultPrompt(value: String): Self = StObject.set(x, "defaultPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPromptUndefined: Self = StObject.set(x, "defaultPrompt", js.undefined)
    
    @scala.inline
    def setHasBrowserHandler(value: Boolean): Self = StObject.set(x, "hasBrowserHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: DialogType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
