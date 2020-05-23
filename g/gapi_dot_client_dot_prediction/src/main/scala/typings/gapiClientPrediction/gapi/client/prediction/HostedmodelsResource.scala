package typings.gapiClientPrediction.gapi.client.prediction

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPrediction.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedmodelsResource extends js.Object {
  /** Submit input and request an output against a hosted model. */
  def predict(request: Alt): Request[Output]
}

object HostedmodelsResource {
  @scala.inline
  def apply(predict: Alt => Request[Output]): HostedmodelsResource = {
    val __obj = js.Dynamic.literal(predict = js.Any.fromFunction1(predict))
    __obj.asInstanceOf[HostedmodelsResource]
  }
}

