package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientValidationSummary.VisibilityChanged event.
  */
trait ASPxClientValidationSummaryVisibilityChangedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets or sets whether the editor is visible on the client.
    */
  var visible: Boolean
}

object ASPxClientValidationSummaryVisibilityChangedEventArgs {
  @scala.inline
  def apply(visible: Boolean): ASPxClientValidationSummaryVisibilityChangedEventArgs = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientValidationSummaryVisibilityChangedEventArgs]
  }
}

