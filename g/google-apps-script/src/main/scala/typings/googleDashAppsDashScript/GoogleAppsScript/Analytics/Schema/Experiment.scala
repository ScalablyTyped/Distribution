package typings.googleDashAppsDashScript.GoogleAppsScript.Analytics.Schema

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
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(editableInGaUi)) __obj.updateDynamic("editableInGaUi")(editableInGaUi.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (!js.isUndefined(equalWeighting)) __obj.updateDynamic("equalWeighting")(equalWeighting.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (internalWebPropertyId != null) __obj.updateDynamic("internalWebPropertyId")(internalWebPropertyId.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (minimumExperimentLengthInDays != null) __obj.updateDynamic("minimumExperimentLengthInDays")(minimumExperimentLengthInDays.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (objectiveMetric != null) __obj.updateDynamic("objectiveMetric")(objectiveMetric.asInstanceOf[js.Any])
    if (optimizationType != null) __obj.updateDynamic("optimizationType")(optimizationType.asInstanceOf[js.Any])
    if (parentLink != null) __obj.updateDynamic("parentLink")(parentLink.asInstanceOf[js.Any])
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    if (reasonExperimentEnded != null) __obj.updateDynamic("reasonExperimentEnded")(reasonExperimentEnded.asInstanceOf[js.Any])
    if (!js.isUndefined(rewriteVariationUrlsAsOriginal)) __obj.updateDynamic("rewriteVariationUrlsAsOriginal")(rewriteVariationUrlsAsOriginal.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (servingFramework != null) __obj.updateDynamic("servingFramework")(servingFramework.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (trafficCoverage != null) __obj.updateDynamic("trafficCoverage")(trafficCoverage.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (variations != null) __obj.updateDynamic("variations")(variations.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    if (winnerConfidenceLevel != null) __obj.updateDynamic("winnerConfidenceLevel")(winnerConfidenceLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(winnerFound)) __obj.updateDynamic("winnerFound")(winnerFound.asInstanceOf[js.Any])
    __obj.asInstanceOf[Experiment]
  }
}

