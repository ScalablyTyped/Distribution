package typings.glReactDom.glviewdomMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GLViewDOMState extends js.Object {
  var error: Error
}

object GLViewDOMState {
  @scala.inline
  def apply(error: Error): GLViewDOMState = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GLViewDOMState]
  }
}

