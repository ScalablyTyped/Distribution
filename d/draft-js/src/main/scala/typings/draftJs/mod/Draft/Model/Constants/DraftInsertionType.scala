package typings.draftJs.mod.Draft.Model.Constants

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type that defines if an fragment shall be inserted before or after
  * another fragment or if the selected fragment shall be replaced
  */
/* Rewritten from type alias, can be one of: 
  - typings.draftJs.draftJsStrings.replace
  - typings.draftJs.draftJsStrings.before
  - typings.draftJs.draftJsStrings.after
*/
trait DraftInsertionType extends js.Object

object DraftInsertionType {
  @scala.inline
  def after: typings.draftJs.draftJsStrings.after = "after".asInstanceOf[typings.draftJs.draftJsStrings.after]
  @scala.inline
  def before: typings.draftJs.draftJsStrings.before = "before".asInstanceOf[typings.draftJs.draftJsStrings.before]
  @scala.inline
  def replace: typings.draftJs.draftJsStrings.replace = "replace".asInstanceOf[typings.draftJs.draftJsStrings.replace]
}

