package typings.gapiClientPrediction.gapi.client.prediction

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientPrediction.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedmodelsResource extends js.Object {
  /** Submit input and request an output against a hosted model. */
  def predict(request: AnonAlt): Request_[Output]
}

object HostedmodelsResource {
  @scala.inline
  def apply(predict: AnonAlt => Request_[Output]): HostedmodelsResource = {
    val __obj = js.Dynamic.literal(predict = js.Any.fromFunction1(predict))
    __obj.asInstanceOf[HostedmodelsResource]
  }
}

