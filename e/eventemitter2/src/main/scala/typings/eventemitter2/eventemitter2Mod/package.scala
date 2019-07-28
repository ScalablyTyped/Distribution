package typings.eventemitter2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventemitter2Mod {
  type EventAndListener = js.Function2[/* event */ String | js.Array[String], /* repeated */ js.Any, Unit]
  type Listener = js.Function1[/* repeated */ js.Any, Unit]
  type eventNS = js.Array[String]
}
