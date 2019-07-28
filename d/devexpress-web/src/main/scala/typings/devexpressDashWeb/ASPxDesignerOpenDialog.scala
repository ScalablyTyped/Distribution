package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides functionality for the Open Report dialog on the client side of the Web Report Designer.
  */
trait ASPxDesignerOpenDialog extends ASPxDesignerReportDialogBase {
  /**
    * Opens the report with the specified URL.
    * @param url A string that specifies an URL of the report to be opened.
    */
  def open(url: String): Unit
}

object ASPxDesignerOpenDialog {
  @scala.inline
  def apply(
    buttons: js.Array[js.Object],
    cancel: () => Unit,
    customize: (String, ASPxDesignerDialogModel) => Unit,
    height: js.Any,
    model: js.Any,
    open: String => Unit,
    show: ASPxDesignerNavigateTab => Unit,
    tab: js.Any,
    template: js.Any,
    title: String,
    visible: js.Any,
    width: js.Any
  ): ASPxDesignerOpenDialog = {
    val __obj = js.Dynamic.literal(buttons = buttons, cancel = js.Any.fromFunction0(cancel), customize = js.Any.fromFunction2(customize), height = height, model = model, open = js.Any.fromFunction1(open), show = js.Any.fromFunction1(show), tab = tab, template = template, title = title, visible = visible, width = width)
  
    __obj.asInstanceOf[ASPxDesignerOpenDialog]
  }
}

