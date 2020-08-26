package typings.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoterInfoSegmentResult extends js.Object {
  var generatedMillis: js.UndefOr[String] = js.native
  var postalAddress: js.UndefOr[PostalAddress] = js.native
  var request: js.UndefOr[VoterInfoRequest] = js.native
  var response: js.UndefOr[VoterInfoResponse] = js.native
}

object VoterInfoSegmentResult {
  @scala.inline
  def apply(): VoterInfoSegmentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoterInfoSegmentResult]
  }
  @scala.inline
  implicit class VoterInfoSegmentResultOps[Self <: VoterInfoSegmentResult] (val x: Self) extends AnyVal {
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
    def setGeneratedMillis(value: String): Self = this.set("generatedMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeneratedMillis: Self = this.set("generatedMillis", js.undefined)
    @scala.inline
    def setPostalAddress(value: PostalAddress): Self = this.set("postalAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostalAddress: Self = this.set("postalAddress", js.undefined)
    @scala.inline
    def setRequest(value: VoterInfoRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
    @scala.inline
    def setResponse(value: VoterInfoResponse): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
  
}

