package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClientAnalytics.anon.Href
import typings.gapiClientAnalytics.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Experiment extends js.Object {
  /** Account ID to which this experiment belongs. This field is read-only. */
  var accountId: js.UndefOr[String] = js.native
  /** Time the experiment was created. This field is read-only. */
  var created: js.UndefOr[String] = js.native
  /** Notes about this experiment. */
  var description: js.UndefOr[String] = js.native
  /** If true, the end user will be able to edit the experiment via the Google Analytics user interface. */
  var editableInGaUi: js.UndefOr[Boolean] = js.native
  /**
    * The ending time of the experiment (the time the status changed from RUNNING to ENDED). This field is present only if the experiment has ended. This
    * field is read-only.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Boolean specifying whether to distribute traffic evenly across all variations. If the value is False, content experiments follows the default behavior
    * of adjusting traffic dynamically based on variation performance. Optional -- defaults to False. This field may not be changed for an experiment whose
    * status is ENDED.
    */
  var equalWeighting: js.UndefOr[Boolean] = js.native
  /** Experiment ID. Required for patch and update. Disallowed for create. */
  var id: js.UndefOr[String] = js.native
  /** Internal ID for the web property to which this experiment belongs. This field is read-only. */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  /** Resource type for an Analytics experiment. This field is read-only. */
  var kind: js.UndefOr[String] = js.native
  /**
    * An integer number in [3, 90]. Specifies the minimum length of the experiment. Can be changed for a running experiment. This field may not be changed
    * for an experiments whose status is ENDED.
    */
  var minimumExperimentLengthInDays: js.UndefOr[Double] = js.native
  /** Experiment name. This field may not be changed for an experiment whose status is ENDED. This field is required when creating an experiment. */
  var name: js.UndefOr[String] = js.native
  /**
    * The metric that the experiment is optimizing. Valid values: "ga:goal(n)Completions", "ga:adsenseAdsClicks", "ga:adsenseAdsViewed", "ga:adsenseRevenue",
    * "ga:bounces", "ga:pageviews", "ga:sessionDuration", "ga:transactions", "ga:transactionRevenue". This field is required if status is "RUNNING" and
    * servingFramework is one of "REDIRECT" or "API".
    */
  var objectiveMetric: js.UndefOr[String] = js.native
  /**
    * Whether the objectiveMetric should be minimized or maximized. Possible values: "MAXIMUM", "MINIMUM". Optional--defaults to "MAXIMUM". Cannot be
    * specified without objectiveMetric. Cannot be modified when status is "RUNNING" or "ENDED".
    */
  var optimizationType: js.UndefOr[String] = js.native
  /** Parent link for an experiment. Points to the view (profile) to which this experiment belongs. */
  var parentLink: js.UndefOr[Href] = js.native
  /** View (Profile) ID to which this experiment belongs. This field is read-only. */
  var profileId: js.UndefOr[String] = js.native
  /**
    * Why the experiment ended. Possible values: "STOPPED_BY_USER", "WINNER_FOUND", "EXPERIMENT_EXPIRED", "ENDED_WITH_NO_WINNER", "GOAL_OBJECTIVE_CHANGED".
    * "ENDED_WITH_NO_WINNER" means that the experiment didn't expire but no winner was projected to be found. If the experiment status is changed via the API
    * to ENDED this field is set to STOPPED_BY_USER. This field is read-only.
    */
  var reasonExperimentEnded: js.UndefOr[String] = js.native
  /**
    * Boolean specifying whether variations URLS are rewritten to match those of the original. This field may not be changed for an experiments whose status
    * is ENDED.
    */
  var rewriteVariationUrlsAsOriginal: js.UndefOr[Boolean] = js.native
  /** Link for this experiment. This field is read-only. */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The framework used to serve the experiment variations and evaluate the results. One of:
    * - REDIRECT: Google Analytics redirects traffic to different variation pages, reports the chosen variation and evaluates the results.
    * - API: Google Analytics chooses and reports the variation to serve and evaluates the results; the caller is responsible for serving the selected
    * variation.
    * - EXTERNAL: The variations will be served externally and the chosen variation reported to Google Analytics. The caller is responsible for serving the
    * selected variation and evaluating the results.
    */
  var servingFramework: js.UndefOr[String] = js.native
  /** The snippet of code to include on the control page(s). This field is read-only. */
  var snippet: js.UndefOr[String] = js.native
  /**
    * The starting time of the experiment (the time the status changed from READY_TO_RUN to RUNNING). This field is present only if the experiment has
    * started. This field is read-only.
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Experiment status. Possible values: "DRAFT", "READY_TO_RUN", "RUNNING", "ENDED". Experiments can be created in the "DRAFT", "READY_TO_RUN" or "RUNNING"
    * state. This field is required when creating an experiment.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * A floating-point number in (0, 1]. Specifies the fraction of the traffic that participates in the experiment. Can be changed for a running experiment.
    * This field may not be changed for an experiments whose status is ENDED.
    */
  var trafficCoverage: js.UndefOr[Double] = js.native
  /** Time the experiment was last modified. This field is read-only. */
  var updated: js.UndefOr[String] = js.native
  /**
    * Array of variations. The first variation in the array is the original. The number of variations may not change once an experiment is in the RUNNING
    * state. At least two variations are required before status can be set to RUNNING.
    */
  var variations: js.UndefOr[js.Array[Name]] = js.native
  /** Web property ID to which this experiment belongs. The web property ID is of the form UA-XXXXX-YY. This field is read-only. */
  var webPropertyId: js.UndefOr[String] = js.native
  /**
    * A floating-point number in (0, 1). Specifies the necessary confidence level to choose a winner. This field may not be changed for an experiments whose
    * status is ENDED.
    */
  var winnerConfidenceLevel: js.UndefOr[Double] = js.native
  /** Boolean specifying whether a winner has been found for this experiment. This field is read-only. */
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
    def setParentLink(value: Href): Self = this.set("parentLink", value.asInstanceOf[js.Any])
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
    def setVariationsVarargs(value: Name*): Self = this.set("variations", js.Array(value :_*))
    @scala.inline
    def setVariations(value: js.Array[Name]): Self = this.set("variations", value.asInstanceOf[js.Any])
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

