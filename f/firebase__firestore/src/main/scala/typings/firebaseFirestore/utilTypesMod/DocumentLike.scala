package typings.firebaseFirestore.utilTypesMod

import typings.std.EventListener
import typings.std.VisibilityState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentLike extends js.Object {
  val visibilityState: VisibilityState
  def addEventListener(`type`: String, listener: EventListener): Unit
  def removeEventListener(`type`: String, listener: EventListener): Unit
}

object DocumentLike {
  @scala.inline
  def apply(
    addEventListener: (String, EventListener) => Unit,
    removeEventListener: (String, EventListener) => Unit,
    visibilityState: VisibilityState
  ): DocumentLike = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), removeEventListener = js.Any.fromFunction2(removeEventListener), visibilityState = visibilityState.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLike]
  }
}

