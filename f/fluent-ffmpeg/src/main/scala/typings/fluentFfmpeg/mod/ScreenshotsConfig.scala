package typings.fluentFfmpeg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenshotsConfig extends js.Object {
  var count: js.UndefOr[Double] = js.native
  var fastSeek: js.UndefOr[Boolean] = js.native
  var filename: js.UndefOr[String] = js.native
  var folder: js.UndefOr[String] = js.native
  var size: js.UndefOr[String] = js.native
  var timemarks: js.UndefOr[js.Array[Double | String]] = js.native
  var timestamps: js.UndefOr[js.Array[Double | String]] = js.native
}

object ScreenshotsConfig {
  @scala.inline
  def apply(): ScreenshotsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenshotsConfig]
  }
  @scala.inline
  implicit class ScreenshotsConfigOps[Self <: ScreenshotsConfig] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setFastSeek(value: Boolean): Self = this.set("fastSeek", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFastSeek: Self = this.set("fastSeek", js.undefined)
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setFolder(value: String): Self = this.set("folder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFolder: Self = this.set("folder", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTimemarksVarargs(value: (Double | String)*): Self = this.set("timemarks", js.Array(value :_*))
    @scala.inline
    def setTimemarks(value: js.Array[Double | String]): Self = this.set("timemarks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimemarks: Self = this.set("timemarks", js.undefined)
    @scala.inline
    def setTimestampsVarargs(value: (Double | String)*): Self = this.set("timestamps", js.Array(value :_*))
    @scala.inline
    def setTimestamps(value: js.Array[Double | String]): Self = this.set("timestamps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimestamps: Self = this.set("timestamps", js.undefined)
  }
  
}

