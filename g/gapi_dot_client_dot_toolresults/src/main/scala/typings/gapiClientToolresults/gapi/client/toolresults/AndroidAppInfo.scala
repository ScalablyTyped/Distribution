package typings.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidAppInfo extends js.Object {
  /** The name of the app. Optional */
  var name: js.UndefOr[String] = js.native
  /** The package name of the app. Required. */
  var packageName: js.UndefOr[String] = js.native
  /** The internal version code of the app. Optional. */
  var versionCode: js.UndefOr[String] = js.native
  /** The version name of the app. Optional. */
  var versionName: js.UndefOr[String] = js.native
}

object AndroidAppInfo {
  @scala.inline
  def apply(): AndroidAppInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidAppInfo]
  }
  @scala.inline
  implicit class AndroidAppInfoOps[Self <: AndroidAppInfo] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    @scala.inline
    def setVersionCode(value: String): Self = this.set("versionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionCode: Self = this.set("versionCode", js.undefined)
    @scala.inline
    def setVersionName(value: String): Self = this.set("versionName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionName: Self = this.set("versionName", js.undefined)
  }
  
}

