package typings
package gapiDotClientDotFitnessLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val users: gapiDotClientDotFitnessLib.gapiNs.clientNs.fitnessNs.UsersResource = js.native
  /** Load Fitness v1 */
  def load(
    name: gapiDotClientDotFitnessLib.gapiDotClientDotFitnessLibStrings.fitness,
    version: gapiDotClientDotFitnessLib.gapiDotClientDotFitnessLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotFitnessLib.gapiDotClientDotFitnessLibStrings.fitness,
    version: gapiDotClientDotFitnessLib.gapiDotClientDotFitnessLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

