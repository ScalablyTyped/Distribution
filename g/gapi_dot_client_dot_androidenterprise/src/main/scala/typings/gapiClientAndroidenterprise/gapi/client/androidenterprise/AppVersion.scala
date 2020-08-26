package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppVersion extends js.Object {
  /** The track that this app was published in. For example if track is "alpha", this is an alpha version of the app. */
  var track: js.UndefOr[String] = js.native
  /** Unique increasing identifier for the app version. */
  var versionCode: js.UndefOr[Double] = js.native
  /**
    * The string used in the Play store by the app developer to identify the version. The string is not necessarily unique or localized (for example, the
    * string could be "1.4").
    */
  var versionString: js.UndefOr[String] = js.native
}

object AppVersion {
  @scala.inline
  def apply(): AppVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppVersion]
  }
  @scala.inline
  implicit class AppVersionOps[Self <: AppVersion] (val x: Self) extends AnyVal {
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
    def setTrack(value: String): Self = this.set("track", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
    @scala.inline
    def setVersionCode(value: Double): Self = this.set("versionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionCode: Self = this.set("versionCode", js.undefined)
    @scala.inline
    def setVersionString(value: String): Self = this.set("versionString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionString: Self = this.set("versionString", js.undefined)
  }
  
}

