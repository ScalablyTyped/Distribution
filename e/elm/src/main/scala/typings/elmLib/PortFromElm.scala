package typings
package elmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortFromElm[V] extends js.Object {
  def subscribe(handler: js.Function1[/* value */ V, scala.Unit]): scala.Unit
  def unsubscribe(handler: js.Function1[/* value */ V, scala.Unit]): scala.Unit
}

object PortFromElm {
  @scala.inline
  def apply[V](
    subscribe: js.Function1[js.Function1[/* value */ V, scala.Unit], scala.Unit],
    unsubscribe: js.Function1[js.Function1[/* value */ V, scala.Unit], scala.Unit]
  ): PortFromElm[V] = {
    val __obj = js.Dynamic.literal(subscribe = subscribe, unsubscribe = unsubscribe)
  
    __obj.asInstanceOf[PortFromElm[V]]
  }
}

