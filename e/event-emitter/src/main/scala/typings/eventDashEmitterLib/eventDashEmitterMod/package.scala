package typings
package eventDashEmitterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eventDashEmitterMod {
  type EmitterMethod = js.Function2[/* type */ java.lang.String, /* listener */ EventListener, scala.Unit]
  type EventListener = js.Function1[/* repeated */ js.Any, scala.Unit]
}
