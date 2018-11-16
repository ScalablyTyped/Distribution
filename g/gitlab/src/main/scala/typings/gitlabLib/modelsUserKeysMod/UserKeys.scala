package typings
package gitlabLib.modelsUserKeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/Models/UserKeys", "UserKeys")
@js.native
class UserKeys ()
  extends gitlabLib.basemodelMod.BaseModel {
  def addKey(userId: java.lang.String, title: java.lang.String, key: js.Any): js.Any = js.native
  def addKey(userId: java.lang.String, title: java.lang.String, key: js.Any, fn: js.Function): js.Any = js.native
  def all(): js.Any = js.native
  def all(userId: gitlabLib.basemodelMod.TId): js.Any = js.native
  def all(userId: gitlabLib.basemodelMod.TId, fn: js.Function): js.Any = js.native
}

