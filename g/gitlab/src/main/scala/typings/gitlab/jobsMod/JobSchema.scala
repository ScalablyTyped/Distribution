package typings.gitlab.jobsMod

import typings.gitlab.commitsMod.CommitSchema
import typings.gitlab.pipelinesMod.PipelineSchema
import typings.gitlab.runnersMod.RunnerSchema
import typings.gitlab.usersMod.UserSchema
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobSchema extends js.Object {
  var allow_failure: Boolean
  var artifacts: js.Array[ArtifactSchema]
  var artifacts_expire_at: js.UndefOr[Date] = js.undefined
  var commit: CommitSchema
  var coverage: js.UndefOr[String] = js.undefined
  var created_at: Date
  var duration: js.UndefOr[Double] = js.undefined
  var finished_at: js.UndefOr[Date] = js.undefined
  var id: Double
  var name: String
  var pipeline: PipelineSchema
  var ref: String
  var runner: RunnerSchema
  var stage: String
  var started_at: js.UndefOr[Date] = js.undefined
  var status: String
  var tag: Boolean
  var user: UserSchema
  var web_url: String
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
    web_url: String,
    artifacts_expire_at: Date = null,
    coverage: String = null,
    duration: Int | Double = null,
    finished_at: Date = null,
    started_at: Date = null
  ): JobSchema = {
    val __obj = js.Dynamic.literal(allow_failure = allow_failure.asInstanceOf[js.Any], artifacts = artifacts.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pipeline = pipeline.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], runner = runner.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], web_url = web_url.asInstanceOf[js.Any])
    if (artifacts_expire_at != null) __obj.updateDynamic("artifacts_expire_at")(artifacts_expire_at.asInstanceOf[js.Any])
    if (coverage != null) __obj.updateDynamic("coverage")(coverage.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (finished_at != null) __obj.updateDynamic("finished_at")(finished_at.asInstanceOf[js.Any])
    if (started_at != null) __obj.updateDynamic("started_at")(started_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobSchema]
  }
}

