package typings.eventDashEmitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventDashEmitterMod {
  type EmitterMethod = js.Function2[/* type */ String, /* listener */ EventListener, Unit]
  type EventListener = js.Function1[/* repeated */ js.Any, Unit]
}
