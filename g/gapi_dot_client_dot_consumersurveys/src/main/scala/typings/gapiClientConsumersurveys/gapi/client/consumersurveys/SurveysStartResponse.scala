package typings.gapiClientConsumersurveys.gapi.client.consumersurveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SurveysStartResponse extends js.Object {
  /** Unique request ID used for logging and debugging. Please include in any error reporting or troubleshooting requests. */
  var requestId: js.UndefOr[String] = js.native
}

object SurveysStartResponse {
  @scala.inline
  def apply(): SurveysStartResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SurveysStartResponse]
  }
  @scala.inline
  implicit class SurveysStartResponseOps[Self <: SurveysStartResponse] (val x: Self) extends AnyVal {
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
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
  
}

