package typings
package gitlabLib.modelsProjectRepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/Models/ProjectRepository", "ProjectRepository")
@js.native
class ProjectRepository ()
  extends gitlabLib.basemodelMod.BaseModel {
  def addTag(params: AddTagParams): js.Any = js.native
  def addTag(params: AddTagParams, fn: js.Function): js.Any = js.native
  def compare(): js.Any = js.native
  def compare(params: js.Object): js.Any = js.native
  def compare(params: js.Object, fn: js.Function): js.Any = js.native
  def createBranch(params: js.Object): js.Any = js.native
  def createBranch(params: js.Object, fn: js.Function): js.Any = js.native
  def createFile(): js.Any = js.native
  def createFile(params: js.Object): js.Any = js.native
  def createFile(params: js.Object, fn: js.Function): js.Any = js.native
  def deleteBranch(projectId: gitlabLib.basemodelMod.TId, branchId: java.lang.String): js.Any = js.native
  def deleteBranch(projectId: gitlabLib.basemodelMod.TId, branchId: java.lang.String, fn: js.Function): js.Any = js.native
  def deleteTag(projectId: gitlabLib.basemodelMod.TId, tagName: java.lang.String): js.Any = js.native
  def deleteTag(projectId: gitlabLib.basemodelMod.TId, tagName: java.lang.String, fn: js.Function): js.Any = js.native
  def diffCommit(projectId: gitlabLib.basemodelMod.TId, sha: java.lang.String): js.Any = js.native
  def diffCommit(projectId: gitlabLib.basemodelMod.TId, sha: java.lang.String, fn: js.Function): js.Any = js.native
  def listBranches(projectId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def listBranches(projectId: gitlabLib.basemodelMod.TId, fn: js.Function): js.Any = js.native
  def listCommits(projectId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def listCommits(projectId: gitlabLib.basemodelMod.TId, fn: js.Function): js.Any = js.native
  def listTags(projectId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def listTags(projectId: gitlabLib.basemodelMod.TId, fn: js.Function): js.Any = js.native
  def listTree(projectId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def listTree(projectId: gitlabLib.basemodelMod.TId, fn: js.Function): js.Any = js.native
  def listTree(projectId: gitlabLib.basemodelMod.TId, params: js.Object): js.Any = js.native
  def listTree(projectId: gitlabLib.basemodelMod.TId, params: js.Object, fn: js.Function): js.Any = js.native
  def protectBranch(projectId: gitlabLib.basemodelMod.TId, branchId: java.lang.String, params: js.Object): js.Any = js.native
  def protectBranch(
    projectId: gitlabLib.basemodelMod.TId,
    branchId: java.lang.String,
    params: js.Object,
    fn: js.Function
  ): js.Any = js.native
  def showBranch(projectId: gitlabLib.basemodelMod.TId, branchId: java.lang.String): js.Any = js.native
  def showBranch(projectId: gitlabLib.basemodelMod.TId, branchId: java.lang.String, fn: js.Function): js.Any = js.native
  def showCommit(projectId: gitlabLib.basemodelMod.TId, sha: java.lang.String): js.Any = js.native
  def showCommit(projectId: gitlabLib.basemodelMod.TId, sha: java.lang.String, fn: js.Function): js.Any = js.native
  def showFile(projectId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def showFile(projectId: gitlabLib.basemodelMod.TId, fn: js.Function): js.Any = js.native
  def showFile(projectId: gitlabLib.basemodelMod.TId, params: ShowFileParams): js.Any = js.native
  def showFile(projectId: gitlabLib.basemodelMod.TId, params: ShowFileParams, fn: js.Function): js.Any = js.native
  def showTag(projectId: gitlabLib.basemodelMod.TId, tagName: java.lang.String): js.Any = js.native
  def showTag(projectId: gitlabLib.basemodelMod.TId, tagName: java.lang.String, fn: js.Function): js.Any = js.native
  def unprotectBranch(projectId: gitlabLib.basemodelMod.TId, branchId: java.lang.String): js.Any = js.native
  def unprotectBranch(projectId: gitlabLib.basemodelMod.TId, branchId: java.lang.String, fn: js.Function): js.Any = js.native
  def updateFile(): js.Any = js.native
  def updateFile(params: js.Object): js.Any = js.native
  def updateFile(params: js.Object, fn: js.Function): js.Any = js.native
}

