package typings.discordRpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  def unsubscribe(): js.Promise[Boolean]
}

object Subscription {
  @scala.inline
  def apply(unsubscribe: () => js.Promise[Boolean]): Subscription = {
    val __obj = js.Dynamic.literal(unsubscribe = js.Any.fromFunction0(unsubscribe))
    __obj.asInstanceOf[Subscription]
  }
}

