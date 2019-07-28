package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the VisibilityChanged event.
  */
trait ASPxClientValidationSummaryVisibilityChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets whether the editor is visible on the client.
    * Value: true if the editor is visible; otherwise, false.
    */
  var visible: Boolean
}

object ASPxClientValidationSummaryVisibilityChangedEventArgs {
  @scala.inline
  def apply(visible: Boolean): ASPxClientValidationSummaryVisibilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(visible = visible)
  
    __obj.asInstanceOf[ASPxClientValidationSummaryVisibilityChangedEventArgs]
  }
}

