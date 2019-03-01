package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Experiment extends js.Object {
  /** Account ID to which this experiment belongs. This field is read-only. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Time the experiment was created. This field is read-only. */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /** Notes about this experiment. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** If true, the end user will be able to edit the experiment via the Google Analytics user interface. */
  var editableInGaUi: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The ending time of the experiment (the time the status changed from RUNNING to ENDED). This field is present only if the experiment has ended. This
    * field is read-only.
    */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Boolean specifying whether to distribute traffic evenly across all variations. If the value is False, content experiments follows the default behavior
    * of adjusting traffic dynamically based on variation performance. Optional -- defaults to False. This field may not be changed for an experiment whose
    * status is ENDED.
    */
  var equalWeighting: js.UndefOr[scala.Boolean] = js.undefined
  /** Experiment ID. Required for patch and update. Disallowed for create. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Internal ID for the web property to which this experiment belongs. This field is read-only. */
  var internalWebPropertyId: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for an Analytics experiment. This field is read-only. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An integer number in [3, 90]. Specifies the minimum length of the experiment. Can be changed for a running experiment. This field may not be changed
    * for an experiments whose status is ENDED.
    */
  var minimumExperimentLengthInDays: js.UndefOr[scala.Double] = js.undefined
  /** Experiment name. This field may not be changed for an experiment whose status is ENDED. This field is required when creating an experiment. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The metric that the experiment is optimizing. Valid values: "ga:goal(n)Completions", "ga:adsenseAdsClicks", "ga:adsenseAdsViewed", "ga:adsenseRevenue",
    * "ga:bounces", "ga:pageviews", "ga:sessionDuration", "ga:transactions", "ga:transactionRevenue". This field is required if status is "RUNNING" and
    * servingFramework is one of "REDIRECT" or "API".
    */
  var objectiveMetric: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether the objectiveMetric should be minimized or maximized. Possible values: "MAXIMUM", "MINIMUM". Optional--defaults to "MAXIMUM". Cannot be
    * specified without objectiveMetric. Cannot be modified when status is "RUNNING" or "ENDED".
    */
  var optimizationType: js.UndefOr[java.lang.String] = js.undefined
  /** Parent link for an experiment. Points to the view (profile) to which this experiment belongs. */
  var parentLink: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_Href] = js.undefined
  /** View (Profile) ID to which this experiment belongs. This field is read-only. */
  var profileId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Why the experiment ended. Possible values: "STOPPED_BY_USER", "WINNER_FOUND", "EXPERIMENT_EXPIRED", "ENDED_WITH_NO_WINNER", "GOAL_OBJECTIVE_CHANGED".
    * "ENDED_WITH_NO_WINNER" means that the experiment didn't expire but no winner was projected to be found. If the experiment status is changed via the API
    * to ENDED this field is set to STOPPED_BY_USER. This field is read-only.
    */
  var reasonExperimentEnded: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Boolean specifying whether variations URLS are rewritten to match those of the original. This field may not be changed for an experiments whose status
    * is ENDED.
    */
  var rewriteVariationUrlsAsOriginal: js.UndefOr[scala.Boolean] = js.undefined
  /** Link for this experiment. This field is read-only. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The framework used to serve the experiment variations and evaluate the results. One of:
    * - REDIRECT: Google Analytics redirects traffic to different variation pages, reports the chosen variation and evaluates the results.
    * - API: Google Analytics chooses and reports the variation to serve and evaluates the results; the caller is responsible for serving the selected
    * variation.
    * - EXTERNAL: The variations will be served externally and the chosen variation reported to Google Analytics. The caller is responsible for serving the
    * selected variation and evaluating the results.
    */
  var servingFramework: js.UndefOr[java.lang.String] = js.undefined
  /** The snippet of code to include on the control page(s). This field is read-only. */
  var snippet: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The starting time of the experiment (the time the status changed from READY_TO_RUN to RUNNING). This field is present only if the experiment has
    * started. This field is read-only.
    */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Experiment status. Possible values: "DRAFT", "READY_TO_RUN", "RUNNING", "ENDED". Experiments can be created in the "DRAFT", "READY_TO_RUN" or "RUNNING"
    * state. This field is required when creating an experiment.
    */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A floating-point number in (0, 1]. Specifies the fraction of the traffic that participates in the experiment. Can be changed for a running experiment.
    * This field may not be changed for an experiments whose status is ENDED.
    */
  var trafficCoverage: js.UndefOr[scala.Double] = js.undefined
  /** Time the experiment was last modified. This field is read-only. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Array of variations. The first variation in the array is the original. The number of variations may not change once an experiment is in the RUNNING
    * state. At least two variations are required before status can be set to RUNNING.
    */
  var variations: js.UndefOr[js.Array[gapiDotClientDotAnalyticsLib.Anon_Name]] = js.undefined
  /** Web property ID to which this experiment belongs. The web property ID is of the form UA-XXXXX-YY. This field is read-only. */
  var webPropertyId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A floating-point number in (0, 1). Specifies the necessary confidence level to choose a winner. This field may not be changed for an experiments whose
    * status is ENDED.
    */
  var winnerConfidenceLevel: js.UndefOr[scala.Double] = js.undefined
  /** Boolean specifying whether a winner has been found for this experiment. This field is read-only. */
  var winnerFound: js.UndefOr[scala.Boolean] = js.undefined
}

object Experiment {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    created: java.lang.String = null,
    description: java.lang.String = null,
    editableInGaUi: js.UndefOr[scala.Boolean] = js.undefined,
    endTime: java.lang.String = null,
    equalWeighting: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    internalWebPropertyId: java.lang.String = null,
    kind: java.lang.String = null,
    minimumExperimentLengthInDays: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    objectiveMetric: java.lang.String = null,
    optimizationType: java.lang.String = null,
    parentLink: gapiDotClientDotAnalyticsLib.Anon_Href = null,
    profileId: java.lang.String = null,
    reasonExperimentEnded: java.lang.String = null,
    rewriteVariationUrlsAsOriginal: js.UndefOr[scala.Boolean] = js.undefined,
    selfLink: java.lang.String = null,
    servingFramework: java.lang.String = null,
    snippet: java.lang.String = null,
    startTime: java.lang.String = null,
    status: java.lang.String = null,
    trafficCoverage: scala.Int | scala.Double = null,
    updated: java.lang.String = null,
    variations: js.Array[gapiDotClientDotAnalyticsLib.Anon_Name] = null,
    webPropertyId: java.lang.String = null,
    winnerConfidenceLevel: scala.Int | scala.Double = null,
    winnerFound: js.UndefOr[scala.Boolean] = js.undefined
  ): Experiment = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (created != null) __obj.updateDynamic("created")(created)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(editableInGaUi)) __obj.updateDynamic("editableInGaUi")(editableInGaUi)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (!js.isUndefined(equalWeighting)) __obj.updateDynamic("equalWeighting")(equalWeighting)
    if (id != null) __obj.updateDynamic("id")(id)
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (minimumExperimentLengthInDays != null) __obj.updateDynamic("minimumExperimentLengthInDays")(minimumExperimentLengthInDays.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (objectiveMetric != null) __obj.updateDynamic("objectiveMetric")(objectiveMetric)
    if (optimizationType != null) __obj.updateDynamic("optimizationType")(optimizationType)
    if (parentLink != null) __obj.updateDynamic("parentLink")(parentLink)
    if (profileId != null) __obj.updateDynamic("profileId")(profileId)
    if (reasonExperimentEnded != null) __obj.updateDynamic("reasonExperimentEnded")(reasonExperimentEnded)
    if (!js.isUndefined(rewriteVariationUrlsAsOriginal)) __obj.updateDynamic("rewriteVariationUrlsAsOriginal")(rewriteVariationUrlsAsOriginal)
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink)
    if (servingFramework != null) __obj.updateDynamic("servingFramework")(servingFramework)
    if (snippet != null) __obj.updateDynamic("snippet")(snippet)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (status != null) __obj.updateDynamic("status")(status)
    if (trafficCoverage != null) __obj.updateDynamic("trafficCoverage")(trafficCoverage.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (variations != null) __obj.updateDynamic("variations")(variations)
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId)
    if (winnerConfidenceLevel != null) __obj.updateDynamic("winnerConfidenceLevel")(winnerConfidenceLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(winnerFound)) __obj.updateDynamic("winnerFound")(winnerFound)
    __obj.asInstanceOf[Experiment]
  }
}

