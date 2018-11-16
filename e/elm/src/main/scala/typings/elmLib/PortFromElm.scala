package typings
package elmLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PortFromElm[V] extends js.Object {
  def subscribe(handler: js.Function1[/* value */ V, scala.Unit]): scala.Unit
  def unsubscribe(handler: js.Function1[/* value */ V, scala.Unit]): scala.Unit
}

