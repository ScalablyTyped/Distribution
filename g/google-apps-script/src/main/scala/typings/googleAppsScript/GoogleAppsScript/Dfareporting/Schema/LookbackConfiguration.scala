package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookbackConfiguration extends js.Object {
  var clickDuration: js.UndefOr[Double] = js.undefined
  var postImpressionActivitiesDuration: js.UndefOr[Double] = js.undefined
}

object LookbackConfiguration {
  @scala.inline
  def apply(
    clickDuration: js.UndefOr[Double] = js.undefined,
    postImpressionActivitiesDuration: js.UndefOr[Double] = js.undefined
  ): LookbackConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickDuration)) __obj.updateDynamic("clickDuration")(clickDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(postImpressionActivitiesDuration)) __obj.updateDynamic("postImpressionActivitiesDuration")(postImpressionActivitiesDuration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookbackConfiguration]
  }
}

