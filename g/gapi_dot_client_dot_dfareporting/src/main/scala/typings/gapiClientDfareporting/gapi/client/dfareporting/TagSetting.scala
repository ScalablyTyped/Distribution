package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagSetting extends js.Object {
  /**
    * Additional key-values to be included in tags. Each key-value pair must be of the form key=value, and pairs must be separated by a semicolon (;). Keys
    * and values must not contain commas. For example, id=2;color=red is a valid value for this field.
    */
  var additionalKeyValues: js.UndefOr[String] = js.native
  /** Whether static landing page URLs should be included in the tags. This setting applies only to placements. */
  var includeClickThroughUrls: js.UndefOr[Boolean] = js.native
  /** Whether click-tracking string should be included in the tags. */
  var includeClickTracking: js.UndefOr[Boolean] = js.native
  /**
    * Option specifying how keywords are embedded in ad tags. This setting can be used to specify whether keyword placeholders are inserted in placement tags
    * for this site. Publishers can then add keywords to those placeholders.
    */
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

