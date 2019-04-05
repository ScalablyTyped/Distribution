package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trigger extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var autoEventFilter: js.UndefOr[js.Array[Condition]] = js.undefined
  var checkValidation: js.UndefOr[Parameter] = js.undefined
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  var continuousTimeMinMilliseconds: js.UndefOr[Parameter] = js.undefined
  var customEventFilter: js.UndefOr[js.Array[Condition]] = js.undefined
  var eventName: js.UndefOr[Parameter] = js.undefined
  var filter: js.UndefOr[js.Array[Condition]] = js.undefined
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  var horizontalScrollPercentageList: js.UndefOr[Parameter] = js.undefined
  var interval: js.UndefOr[Parameter] = js.undefined
  var intervalSeconds: js.UndefOr[Parameter] = js.undefined
  var limit: js.UndefOr[Parameter] = js.undefined
  var maxTimerLengthSeconds: js.UndefOr[Parameter] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var notes: js.UndefOr[java.lang.String] = js.undefined
  var parameter: js.UndefOr[js.Array[Parameter]] = js.undefined
  var parentFolderId: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var selector: js.UndefOr[Parameter] = js.undefined
  var tagManagerUrl: js.UndefOr[java.lang.String] = js.undefined
  var totalTimeMinMilliseconds: js.UndefOr[Parameter] = js.undefined
  var triggerId: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var uniqueTriggerId: js.UndefOr[Parameter] = js.undefined
  var verticalScrollPercentageList: js.UndefOr[Parameter] = js.undefined
  var visibilitySelector: js.UndefOr[Parameter] = js.undefined
  var visiblePercentageMax: js.UndefOr[Parameter] = js.undefined
  var visiblePercentageMin: js.UndefOr[Parameter] = js.undefined
  var waitForTags: js.UndefOr[Parameter] = js.undefined
  var waitForTagsTimeout: js.UndefOr[Parameter] = js.undefined
  var workspaceId: js.UndefOr[java.lang.String] = js.undefined
}

object Trigger {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    autoEventFilter: js.Array[Condition] = null,
    checkValidation: Parameter = null,
    containerId: java.lang.String = null,
    continuousTimeMinMilliseconds: Parameter = null,
    customEventFilter: js.Array[Condition] = null,
    eventName: Parameter = null,
    filter: js.Array[Condition] = null,
    fingerprint: java.lang.String = null,
    horizontalScrollPercentageList: Parameter = null,
    interval: Parameter = null,
    intervalSeconds: Parameter = null,
    limit: Parameter = null,
    maxTimerLengthSeconds: Parameter = null,
    name: java.lang.String = null,
    notes: java.lang.String = null,
    parameter: js.Array[Parameter] = null,
    parentFolderId: java.lang.String = null,
    path: java.lang.String = null,
    selector: Parameter = null,
    tagManagerUrl: java.lang.String = null,
    totalTimeMinMilliseconds: Parameter = null,
    triggerId: java.lang.String = null,
    `type`: java.lang.String = null,
    uniqueTriggerId: Parameter = null,
    verticalScrollPercentageList: Parameter = null,
    visibilitySelector: Parameter = null,
    visiblePercentageMax: Parameter = null,
    visiblePercentageMin: Parameter = null,
    waitForTags: Parameter = null,
    waitForTagsTimeout: Parameter = null,
    workspaceId: java.lang.String = null
  ): Trigger = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (autoEventFilter != null) __obj.updateDynamic("autoEventFilter")(autoEventFilter)
    if (checkValidation != null) __obj.updateDynamic("checkValidation")(checkValidation)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (continuousTimeMinMilliseconds != null) __obj.updateDynamic("continuousTimeMinMilliseconds")(continuousTimeMinMilliseconds)
    if (customEventFilter != null) __obj.updateDynamic("customEventFilter")(customEventFilter)
    if (eventName != null) __obj.updateDynamic("eventName")(eventName)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (horizontalScrollPercentageList != null) __obj.updateDynamic("horizontalScrollPercentageList")(horizontalScrollPercentageList)
    if (interval != null) __obj.updateDynamic("interval")(interval)
    if (intervalSeconds != null) __obj.updateDynamic("intervalSeconds")(intervalSeconds)
    if (limit != null) __obj.updateDynamic("limit")(limit)
    if (maxTimerLengthSeconds != null) __obj.updateDynamic("maxTimerLengthSeconds")(maxTimerLengthSeconds)
    if (name != null) __obj.updateDynamic("name")(name)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (parameter != null) __obj.updateDynamic("parameter")(parameter)
    if (parentFolderId != null) __obj.updateDynamic("parentFolderId")(parentFolderId)
    if (path != null) __obj.updateDynamic("path")(path)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl)
    if (totalTimeMinMilliseconds != null) __obj.updateDynamic("totalTimeMinMilliseconds")(totalTimeMinMilliseconds)
    if (triggerId != null) __obj.updateDynamic("triggerId")(triggerId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (uniqueTriggerId != null) __obj.updateDynamic("uniqueTriggerId")(uniqueTriggerId)
    if (verticalScrollPercentageList != null) __obj.updateDynamic("verticalScrollPercentageList")(verticalScrollPercentageList)
    if (visibilitySelector != null) __obj.updateDynamic("visibilitySelector")(visibilitySelector)
    if (visiblePercentageMax != null) __obj.updateDynamic("visiblePercentageMax")(visiblePercentageMax)
    if (visiblePercentageMin != null) __obj.updateDynamic("visiblePercentageMin")(visiblePercentageMin)
    if (waitForTags != null) __obj.updateDynamic("waitForTags")(waitForTags)
    if (waitForTagsTimeout != null) __obj.updateDynamic("waitForTagsTimeout")(waitForTagsTimeout)
    if (workspaceId != null) __obj.updateDynamic("workspaceId")(workspaceId)
    __obj.asInstanceOf[Trigger]
  }
}

