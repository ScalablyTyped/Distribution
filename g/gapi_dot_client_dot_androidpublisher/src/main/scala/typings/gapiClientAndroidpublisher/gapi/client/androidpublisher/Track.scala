package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Track extends js.Object {
  var track: js.UndefOr[String] = js.native
  var userFraction: js.UndefOr[Double] = js.native
  var versionCodes: js.UndefOr[js.Array[Double]] = js.native
}

object Track {
  @scala.inline
  def apply(): Track = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Track]
  }
  @scala.inline
  implicit class TrackOps[Self <: Track] (val x: Self) extends AnyVal {
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
    def setUserFraction(value: Double): Self = this.set("userFraction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserFraction: Self = this.set("userFraction", js.undefined)
    @scala.inline
    def setVersionCodesVarargs(value: Double*): Self = this.set("versionCodes", js.Array(value :_*))
    @scala.inline
    def setVersionCodes(value: js.Array[Double]): Self = this.set("versionCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionCodes: Self = this.set("versionCodes", js.undefined)
  }
  
}

