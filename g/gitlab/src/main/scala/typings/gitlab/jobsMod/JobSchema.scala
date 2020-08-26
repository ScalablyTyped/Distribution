package typings.gitlab.jobsMod

import typings.gitlab.commitsMod.CommitSchema
import typings.gitlab.pipelinesMod.PipelineSchema
import typings.gitlab.runnersMod.RunnerSchema
import typings.gitlab.usersMod.UserSchema
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobSchema extends js.Object {
  var allow_failure: Boolean = js.native
  var artifacts: js.Array[ArtifactSchema] = js.native
  var artifacts_expire_at: js.UndefOr[Date] = js.native
  var commit: CommitSchema = js.native
  var coverage: js.UndefOr[String] = js.native
  var created_at: Date = js.native
  var duration: js.UndefOr[Double] = js.native
  var finished_at: js.UndefOr[Date] = js.native
  var id: Double = js.native
  var name: String = js.native
  var pipeline: PipelineSchema = js.native
  var ref: String = js.native
  var runner: RunnerSchema = js.native
  var stage: String = js.native
  var started_at: js.UndefOr[Date] = js.native
  var status: String = js.native
  var tag: Boolean = js.native
  var user: UserSchema = js.native
  var web_url: String = js.native
}

object JobSchema {
  @scala.inline
  def apply(
    allow_failure: Boolean,
    artifacts: js.Array[ArtifactSchema],
    commit: CommitSchema,
    created_at: Date,
    id: Double,
    name: String,
    pipeline: PipelineSchema,
    ref: String,
    runner: RunnerSchema,
    stage: String,
    status: String,
    tag: Boolean,
    user: UserSchema,
    web_url: String
  ): JobSchema = {
    val __obj = js.Dynamic.literal(allow_failure = allow_failure.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pipeline = pipeline.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobSchema]
  }
  @scala.inline
  implicit class JobSchemaOps[Self <: JobSchema] (val x: Self) extends AnyVal {
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
    def setAllow_failure(value: Boolean): Self = this.set("allow_failure", value.asInstanceOf[js.Any])
    @scala.inline
    def setArtifactsVarargs(value: ArtifactSchema*): Self = this.set("artifacts", js.Array(value :_*))
    @scala.inline
    def setArtifacts(value: js.Array[ArtifactSchema]): Self = this.set("artifacts", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommit(value: CommitSchema): Self = this.set("commit", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated_at(value: Date): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPipeline(value: PipelineSchema): Self = this.set("pipeline", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setRunner(value: RunnerSchema): Self = this.set("runner", value.asInstanceOf[js.Any])
    @scala.inline
    def setStage(value: String): Self = this.set("stage", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: Boolean): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: UserSchema): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeb_url(value: String): Self = this.set("web_url", value.asInstanceOf[js.Any])
    @scala.inline
    def setArtifacts_expire_at(value: Date): Self = this.set("artifacts_expire_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtifacts_expire_at: Self = this.set("artifacts_expire_at", js.undefined)
    @scala.inline
    def setCoverage(value: String): Self = this.set("coverage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverage: Self = this.set("coverage", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setFinished_at(value: Date): Self = this.set("finished_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinished_at: Self = this.set("finished_at", js.undefined)
    @scala.inline
    def setStarted_at(value: Date): Self = this.set("started_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStarted_at: Self = this.set("started_at", js.undefined)
  }
  
}

