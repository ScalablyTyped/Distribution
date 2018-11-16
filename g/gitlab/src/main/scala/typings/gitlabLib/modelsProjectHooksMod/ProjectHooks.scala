package typings
package gitlabLib.modelsProjectHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/Models/ProjectHooks", "ProjectHooks")
@js.native
class ProjectHooks ()
  extends gitlabLib.basemodelMod.BaseModel {
  def add(projectId: gitlabLib.basemodelMod.TId, params: IAddParam): js.Any = js.native
  def add(projectId: gitlabLib.basemodelMod.TId, params: IAddParam, fn: js.Function): js.Any = js.native
  def add(projectId: gitlabLib.basemodelMod.TId, params: java.lang.String): js.Any = js.native
  def add(projectId: gitlabLib.basemodelMod.TId, params: java.lang.String, fn: js.Function): js.Any = js.native
  def list(projectId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def list(projectId: gitlabLib.basemodelMod.TId, fn: HooksCb): js.Any = js.native
  def remove(projectId: gitlabLib.basemodelMod.TId, hookId: scala.Double): js.Any = js.native
  def remove(projectId: gitlabLib.basemodelMod.TId, hookId: scala.Double, fn: js.Function): js.Any = js.native
  def show(projectId: gitlabLib.basemodelMod.TId, hookId: scala.Double): js.Any = js.native
  def show(projectId: gitlabLib.basemodelMod.TId, hookId: scala.Double, fn: js.Function): js.Any = js.native
  def update(projectId: gitlabLib.basemodelMod.TId, hookId: scala.Double, url: java.lang.String): js.Any = js.native
  def update(
    projectId: gitlabLib.basemodelMod.TId,
    hookId: scala.Double,
    url: java.lang.String,
    fn: js.Function
  ): js.Any = js.native
}

