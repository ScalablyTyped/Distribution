package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the events related to opening and saving reports in the Web Report Designer.
  */
trait ASPxClientReportDesignerDialogCancelEventArgs extends ASPxClientReportDesignerDialogEventArgs {
  /**
    * Specifies whether or not the operation performed with a report should be canceled.
    * Value: true, if the operation should be canceled; otherwise, false.
    */
  var Cancel: scala.Boolean
}

object ASPxClientReportDesignerDialogCancelEventArgs {
  @scala.inline
  def apply(Cancel: scala.Boolean, Report: js.Object, Url: java.lang.String): ASPxClientReportDesignerDialogCancelEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Cancel")(Cancel)
    __obj.updateDynamic("Report")(Report)
    __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[ASPxClientReportDesignerDialogCancelEventArgs]
  }
}

