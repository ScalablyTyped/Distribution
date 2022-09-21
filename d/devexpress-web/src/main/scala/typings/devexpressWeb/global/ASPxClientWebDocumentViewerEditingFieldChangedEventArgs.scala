package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientWebDocumentViewer.EditingFieldChanged and ASPxClientReportDesigner.PreviewEditingFieldChanged events.
  */
@JSGlobal("ASPxClientWebDocumentViewerEditingFieldChangedEventArgs")
@js.native
open class ASPxClientWebDocumentViewerEditingFieldChangedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientWebDocumentViewerEditingFieldChangedEventArgs {
  /**
    * Creates a new instance of the ASPxClientWebDocumentViewerEditingFieldChangedEventArgs class with the specified settings.
    * @param field An editing field whose value has been changed. This value is assigned to the ASPxClientWebDocumentViewerEditingFieldChangedEventArgs.Field property.
    * @param oldValue An object that specifies an editing field's previous value. This value is assigned to the ASPxClientWebDocumentViewerEditingFieldChangedEventArgs.OldValue property.
    * @param newValue An object that specifies an editing field's new value. This value is assigned to the ASPxClientWebDocumentViewerEditingFieldChangedEventArgs.NewValue property.
    */
  def this(field: typings.devexpressWeb.ASPxClientWebDocumentViewerEditingField, oldValue: Any, newValue: Any) = this()
  
  /**
    * Gets an editing field whose value has been changed.
    */
  /* CompleteClass */
  var Field: typings.devexpressWeb.ASPxClientWebDocumentViewerEditingField = js.native
  
  /**
    * Provides access to a new value of an editing field.
    */
  /* CompleteClass */
  var NewValue: Any = js.native
  
  /**
    * Provides access to a previous value of an editing field.
    */
  /* CompleteClass */
  var OldValue: Any = js.native
}
