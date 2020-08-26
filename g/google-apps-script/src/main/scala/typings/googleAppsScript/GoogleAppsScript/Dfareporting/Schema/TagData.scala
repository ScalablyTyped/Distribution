package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagData extends js.Object {
  var adId: js.UndefOr[String] = js.native
  var clickTag: js.UndefOr[String] = js.native
  var creativeId: js.UndefOr[String] = js.native
  var format: js.UndefOr[String] = js.native
  var impressionTag: js.UndefOr[String] = js.native
}

object TagData {
  @scala.inline
  def apply(): TagData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagData]
  }
  @scala.inline
  implicit class TagDataOps[Self <: TagData] (val x: Self) extends AnyVal {
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
    def setAdId(value: String): Self = this.set("adId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdId: Self = this.set("adId", js.undefined)
    @scala.inline
    def setClickTag(value: String): Self = this.set("clickTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickTag: Self = this.set("clickTag", js.undefined)
    @scala.inline
    def setCreativeId(value: String): Self = this.set("creativeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreativeId: Self = this.set("creativeId", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setImpressionTag(value: String): Self = this.set("impressionTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImpressionTag: Self = this.set("impressionTag", js.undefined)
  }
  
}

