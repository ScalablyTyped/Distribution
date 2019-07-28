package typings.gapiDotClientDotFitness.gapiNs.clientNs

import typings.gapiDotClientDotFitness.gapiDotClientDotFitnessStrings.fitness
import typings.gapiDotClientDotFitness.gapiDotClientDotFitnessStrings.v1
import typings.gapiDotClientDotFitness.gapiNs.clientNs.fitnessNs.UsersResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val users: UsersResource = js.native
  /** Load Fitness v1 */
  def load(name: fitness, version: v1): js.Thenable[Unit] = js.native
  def load(name: fitness, version: v1, callback: js.Function0[_]): Unit = js.native
}

