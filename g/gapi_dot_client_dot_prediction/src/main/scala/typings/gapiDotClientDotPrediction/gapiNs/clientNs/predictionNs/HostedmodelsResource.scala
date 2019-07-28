package typings.gapiDotClientDotPrediction.gapiNs.clientNs.predictionNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotPrediction.Anon_Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedmodelsResource extends js.Object {
  /** Submit input and request an output against a hosted model. */
  def predict(request: Anon_Alt): Request[Output]
}

object HostedmodelsResource {
  @scala.inline
  def apply(predict: Anon_Alt => Request[Output]): HostedmodelsResource = {
    val __obj = js.Dynamic.literal(predict = js.Any.fromFunction1(predict))
  
    __obj.asInstanceOf[HostedmodelsResource]
  }
}

