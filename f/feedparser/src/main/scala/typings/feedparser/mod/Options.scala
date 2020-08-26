package typings.feedparser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var MAX_BUFFER_LENGTH: js.UndefOr[Double] = js.native
  var addmeta: js.UndefOr[Boolean] = js.native
  var feedurl: js.UndefOr[String] = js.native
  var normalize: js.UndefOr[Boolean] = js.native
  var resume_saxerror: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setMAX_BUFFER_LENGTH(value: Double): Self = this.set("MAX_BUFFER_LENGTH", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMAX_BUFFER_LENGTH: Self = this.set("MAX_BUFFER_LENGTH", js.undefined)
    @scala.inline
    def setAddmeta(value: Boolean): Self = this.set("addmeta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddmeta: Self = this.set("addmeta", js.undefined)
    @scala.inline
    def setFeedurl(value: String): Self = this.set("feedurl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeedurl: Self = this.set("feedurl", js.undefined)
    @scala.inline
    def setNormalize(value: Boolean): Self = this.set("normalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
    @scala.inline
    def setResume_saxerror(value: Boolean): Self = this.set("resume_saxerror", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResume_saxerror: Self = this.set("resume_saxerror", js.undefined)
  }
  
}

