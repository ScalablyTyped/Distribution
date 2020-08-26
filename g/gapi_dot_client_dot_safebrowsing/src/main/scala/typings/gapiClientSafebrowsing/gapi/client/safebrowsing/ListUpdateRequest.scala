package typings.gapiClientSafebrowsing.gapi.client.safebrowsing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUpdateRequest extends js.Object {
  /** The constraints associated with this request. */
  var constraints: js.UndefOr[Constraints] = js.native
  /** The type of platform at risk by entries present in the list. */
  var platformType: js.UndefOr[String] = js.native
  /**
    * The current state of the client for the requested list (the encrypted
    * client state that was received from the last successful list update).
    */
  var state: js.UndefOr[String] = js.native
  /** The types of entries present in the list. */
  var threatEntryType: js.UndefOr[String] = js.native
  /** The type of threat posed by entries present in the list. */
  var threatType: js.UndefOr[String] = js.native
}

object ListUpdateRequest {
  @scala.inline
  def apply(): ListUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUpdateRequest]
  }
  @scala.inline
  implicit class ListUpdateRequestOps[Self <: ListUpdateRequest] (val x: Self) extends AnyVal {
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
    def setConstraints(value: Constraints): Self = this.set("constraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
    @scala.inline
    def setPlatformType(value: String): Self = this.set("platformType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformType: Self = this.set("platformType", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setThreatEntryType(value: String): Self = this.set("threatEntryType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreatEntryType: Self = this.set("threatEntryType", js.undefined)
    @scala.inline
    def setThreatType(value: String): Self = this.set("threatType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreatType: Self = this.set("threatType", js.undefined)
  }
  
}

