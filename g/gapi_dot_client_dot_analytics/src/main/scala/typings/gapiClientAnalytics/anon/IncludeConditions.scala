package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeConditions extends js.Object {
  /** Defines the conditions to include users to the audience. */
  var includeConditions: js.UndefOr[typings.gapiClientAnalytics.gapi.client.analytics.IncludeConditions] = js.undefined
}

object IncludeConditions {
  @scala.inline
  def apply(includeConditions: typings.gapiClientAnalytics.gapi.client.analytics.IncludeConditions = null): IncludeConditions = {
    val __obj = js.Dynamic.literal()
    if (includeConditions != null) __obj.updateDynamic("includeConditions")(includeConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeConditions]
  }
}

