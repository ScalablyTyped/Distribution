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
  def apply(skip: js.Function0[scala.Unit]): WalkerContext = {
    val __obj = js.Dynamic.literal(skip = skip)
  
    __obj.asInstanceOf[WalkerContext]
  }
}

