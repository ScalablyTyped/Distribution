package typings.dockerode.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.dockerode.dockerodeStrings.default
  - typings.dockerode.dockerodeStrings.consistent
  - typings.dockerode.dockerodeStrings.cached
  - typings.dockerode.dockerodeStrings.delegated
*/
trait MountConsistency extends js.Object

object MountConsistency {
  @scala.inline
  def cached: typings.dockerode.dockerodeStrings.cached = this.cast("cached")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def consistent: typings.dockerode.dockerodeStrings.consistent = this.cast("consistent")
  @scala.inline
  def default: typings.dockerode.dockerodeStrings.default = this.cast("default")
  @scala.inline
  def delegated: typings.dockerode.dockerodeStrings.delegated = this.cast("delegated")
}

