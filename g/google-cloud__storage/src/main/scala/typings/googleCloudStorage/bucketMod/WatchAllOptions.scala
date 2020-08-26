package typings.googleCloudStorage.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchAllOptions extends js.Object {
  var delimiter: js.UndefOr[String] = js.native
  var maxResults: js.UndefOr[Double] = js.native
  var pageToken: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[String] = js.native
  var projection: js.UndefOr[String] = js.native
  var userProject: js.UndefOr[String] = js.native
  var versions: js.UndefOr[Boolean] = js.native
}

object WatchAllOptions {
  @scala.inline
  def apply(): WatchAllOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchAllOptions]
  }
  @scala.inline
  implicit class WatchAllOptionsOps[Self <: WatchAllOptions] (val x: Self) extends AnyVal {
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
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setProjection(value: String): Self = this.set("projection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    @scala.inline
    def setUserProject(value: String): Self = this.set("userProject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProject: Self = this.set("userProject", js.undefined)
    @scala.inline
    def setVersions(value: Boolean): Self = this.set("versions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
  }
  
}

