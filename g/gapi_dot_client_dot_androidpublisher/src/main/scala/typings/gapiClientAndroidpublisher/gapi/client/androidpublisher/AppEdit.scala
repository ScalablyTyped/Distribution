package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppEdit extends js.Object {
  /** The time at which the edit will expire and will be no longer valid for use in any subsequent API calls (encoded as seconds since the Epoch). */
  var expiryTimeSeconds: js.UndefOr[String] = js.native
  /** The ID of the edit that can be used in subsequent API calls. */
  var id: js.UndefOr[String] = js.native
}

object AppEdit {
  @scala.inline
  def apply(): AppEdit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppEdit]
  }
  @scala.inline
  implicit class AppEditOps[Self <: AppEdit] (val x: Self) extends AnyVal {
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
    def setExpiryTimeSeconds(value: String): Self = this.set("expiryTimeSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiryTimeSeconds: Self = this.set("expiryTimeSeconds", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

