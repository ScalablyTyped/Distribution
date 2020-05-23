package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFilterControl.Applied event.
  */
trait ASPxClientFilterAppliedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the filter expression currently being applied.
    */
  var filterExpression: String
}

object ASPxClientFilterAppliedEventArgs {
  @scala.inline
  def apply(filterExpression: String): ASPxClientFilterAppliedEventArgs = {
    val __obj = js.Dynamic.literal(filterExpression = filterExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFilterAppliedEventArgs]
  }
}

