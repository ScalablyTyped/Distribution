package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for client events that relate to custom dialog operations.
  */
@js.native
trait ASPxClientHtmlEditorCustomDialogEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the name that uniquely identifies the processed custom dialog.
    */
  var name: String = js.native
}
object ASPxClientHtmlEditorCustomDialogEventArgs {
  
  @scala.inline
  def apply(name: String): ASPxClientHtmlEditorCustomDialogEventArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCustomDialogEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorCustomDialogEventArgsMutableBuilder[Self <: ASPxClientHtmlEditorCustomDialogEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
