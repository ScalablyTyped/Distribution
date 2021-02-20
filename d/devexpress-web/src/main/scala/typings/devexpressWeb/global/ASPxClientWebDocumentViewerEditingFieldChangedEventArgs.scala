package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientWebDocumentViewer.EditingFieldChanged and ASPxClientReportDesigner.PreviewEditingFieldChanged events.
  */
@JSGlobal("ASPxClientWebDocumentViewerEditingFieldChangedEventArgs")
@js.native
class ASPxClientWebDocumentViewerEditingFieldChangedEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientWebDocumentViewerEditingFieldChangedEventArgs {
  /**
    * Creates a new instance of the ASPxClientWebDocumentViewerEditingFieldChangedEventArgs class with the specified settings.
    * @param field An editing field whose value has been changed. This value is assigned to the ASPxClientWebDocumentViewerEditingFieldChangedEventArgs.Field property.
    * @param oldValue An object that specifies an editing field's previous value. This value is assigned to the ASPxClientWebDocumentViewerEditingFieldChangedEventArgs.OldValue property.
    * @param newValue An object that specifies an editing field's new value. This value is assigned to the ASPxClientWebDocumentViewerEditingFieldChangedEventArgs.NewValue property.
    */
  def this(
    field: typings.devexpressWeb.ASPxClientWebDocumentViewerEditingField,
    oldValue: js.Any,
    newValue: js.Any
  ) = this()
}
