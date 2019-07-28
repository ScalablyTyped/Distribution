package typings.famous.utilitiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/utilities", "CallbackStore")
@js.native
class CallbackStore () extends js.Object {
  def on(event: String, callback: js.Function1[/* payload */ js.Any, Unit]): Unit = js.native
  def trigger(event: String, payload: js.Any): Unit = js.native
}

