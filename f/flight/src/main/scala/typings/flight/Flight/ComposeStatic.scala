package typings.flight.Flight

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeStatic extends js.Object {
  def mixin(base: js.Object, mixins: js.Array[js.Function]): Unit
}

object ComposeStatic {
  @scala.inline
  def apply(mixin: (js.Object, js.Array[js.Function]) => Unit): ComposeStatic = {
    val __obj = js.Dynamic.literal(mixin = js.Any.fromFunction2(mixin))
  
    __obj.asInstanceOf[ComposeStatic]
  }
}

