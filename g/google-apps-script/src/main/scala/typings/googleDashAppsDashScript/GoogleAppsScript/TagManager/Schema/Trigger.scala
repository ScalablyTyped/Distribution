package typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trigger extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var autoEventFilter: js.UndefOr[js.Array[Condition]] = js.undefined
  var checkValidation: js.UndefOr[Parameter] = js.undefined
  var containerId: js.UndefOr[String] = js.undefined
  var continuousTimeMinMilliseconds: js.UndefOr[Parameter] = js.undefined
  var customEventFilter: js.UndefOr[js.Array[Condition]] = js.undefined
  var eventName: js.UndefOr[Parameter] = js.undefined
  var filter: js.UndefOr[js.Array[Condition]] = js.undefined
  var fingerprint: js.UndefOr[String] = js.undefined
  var horizontalScrollPercentageList: js.UndefOr[Parameter] = js.undefined
  var interval: js.UndefOr[Parameter] = js.undefined
  var intervalSeconds: js.UndefOr[Parameter] = js.undefined
  var limit: js.UndefOr[Parameter] = js.undefined
  var maxTimerLengthSeconds: js.UndefOr[Parameter] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var notes: js.UndefOr[String] = js.undefined
  var parameter: js.UndefOr[js.Array[Parameter]] = js.undefined
  var parentFolderId: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var selector: js.UndefOr[Parameter] = js.undefined
  var tagManagerUrl: js.UndefOr[String] = js.undefined
  var totalTimeMinMilliseconds: js.UndefOr[Parameter] = js.undefined
  var triggerId: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var uniqueTriggerId: js.UndefOr[Parameter] = js.undefined
  var verticalScrollPercentageList: js.UndefOr[Parameter] = js.undefined
  var visibilitySelector: js.UndefOr[Parameter] = js.undefined
  var visiblePercentageMax: js.UndefOr[Parameter] = js.undefined
  var visiblePercentageMin: js.UndefOr[Parameter] = js.undefined
  var waitForTags: js.UndefOr[Parameter] = js.undefined
  var waitForTagsTimeout: js.UndefOr[Parameter] = js.undefined
  var workspaceId: js.UndefOr[String] = js.undefined
}

object Trigger {
  @scala.inline
  def apply(
    accountId: String = null,
    autoEventFilter: js.Array[Condition] = null,
    checkValidation: Parameter = null,
    containerId: String = null,
    continuousTimeMinMilliseconds: Parameter = null,
    customEventFilter: js.Array[Condition] = null,
    eventName: Parameter = null,
    filter: js.Array[Condition] = null,
    fingerprint: String = null,
    horizontalScrollPercentageList: Parameter = null,
    interval: Parameter = null,
    intervalSeconds: Parameter = null,
    limit: Parameter = null,
    maxTimerLengthSeconds: Parameter = null,
    name: String = null,
    notes: String = null,
    parameter: js.Array[Parameter] = null,
    parentFolderId: String = null,
    path: String = null,
    selector: Parameter = null,
    tagManagerUrl: String = null,
    totalTimeMinMilliseconds: Parameter = null,
    triggerId: String = null,
    `type`: String = null,
    uniqueTriggerId: Parameter = null,
    verticalScrollPercentageList: Parameter = null,
    visibilitySelector: Parameter = null,
    visiblePercentageMax: Parameter = null,
    visiblePercentageMin: Parameter = null,
    waitForTags: Parameter = null,
    waitForTagsTimeout: Parameter = null,
    workspaceId: String = null
  ): Trigger = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (autoEventFilter != null) __obj.updateDynamic("autoEventFilter")(autoEventFilter.asInstanceOf[js.Any])
    if (checkValidation != null) __obj.updateDynamic("checkValidation")(checkValidation.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (continuousTimeMinMilliseconds != null) __obj.updateDynamic("continuousTimeMinMilliseconds")(continuousTimeMinMilliseconds.asInstanceOf[js.Any])
    if (customEventFilter != null) __obj.updateDynamic("customEventFilter")(customEventFilter.asInstanceOf[js.Any])
    if (eventName != null) __obj.updateDynamic("eventName")(eventName.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (horizontalScrollPercentageList != null) __obj.updateDynamic("horizontalScrollPercentageList")(horizontalScrollPercentageList.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (intervalSeconds != null) __obj.updateDynamic("intervalSeconds")(intervalSeconds.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (maxTimerLengthSeconds != null) __obj.updateDynamic("maxTimerLengthSeconds")(maxTimerLengthSeconds.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (parameter != null) __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    if (parentFolderId != null) __obj.updateDynamic("parentFolderId")(parentFolderId.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl.asInstanceOf[js.Any])
    if (totalTimeMinMilliseconds != null) __obj.updateDynamic("totalTimeMinMilliseconds")(totalTimeMinMilliseconds.asInstanceOf[js.Any])
    if (triggerId != null) __obj.updateDynamic("triggerId")(triggerId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uniqueTriggerId != null) __obj.updateDynamic("uniqueTriggerId")(uniqueTriggerId.asInstanceOf[js.Any])
    if (verticalScrollPercentageList != null) __obj.updateDynamic("verticalScrollPercentageList")(verticalScrollPercentageList.asInstanceOf[js.Any])
    if (visibilitySelector != null) __obj.updateDynamic("visibilitySelector")(visibilitySelector.asInstanceOf[js.Any])
    if (visiblePercentageMax != null) __obj.updateDynamic("visiblePercentageMax")(visiblePercentageMax.asInstanceOf[js.Any])
    if (visiblePercentageMin != null) __obj.updateDynamic("visiblePercentageMin")(visiblePercentageMin.asInstanceOf[js.Any])
    if (waitForTags != null) __obj.updateDynamic("waitForTags")(waitForTags.asInstanceOf[js.Any])
    if (waitForTagsTimeout != null) __obj.updateDynamic("waitForTagsTimeout")(waitForTagsTimeout.asInstanceOf[js.Any])
    if (workspaceId != null) __obj.updateDynamic("workspaceId")(workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trigger]
  }
}

