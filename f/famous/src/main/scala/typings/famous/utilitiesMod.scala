package typings.famous

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("famous/utilities", JSImport.Namespace)
@js.native
object utilitiesMod extends js.Object {
  @js.native
  class CallbackStore () extends js.Object {
    def on(event: String, callback: js.Function1[/* payload */ js.Any, Unit]): Unit = js.native
    def trigger(event: String, payload: js.Any): Unit = js.native
  }
  
}

