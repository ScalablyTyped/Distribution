package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Google Tag Manager Trigger
  */
@js.native
trait Schema$Trigger extends js.Object {
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Used in the case of auto event tracking.
    */
  var autoEventFilter: js.UndefOr[js.Array[Schema$Condition]] = js.native
  /**
    * Whether or not we should only fire tags if the form submit or link click
    * event is not cancelled by some other event handler (e.g. because of
    * validation). Only valid for Form Submission and Link Click triggers.
    */
  var checkValidation: js.UndefOr[Schema$Parameter] = js.native
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  /**
    * A visibility trigger minimum continuous visible time (in milliseconds).
    * Only valid for AMP Visibility trigger.
    */
  var continuousTimeMinMilliseconds: js.UndefOr[Schema$Parameter] = js.native
  /**
    * Used in the case of custom event, which is fired iff all Conditions are
    * true.
    */
  var customEventFilter: js.UndefOr[js.Array[Schema$Condition]] = js.native
  /**
    * Name of the GTM event that is fired. Only valid for Timer triggers.
    */
  var eventName: js.UndefOr[Schema$Parameter] = js.native
  /**
    * The trigger will only fire iff all Conditions are true.
    */
  var filter: js.UndefOr[js.Array[Schema$Condition]] = js.native
  /**
    * The fingerprint of the GTM Trigger as computed at storage time. This
    * value is recomputed whenever the trigger is modified.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * List of integer percentage values for scroll triggers. The trigger will
    * fire when each percentage is reached when the view is scrolled
    * horizontally. Only valid for AMP scroll triggers.
    */
  var horizontalScrollPercentageList: js.UndefOr[Schema$Parameter] = js.native
  /**
    * Time between triggering recurring Timer Events (in milliseconds). Only
    * valid for Timer triggers.
    */
  var interval: js.UndefOr[Schema$Parameter] = js.native
  /**
    * Time between Timer Events to fire (in seconds). Only valid for AMP Timer
    * trigger.
    */
  var intervalSeconds: js.UndefOr[Schema$Parameter] = js.native
  /**
    * Limit of the number of GTM events this Timer Trigger will fire. If no
    * limit is set, we will continue to fire GTM events until the user leaves
    * the page. Only valid for Timer triggers.
    */
  var limit: js.UndefOr[Schema$Parameter] = js.native
  /**
    * Max time to fire Timer Events (in seconds). Only valid for AMP Timer
    * trigger.
    */
  var maxTimerLengthSeconds: js.UndefOr[Schema$Parameter] = js.native
  /**
    * Trigger display name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Additional parameters.
    */
  var parameter: js.UndefOr[js.Array[Schema$Parameter]] = js.native
  /**
    * Parent folder id.
    */
  var parentFolderId: js.UndefOr[String] = js.native
  /**
    * A click trigger CSS selector (i.e. &quot;a&quot;, &quot;button&quot;
    * etc.). Only valid for AMP Click trigger.
    */
  var selector: js.UndefOr[Schema$Parameter] = js.native
  /**
    * A visibility trigger minimum total visible time (in milliseconds). Only
    * valid for AMP Visibility trigger.
    */
  var totalTimeMinMilliseconds: js.UndefOr[Schema$Parameter] = js.native
  /**
    * The Trigger ID uniquely identifies the GTM Trigger.
    */
  var triggerId: js.UndefOr[String] = js.native
  /**
    * Defines the data layer event that causes this trigger.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Globally unique id of the trigger that auto-generates this (a Form
    * Submit, Link Click or Timer listener) if any. Used to make incompatible
    * auto-events work together with trigger filtering based on trigger ids.
    * This value is populated during output generation since the tags implied
    * by triggers don&#39;t exist until then. Only valid for Form Submit, Link
    * Click and Timer triggers.
    */
  var uniqueTriggerId: js.UndefOr[Schema$Parameter] = js.native
  /**
    * List of integer percentage values for scroll triggers. The trigger will
    * fire when each percentage is reached when the view is scrolled
    * vertically. Only valid for AMP scroll triggers.
    */
  var verticalScrollPercentageList: js.UndefOr[Schema$Parameter] = js.native
  /**
    * A visibility trigger CSS selector (i.e. &quot;#id&quot;). Only valid for
    * AMP Visibility trigger.
    */
  var visibilitySelector: js.UndefOr[Schema$Parameter] = js.native
  /**
    * A visibility trigger maximum percent visibility. Only valid for AMP
    * Visibility trigger.
    */
  var visiblePercentageMax: js.UndefOr[Schema$Parameter] = js.native
  /**
    * A visibility trigger minimum percent visibility. Only valid for AMP
    * Visibility trigger.
    */
  var visiblePercentageMin: js.UndefOr[Schema$Parameter] = js.native
  /**
    * Whether or not we should delay the form submissions or link opening until
    * all of the tags have fired (by preventing the default action and later
    * simulating the default action). Only valid for Form Submission and Link
    * Click triggers.
    */
  var waitForTags: js.UndefOr[Schema$Parameter] = js.native
  /**
    * How long to wait (in milliseconds) for tags to fire when
    * &#39;waits_for_tags&#39; above evaluates to true. Only valid for Form
    * Submission and Link Click triggers.
    */
  var waitForTagsTimeout: js.UndefOr[Schema$Parameter] = js.native
}

object Schema$Trigger {
  @scala.inline
  def apply(
    accountId: String = null,
    autoEventFilter: js.Array[Schema$Condition] = null,
    checkValidation: Schema$Parameter = null,
    containerId: String = null,
    continuousTimeMinMilliseconds: Schema$Parameter = null,
    customEventFilter: js.Array[Schema$Condition] = null,
    eventName: Schema$Parameter = null,
    filter: js.Array[Schema$Condition] = null,
    fingerprint: String = null,
    horizontalScrollPercentageList: Schema$Parameter = null,
    interval: Schema$Parameter = null,
    intervalSeconds: Schema$Parameter = null,
    limit: Schema$Parameter = null,
    maxTimerLengthSeconds: Schema$Parameter = null,
    name: String = null,
    parameter: js.Array[Schema$Parameter] = null,
    parentFolderId: String = null,
    selector: Schema$Parameter = null,
    totalTimeMinMilliseconds: Schema$Parameter = null,
    triggerId: String = null,
    `type`: String = null,
    uniqueTriggerId: Schema$Parameter = null,
    verticalScrollPercentageList: Schema$Parameter = null,
    visibilitySelector: Schema$Parameter = null,
    visiblePercentageMax: Schema$Parameter = null,
    visiblePercentageMin: Schema$Parameter = null,
    waitForTags: Schema$Parameter = null,
    waitForTagsTimeout: Schema$Parameter = null
  ): Schema$Trigger = {
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
    if (parameter != null) __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    if (parentFolderId != null) __obj.updateDynamic("parentFolderId")(parentFolderId.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[Schema$Trigger]
  }
}

