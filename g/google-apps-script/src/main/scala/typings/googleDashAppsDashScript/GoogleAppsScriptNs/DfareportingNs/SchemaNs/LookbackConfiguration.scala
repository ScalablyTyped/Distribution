package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookbackConfiguration extends js.Object {
  var clickDuration: js.UndefOr[Double] = js.undefined
  var postImpressionActivitiesDuration: js.UndefOr[Double] = js.undefined
}

object LookbackConfiguration {
  @scala.inline
  def apply(clickDuration: Int | Double = null, postImpressionActivitiesDuration: Int | Double = null): LookbackConfiguration = {
    val __obj = js.Dynamic.literal()
    if (clickDuration != null) __obj.updateDynamic("clickDuration")(clickDuration.asInstanceOf[js.Any])
    if (postImpressionActivitiesDuration != null) __obj.updateDynamic("postImpressionActivitiesDuration")(postImpressionActivitiesDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookbackConfiguration]
  }
}

