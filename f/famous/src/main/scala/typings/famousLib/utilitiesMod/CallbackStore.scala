package typings
package famousLib.utilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/utilities", "CallbackStore")
@js.native
class CallbackStore () extends js.Object {
  def on(event: java.lang.String, callback: js.Function1[/* payload */ js.Any, scala.Unit]): scala.Unit = js.native
  def trigger(event: java.lang.String, payload: js.Any): scala.Unit = js.native
}

