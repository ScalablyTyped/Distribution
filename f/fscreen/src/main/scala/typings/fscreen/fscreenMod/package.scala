package typings.fscreen

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fscreenMod {
  import typings.std.Element
  import typings.std.Event

  type Handler = js.Function1[/* e */ js.UndefOr[Event], Unit]
  type RequestFullScreenFunction = js.Function1[/* element */ Element, Unit]
}
