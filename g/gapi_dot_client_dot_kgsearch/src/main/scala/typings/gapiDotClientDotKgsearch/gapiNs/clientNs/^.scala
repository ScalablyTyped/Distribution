package typings.gapiDotClientDotKgsearch.gapiNs.clientNs

import typings.gapiDotClientDotKgsearch.gapiDotClientDotKgsearchStrings.kgsearch
import typings.gapiDotClientDotKgsearch.gapiDotClientDotKgsearchStrings.v1
import typings.gapiDotClientDotKgsearch.gapiNs.clientNs.kgsearchNs.EntitiesResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val entities: EntitiesResource = js.native
  /** Load Knowledge Graph Search API v1 */
  def load(name: kgsearch, version: v1): js.Thenable[Unit] = js.native
  def load(name: kgsearch, version: v1, callback: js.Function0[_]): Unit = js.native
}

