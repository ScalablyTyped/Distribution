package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemarketingAudienceAudienceDefinition extends js.Object {
  var includeConditions: js.UndefOr[IncludeConditions] = js.native
}

object RemarketingAudienceAudienceDefinition {
  @scala.inline
  def apply(): RemarketingAudienceAudienceDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemarketingAudienceAudienceDefinition]
  }
  @scala.inline
  implicit class RemarketingAudienceAudienceDefinitionOps[Self <: RemarketingAudienceAudienceDefinition] (val x: Self) extends AnyVal {
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
    def setIncludeConditions(value: IncludeConditions): Self = this.set("includeConditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeConditions: Self = this.set("includeConditions", js.undefined)
  }
  
}

