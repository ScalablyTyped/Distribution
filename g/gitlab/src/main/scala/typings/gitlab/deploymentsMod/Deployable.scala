package typings.gitlab.deploymentsMod

import typings.gitlab.commitsMod.CommitSchema
import typings.gitlab.pipelinesMod.PipelineSchema
import typings.gitlab.runnersMod.RunnerSchema
import typings.gitlab.usersMod.UserSchema
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deployable extends js.Object {
  var commit: js.UndefOr[CommitSchema] = js.undefined
  var coverage: js.UndefOr[String] = js.undefined
  var created_at: js.UndefOr[Date] = js.undefined
  var finished_at: js.UndefOr[Date] = js.undefined
  var id: Double
  var name: String
  var pipeline: js.UndefOr[PipelineSchema] = js.undefined
  var ref: String
  var runner: js.UndefOr[RunnerSchema] = js.undefined
  var stage: js.UndefOr[String] = js.undefined
  var started_at: js.UndefOr[Date] = js.undefined
  var status: js.UndefOr[DeploymentStatus] = js.undefined
  var tag: Boolean
  var user: js.UndefOr[UserSchema] = js.undefined
}

object Deployable {
  @scala.inline
  def apply(
    id: Double,
    name: String,
    ref: String,
    tag: Boolean,
    commit: CommitSchema = null,
    coverage: String = null,
    created_at: Date = null,
    finished_at: Date = null,
    pipeline: PipelineSchema = null,
    runner: RunnerSchema = null,
    stage: String = null,
    started_at: Date = null,
    status: DeploymentStatus = null,
    user: UserSchema = null
  ): Deployable = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    if (commit != null) __obj.updateDynamic("commit")(commit.asInstanceOf[js.Any])
    if (coverage != null) __obj.updateDynamic("coverage")(coverage.asInstanceOf[js.Any])
    if (created_at != null) __obj.updateDynamic("created_at")(created_at.asInstanceOf[js.Any])
    if (finished_at != null) __obj.updateDynamic("finished_at")(finished_at.asInstanceOf[js.Any])
    if (pipeline != null) __obj.updateDynamic("pipeline")(pipeline.asInstanceOf[js.Any])
    if (runner != null) __obj.updateDynamic("runner")(runner.asInstanceOf[js.Any])
    if (stage != null) __obj.updateDynamic("stage")(stage.asInstanceOf[js.Any])
    if (started_at != null) __obj.updateDynamic("started_at")(started_at.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deployable]
  }
}

