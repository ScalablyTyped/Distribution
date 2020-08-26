package typings.gapiClientCloudbuild.gapi.client.cloudbuild

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Build extends js.Object {
  /**
    * The ID of the BuildTrigger that triggered this build, if it was
    * triggered automatically.
    * @OutputOnly
    */
  var buildTriggerId: js.UndefOr[String] = js.native
  /**
    * Time at which the request to create the build was received.
    * @OutputOnly
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Time at which execution of the build was finished.
    *
    * The difference between finish_time and start_time is the duration of the
    * build's execution.
    * @OutputOnly
    */
  var finishTime: js.UndefOr[String] = js.native
  /**
    * Unique identifier of the build.
    * @OutputOnly
    */
  var id: js.UndefOr[String] = js.native
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
  var images: js.UndefOr[js.Array[String]] = js.native
  /**
    * URL to logs for this build in Google Cloud Logging.
    * @OutputOnly
    */
  var logUrl: js.UndefOr[String] = js.native
  /**
    * Google Cloud Storage bucket where logs should be written (see
    * [Bucket Name
    * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
    * Logs file names will be of the format `${logs_bucket}/log-${build_id}.txt`.
    */
  var logsBucket: js.UndefOr[String] = js.native
  /** Special options for this build. */
  var options: js.UndefOr[BuildOptions] = js.native
  /**
    * ID of the project.
    * @OutputOnly.
    */
  var projectId: js.UndefOr[String] = js.native
  /**
    * Results of the build.
    * @OutputOnly
    */
  var results: js.UndefOr[Results] = js.native
  /** Secrets to decrypt using Cloud KMS. */
  var secrets: js.UndefOr[js.Array[Secret]] = js.native
  /** Describes where to find the source files to build. */
  var source: js.UndefOr[Source] = js.native
  /**
    * A permanent fixed identifier for source.
    * @OutputOnly
    */
  var sourceProvenance: js.UndefOr[SourceProvenance] = js.native
  /**
    * Time at which execution of the build was started.
    * @OutputOnly
    */
  var startTime: js.UndefOr[String] = js.native
  /**
    * Status of the build.
    * @OutputOnly
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Customer-readable message about the current status.
    * @OutputOnly
    */
  var statusDetail: js.UndefOr[String] = js.native
  /** Describes the operations to be performed on the workspace. */
  var steps: js.UndefOr[js.Array[BuildStep]] = js.native
  /** Substitutions data for Build resource. */
  var substitutions: js.UndefOr[Record[String, String]] = js.native
  /** Tags for annotation of a Build. These are not docker tags. */
  var tags: js.UndefOr[js.Array[String]] = js.native
  /**
    * Amount of time that this build should be allowed to run, to second
    * granularity. If this amount of time elapses, work on the build will cease
    * and the build status will be TIMEOUT.
    *
    * Default time is ten minutes.
    */
  var timeout: js.UndefOr[String] = js.native
}

object Build {
  @scala.inline
  def apply(): Build = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Build]
  }
  @scala.inline
  implicit class BuildOps[Self <: Build] (val x: Self) extends AnyVal {
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
    def setBuildTriggerId(value: String): Self = this.set("buildTriggerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuildTriggerId: Self = this.set("buildTriggerId", js.undefined)
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setFinishTime(value: String): Self = this.set("finishTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinishTime: Self = this.set("finishTime", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setImagesVarargs(value: String*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[String]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
    @scala.inline
    def setLogUrl(value: String): Self = this.set("logUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogUrl: Self = this.set("logUrl", js.undefined)
    @scala.inline
    def setLogsBucket(value: String): Self = this.set("logsBucket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogsBucket: Self = this.set("logsBucket", js.undefined)
    @scala.inline
    def setOptions(value: BuildOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setResults(value: Results): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
    @scala.inline
    def setSecretsVarargs(value: Secret*): Self = this.set("secrets", js.Array(value :_*))
    @scala.inline
    def setSecrets(value: js.Array[Secret]): Self = this.set("secrets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecrets: Self = this.set("secrets", js.undefined)
    @scala.inline
    def setSource(value: Source): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setSourceProvenance(value: SourceProvenance): Self = this.set("sourceProvenance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceProvenance: Self = this.set("sourceProvenance", js.undefined)
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusDetail(value: String): Self = this.set("statusDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusDetail: Self = this.set("statusDetail", js.undefined)
    @scala.inline
    def setStepsVarargs(value: BuildStep*): Self = this.set("steps", js.Array(value :_*))
    @scala.inline
    def setSteps(value: js.Array[BuildStep]): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
    @scala.inline
    def setSubstitutions(value: Record[String, String]): Self = this.set("substitutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubstitutions: Self = this.set("substitutions", js.undefined)
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

