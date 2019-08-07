package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for client events that relate to custom dialog operations.
  */
@JSGlobal("ASPxClientHtmlEditorCustomDialogEventArgs")
@js.native
class ASPxClientHtmlEditorCustomDialogEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorCustomDialogEventArgs class.
    * @param name A string value that specifies the custom dialog's name. Initializes the ASPxClientHtmlEditorCustomDialogEventArgs.name property.
    */
  def this(name: String) = this()
  /**
    * Gets the name that uniquely identifies the processed custom dialog.
    */
  var name: String = js.native
}

