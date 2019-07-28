package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the PreviewEditingFieldChanged events.
  */
trait ASPxClientWebDocumentViewerEditingFieldChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets an editing field whose value has been changed.
    * Value: An object that specifies an editing field whose content has been changed.
    */
  var Field: ASPxClientWebDocumentViewerEditingField
  /**
    * Provides access to a new value of an editing field.
    * Value: An object that specifies an editing field's new value.
    */
  var NewValue: js.Object
  /**
    * Provides access to a previous value of an editing field.
    * Value: An object that specifies an editing field's previous value.
    */
  var OldValue: js.Object
}

object ASPxClientWebDocumentViewerEditingFieldChangedEventArgs {
  @scala.inline
  def apply(Field: ASPxClientWebDocumentViewerEditingField, NewValue: js.Object, OldValue: js.Object): ASPxClientWebDocumentViewerEditingFieldChangedEventArgs = {
    val __obj = js.Dynamic.literal(Field = Field, NewValue = NewValue, OldValue = OldValue)
  
    __obj.asInstanceOf[ASPxClientWebDocumentViewerEditingFieldChangedEventArgs]
  }
}

