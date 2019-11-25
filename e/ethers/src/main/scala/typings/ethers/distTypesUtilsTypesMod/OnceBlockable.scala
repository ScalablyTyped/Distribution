package typings.ethers.distTypesUtilsTypesMod

import typings.ethers.ethersStrings.block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnceBlockable extends js.Object {
  @JSName("once")
  def once_block(eventName: block, handler: js.Function0[Unit]): Unit
}

object OnceBlockable {
  @scala.inline
  def apply(once: (block, js.Function0[Unit]) => Unit): OnceBlockable = {
    val __obj = js.Dynamic.literal(once = js.Any.fromFunction2(once))
  
    __obj.asInstanceOf[OnceBlockable]
  }
}

