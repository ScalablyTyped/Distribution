package typings.gitlab.deploymentsMod

import typings.gitlab.commitsMod.CommitSchema
import typings.gitlab.pipelinesMod.PipelineSchema
import typings.gitlab.runnersMod.RunnerSchema
import typings.gitlab.usersMod.UserSchema
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deployable extends js.Object {
  var commit: js.UndefOr[CommitSchema] = js.native
  var coverage: js.UndefOr[String] = js.native
  var created_at: js.UndefOr[Date] = js.native
  var finished_at: js.UndefOr[Date] = js.native
  var id: Double = js.native
  var name: String = js.native
  var pipeline: js.UndefOr[PipelineSchema] = js.native
  var ref: String = js.native
  var runner: js.UndefOr[RunnerSchema] = js.native
  var stage: js.UndefOr[String] = js.native
  var started_at: js.UndefOr[Date] = js.native
  var status: js.UndefOr[DeploymentStatus] = js.native
  var tag: Boolean = js.native
  var user: js.UndefOr[UserSchema] = js.native
}

object Deployable {
  @scala.inline
  def apply(id: Double, name: String, ref: String, tag: Boolean): Deployable = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deployable]
  }
  @scala.inline
  implicit class DeployableOps[Self <: Deployable] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: Boolean): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommit(value: CommitSchema): Self = this.set("commit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommit: Self = this.set("commit", js.undefined)
    @scala.inline
    def setCoverage(value: String): Self = this.set("coverage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverage: Self = this.set("coverage", js.undefined)
    @scala.inline
    def setCreated_at(value: Date): Self = this.set("created_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated_at: Self = this.set("created_at", js.undefined)
    @scala.inline
    def setFinished_at(value: Date): Self = this.set("finished_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinished_at: Self = this.set("finished_at", js.undefined)
    @scala.inline
    def setPipeline(value: PipelineSchema): Self = this.set("pipeline", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipeline: Self = this.set("pipeline", js.undefined)
    @scala.inline
    def setRunner(value: RunnerSchema): Self = this.set("runner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunner: Self = this.set("runner", js.undefined)
    @scala.inline
    def setStage(value: String): Self = this.set("stage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStage: Self = this.set("stage", js.undefined)
    @scala.inline
    def setStarted_at(value: Date): Self = this.set("started_at", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStarted_at: Self = this.set("started_at", js.undefined)
    @scala.inline
    def setStatus(value: DeploymentStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setUser(value: UserSchema): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
  
}

