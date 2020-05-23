package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientWebDocumentViewer.EditingFieldChanged and ASPxClientReportDesigner.PreviewEditingFieldChanged events.
  */
trait ASPxClientWebDocumentViewerEditingFieldChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets an editing field whose value has been changed.
    */
  var Field: ASPxClientWebDocumentViewerEditingField
  /**
    * Provides access to a new value of an editing field.
    */
  var NewValue: js.Any
  /**
    * Provides access to a previous value of an editing field.
    */
  var OldValue: js.Any
}

object ASPxClientWebDocumentViewerEditingFieldChangedEventArgs {
  @scala.inline
  def apply(Field: ASPxClientWebDocumentViewerEditingField, NewValue: js.Any, OldValue: js.Any): ASPxClientWebDocumentViewerEditingFieldChangedEventArgs = {
    val __obj = js.Dynamic.literal(Field = Field.asInstanceOf[js.Any], NewValue = NewValue.asInstanceOf[js.Any], OldValue = OldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebDocumentViewerEditingFieldChangedEventArgs]
  }
}

