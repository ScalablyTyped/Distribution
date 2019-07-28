package typings.elementDashReady

import typings.elementDashReady.Anon_Stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object elementDashReadyMod {
  type StoppablePromise[T] = js.Promise[T] with Anon_Stop
}
