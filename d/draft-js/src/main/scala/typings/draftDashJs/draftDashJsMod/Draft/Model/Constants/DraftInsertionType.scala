package typings.draftDashJs.draftDashJsMod.Draft.Model.Constants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type that defines if an fragment shall be inserted before or after
  * another fragment or if the selected fragment shall be replaced
  */
/* Rewritten from type alias, can be one of: 
  - typings.draftDashJs.draftDashJsStrings.replace
  - typings.draftDashJs.draftDashJsStrings.before
  - typings.draftDashJs.draftDashJsStrings.after
*/
trait DraftInsertionType extends js.Object

object DraftInsertionType {
  @scala.inline
  def after: typings.draftDashJs.draftDashJsStrings.after = this.cast("after")
  @scala.inline
  def before: typings.draftDashJs.draftDashJsStrings.before = this.cast("before")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def replace: typings.draftDashJs.draftDashJsStrings.replace = this.cast("replace")
}

