package typings
package glDashReactDashDomLib.glviewdomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GLViewDOMState extends js.Object {
  var error: stdLib.Error
}

object GLViewDOMState {
  @scala.inline
  def apply(error: stdLib.Error): GLViewDOMState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[GLViewDOMState]
  }
}

