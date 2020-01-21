package typings.estreeWalker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkerContext extends js.Object {
  def skip(): Unit
}

object WalkerContext {
  @scala.inline
  def apply(skip: () => Unit): WalkerContext = {
    val __obj = js.Dynamic.literal(skip = js.Any.fromFunction0(skip))
  
    __obj.asInstanceOf[WalkerContext]
  }
}

