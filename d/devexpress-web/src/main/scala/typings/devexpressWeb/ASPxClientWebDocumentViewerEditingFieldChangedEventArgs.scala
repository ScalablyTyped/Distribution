package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientWebDocumentViewer.EditingFieldChanged and ASPxClientReportDesigner.PreviewEditingFieldChanged events.
  */
trait ASPxClientWebDocumentViewerEditingFieldChangedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets an editing field whose value has been changed.
    */
  var Field: ASPxClientWebDocumentViewerEditingField
  
  /**
    * Provides access to a new value of an editing field.
    */
  var NewValue: Any
  
  /**
    * Provides access to a previous value of an editing field.
    */
  var OldValue: Any
}
object ASPxClientWebDocumentViewerEditingFieldChangedEventArgs {
  
  inline def apply(Field: ASPxClientWebDocumentViewerEditingField, NewValue: Any, OldValue: Any): ASPxClientWebDocumentViewerEditingFieldChangedEventArgs = {
    val __obj = js.Dynamic.literal(Field = Field.asInstanceOf[js.Any], NewValue = NewValue.asInstanceOf[js.Any], OldValue = OldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebDocumentViewerEditingFieldChangedEventArgs]
  }
  
  extension [Self <: ASPxClientWebDocumentViewerEditingFieldChangedEventArgs](x: Self) {
    
    inline def setField(value: ASPxClientWebDocumentViewerEditingField): Self = StObject.set(x, "Field", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: Any): Self = StObject.set(x, "NewValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: Any): Self = StObject.set(x, "OldValue", value.asInstanceOf[js.Any])
  }
}
