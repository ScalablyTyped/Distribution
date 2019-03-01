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
    cancel: js.Function0[scala.Unit],
    customize: js.Function2[java.lang.String, ASPxDesignerDialogModel, scala.Unit],
    height: js.Any,
    model: js.Any,
    save: js.Function1[java.lang.String, scala.Unit],
    show: js.Function1[ASPxDesignerNavigateTab, scala.Unit],
    tab: js.Any,
    template: js.Any,
    title: java.lang.String,
    visible: js.Any,
    width: js.Any
  ): ASPxDesignerSaveAsDialog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buttons")(buttons)
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("customize")(customize)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("model")(model)
    __obj.updateDynamic("save")(save)
    __obj.updateDynamic("show")(show)
    __obj.updateDynamic("tab")(tab)
    __obj.updateDynamic("template")(template)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("visible")(visible)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ASPxDesignerSaveAsDialog]
  }
}

