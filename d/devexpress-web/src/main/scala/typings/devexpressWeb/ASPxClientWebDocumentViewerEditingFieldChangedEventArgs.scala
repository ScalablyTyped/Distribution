package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientWebDocumentViewer.EditingFieldChanged and ASPxClientReportDesigner.PreviewEditingFieldChanged events.
  */
@js.native
trait ASPxClientWebDocumentViewerEditingFieldChangedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets an editing field whose value has been changed.
    */
  var Field: ASPxClientWebDocumentViewerEditingField = js.native
  
  /**
    * Provides access to a new value of an editing field.
    */
  var NewValue: js.Any = js.native
  
  /**
    * Provides access to a previous value of an editing field.
    */
  var OldValue: js.Any = js.native
}
object ASPxClientWebDocumentViewerEditingFieldChangedEventArgs {
  
  @scala.inline
  def apply(Field: ASPxClientWebDocumentViewerEditingField, NewValue: js.Any, OldValue: js.Any): ASPxClientWebDocumentViewerEditingFieldChangedEventArgs = {
    val __obj = js.Dynamic.literal(Field = Field.asInstanceOf[js.Any], NewValue = NewValue.asInstanceOf[js.Any], OldValue = OldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebDocumentViewerEditingFieldChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientWebDocumentViewerEditingFieldChangedEventArgsMutableBuilder[Self <: ASPxClientWebDocumentViewerEditingFieldChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: ASPxClientWebDocumentViewerEditingField): Self = StObject.set(x, "Field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValue(value: js.Any): Self = StObject.set(x, "NewValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValue(value: js.Any): Self = StObject.set(x, "OldValue", value.asInstanceOf[js.Any])
  }
}
