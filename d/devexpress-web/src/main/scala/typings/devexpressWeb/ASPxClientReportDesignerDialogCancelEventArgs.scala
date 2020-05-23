package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the events related to opening and saving reports in the Web Report Designer.
  */
trait ASPxClientReportDesignerDialogCancelEventArgs extends ASPxClientReportDesignerDialogEventArgs {
  /**
    * Specifies whether or not the operation performed with a report should be canceled.
    */
  var Cancel: Boolean
}

object ASPxClientReportDesignerDialogCancelEventArgs {
  @scala.inline
  def apply(Cancel: Boolean, Report: js.Any, Url: String): ASPxClientReportDesignerDialogCancelEventArgs = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Report = Report.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerDialogCancelEventArgs]
  }
}

