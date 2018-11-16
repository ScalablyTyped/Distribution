package typings
package freshyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("freshy", JSImport.Namespace)
@js.native
object freshyMod extends js.Object {
  def freshy(module: java.lang.String): js.Any = js.native
  def freshy(module: java.lang.String, cb: js.Function1[/* module */ js.Any, _]): js.Any = js.native
  def reload(module: java.lang.String): js.Any = js.native
  def unload(module: java.lang.String): scala.Boolean = js.native
}

