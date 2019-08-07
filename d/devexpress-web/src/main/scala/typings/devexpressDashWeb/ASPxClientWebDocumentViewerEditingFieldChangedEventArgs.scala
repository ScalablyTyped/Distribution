package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientWebDocumentViewer.EditingFieldChanged and ASPxClientReportDesigner.PreviewEditingFieldChanged events.
  */
@JSGlobal("ASPxClientWebDocumentViewerEditingFieldChangedEventArgs")
@js.native
class ASPxClientWebDocumentViewerEditingFieldChangedEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Creates a new instance of the ASPxClientWebDocumentViewerEditingFieldChangedEventArgs class with the specified settings.
    * @param field An editing field whose value has been changed. This value is assigned to the ASPxClientWebDocumentViewerEditingFieldChangedEventArgs.Field property.
    * @param oldValue An object that specifies an editing field's previous value. This value is assigned to the ASPxClientWebDocumentViewerEditingFieldChangedEventArgs.OldValue property.
    * @param newValue An object that specifies an editing field's new value. This value is assigned to the ASPxClientWebDocumentViewerEditingFieldChangedEventArgs.NewValue property.
    */
  def this(field: ASPxClientWebDocumentViewerEditingField, oldValue: js.Any, newValue: js.Any) = this()
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

