package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallsListResponse extends js.Object {
  /** An installation of an app for a user on a specific device. The existence of an install implies that the user must have an entitlement to the app. */
  var install: js.UndefOr[js.Array[Install]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#installsListResponse". */
  var kind: js.UndefOr[String] = js.native
}

object InstallsListResponse {
  @scala.inline
  def apply(): InstallsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstallsListResponse]
  }
  @scala.inline
  implicit class InstallsListResponseOps[Self <: InstallsListResponse] (val x: Self) extends AnyVal {
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
    def setInstallVarargs(value: Install*): Self = this.set("install", js.Array(value :_*))
    @scala.inline
    def setInstall(value: js.Array[Install]): Self = this.set("install", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstall: Self = this.set("install", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

