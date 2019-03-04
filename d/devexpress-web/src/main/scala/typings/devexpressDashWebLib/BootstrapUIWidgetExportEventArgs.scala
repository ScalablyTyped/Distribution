package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events related to saving files in the built-in dialogs.
  */
trait BootstrapUIWidgetExportEventArgs extends BootstrapUIWidgetEventArgsBase {
  /**
    * Allows you to cancel file saving.
    * Value: true, to cancel the file saving; otherwise, false.
    */
  var cancel: scala.Boolean
  /**
    * Gets the saved data as a BLOB object.
    * Value: A <a href="https://msdn.microsoft.com/en-us/library/dd301120.aspx" target="_blank">BLOB</a> object containing saved data.
    */
  var data: js.Object
  /**
    * Gets a name of a saved file.
    * Value: A string value specifying the saved file's name.
    */
  var fileName: java.lang.String
  /**
    * Gets the saved file's format.
    * Value: A string value specifying the saved file's format.
    */
  var format: java.lang.String
}

object BootstrapUIWidgetExportEventArgs {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    component: js.Object,
    data: js.Object,
    element: js.Object,
    fileName: java.lang.String,
    format: java.lang.String
  ): BootstrapUIWidgetExportEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, component = component, data = data, element = element, fileName = fileName, format = format)
  
    __obj.asInstanceOf[BootstrapUIWidgetExportEventArgs]
  }
}

