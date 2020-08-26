package typings.gapiClientConsumersurveys.gapi.client.consumersurveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurveysStartRequest extends js.Object {
  /** Threshold to start a survey automically if the quoted prices is less than or equal to this value. See Survey.Cost for more details. */
  var maxCostPerResponseNanos: js.UndefOr[String] = js.native
}

object SurveysStartRequest {
  @scala.inline
  def apply(): SurveysStartRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurveysStartRequest]
  }
  @scala.inline
  implicit class SurveysStartRequestOps[Self <: SurveysStartRequest] (val x: Self) extends AnyVal {
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
    def setMaxCostPerResponseNanos(value: String): Self = this.set("maxCostPerResponseNanos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxCostPerResponseNanos: Self = this.set("maxCostPerResponseNanos", js.undefined)
  }
  
}

