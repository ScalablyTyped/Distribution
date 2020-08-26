package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagSetting extends js.Object {
  var additionalKeyValues: js.UndefOr[String] = js.native
  var includeClickThroughUrls: js.UndefOr[Boolean] = js.native
  var includeClickTracking: js.UndefOr[Boolean] = js.native
  var keywordOption: js.UndefOr[String] = js.native
}

object TagSetting {
  @scala.inline
  def apply(): TagSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagSetting]
  }
  @scala.inline
  implicit class TagSettingOps[Self <: TagSetting] (val x: Self) extends AnyVal {
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
    def setAdditionalKeyValues(value: String): Self = this.set("additionalKeyValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalKeyValues: Self = this.set("additionalKeyValues", js.undefined)
    @scala.inline
    def setIncludeClickThroughUrls(value: Boolean): Self = this.set("includeClickThroughUrls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeClickThroughUrls: Self = this.set("includeClickThroughUrls", js.undefined)
    @scala.inline
    def setIncludeClickTracking(value: Boolean): Self = this.set("includeClickTracking", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeClickTracking: Self = this.set("includeClickTracking", js.undefined)
    @scala.inline
    def setKeywordOption(value: String): Self = this.set("keywordOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywordOption: Self = this.set("keywordOption", js.undefined)
  }
  
}

