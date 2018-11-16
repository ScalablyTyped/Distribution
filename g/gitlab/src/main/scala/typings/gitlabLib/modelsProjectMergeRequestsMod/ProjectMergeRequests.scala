package typings
package gitlabLib.modelsProjectMergeRequestsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/Models/ProjectMergeRequests", "ProjectMergeRequests")
@js.native
class ProjectMergeRequests ()
  extends gitlabLib.basemodelMod.BaseModel {
  def add(
    projectId: gitlabLib.basemodelMod.TId,
    sourceBranch: java.lang.String,
    targetBranch: java.lang.String,
    assigneeId: scala.Double,
    title: java.lang.String
  ): js.Any = js.native
  def add(
    projectId: gitlabLib.basemodelMod.TId,
    sourceBranch: java.lang.String,
    targetBranch: java.lang.String,
    assigneeId: scala.Double,
    title: java.lang.String,
    fn: js.Function
  ): js.Any = js.native
  def comment(projectId: gitlabLib.basemodelMod.TId, mergerequestId: scala.Double, note: js.Any): js.Any = js.native
  def comment(projectId: gitlabLib.basemodelMod.TId, mergerequestId: scala.Double, note: js.Any, fn: js.Function): js.Any = js.native
  def list(projectId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def list(projectId: gitlabLib.basemodelMod.TId, fn: js.Function): js.Any = js.native
  def list(projectId: gitlabLib.basemodelMod.TId, params: gitlabLib.basemodelMod.DefParams): js.Any = js.native
  def list(projectId: gitlabLib.basemodelMod.TId, params: gitlabLib.basemodelMod.DefParams, fn: js.Function): js.Any = js.native
  def merge(projectId: gitlabLib.basemodelMod.TId, mergerequestId: scala.Double, params: js.Object): js.Any = js.native
  def merge(
    projectId: gitlabLib.basemodelMod.TId,
    mergerequestId: scala.Double,
    params: js.Object,
    fn: js.Function
  ): js.Any = js.native
  def show(projectId: gitlabLib.basemodelMod.TId, mergerequestId: scala.Double): js.Any = js.native
  def show(projectId: gitlabLib.basemodelMod.TId, mergerequestId: scala.Double, fn: js.Function): js.Any = js.native
  def update(projectId: gitlabLib.basemodelMod.TId, mergerequestId: scala.Double, params: js.Object): js.Any = js.native
  def update(
    projectId: gitlabLib.basemodelMod.TId,
    mergerequestId: scala.Double,
    params: js.Object,
    fn: js.Function
  ): js.Any = js.native
}

