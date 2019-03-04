package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ComponentAdded event.
  */
trait ASPxClientReportDesignerComponentAddedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the model of a component that has been added to a report.
    * Value: An object that specifies the component model.
    */
  var Model: js.Object
  /**
    * Gets the parent of a component that has been added to a report.
    * Value: An object that specifies the component parent.
    */
  var Parent: js.Object
}

object ASPxClientReportDesignerComponentAddedEventArgs {
  @scala.inline
  def apply(Model: js.Object, Parent: js.Object): ASPxClientReportDesignerComponentAddedEventArgs = {
    val __obj = js.Dynamic.literal(Model = Model, Parent = Parent)
  
    __obj.asInstanceOf[ASPxClientReportDesignerComponentAddedEventArgs]
  }
}

