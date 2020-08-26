package typings.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DivisionSearchRequest extends js.Object {
  var contextParams: js.UndefOr[ContextParams] = js.native
}

object DivisionSearchRequest {
  @scala.inline
  def apply(): DivisionSearchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DivisionSearchRequest]
  }
  @scala.inline
  implicit class DivisionSearchRequestOps[Self <: DivisionSearchRequest] (val x: Self) extends AnyVal {
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
    def setContextParams(value: ContextParams): Self = this.set("contextParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextParams: Self = this.set("contextParams", js.undefined)
  }
  
}

