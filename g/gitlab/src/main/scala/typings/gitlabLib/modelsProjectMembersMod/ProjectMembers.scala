package typings
package gitlabLib.modelsProjectMembersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/Models/ProjectMembers", "ProjectMembers")
@js.native
class ProjectMembers ()
  extends gitlabLib.basemodelMod.BaseModel {
  def add(projectId: gitlabLib.basemodelMod.TId, userId: scala.Double, accessLevel: scala.Double): js.Any = js.native
  def add(
    projectId: gitlabLib.basemodelMod.TId,
    userId: scala.Double,
    accessLevel: scala.Double,
    fn: js.Function
  ): js.Any = js.native
  def list(projectId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def list(projectId: gitlabLib.basemodelMod.TId, fn: MenbersCb): js.Any = js.native
  def remove(projectId: gitlabLib.basemodelMod.TId, userId: scala.Double): js.Any = js.native
  def remove(projectId: gitlabLib.basemodelMod.TId, userId: scala.Double, fn: js.Function): js.Any = js.native
  def show(projectId: gitlabLib.basemodelMod.TId, userId: scala.Double): js.Any = js.native
  def show(projectId: gitlabLib.basemodelMod.TId, userId: scala.Double, fn: MenberCb): js.Any = js.native
  def update(projectId: gitlabLib.basemodelMod.TId, userId: scala.Double, accessLevel: scala.Double): js.Any = js.native
  def update(
    projectId: gitlabLib.basemodelMod.TId,
    userId: scala.Double,
    accessLevel: scala.Double,
    fn: js.Function
  ): js.Any = js.native
}

