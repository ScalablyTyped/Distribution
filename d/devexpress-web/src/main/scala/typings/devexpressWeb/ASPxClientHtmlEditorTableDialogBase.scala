package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides base client functionality for the Table dialog within the ASPxHtmlEditor.
  */
trait ASPxClientHtmlEditorTableDialogBase
  extends StObject
     with ASPxClientHtmlEditorDialogBase {
  
  /**
    * Provides access to the client object of the "Background color" color editor in the Html Editor's Table dialogs.
    */
  def GetBackgroundColorColorEdit(): ASPxClientColorEdit
}
object ASPxClientHtmlEditorTableDialogBase {
  
  inline def apply(
    GetBackgroundColorColorEdit: () => ASPxClientColorEdit,
    GetCancelButton: () => ASPxClientButton,
    GetFormLayout: () => ASPxClientFormLayout,
    GetOkButton: () => ASPxClientButton
  ): ASPxClientHtmlEditorTableDialogBase = {
    val __obj = js.Dynamic.literal(GetBackgroundColorColorEdit = js.Any.fromFunction0(GetBackgroundColorColorEdit), GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetOkButton = js.Any.fromFunction0(GetOkButton))
    __obj.asInstanceOf[ASPxClientHtmlEditorTableDialogBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientHtmlEditorTableDialogBase] (val x: Self) extends AnyVal {
    
    inline def setGetBackgroundColorColorEdit(value: () => ASPxClientColorEdit): Self = StObject.set(x, "GetBackgroundColorColorEdit", js.Any.fromFunction0(value))
  }
}
