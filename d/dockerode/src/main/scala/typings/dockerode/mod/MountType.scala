package typings.dockerode.mod

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
  def bind: typings.dockerode.dockerodeStrings.bind = "bind".asInstanceOf[typings.dockerode.dockerodeStrings.bind]
  @scala.inline
  def tmpfs: typings.dockerode.dockerodeStrings.tmpfs = "tmpfs".asInstanceOf[typings.dockerode.dockerodeStrings.tmpfs]
  @scala.inline
  def volume: typings.dockerode.dockerodeStrings.volume = "volume".asInstanceOf[typings.dockerode.dockerodeStrings.volume]
}

