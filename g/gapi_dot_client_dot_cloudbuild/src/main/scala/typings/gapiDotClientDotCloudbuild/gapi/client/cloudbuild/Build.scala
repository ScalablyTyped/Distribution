package typings.gapiDotClientDotCloudbuild.gapi.client.cloudbuild

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Build extends js.Object {
  /**
    * The ID of the BuildTrigger that triggered this build, if it was
    * triggered automatically.
    * @OutputOnly
    */
  var buildTriggerId: js.UndefOr[String] = js.undefined
  /**
    * Time at which the request to create the build was received.
    * @OutputOnly
    */
  var createTime: js.UndefOr[String] = js.undefined
  /**
    * Time at which execution of the build was finished.
    *
    * The difference between finish_time and start_time is the duration of the
    * build's execution.
    * @OutputOnly
    */
  var finishTime: js.UndefOr[String] = js.undefined
  /**
    * Unique identifier of the build.
    * @OutputOnly
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * A list of images to be pushed upon the successful completion of all build
    * steps.
    *
    * The images will be pushed using the builder service account's credentials.
    *
    * The digests of the pushed images will be stored in the Build resource's
    * results field.
    *
    * If any of the images fail to be pushed, the build is marked FAILURE.
    */
  var images: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * URL to logs for this build in Google Cloud Logging.
    * @OutputOnly
    */
  var logUrl: js.UndefOr[String] = js.undefined
  /**
    * Google Cloud Storage bucket where logs should be written (see
    * [Bucket Name
    * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
    * Logs file names will be of the format `${logs_bucket}/log-${build_id}.txt`.
    */
  var logsBucket: js.UndefOr[String] = js.undefined
  /** Special options for this build. */
  var options: js.UndefOr[BuildOptions] = js.undefined
  /**
    * ID of the project.
    * @OutputOnly.
    */
  var projectId: js.UndefOr[String] = js.undefined
  /**
    * Results of the build.
    * @OutputOnly
    */
  var results: js.UndefOr[Results] = js.undefined
  /** Secrets to decrypt using Cloud KMS. */
  var secrets: js.UndefOr[js.Array[Secret]] = js.undefined
  /** Describes where to find the source files to build. */
  var source: js.UndefOr[Source] = js.undefined
  /**
    * A permanent fixed identifier for source.
    * @OutputOnly
    */
  var sourceProvenance: js.UndefOr[SourceProvenance] = js.undefined
  /**
    * Time at which execution of the build was started.
    * @OutputOnly
    */
  var startTime: js.UndefOr[String] = js.undefined
  /**
    * Status of the build.
    * @OutputOnly
    */
  var status: js.UndefOr[String] = js.undefined
  /**
    * Customer-readable message about the current status.
    * @OutputOnly
    */
  var statusDetail: js.UndefOr[String] = js.undefined
  /** Describes the operations to be performed on the workspace. */
  var steps: js.UndefOr[js.Array[BuildStep]] = js.undefined
  /** Substitutions data for Build resource. */
  var substitutions: js.UndefOr[Record[String, String]] = js.undefined
  /** Tags for annotation of a Build. These are not docker tags. */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Amount of time that this build should be allowed to run, to second
    * granularity. If this amount of time elapses, work on the build will cease
    * and the build status will be TIMEOUT.
    *
    * Default time is ten minutes.
    */
  var timeout: js.UndefOr[String] = js.undefined
}

object Build {
  @scala.inline
  def apply(
    buildTriggerId: String = null,
    createTime: String = null,
    finishTime: String = null,
    id: String = null,
    images: js.Array[String] = null,
    logUrl: String = null,
    logsBucket: String = null,
    options: BuildOptions = null,
    projectId: String = null,
    results: Results = null,
    secrets: js.Array[Secret] = null,
    source: Source = null,
    sourceProvenance: SourceProvenance = null,
    startTime: String = null,
    status: String = null,
    statusDetail: String = null,
    steps: js.Array[BuildStep] = null,
    substitutions: Record[String, String] = null,
    tags: js.Array[String] = null,
    timeout: String = null
  ): Build = {
    val __obj = js.Dynamic.literal()
    if (buildTriggerId != null) __obj.updateDynamic("buildTriggerId")(buildTriggerId.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (finishTime != null) __obj.updateDynamic("finishTime")(finishTime.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (images != null) __obj.updateDynamic("images")(images.asInstanceOf[js.Any])
    if (logUrl != null) __obj.updateDynamic("logUrl")(logUrl.asInstanceOf[js.Any])
    if (logsBucket != null) __obj.updateDynamic("logsBucket")(logsBucket.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (projectId != null) __obj.updateDynamic("projectId")(projectId.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    if (secrets != null) __obj.updateDynamic("secrets")(secrets.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceProvenance != null) __obj.updateDynamic("sourceProvenance")(sourceProvenance.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusDetail != null) __obj.updateDynamic("statusDetail")(statusDetail.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    if (substitutions != null) __obj.updateDynamic("substitutions")(substitutions.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Build]
  }
}

