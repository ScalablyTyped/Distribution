package typings.gitlab.jobsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.gitlab.gitlabStrings.created
  - typings.gitlab.gitlabStrings.pending
  - typings.gitlab.gitlabStrings.running
  - typings.gitlab.gitlabStrings.failed
  - typings.gitlab.gitlabStrings.success
  - typings.gitlab.gitlabStrings.canceled
  - typings.gitlab.gitlabStrings.skipped
  - typings.gitlab.gitlabStrings.manual
*/
trait JobScope extends js.Object

object JobScope {
  @scala.inline
  def canceled: typings.gitlab.gitlabStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def created: typings.gitlab.gitlabStrings.created = this.cast("created")
  @scala.inline
  def failed: typings.gitlab.gitlabStrings.failed = this.cast("failed")
  @scala.inline
  def manual: typings.gitlab.gitlabStrings.manual = this.cast("manual")
  @scala.inline
  def pending: typings.gitlab.gitlabStrings.pending = this.cast("pending")
  @scala.inline
  def running: typings.gitlab.gitlabStrings.running = this.cast("running")
  @scala.inline
  def skipped: typings.gitlab.gitlabStrings.skipped = this.cast("skipped")
  @scala.inline
  def success: typings.gitlab.gitlabStrings.success = this.cast("success")
}

