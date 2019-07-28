package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides functionality for the Save dialog on the client side of the Web Report Designer.
  */
trait ASPxDesignerSaveDialog extends ASPxDesignerReportDialogBase {
  /**
    * Provides access to the Save Report dialog that appears if a user selected to save changes in the Save dialog.
    * Value: An object that specifies the Save As dialog.
    */
  var saveReportDialog: ASPxDesignerSaveAsDialog
  /**
    * Closes the dialog without saving the current report.
    */
  def notSave(): Unit
  /**
    * Saves the report with the specified URL.
    * @param url A string that specifies an URL of the report to be saved.
    */
  def save(url: String): Unit
}

object ASPxDesignerSaveDialog {
  @scala.inline
  def apply(
    buttons: js.Array[js.Object],
    cancel: () => Unit,
    customize: (String, ASPxDesignerDialogModel) => Unit,
    height: js.Any,
    model: js.Any,
    notSave: () => Unit,
    save: String => Unit,
    saveReportDialog: ASPxDesignerSaveAsDialog,
    show: ASPxDesignerNavigateTab => Unit,
    tab: js.Any,
    template: js.Any,
    title: String,
    visible: js.Any,
    width: js.Any
  ): ASPxDesignerSaveDialog = {
    val __obj = js.Dynamic.literal(buttons = buttons, cancel = js.Any.fromFunction0(cancel), customize = js.Any.fromFunction2(customize), height = height, model = model, notSave = js.Any.fromFunction0(notSave), save = js.Any.fromFunction1(save), saveReportDialog = saveReportDialog, show = js.Any.fromFunction1(show), tab = tab, template = template, title = title, visible = visible, width = width)
  
    __obj.asInstanceOf[ASPxDesignerSaveDialog]
  }
}

