package typings
package gapiDotClientDotPredictionLib.gapiNs.clientNs.predictionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedmodelsResource extends js.Object {
  /** Submit input and request an output against a hosted model. */
  def predict(request: gapiDotClientDotPredictionLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Output]
}

object HostedmodelsResource {
  @scala.inline
  def apply(
    predict: gapiDotClientDotPredictionLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Output]
  ): HostedmodelsResource = {
    val __obj = js.Dynamic.literal(predict = js.Any.fromFunction1(predict))
  
    __obj.asInstanceOf[HostedmodelsResource]
  }
}

