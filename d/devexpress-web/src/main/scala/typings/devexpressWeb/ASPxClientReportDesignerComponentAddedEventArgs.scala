package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.ComponentAdded event.
  */
@js.native
trait ASPxClientReportDesignerComponentAddedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the model of a component that has been added to a report.
    */
  var Model: js.Any = js.native
  /**
    * Gets the parent of a component that has been added to a report.
    */
  var Parent: js.Any = js.native
}

object ASPxClientReportDesignerComponentAddedEventArgs {
  @scala.inline
  def apply(Model: js.Any, Parent: js.Any): ASPxClientReportDesignerComponentAddedEventArgs = {
    val __obj = js.Dynamic.literal(Model = Model.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerComponentAddedEventArgs]
  }
  @scala.inline
  implicit class ASPxClientReportDesignerComponentAddedEventArgsOps[Self <: ASPxClientReportDesignerComponentAddedEventArgs] (val x: Self) extends AnyVal {
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
    def setModel(value: js.Any): Self = this.set("Model", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
  }
  
}

