package typings
package estreeDashWalkerLib.estreeDashWalkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkerContext extends js.Object {
  def skip(): scala.Unit
}

object WalkerContext {
  @scala.inline
  def apply(skip: () => scala.Unit): WalkerContext = {
    val __obj = js.Dynamic.literal(skip = js.Any.fromFunction0(skip))
  
    __obj.asInstanceOf[WalkerContext]
  }
}

