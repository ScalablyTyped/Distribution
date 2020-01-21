package typings.fsTreeDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fsTreeDiff.fsTreeDiffStrings.unlink
  - typings.fsTreeDiff.fsTreeDiffStrings.rmdir
  - typings.fsTreeDiff.fsTreeDiffStrings.mkdir
  - typings.fsTreeDiff.fsTreeDiffStrings.create
  - typings.fsTreeDiff.fsTreeDiffStrings.change
*/
trait ChangeType extends js.Object

object ChangeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typings.fsTreeDiff.fsTreeDiffStrings.change = this.cast("change")
  @scala.inline
  def create: typings.fsTreeDiff.fsTreeDiffStrings.create = this.cast("create")
  @scala.inline
  def mkdir: typings.fsTreeDiff.fsTreeDiffStrings.mkdir = this.cast("mkdir")
  @scala.inline
  def rmdir: typings.fsTreeDiff.fsTreeDiffStrings.rmdir = this.cast("rmdir")
  @scala.inline
  def unlink: typings.fsTreeDiff.fsTreeDiffStrings.unlink = this.cast("unlink")
}

