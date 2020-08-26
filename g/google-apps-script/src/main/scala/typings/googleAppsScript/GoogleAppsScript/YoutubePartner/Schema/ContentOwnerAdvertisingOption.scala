package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentOwnerAdvertisingOption extends js.Object {
  var allowedOptions: js.UndefOr[AllowedAdvertisingOptions] = js.native
  var claimedVideoOptions: js.UndefOr[ClaimedVideoDefaults] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
}

object ContentOwnerAdvertisingOption {
  @scala.inline
  def apply(): ContentOwnerAdvertisingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentOwnerAdvertisingOption]
  }
  @scala.inline
  implicit class ContentOwnerAdvertisingOptionOps[Self <: ContentOwnerAdvertisingOption] (val x: Self) extends AnyVal {
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
    def setAllowedOptions(value: AllowedAdvertisingOptions): Self = this.set("allowedOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedOptions: Self = this.set("allowedOptions", js.undefined)
    @scala.inline
    def setClaimedVideoOptions(value: ClaimedVideoDefaults): Self = this.set("claimedVideoOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClaimedVideoOptions: Self = this.set("claimedVideoOptions", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

