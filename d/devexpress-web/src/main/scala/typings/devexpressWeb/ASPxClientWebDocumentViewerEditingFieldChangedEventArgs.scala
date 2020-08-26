package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ASPxClientWebDocumentViewerEditingFieldChangedEventArgsOps[Self <: ASPxClientWebDocumentViewerEditingFieldChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setField(value: ASPxClientWebDocumentViewerEditingField): Self = this.set("Field", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewValue(value: js.Any): Self = this.set("NewValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldValue(value: js.Any): Self = this.set("OldValue", value.asInstanceOf[js.Any])
  }
  
}

