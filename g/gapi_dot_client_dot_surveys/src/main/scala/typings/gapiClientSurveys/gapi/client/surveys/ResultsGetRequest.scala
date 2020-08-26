package typings.gapiClientSurveys.gapi.client.surveys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResultsGetRequest extends js.Object {
  var resultMask: js.UndefOr[ResultsMask] = js.native
}

object ResultsGetRequest {
  @scala.inline
  def apply(): ResultsGetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultsGetRequest]
  }
  @scala.inline
  implicit class ResultsGetRequestOps[Self <: ResultsGetRequest] (val x: Self) extends AnyVal {
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
    def setResultMask(value: ResultsMask): Self = this.set("resultMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultMask: Self = this.set("resultMask", js.undefined)
  }
  
}

