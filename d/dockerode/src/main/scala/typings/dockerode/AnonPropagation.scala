package typings.dockerode

import typings.dockerode.mod.MountPropagation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPropagation extends js.Object {
  var Propagation: MountPropagation
}

object AnonPropagation {
  @scala.inline
  def apply(Propagation: MountPropagation): AnonPropagation = {
    val __obj = js.Dynamic.literal(Propagation = Propagation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPropagation]
  }
}

