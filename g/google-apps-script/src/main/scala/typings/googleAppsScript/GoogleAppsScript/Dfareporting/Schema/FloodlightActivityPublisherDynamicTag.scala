package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FloodlightActivityPublisherDynamicTag extends js.Object {
  var clickThrough: js.UndefOr[Boolean] = js.native
  var directorySiteId: js.UndefOr[String] = js.native
  var dynamicTag: js.UndefOr[FloodlightActivityDynamicTag] = js.native
  var siteId: js.UndefOr[String] = js.native
  var siteIdDimensionValue: js.UndefOr[DimensionValue] = js.native
  var viewThrough: js.UndefOr[Boolean] = js.native
}

object FloodlightActivityPublisherDynamicTag {
  @scala.inline
  def apply(): FloodlightActivityPublisherDynamicTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightActivityPublisherDynamicTag]
  }
  @scala.inline
  implicit class FloodlightActivityPublisherDynamicTagOps[Self <: FloodlightActivityPublisherDynamicTag] (val x: Self) extends AnyVal {
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
    def setClickThrough(value: Boolean): Self = this.set("clickThrough", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickThrough: Self = this.set("clickThrough", js.undefined)
    @scala.inline
    def setDirectorySiteId(value: String): Self = this.set("directorySiteId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectorySiteId: Self = this.set("directorySiteId", js.undefined)
    @scala.inline
    def setDynamicTag(value: FloodlightActivityDynamicTag): Self = this.set("dynamicTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicTag: Self = this.set("dynamicTag", js.undefined)
    @scala.inline
    def setSiteId(value: String): Self = this.set("siteId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteId: Self = this.set("siteId", js.undefined)
    @scala.inline
    def setSiteIdDimensionValue(value: DimensionValue): Self = this.set("siteIdDimensionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteIdDimensionValue: Self = this.set("siteIdDimensionValue", js.undefined)
    @scala.inline
    def setViewThrough(value: Boolean): Self = this.set("viewThrough", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewThrough: Self = this.set("viewThrough", js.undefined)
  }
  
}

