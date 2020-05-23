package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the events related to opening and saving reports in the Web Report Designer.
  */
trait ASPxClientReportDesignerDialogEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies the report currently being processed.
    */
  var Report: js.Any
  /**
    * Specifies the URL of the report currently being processed.
    */
  var Url: String
}

object ASPxClientReportDesignerDialogEventArgs {
  @scala.inline
  def apply(Report: js.Any, Url: String): ASPxClientReportDesignerDialogEventArgs = {
    val __obj = js.Dynamic.literal(Report = Report.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerDialogEventArgs]
  }
}

