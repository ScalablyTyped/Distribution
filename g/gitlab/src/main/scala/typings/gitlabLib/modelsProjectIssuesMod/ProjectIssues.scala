package typings
package gitlabLib.modelsProjectIssuesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/Models/ProjectIssues", "ProjectIssues")
@js.native
class ProjectIssues ()
  extends gitlabLib.basemodelMod.BaseModel {
  val notes: gitlabLib.modelsIssueNotesMod.IssueNotes = js.native
  def list(projectId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def list(projectId: gitlabLib.basemodelMod.TId, fn: js.Function): js.Any = js.native
  def list(projectId: gitlabLib.basemodelMod.TId, params: gitlabLib.basemodelMod.DefParams): js.Any = js.native
  def list(projectId: gitlabLib.basemodelMod.TId, params: gitlabLib.basemodelMod.DefParams, fn: js.Function): js.Any = js.native
}

