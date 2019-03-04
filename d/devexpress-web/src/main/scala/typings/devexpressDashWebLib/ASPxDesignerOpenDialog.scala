package typings
package devexpressDashWebLib

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
  def open(url: java.lang.String): scala.Unit
}

object ASPxDesignerOpenDialog {
  @scala.inline
  def apply(
    buttons: js.Array[js.Object],
    cancel: js.Function0[scala.Unit],
    customize: js.Function2[java.lang.String, ASPxDesignerDialogModel, scala.Unit],
    height: js.Any,
    model: js.Any,
    open: js.Function1[java.lang.String, scala.Unit],
    show: js.Function1[ASPxDesignerNavigateTab, scala.Unit],
    tab: js.Any,
    template: js.Any,
    title: java.lang.String,
    visible: js.Any,
    width: js.Any
  ): ASPxDesignerOpenDialog = {
    val __obj = js.Dynamic.literal(buttons = buttons, cancel = cancel, customize = customize, height = height, model = model, open = open, show = show, tab = tab, template = template, title = title, visible = visible, width = width)
  
    __obj.asInstanceOf[ASPxDesignerOpenDialog]
  }
}

