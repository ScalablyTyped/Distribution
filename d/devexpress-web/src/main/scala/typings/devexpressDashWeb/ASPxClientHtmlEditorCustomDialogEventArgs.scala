package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events that relate to custom dialog operations.
  */
trait ASPxClientHtmlEditorCustomDialogEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name that uniquely identifies the processed custom dialog.
    * Value: A string value that represents the value assigned to the processed custom dialog's Name property.
    */
  var name: String
}

object ASPxClientHtmlEditorCustomDialogEventArgs {
  @scala.inline
  def apply(name: String): ASPxClientHtmlEditorCustomDialogEventArgs = {
    val __obj = js.Dynamic.literal(name = name)
  
    __obj.asInstanceOf[ASPxClientHtmlEditorCustomDialogEventArgs]
  }
}

