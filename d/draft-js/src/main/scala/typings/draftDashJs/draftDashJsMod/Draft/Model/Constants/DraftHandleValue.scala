package typings.draftDashJs.draftDashJsMod.Draft.Model.Constants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type that allows us to avoid returning boolean values
  * to indicate whether an event was handled or not.
  */
/* Rewritten from type alias, can be one of: 
  - typings.draftDashJs.draftDashJsStrings.handled
  - typings.draftDashJs.draftDashJsStrings.`not-handled`
*/
trait DraftHandleValue extends js.Object

object DraftHandleValue {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def handled: typings.draftDashJs.draftDashJsStrings.handled = this.cast("handled")
  @scala.inline
  def `not-handled`: typings.draftDashJs.draftDashJsStrings.`not-handled` = this.cast("not-handled")
}

