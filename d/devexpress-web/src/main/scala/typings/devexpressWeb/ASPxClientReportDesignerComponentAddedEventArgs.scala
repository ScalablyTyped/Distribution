package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.ComponentAdded event.
  */
trait ASPxClientReportDesignerComponentAddedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the model of a component that has been added to a report.
    */
  var Model: js.Any
  /**
    * Gets the parent of a component that has been added to a report.
    */
  var Parent: js.Any
}

object ASPxClientReportDesignerComponentAddedEventArgs {
  @scala.inline
  def apply(Model: js.Any, Parent: js.Any): ASPxClientReportDesignerComponentAddedEventArgs = {
    val __obj = js.Dynamic.literal(Model = Model.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerComponentAddedEventArgs]
  }
}

