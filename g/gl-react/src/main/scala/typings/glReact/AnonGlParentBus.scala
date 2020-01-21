package typings.glReact

import typings.glReact.mod.Bus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGlParentBus extends js.Object {
  var glParent: Bus
}

object AnonGlParentBus {
  @scala.inline
  def apply(glParent: Bus): AnonGlParentBus = {
    val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGlParentBus]
  }
}

