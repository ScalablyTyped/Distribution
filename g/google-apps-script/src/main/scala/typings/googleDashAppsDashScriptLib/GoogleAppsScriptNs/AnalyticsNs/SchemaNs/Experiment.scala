package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AnalyticsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Experiment extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var created: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var editableInGaUi: js.UndefOr[scala.Boolean] = js.undefined
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  var equalWeighting: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var internalWebPropertyId: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var minimumExperimentLengthInDays: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var objectiveMetric: js.UndefOr[java.lang.String] = js.undefined
  var optimizationType: js.UndefOr[java.lang.String] = js.undefined
  var parentLink: js.UndefOr[ExperimentParentLink] = js.undefined
  var profileId: js.UndefOr[java.lang.String] = js.undefined
  var reasonExperimentEnded: js.UndefOr[java.lang.String] = js.undefined
  var rewriteVariationUrlsAsOriginal: js.UndefOr[scala.Boolean] = js.undefined
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  var servingFramework: js.UndefOr[java.lang.String] = js.undefined
  var snippet: js.UndefOr[java.lang.String] = js.undefined
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var trafficCoverage: js.UndefOr[scala.Double] = js.undefined
  var updated: js.UndefOr[java.lang.String] = js.undefined
  var variations: js.UndefOr[js.Array[ExperimentVariations]] = js.undefined
  var webPropertyId: js.UndefOr[java.lang.String] = js.undefined
  var winnerConfidenceLevel: js.UndefOr[scala.Double] = js.undefined
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
    parentLink: ExperimentParentLink = null,
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
    variations: js.Array[ExperimentVariations] = null,
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

