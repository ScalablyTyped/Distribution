package typings.fsDashTreeDashDiff.fsDashTreeDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fsDashTreeDashDiff.fsDashTreeDashDiffStrings.unlink
  - typings.fsDashTreeDashDiff.fsDashTreeDashDiffStrings.rmdir
  - typings.fsDashTreeDashDiff.fsDashTreeDashDiffStrings.mkdir
  - typings.fsDashTreeDashDiff.fsDashTreeDashDiffStrings.create
  - typings.fsDashTreeDashDiff.fsDashTreeDashDiffStrings.change
*/
trait ChangeType extends js.Object

object ChangeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def change: typings.fsDashTreeDashDiff.fsDashTreeDashDiffStrings.change = this.cast("change")
  @scala.inline
  def create: typings.fsDashTreeDashDiff.fsDashTreeDashDiffStrings.create = this.cast("create")
  @scala.inline
  def mkdir: typings.fsDashTreeDashDiff.fsDashTreeDashDiffStrings.mkdir = this.cast("mkdir")
  @scala.inline
  def rmdir: typings.fsDashTreeDashDiff.fsDashTreeDashDiffStrings.rmdir = this.cast("rmdir")
  @scala.inline
  def unlink: typings.fsDashTreeDashDiff.fsDashTreeDashDiffStrings.unlink = this.cast("unlink")
}

