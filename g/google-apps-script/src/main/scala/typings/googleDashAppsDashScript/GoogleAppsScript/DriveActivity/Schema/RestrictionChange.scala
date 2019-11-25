package typings.googleDashAppsDashScript.GoogleAppsScript.DriveActivity.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestrictionChange extends js.Object {
  var feature: js.UndefOr[String] = js.undefined
  var newRestriction: js.UndefOr[String] = js.undefined
}

object RestrictionChange {
  @scala.inline
  def apply(feature: String = null, newRestriction: String = null): RestrictionChange = {
    val __obj = js.Dynamic.literal()
    if (feature != null) __obj.updateDynamic("feature")(feature.asInstanceOf[js.Any])
    if (newRestriction != null) __obj.updateDynamic("newRestriction")(newRestriction.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestrictionChange]
  }
}

