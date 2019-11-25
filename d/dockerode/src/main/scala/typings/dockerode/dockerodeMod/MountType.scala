package typings.dockerode.dockerodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.dockerode.dockerodeStrings.bind
  - typings.dockerode.dockerodeStrings.volume
  - typings.dockerode.dockerodeStrings.tmpfs
*/
trait MountType extends js.Object

object MountType {
  @scala.inline
  def bind: typings.dockerode.dockerodeStrings.bind = this.cast("bind")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tmpfs: typings.dockerode.dockerodeStrings.tmpfs = this.cast("tmpfs")
  @scala.inline
  def volume: typings.dockerode.dockerodeStrings.volume = this.cast("volume")
}

