package typings
package gapiDotClientDotPredictionLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val hostedmodels: gapiDotClientDotPredictionLib.gapiNs.clientNs.predictionNs.HostedmodelsResource = js.native
  val trainedmodels: gapiDotClientDotPredictionLib.gapiNs.clientNs.predictionNs.TrainedmodelsResource = js.native
  /** Load Prediction API v1.6 */
  def load(
    name: gapiDotClientDotPredictionLib.gapiDotClientDotPredictionLibStrings.prediction,
    version: gapiDotClientDotPredictionLib.gapiDotClientDotPredictionLibStrings.v1DOT6
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotPredictionLib.gapiDotClientDotPredictionLibStrings.prediction,
    version: gapiDotClientDotPredictionLib.gapiDotClientDotPredictionLibStrings.v1DOT6,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

