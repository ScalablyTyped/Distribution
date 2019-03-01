package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the Applied event.
  */
trait ASPxClientFilterAppliedEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the filter expression currently being applied.
    * Value: A string value that specifies the filter expression currently being applied.
    */
  var filterExpression: java.lang.String
}

object ASPxClientFilterAppliedEventArgs {
  @scala.inline
  def apply(filterExpression: java.lang.String): ASPxClientFilterAppliedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filterExpression")(filterExpression)
    __obj.asInstanceOf[ASPxClientFilterAppliedEventArgs]
  }
}

