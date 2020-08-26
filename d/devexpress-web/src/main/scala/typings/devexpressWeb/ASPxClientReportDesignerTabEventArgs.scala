package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.ReportTabClosed event.
  */
@js.native
trait ASPxClientReportDesignerTabEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies the report tab currently being processed.
    */
  var Tab: ASPxDesignerNavigateTab = js.native
}

object ASPxClientReportDesignerTabEventArgs {
  @scala.inline
  def apply(Tab: ASPxDesignerNavigateTab): ASPxClientReportDesignerTabEventArgs = {
    val __obj = js.Dynamic.literal(Tab = Tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerTabEventArgs]
  }
  @scala.inline
  implicit class ASPxClientReportDesignerTabEventArgsOps[Self <: ASPxClientReportDesignerTabEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTab(value: ASPxDesignerNavigateTab): Self = this.set("Tab", value.asInstanceOf[js.Any])
  }
  
}

