package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreativeAssignment extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var applyEventTags: js.UndefOr[Boolean] = js.undefined
  var clickThroughUrl: js.UndefOr[ClickThroughUrl] = js.undefined
  var companionCreativeOverrides: js.UndefOr[js.Array[CompanionClickThroughOverride]] = js.undefined
  var creativeGroupAssignments: js.UndefOr[js.Array[CreativeGroupAssignment]] = js.undefined
  var creativeId: js.UndefOr[String] = js.undefined
  var creativeIdDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var endTime: js.UndefOr[String] = js.undefined
  var richMediaExitOverrides: js.UndefOr[js.Array[RichMediaExitOverride]] = js.undefined
  var sequence: js.UndefOr[Double] = js.undefined
  var sslCompliant: js.UndefOr[Boolean] = js.undefined
  var startTime: js.UndefOr[String] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
}

object CreativeAssignment {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    applyEventTags: js.UndefOr[Boolean] = js.undefined,
    clickThroughUrl: ClickThroughUrl = null,
    companionCreativeOverrides: js.Array[CompanionClickThroughOverride] = null,
    creativeGroupAssignments: js.Array[CreativeGroupAssignment] = null,
    creativeId: String = null,
    creativeIdDimensionValue: DimensionValue = null,
    endTime: String = null,
    richMediaExitOverrides: js.Array[RichMediaExitOverride] = null,
    sequence: js.UndefOr[Double] = js.undefined,
    sslCompliant: js.UndefOr[Boolean] = js.undefined,
    startTime: String = null,
    weight: js.UndefOr[Double] = js.undefined
  ): CreativeAssignment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (!js.isUndefined(applyEventTags)) __obj.updateDynamic("applyEventTags")(applyEventTags.get.asInstanceOf[js.Any])
    if (clickThroughUrl != null) __obj.updateDynamic("clickThroughUrl")(clickThroughUrl.asInstanceOf[js.Any])
    if (companionCreativeOverrides != null) __obj.updateDynamic("companionCreativeOverrides")(companionCreativeOverrides.asInstanceOf[js.Any])
    if (creativeGroupAssignments != null) __obj.updateDynamic("creativeGroupAssignments")(creativeGroupAssignments.asInstanceOf[js.Any])
    if (creativeId != null) __obj.updateDynamic("creativeId")(creativeId.asInstanceOf[js.Any])
    if (creativeIdDimensionValue != null) __obj.updateDynamic("creativeIdDimensionValue")(creativeIdDimensionValue.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (richMediaExitOverrides != null) __obj.updateDynamic("richMediaExitOverrides")(richMediaExitOverrides.asInstanceOf[js.Any])
    if (!js.isUndefined(sequence)) __obj.updateDynamic("sequence")(sequence.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sslCompliant)) __obj.updateDynamic("sslCompliant")(sslCompliant.get.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (!js.isUndefined(weight)) __obj.updateDynamic("weight")(weight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreativeAssignment]
  }
}

