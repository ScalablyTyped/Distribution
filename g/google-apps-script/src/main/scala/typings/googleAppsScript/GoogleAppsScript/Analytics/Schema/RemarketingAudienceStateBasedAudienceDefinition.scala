package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemarketingAudienceStateBasedAudienceDefinition extends js.Object {
  var excludeConditions: js.UndefOr[RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions] = js.native
  var includeConditions: js.UndefOr[IncludeConditions] = js.native
}

object RemarketingAudienceStateBasedAudienceDefinition {
  @scala.inline
  def apply(): RemarketingAudienceStateBasedAudienceDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemarketingAudienceStateBasedAudienceDefinition]
  }
  @scala.inline
  implicit class RemarketingAudienceStateBasedAudienceDefinitionOps[Self <: RemarketingAudienceStateBasedAudienceDefinition] (val x: Self) extends AnyVal {
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
    def setExcludeConditions(value: RemarketingAudienceStateBasedAudienceDefinitionExcludeConditions): Self = this.set("excludeConditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeConditions: Self = this.set("excludeConditions", js.undefined)
    @scala.inline
    def setIncludeConditions(value: IncludeConditions): Self = this.set("includeConditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeConditions: Self = this.set("includeConditions", js.undefined)
  }
  
}

