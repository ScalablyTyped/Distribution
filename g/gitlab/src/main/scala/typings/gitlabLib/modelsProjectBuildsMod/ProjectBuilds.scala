package typings
package gitlabLib.modelsProjectBuildsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/Models/ProjectBuilds", "ProjectBuilds")
@js.native
class ProjectBuilds ()
  extends gitlabLib.basemodelMod.BaseModel {
  def listBuilds(projectId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def listBuilds(projectId: gitlabLib.basemodelMod.TId, fn: js.Function): js.Any = js.native
  def listBuilds(projectId: gitlabLib.basemodelMod.TId, params: gitlabLib.basemodelMod.DefParams): js.Any = js.native
  def listBuilds(projectId: gitlabLib.basemodelMod.TId, params: gitlabLib.basemodelMod.DefParams, fn: js.Function): js.Any = js.native
  def showBuild(projectId: gitlabLib.basemodelMod.TId, buildId: java.lang.String): js.Any = js.native
  def showBuild(projectId: gitlabLib.basemodelMod.TId, buildId: java.lang.String, fn: js.Function): js.Any = js.native
  def triggerBuild(): js.Any = js.native
  def triggerBuild(params: IShowBuildParam): js.Any = js.native
  def triggerBuild(params: IShowBuildParam, fn: js.Function): js.Any = js.native
}

