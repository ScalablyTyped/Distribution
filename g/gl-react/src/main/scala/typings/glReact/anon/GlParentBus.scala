package typings.glReact.anon

import typings.glReact.mod.Bus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlParentBus extends js.Object {
  var glParent: Bus
}

object GlParentBus {
  @scala.inline
  def apply(glParent: Bus): GlParentBus = {
    val __obj = js.Dynamic.literal(glParent = glParent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlParentBus]
  }
}

