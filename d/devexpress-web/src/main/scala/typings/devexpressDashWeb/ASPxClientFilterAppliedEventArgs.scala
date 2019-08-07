package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientFilterControl.Applied event.
  */
@JSGlobal("ASPxClientFilterAppliedEventArgs")
@js.native
class ASPxClientFilterAppliedEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientFilterAppliedEventArgs class.
    * @param filterExpression A string value that specifies the filter expression currently being applied. This value is assigned to the ASPxClientFilterAppliedEventArgs.filterExpression property.
    */
  def this(filterExpression: String) = this()
  /**
    * Gets the filter expression currently being applied.
    */
  var filterExpression: String = js.native
}

