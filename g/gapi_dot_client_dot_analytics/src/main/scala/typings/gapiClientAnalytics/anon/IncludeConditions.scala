package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncludeConditions extends js.Object {
  /** Defines the conditions to include users to the audience. */
  var includeConditions: js.UndefOr[typings.gapiClientAnalytics.gapi.client.analytics.IncludeConditions] = js.native
}

object IncludeConditions {
  @scala.inline
  def apply(): IncludeConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeConditions]
  }
  @scala.inline
  implicit class IncludeConditionsOps[Self <: IncludeConditions] (val x: Self) extends AnyVal {
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
    def setIncludeConditions(value: typings.gapiClientAnalytics.gapi.client.analytics.IncludeConditions): Self = this.set("includeConditions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeConditions: Self = this.set("includeConditions", js.undefined)
  }
  
}

