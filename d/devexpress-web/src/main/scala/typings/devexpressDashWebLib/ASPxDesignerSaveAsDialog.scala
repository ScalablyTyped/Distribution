package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides functionality for the Save Report dialog on the client side of the Web Report Designer.
  */
trait ASPxDesignerSaveAsDialog extends ASPxDesignerReportDialogBase {
  /**
    * Saves the report with the specified URL.
    * @param url A string that specifies a URL of the report to be saved.
    */
  def save(url: java.lang.String): scala.Unit
}

object ASPxDesignerSaveAsDialog {
  @scala.inline
  def apply(
    buttons: js.Array[js.Object],
    cancel: () => scala.Unit,
    customize: (java.lang.String, ASPxDesignerDialogModel) => scala.Unit,
    height: js.Any,
    model: js.Any,
    save: java.lang.String => scala.Unit,
    show: ASPxDesignerNavigateTab => scala.Unit,
    tab: js.Any,
    template: js.Any,
    title: java.lang.String,
    visible: js.Any,
    width: js.Any
  ): ASPxDesignerSaveAsDialog = {
    val __obj = js.Dynamic.literal(buttons = buttons, cancel = js.Any.fromFunction0(cancel), customize = js.Any.fromFunction2(customize), height = height, model = model, save = js.Any.fromFunction1(save), show = js.Any.fromFunction1(show), tab = tab, template = template, title = title, visible = visible, width = width)
  
    __obj.asInstanceOf[ASPxDesignerSaveAsDialog]
  }
}

