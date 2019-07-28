package typings.devexpressDashWeb

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
  var Cancel: Boolean
}

object ASPxClientReportDesignerDialogCancelEventArgs {
  @scala.inline
  def apply(Cancel: Boolean, Report: js.Object, Url: String): ASPxClientReportDesignerDialogCancelEventArgs = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, Report = Report, Url = Url)
  
    __obj.asInstanceOf[ASPxClientReportDesignerDialogCancelEventArgs]
  }
}

