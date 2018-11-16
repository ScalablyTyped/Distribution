package typings
package gitlabLib.modelsProjectDeployKeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/Models/ProjectDeployKeys", "ProjectKeys")
@js.native
class ProjectKeys ()
  extends gitlabLib.basemodelMod.BaseModel {
  def addKey(projectId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def addKey(projectId: gitlabLib.basemodelMod.TId, params: js.Object): js.Any = js.native
  def addKey(projectId: gitlabLib.basemodelMod.TId, params: js.Object, fn: js.Function): js.Any = js.native
  def getKey(projectId: gitlabLib.basemodelMod.TId, keyId: scala.Double): js.Any = js.native
  def getKey(projectId: gitlabLib.basemodelMod.TId, keyId: scala.Double, fn: js.Function): js.Any = js.native
  def listKeys(projectId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def listKeys(projectId: gitlabLib.basemodelMod.TId, fn: js.Function): js.Any = js.native
}

