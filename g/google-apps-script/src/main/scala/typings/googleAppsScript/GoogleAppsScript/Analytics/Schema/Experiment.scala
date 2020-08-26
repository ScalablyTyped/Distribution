package typings.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Experiment extends js.Object {
  var accountId: js.UndefOr[String] = js.native
  var created: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var editableInGaUi: js.UndefOr[Boolean] = js.native
  var endTime: js.UndefOr[String] = js.native
  var equalWeighting: js.UndefOr[Boolean] = js.native
  var id: js.UndefOr[String] = js.native
  var internalWebPropertyId: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var minimumExperimentLengthInDays: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var objectiveMetric: js.UndefOr[String] = js.native
  var optimizationType: js.UndefOr[String] = js.native
  var parentLink: js.UndefOr[ExperimentParentLink] = js.native
  var profileId: js.UndefOr[String] = js.native
  var reasonExperimentEnded: js.UndefOr[String] = js.native
  var rewriteVariationUrlsAsOriginal: js.UndefOr[Boolean] = js.native
  var selfLink: js.UndefOr[String] = js.native
  var servingFramework: js.UndefOr[String] = js.native
  var snippet: js.UndefOr[String] = js.native
  var startTime: js.UndefOr[String] = js.native
  var status: js.UndefOr[String] = js.native
  var trafficCoverage: js.UndefOr[Double] = js.native
  var updated: js.UndefOr[String] = js.native
  var variations: js.UndefOr[js.Array[ExperimentVariations]] = js.native
  var webPropertyId: js.UndefOr[String] = js.native
  var winnerConfidenceLevel: js.UndefOr[Double] = js.native
  var winnerFound: js.UndefOr[Boolean] = js.native
}

object Experiment {
  @scala.inline
  def apply(): Experiment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Experiment]
  }
  @scala.inline
  implicit class ExperimentOps[Self <: Experiment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEditableInGaUi(value: Boolean): Self = this.set("editableInGaUi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditableInGaUi: Self = this.set("editableInGaUi", js.undefined)
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setEqualWeighting(value: Boolean): Self = this.set("equalWeighting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEqualWeighting: Self = this.set("equalWeighting", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInternalWebPropertyId(value: String): Self = this.set("internalWebPropertyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternalWebPropertyId: Self = this.set("internalWebPropertyId", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMinimumExperimentLengthInDays(value: Double): Self = this.set("minimumExperimentLengthInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumExperimentLengthInDays: Self = this.set("minimumExperimentLengthInDays", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setObjectiveMetric(value: String): Self = this.set("objectiveMetric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectiveMetric: Self = this.set("objectiveMetric", js.undefined)
    @scala.inline
    def setOptimizationType(value: String): Self = this.set("optimizationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptimizationType: Self = this.set("optimizationType", js.undefined)
    @scala.inline
    def setParentLink(value: ExperimentParentLink): Self = this.set("parentLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentLink: Self = this.set("parentLink", js.undefined)
    @scala.inline
    def setProfileId(value: String): Self = this.set("profileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileId: Self = this.set("profileId", js.undefined)
    @scala.inline
    def setReasonExperimentEnded(value: String): Self = this.set("reasonExperimentEnded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReasonExperimentEnded: Self = this.set("reasonExperimentEnded", js.undefined)
    @scala.inline
    def setRewriteVariationUrlsAsOriginal(value: Boolean): Self = this.set("rewriteVariationUrlsAsOriginal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRewriteVariationUrlsAsOriginal: Self = this.set("rewriteVariationUrlsAsOriginal", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setServingFramework(value: String): Self = this.set("servingFramework", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServingFramework: Self = this.set("servingFramework", js.undefined)
    @scala.inline
    def setSnippet(value: String): Self = this.set("snippet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnippet: Self = this.set("snippet", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTrafficCoverage(value: Double): Self = this.set("trafficCoverage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrafficCoverage: Self = this.set("trafficCoverage", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    @scala.inline
    def setVariationsVarargs(value: ExperimentVariations*): Self = this.set("variations", js.Array(value :_*))
    @scala.inline
    def setVariations(value: js.Array[ExperimentVariations]): Self = this.set("variations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariations: Self = this.set("variations", js.undefined)
    @scala.inline
    def setWebPropertyId(value: String): Self = this.set("webPropertyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebPropertyId: Self = this.set("webPropertyId", js.undefined)
    @scala.inline
    def setWinnerConfidenceLevel(value: Double): Self = this.set("winnerConfidenceLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWinnerConfidenceLevel: Self = this.set("winnerConfidenceLevel", js.undefined)
    @scala.inline
    def setWinnerFound(value: Boolean): Self = this.set("winnerFound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWinnerFound: Self = this.set("winnerFound", js.undefined)
  }
  
}

