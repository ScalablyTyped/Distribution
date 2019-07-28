package typings.freshy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("freshy", JSImport.Namespace)
@js.native
object freshyMod extends js.Object {
  def freshy(module: String): js.Any = js.native
  def freshy(module: String, cb: js.Function1[/* module */ js.Any, _]): js.Any = js.native
  def reload(module: String): js.Any = js.native
  def unload(module: String): Boolean = js.native
}

