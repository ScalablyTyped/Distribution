package typings
package eventDashEmitterLib.eventDashEmitterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eeNs {
  type EmitterMethod = js.Function2[/* type */ java.lang.String, /* listener */ EventListener, scala.Unit]
  type EventListener = js.Function1[/* repeated */ js.Any, scala.Unit]
}
