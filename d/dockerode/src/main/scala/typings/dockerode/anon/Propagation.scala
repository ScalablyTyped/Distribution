package typings.dockerode.anon

import typings.dockerode.mod.MountPropagation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Propagation extends js.Object {
  var Propagation: MountPropagation
}

object Propagation {
  @scala.inline
  def apply(Propagation: MountPropagation): Propagation = {
    val __obj = js.Dynamic.literal(Propagation = Propagation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Propagation]
  }
}

