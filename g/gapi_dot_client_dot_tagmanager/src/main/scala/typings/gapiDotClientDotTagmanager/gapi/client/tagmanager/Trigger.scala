package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Trigger extends js.Object {
  /** GTM Account ID. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Used in the case of auto event tracking. */
  var autoEventFilter: js.UndefOr[js.Array[Condition]] = js.undefined
  /**
    * Whether or not we should only fire tags if the form submit or link click event is not cancelled by some other event handler (e.g. because of
    * validation). Only valid for Form Submission and Link Click triggers.
    */
  var checkValidation: js.UndefOr[Parameter] = js.undefined
  /** GTM Container ID. */
  var containerId: js.UndefOr[String] = js.undefined
  /** A visibility trigger minimum continuous visible time (in milliseconds). Only valid for AMP Visibility trigger. */
  var continuousTimeMinMilliseconds: js.UndefOr[Parameter] = js.undefined
  /** Used in the case of custom event, which is fired iff all Conditions are true. */
  var customEventFilter: js.UndefOr[js.Array[Condition]] = js.undefined
  /** Name of the GTM event that is fired. Only valid for Timer triggers. */
  var eventName: js.UndefOr[Parameter] = js.undefined
  /** The trigger will only fire iff all Conditions are true. */
  var filter: js.UndefOr[js.Array[Condition]] = js.undefined
  /** The fingerprint of the GTM Trigger as computed at storage time. This value is recomputed whenever the trigger is modified. */
  var fingerprint: js.UndefOr[String] = js.undefined
  /**
    * List of integer percentage values for scroll triggers. The trigger will fire when each percentage is reached when the view is scrolled horizontally.
    * Only valid for AMP scroll triggers.
    */
  var horizontalScrollPercentageList: js.UndefOr[Parameter] = js.undefined
  /** Time between triggering recurring Timer Events (in milliseconds). Only valid for Timer triggers. */
  var interval: js.UndefOr[Parameter] = js.undefined
  /** Time between Timer Events to fire (in seconds). Only valid for AMP Timer trigger. */
  var intervalSeconds: js.UndefOr[Parameter] = js.undefined
  /**
    * Limit of the number of GTM events this Timer Trigger will fire. If no limit is set, we will continue to fire GTM events until the user leaves the page.
    * Only valid for Timer triggers.
    */
  var limit: js.UndefOr[Parameter] = js.undefined
  /** Max time to fire Timer Events (in seconds). Only valid for AMP Timer trigger. */
  var maxTimerLengthSeconds: js.UndefOr[Parameter] = js.undefined
  /** Trigger display name. */
  var name: js.UndefOr[String] = js.undefined
  /** User notes on how to apply this trigger in the container. */
  var notes: js.UndefOr[String] = js.undefined
  /** Additional parameters. */
  var parameter: js.UndefOr[js.Array[Parameter]] = js.undefined
  /** Parent folder id. */
  var parentFolderId: js.UndefOr[String] = js.undefined
  /** GTM Trigger's API relative path. */
  var path: js.UndefOr[String] = js.undefined
  /** A click trigger CSS selector (i.e. "a", "button" etc.). Only valid for AMP Click trigger. */
  var selector: js.UndefOr[Parameter] = js.undefined
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[String] = js.undefined
  /** A visibility trigger minimum total visible time (in milliseconds). Only valid for AMP Visibility trigger. */
  var totalTimeMinMilliseconds: js.UndefOr[Parameter] = js.undefined
  /** The Trigger ID uniquely identifies the GTM Trigger. */
  var triggerId: js.UndefOr[String] = js.undefined
  /** Defines the data layer event that causes this trigger. */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Globally unique id of the trigger that auto-generates this (a Form Submit, Link Click or Timer listener) if any. Used to make incompatible auto-events
    * work together with trigger filtering based on trigger ids. This value is populated during output generation since the tags implied by triggers don't
    * exist until then. Only valid for Form Submit, Link Click and Timer triggers.
    */
  var uniqueTriggerId: js.UndefOr[Parameter] = js.undefined
  /**
    * List of integer percentage values for scroll triggers. The trigger will fire when each percentage is reached when the view is scrolled vertically. Only
    * valid for AMP scroll triggers.
    */
  var verticalScrollPercentageList: js.UndefOr[Parameter] = js.undefined
  /** A visibility trigger CSS selector (i.e. "#id"). Only valid for AMP Visibility trigger. */
  var visibilitySelector: js.UndefOr[Parameter] = js.undefined
  /** A visibility trigger maximum percent visibility. Only valid for AMP Visibility trigger. */
  var visiblePercentageMax: js.UndefOr[Parameter] = js.undefined
  /** A visibility trigger minimum percent visibility. Only valid for AMP Visibility trigger. */
  var visiblePercentageMin: js.UndefOr[Parameter] = js.undefined
  /**
    * Whether or not we should delay the form submissions or link opening until all of the tags have fired (by preventing the default action and later
    * simulating the default action). Only valid for Form Submission and Link Click triggers.
    */
  var waitForTags: js.UndefOr[Parameter] = js.undefined
  /**
    * How long to wait (in milliseconds) for tags to fire when 'waits_for_tags' above evaluates to true. Only valid for Form Submission and Link Click
    * triggers.
    */
  var waitForTagsTimeout: js.UndefOr[Parameter] = js.undefined
  /** GTM Workspace ID. */
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

