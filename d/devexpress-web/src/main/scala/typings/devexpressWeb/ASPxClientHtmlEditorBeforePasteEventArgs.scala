package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientHtmlEditor.BeforePaste event.
  */
@js.native
trait ASPxClientHtmlEditorBeforePasteEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the name of the processed command.
    */
  var commandName: String = js.native
  
  /**
    * Gets or sets the HTML markup that is about to be pasted to the ASPxHtmlEditor's content.
    */
  var html: String = js.native
}
object ASPxClientHtmlEditorBeforePasteEventArgs {
  
  @scala.inline
  def apply(commandName: String, html: String): ASPxClientHtmlEditorBeforePasteEventArgs = {
    val __obj = js.Dynamic.literal(commandName = commandName.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorBeforePasteEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorBeforePasteEventArgsMutableBuilder[Self <: ASPxClientHtmlEditorBeforePasteEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
  }
}
