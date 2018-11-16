package typings
package gitlabLib.modelsUsersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/Models/Users", "Users")
@js.native
class Users ()
  extends gitlabLib.basemodelMod.BaseModel {
  val keys: gitlabLib.modelsUserKeysMod.UserKeys = js.native
  def all(): js.Any = js.native
  def all(fn: UsersCb): js.Any = js.native
  def all(params: gitlabLib.basemodelMod.DefParams): js.Any = js.native
  def all(params: gitlabLib.basemodelMod.DefParams, fn: UsersCb): js.Any = js.native
  def create(): js.Any = js.native
  def create(params: gitlabLib.basemodelMod.DefParams): js.Any = js.native
  def create(params: gitlabLib.basemodelMod.DefParams, fn: js.Function): js.Any = js.native
  def current(): js.Any = js.native
  def current(fn: js.Function): js.Any = js.native
  def search(emailOrUsername: java.lang.String): js.Any = js.native
  def search(emailOrUsername: java.lang.String, fn: js.Function): js.Any = js.native
  def session(email: java.lang.String, password: java.lang.String): js.Any = js.native
  def session(email: java.lang.String, password: java.lang.String, fn: js.Function): js.Any = js.native
  def show(userId: scala.Double): js.Any = js.native
  def show(userId: scala.Double, fn: UserCb): js.Any = js.native
}

