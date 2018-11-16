package typings
package gitlabLib.modelsProjectServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/Models/ProjectServices", "ProjectServices")
@js.native
class ProjectServices ()
  extends gitlabLib.basemodelMod.BaseModel {
  def remove(projectId: gitlabLib.basemodelMod.TId, serviceName: java.lang.String): js.Any = js.native
  def remove(projectId: gitlabLib.basemodelMod.TId, serviceName: java.lang.String, fn: ServiceCb): js.Any = js.native
  def show(projectId: gitlabLib.basemodelMod.TId, serviceName: java.lang.String): js.Any = js.native
  def show(projectId: gitlabLib.basemodelMod.TId, serviceName: java.lang.String, fn: ServiceCb): js.Any = js.native
  def update(projectId: gitlabLib.basemodelMod.TId, serviceName: java.lang.String, params: js.Object): js.Any = js.native
  def update(
    projectId: gitlabLib.basemodelMod.TId,
    serviceName: java.lang.String,
    params: js.Object,
    fn: ServiceCb
  ): js.Any = js.native
}

