package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides the base functionality for dialogs used to open and save reports on the client side of the Web Report Designer.
  */
trait ASPxDesignerReportDialogBase extends js.Object {
  /**
    * Provides access to buttons displayed in a dialog.
    * Value: An array of objects that specify buttons displayed in the dialog.
    */
  var buttons: js.Array[js.Object]
  /**
    * Provides access to a dialog's height.
    * Value: A knockout observable object that specifies a dialog's height.
    */
  var height: js.Any
  /**
    * Provides access to a dialog's model.
    * Value: A knockout observable object of the ASPxDesignerDialogModel type.
    */
  var model: js.Any
  /**
    * Provides access to a report tab for which a dialog appears.
    * Value: A knockout observable object of the ASPxDesignerNavigateTab type.
    */
  var tab: js.Any
  /**
    * Provides access to the name of an HTML template used by a dialog.
    * Value: A knockout observable string that specifies the name of the HTML template used by a dialog.
    */
  var template: js.Any
  /**
    * Provides access to a dialog's title.
    * Value: A string that specifies a dialog's title.
    */
  var title: java.lang.String
  /**
    * Provides access to a value that specifies a dialog's visibility state.
    * Value: true, if the dialog is visible; otherwise, false;
    */
  var visible: js.Any
  /**
    * Provides access to a dialog's width.
    * Value: A knockout observable object that specifies a dialog's width.
    */
  var width: js.Any
  /**
    * Cancels the dialog.
    */
  def cancel(): scala.Unit
  /**
    * Customizes the dialog based on the specified template and model.
    * @param template A string that specifies the name of an HTML template for the dialog.
    * @param model An object that specifies the dialog model.
    */
  def customize(template: java.lang.String, model: ASPxDesignerDialogModel): scala.Unit
  /**
    * Shows the dialog for the specified report tab.
    * @param tab A report tab for which the dialog should be shown.
    */
  def show(tab: ASPxDesignerNavigateTab): scala.Unit
}

object ASPxDesignerReportDialogBase {
  @scala.inline
  def apply(
    buttons: js.Array[js.Object],
    cancel: js.Function0[scala.Unit],
    customize: js.Function2[java.lang.String, ASPxDesignerDialogModel, scala.Unit],
    height: js.Any,
    model: js.Any,
    show: js.Function1[ASPxDesignerNavigateTab, scala.Unit],
    tab: js.Any,
    template: js.Any,
    title: java.lang.String,
    visible: js.Any,
    width: js.Any
  ): ASPxDesignerReportDialogBase = {
    val __obj = js.Dynamic.literal(buttons = buttons, cancel = cancel, customize = customize, height = height, model = model, show = show, tab = tab, template = template, title = title, visible = visible, width = width)
  
    __obj.asInstanceOf[ASPxDesignerReportDialogBase]
  }
}

