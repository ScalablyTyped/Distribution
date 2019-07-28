package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Experiment extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var created: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var editableInGaUi: js.UndefOr[Boolean] = js.undefined
  var endTime: js.UndefOr[String] = js.undefined
  var equalWeighting: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var internalWebPropertyId: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var minimumExperimentLengthInDays: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var objectiveMetric: js.UndefOr[String] = js.undefined
  var optimizationType: js.UndefOr[String] = js.undefined
  var parentLink: js.UndefOr[ExperimentParentLink] = js.undefined
  var profileId: js.UndefOr[String] = js.undefined
  var reasonExperimentEnded: js.UndefOr[String] = js.undefined
  var rewriteVariationUrlsAsOriginal: js.UndefOr[Boolean] = js.undefined
  var selfLink: js.UndefOr[String] = js.undefined
  var servingFramework: js.UndefOr[String] = js.undefined
  var snippet: js.UndefOr[String] = js.undefined
  var startTime: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var trafficCoverage: js.UndefOr[Double] = js.undefined
  var updated: js.UndefOr[String] = js.undefined
  var variations: js.UndefOr[js.Array[ExperimentVariations]] = js.undefined
  var webPropertyId: js.UndefOr[String] = js.undefined
  var winnerConfidenceLevel: js.UndefOr[Double] = js.undefined
  var winnerFound: js.UndefOr[Boolean] = js.undefined
}

object Experiment {
  @scala.inline
  def apply(
    accountId: String = null,
    created: String = null,
    description: String = null,
    editableInGaUi: js.UndefOr[Boolean] = js.undefined,
    endTime: String = null,
    equalWeighting: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    internalWebPropertyId: String = null,
    kind: String = null,
    minimumExperimentLengthInDays: Int | Double = null,
    name: String = null,
    objectiveMetric: String = null,
    optimizationType: String = null,
    parentLink: ExperimentParentLink = null,
    profileId: String = null,
    reasonExperimentEnded: String = null,
    rewriteVariationUrlsAsOriginal: js.UndefOr[Boolean] = js.undefined,
    selfLink: String = null,
    servingFramework: String = null,
    snippet: String = null,
    startTime: String = null,
    status: String = null,
    trafficCoverage: Int | Double = null,
    updated: String = null,
    variations: js.Array[ExperimentVariations] = null,
    webPropertyId: String = null,
    winnerConfidenceLevel: Int | Double = null,
    winnerFound: js.UndefOr[Boolean] = js.undefined
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

