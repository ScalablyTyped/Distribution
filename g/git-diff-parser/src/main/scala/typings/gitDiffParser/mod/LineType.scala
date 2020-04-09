package typings.gitDiffParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents prefix in `git diff` output: '+', '-', or space */
/* Rewritten from type alias, can be one of: 
  - typings.gitDiffParser.gitDiffParserStrings.deleted
  - typings.gitDiffParser.gitDiffParserStrings.added
  - typings.gitDiffParser.gitDiffParserStrings.normal
*/
trait LineType extends js.Object

object LineType {
  @scala.inline
  def added: typings.gitDiffParser.gitDiffParserStrings.added = this.cast("added")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deleted: typings.gitDiffParser.gitDiffParserStrings.deleted = this.cast("deleted")
  @scala.inline
  def normal: typings.gitDiffParser.gitDiffParserStrings.normal = this.cast("normal")
}

