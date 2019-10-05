package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

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
    if (contentMatchType != null) __obj.updateDynamic("contentMatchType")(contentMatchType)
    if (matchDuration != null) __obj.updateDynamic("matchDuration")(matchDuration)
    if (matchPercent != null) __obj.updateDynamic("matchPercent")(matchPercent)
    if (referenceDuration != null) __obj.updateDynamic("referenceDuration")(referenceDuration)
    if (referencePercent != null) __obj.updateDynamic("referencePercent")(referencePercent)
    if (requiredTerritories != null) __obj.updateDynamic("requiredTerritories")(requiredTerritories)
    __obj.asInstanceOf[Conditions]
  }
}

