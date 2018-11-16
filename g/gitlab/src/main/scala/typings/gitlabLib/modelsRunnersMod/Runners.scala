package typings
package gitlabLib.modelsRunnersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/Models/Runners", "Runners")
@js.native
class Runners ()
  extends gitlabLib.basemodelMod.BaseModel {
  def all(): js.Any = js.native
  def all(projectId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def all(projectId: gitlabLib.basemodelMod.TId, fn: js.Function): js.Any = js.native
  def all(projectId: gitlabLib.basemodelMod.TId, params: js.Object): js.Any = js.native
  def all(projectId: gitlabLib.basemodelMod.TId, params: js.Object, fn: js.Function): js.Any = js.native
  def disable(projectId: gitlabLib.basemodelMod.TId, runnerId: scala.Double): js.Any = js.native
  def disable(projectId: gitlabLib.basemodelMod.TId, runnerId: scala.Double, fn: js.Function): js.Any = js.native
  def enable(projectId: gitlabLib.basemodelMod.TId, runnerId: scala.Double): js.Any = js.native
  def enable(projectId: gitlabLib.basemodelMod.TId, runnerId: scala.Double, fn: js.Function): js.Any = js.native
  def remove(runnerId: scala.Double, projectId: js.Any, enable: js.Any): js.Any = js.native
  def remove(runnerId: scala.Double, projectId: js.Any, enable: js.Any, fn: js.Function): js.Any = js.native
  def show(runnerId: scala.Double): js.Any = js.native
  def show(runnerId: scala.Double, fn: js.Function): js.Any = js.native
  def update(runnerId: scala.Double, attributes: js.Any): js.Any = js.native
  def update(runnerId: scala.Double, attributes: js.Any, fn: js.Function): js.Any = js.native
}

