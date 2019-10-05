package typings.gapi.gapi.client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.load")
@js.native
object load extends js.Object {
  def apply(name: String, version: String): js.Promise[Unit] = js.native
  def apply(name: String, version: String, callback: js.Function0[_]): Unit = js.native
  def apply(name: String, version: String, callback: js.Function0[_], url: String): Unit = js.native
}

