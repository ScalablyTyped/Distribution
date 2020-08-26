package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcludeConditions extends js.Object {
  /** Defines the conditions to exclude users from the audience. */
  var excludeConditions: js.UndefOr[ExclusionDuration] = js.native
  /** Defines the conditions to include users to the audience. */
  var includeConditions: js.UndefOr[typings.gapiClientAnalytics.gapi.client.analytics.IncludeConditions] = js.native
}

object ExcludeConditions {
  @scala.inline
  def apply(): ExcludeConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcludeConditions]
  }
  @scala.inline
  implicit class ExcludeConditionsOps[Self <: ExcludeConditions] (val x: Self) extends AnyVal {
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
    def setExcludeConditions(value: ExclusionDuration): Self = this.set("excludeConditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeConditions: Self = this.set("excludeConditions", js.undefined)
    @scala.inline
    def setIncludeConditions(value: typings.gapiClientAnalytics.gapi.client.analytics.IncludeConditions): Self = this.set("includeConditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeConditions: Self = this.set("includeConditions", js.undefined)
  }
  
}

