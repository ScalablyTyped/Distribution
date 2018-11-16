package typings
package gitlabLib.modelsProjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/Models/Projects", "Projects")
@js.native
class Projects ()
  extends gitlabLib.basemodelMod.BaseModel {
  val builds: gitlabLib.modelsProjectBuildsMod.ProjectBuilds = js.native
  val deploy_keys: gitlabLib.modelsProjectDeployKeysMod.ProjectKeys = js.native
  val hooks: gitlabLib.modelsProjectHooksMod.ProjectHooks = js.native
  val issues: gitlabLib.modelsProjectIssuesMod.ProjectIssues = js.native
  val labels: gitlabLib.modelsProjectLabelsMod.ProjectLabels = js.native
  val members: gitlabLib.modelsProjectMembersMod.ProjectMembers = js.native
  val merge_requests: gitlabLib.modelsProjectMergeRequestsMod.ProjectMergeRequests = js.native
  val milestones: gitlabLib.modelsProjectMilestonesMod.ProjectMilestones = js.native
  val pipelines: gitlabLib.modelsPipelinesMod.Pipelines = js.native
  val repository: gitlabLib.modelsProjectRepositoryMod.ProjectRepository = js.native
  val runners: gitlabLib.modelsRunnersMod.Runners = js.native
  val services: gitlabLib.modelsProjectServicesMod.ProjectServices = js.native
  def addMember(): js.Any = js.native
  def addMember(params: js.Object): js.Any = js.native
  def addMember(params: js.Object, fn: js.Function): js.Any = js.native
  def all(): js.Any = js.native
  def all(fn: ProjectsCb): js.Any = js.native
  def all(params: gitlabLib.basemodelMod.DefParams): js.Any = js.native
  def all(params: gitlabLib.basemodelMod.DefParams, fn: ProjectsCb): js.Any = js.native
  def allAdmin(): js.Any = js.native
  def allAdmin(fn: js.Function): js.Any = js.native
  def allAdmin(params: gitlabLib.basemodelMod.DefParams): js.Any = js.native
  def allAdmin(params: gitlabLib.basemodelMod.DefParams, fn: js.Function): js.Any = js.native
  def create(params: js.Object): js.Any = js.native
  def create(params: js.Object, fn: js.Function): js.Any = js.native
  def createTrigger(): js.Any = js.native
  def createTrigger(params: js.Object): js.Any = js.native
  def createTrigger(params: js.Object, fn: js.Function): js.Any = js.native
  def create_for_user(params: js.Object): js.Any = js.native
  def create_for_user(params: js.Object, fn: js.Function): js.Any = js.native
  def edit(projectId: gitlabLib.basemodelMod.TId, params: js.Object): js.Any = js.native
  def edit(projectId: gitlabLib.basemodelMod.TId, params: js.Object, fn: js.Function): js.Any = js.native
  def editMember(): js.Any = js.native
  def editMember(params: js.Object): js.Any = js.native
  def editMember(params: js.Object, fn: js.Function): js.Any = js.native
  def fork(): js.Any = js.native
  def fork(params: js.Object): js.Any = js.native
  def fork(params: js.Object, fn: js.Function): js.Any = js.native
  def listCommits(): js.Any = js.native
  def listCommits(params: js.Object): js.Any = js.native
  def listCommits(params: js.Object, fn: js.Function): js.Any = js.native
  def listMembers(): js.Any = js.native
  def listMembers(params: js.Object): js.Any = js.native
  def listMembers(params: js.Object, fn: js.Function): js.Any = js.native
  def listTags(): js.Any = js.native
  def listTags(params: js.Object): js.Any = js.native
  def listTags(params: js.Object, fn: js.Function): js.Any = js.native
  def listTriggers(projectId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def listTriggers(projectId: gitlabLib.basemodelMod.TId, fn: js.Function): js.Any = js.native
  def remove(projectId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def remove(projectId: gitlabLib.basemodelMod.TId, fn: js.Function): js.Any = js.native
  def removeTrigger(projectId: gitlabLib.basemodelMod.TId, token: java.lang.String): js.Any = js.native
  def removeTrigger(projectId: gitlabLib.basemodelMod.TId, token: java.lang.String, fn: js.Function): js.Any = js.native
  def search(projectName: java.lang.String): js.Any = js.native
  def search(projectName: java.lang.String, fn: js.Function): js.Any = js.native
  def search(projectName: java.lang.String, params: js.Object): js.Any = js.native
  def search(projectName: java.lang.String, params: js.Object, fn: js.Function): js.Any = js.native
  def share(): js.Any = js.native
  def share(params: js.Object): js.Any = js.native
  def share(params: js.Object, fn: js.Function): js.Any = js.native
  def show(projectId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def show(projectId: gitlabLib.basemodelMod.TId, fn: js.Function): js.Any = js.native
  def showTrigger(projectId: gitlabLib.basemodelMod.TId, token: java.lang.String): js.Any = js.native
  def showTrigger(projectId: gitlabLib.basemodelMod.TId, token: java.lang.String, fn: js.Function): js.Any = js.native
}

