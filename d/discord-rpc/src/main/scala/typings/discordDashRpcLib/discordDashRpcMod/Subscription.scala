package typings
package discordDashRpcLib.discordDashRpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  def unsubscribe(): js.Promise[scala.Boolean]
}

object Subscription {
  @scala.inline
  def apply(unsubscribe: js.Function0[js.Promise[scala.Boolean]]): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("unsubscribe")(unsubscribe)
    __obj.asInstanceOf[Subscription]
  }
}

