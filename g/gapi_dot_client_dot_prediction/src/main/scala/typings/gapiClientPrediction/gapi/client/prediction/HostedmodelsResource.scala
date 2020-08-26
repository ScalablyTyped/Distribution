package typings.gapiClientPrediction.gapi.client.prediction

import typings.gapiClient.gapi.client.Request
import typings.gapiClientPrediction.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedmodelsResource extends js.Object {
  /** Submit input and request an output against a hosted model. */
  def predict(request: Alt): Request[Output] = js.native
}

object HostedmodelsResource {
  @scala.inline
  def apply(predict: Alt => Request[Output]): HostedmodelsResource = {
    val __obj = js.Dynamic.literal(predict = js.Any.fromFunction1(predict))
    __obj.asInstanceOf[HostedmodelsResource]
  }
  @scala.inline
  implicit class HostedmodelsResourceOps[Self <: HostedmodelsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPredict(value: Alt => Request[Output]): Self = this.set("predict", js.Any.fromFunction1(value))
  }
  
}

