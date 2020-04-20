package typings.draftJs.mod.Draft.Model.Constants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type that allows us to avoid returning boolean values
  * to indicate whether an event was handled or not.
  */
/* Rewritten from type alias, can be one of: 
  - typings.draftJs.draftJsStrings.handled
  - typings.draftJs.draftJsStrings.`not-handled`
*/
trait DraftHandleValue extends js.Object

object DraftHandleValue {
  @scala.inline
  def handled: typings.draftJs.draftJsStrings.handled = "handled".asInstanceOf[typings.draftJs.draftJsStrings.handled]
  @scala.inline
  def `not-handled`: typings.draftJs.draftJsStrings.`not-handled` = "not-handled".asInstanceOf[typings.draftJs.draftJsStrings.`not-handled`]
}

