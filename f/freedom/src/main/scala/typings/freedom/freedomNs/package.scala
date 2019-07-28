package typings.freedom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object freedomNs {
  // Common on/emit for message passing interfaces.
  type EventDispatchFn[T] = js.Function2[/* eventType */ String, /* value */ js.UndefOr[T], Unit]
  type EventHandlerFn[T] = js.Function2[/* eventType */ String, /* handler */ js.Function1[/* eventData */ T, Unit], Unit]
}
