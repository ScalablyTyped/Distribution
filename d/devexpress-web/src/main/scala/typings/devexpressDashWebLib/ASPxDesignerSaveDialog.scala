package typings
package devexpressDashWebLib

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
  def notSave(): scala.Unit
  /**
    * Saves the report with the specified URL.
    * @param url A string that specifies an URL of the report to be saved.
    */
  def save(url: java.lang.String): scala.Unit
}

object ASPxDesignerSaveDialog {
  @scala.inline
  def apply(
    buttons: js.Array[js.Object],
    cancel: js.Function0[scala.Unit],
    customize: js.Function2[java.lang.String, ASPxDesignerDialogModel, scala.Unit],
    height: js.Any,
    model: js.Any,
    notSave: js.Function0[scala.Unit],
    save: js.Function1[java.lang.String, scala.Unit],
    saveReportDialog: ASPxDesignerSaveAsDialog,
    show: js.Function1[ASPxDesignerNavigateTab, scala.Unit],
    tab: js.Any,
    template: js.Any,
    title: java.lang.String,
    visible: js.Any,
    width: js.Any
  ): ASPxDesignerSaveDialog = {
    val __obj = js.Dynamic.literal(buttons = buttons, cancel = cancel, customize = customize, height = height, model = model, notSave = notSave, save = save, saveReportDialog = saveReportDialog, show = show, tab = tab, template = template, title = title, visible = visible, width = width)
  
    __obj.asInstanceOf[ASPxDesignerSaveDialog]
  }
}

