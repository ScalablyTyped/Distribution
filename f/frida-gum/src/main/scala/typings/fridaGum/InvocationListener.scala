package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvocationListener extends js.Object {
  /**
    * Detaches listener previously attached through `Interceptor#attach()`.
    */
  def detach(): Unit
}

object InvocationListener {
  @scala.inline
  def apply(detach: () => Unit): InvocationListener = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach))
    __obj.asInstanceOf[InvocationListener]
  }
}

