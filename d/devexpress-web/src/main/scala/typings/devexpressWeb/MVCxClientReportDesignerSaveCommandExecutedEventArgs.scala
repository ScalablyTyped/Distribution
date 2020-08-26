package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the MVCxClientReportDesigner.SaveCommandExecuted event.
  */
@js.native
trait MVCxClientReportDesignerSaveCommandExecutedEventArgs extends ASPxClientEventArgs {
  /**
    * Returns the operation result.
    */
  var Result: String = js.native
}

object MVCxClientReportDesignerSaveCommandExecutedEventArgs {
  @scala.inline
  def apply(Result: String): MVCxClientReportDesignerSaveCommandExecutedEventArgs = {
    val __obj = js.Dynamic.literal(Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientReportDesignerSaveCommandExecutedEventArgs]
  }
  @scala.inline
  implicit class MVCxClientReportDesignerSaveCommandExecutedEventArgsOps[Self <: MVCxClientReportDesignerSaveCommandExecutedEventArgs] (val x: Self) extends AnyVal {
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
    def setResult(value: String): Self = this.set("Result", value.asInstanceOf[js.Any])
  }
  
}

