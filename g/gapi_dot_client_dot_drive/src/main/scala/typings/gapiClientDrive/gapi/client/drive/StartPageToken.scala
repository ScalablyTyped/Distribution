package typings.gapiClientDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartPageToken extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "drive#startPageToken". */
  var kind: js.UndefOr[String] = js.native
  /** The starting page token for listing changes. */
  var startPageToken: js.UndefOr[String] = js.native
}

object StartPageToken {
  @scala.inline
  def apply(): StartPageToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPageToken]
  }
  @scala.inline
  implicit class StartPageTokenOps[Self <: StartPageToken] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setStartPageToken(value: String): Self = this.set("startPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartPageToken: Self = this.set("startPageToken", js.undefined)
  }
  
}

