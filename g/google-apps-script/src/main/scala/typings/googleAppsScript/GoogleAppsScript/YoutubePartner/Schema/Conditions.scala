package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conditions extends js.Object {
  var contentMatchType: js.UndefOr[js.Array[String]] = js.undefined
  var matchDuration: js.UndefOr[js.Array[IntervalCondition]] = js.undefined
  var matchPercent: js.UndefOr[js.Array[IntervalCondition]] = js.undefined
  var referenceDuration: js.UndefOr[js.Array[IntervalCondition]] = js.undefined
  var referencePercent: js.UndefOr[js.Array[IntervalCondition]] = js.undefined
  var requiredTerritories: js.UndefOr[TerritoryCondition] = js.undefined
}

object Conditions {
  @scala.inline
  def apply(
    contentMatchType: js.Array[String] = null,
    matchDuration: js.Array[IntervalCondition] = null,
    matchPercent: js.Array[IntervalCondition] = null,
    referenceDuration: js.Array[IntervalCondition] = null,
    referencePercent: js.Array[IntervalCondition] = null,
    requiredTerritories: TerritoryCondition = null
  ): Conditions = {
    val __obj = js.Dynamic.literal()
    if (contentMatchType != null) __obj.updateDynamic("contentMatchType")(contentMatchType.asInstanceOf[js.Any])
    if (matchDuration != null) __obj.updateDynamic("matchDuration")(matchDuration.asInstanceOf[js.Any])
    if (matchPercent != null) __obj.updateDynamic("matchPercent")(matchPercent.asInstanceOf[js.Any])
    if (referenceDuration != null) __obj.updateDynamic("referenceDuration")(referenceDuration.asInstanceOf[js.Any])
    if (referencePercent != null) __obj.updateDynamic("referencePercent")(referencePercent.asInstanceOf[js.Any])
    if (requiredTerritories != null) __obj.updateDynamic("requiredTerritories")(requiredTerritories.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conditions]
  }
}

