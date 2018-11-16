package typings
package gitlabLib.modelsProjectMilestonesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/Models/ProjectMilestones", "ProjectMilestones")
@js.native
class ProjectMilestones ()
  extends gitlabLib.basemodelMod.BaseModel {
  def add(
    projectId: gitlabLib.basemodelMod.TId,
    title: java.lang.String,
    description: java.lang.String,
    due_date: js.Any
  ): js.Any = js.native
  def add(
    projectId: gitlabLib.basemodelMod.TId,
    title: java.lang.String,
    description: java.lang.String,
    due_date: js.Any,
    fn: js.Function
  ): js.Any = js.native
  def all(projectId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def all(projectId: gitlabLib.basemodelMod.TId, fn: MilestonesCb): js.Any = js.native
  def list(projectId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def list(projectId: gitlabLib.basemodelMod.TId, fn: MilestonesCb): js.Any = js.native
  def show(projectId: gitlabLib.basemodelMod.TId, milestoneId: scala.Double): js.Any = js.native
  def show(projectId: gitlabLib.basemodelMod.TId, milestoneId: scala.Double, fn: MilestoneCb): js.Any = js.native
  def update(
    projectId: gitlabLib.basemodelMod.TId,
    milestoneId: scala.Double,
    title: java.lang.String,
    description: java.lang.String,
    due_date: js.Any,
    state_event: js.Any
  ): js.Any = js.native
  def update(
    projectId: gitlabLib.basemodelMod.TId,
    milestoneId: scala.Double,
    title: java.lang.String,
    description: java.lang.String,
    due_date: js.Any,
    state_event: js.Any,
    fn: js.Function
  ): js.Any = js.native
}

