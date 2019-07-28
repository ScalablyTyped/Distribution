package typings.gapiDotClientDotPrediction.gapiNs.clientNs

import typings.gapiDotClientDotPrediction.gapiDotClientDotPredictionStrings.prediction
import typings.gapiDotClientDotPrediction.gapiDotClientDotPredictionStrings.v1DOT6
import typings.gapiDotClientDotPrediction.gapiNs.clientNs.predictionNs.HostedmodelsResource
import typings.gapiDotClientDotPrediction.gapiNs.clientNs.predictionNs.TrainedmodelsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val hostedmodels: HostedmodelsResource = js.native
  val trainedmodels: TrainedmodelsResource = js.native
  /** Load Prediction API v1.6 */
  def load(name: prediction, version: v1DOT6): js.Thenable[Unit] = js.native
  def load(name: prediction, version: v1DOT6, callback: js.Function0[_]): Unit = js.native
}

