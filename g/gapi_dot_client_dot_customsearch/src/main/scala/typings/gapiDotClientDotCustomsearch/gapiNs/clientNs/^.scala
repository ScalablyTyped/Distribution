package typings.gapiDotClientDotCustomsearch.gapiNs.clientNs

import typings.gapiDotClientDotCustomsearch.gapiDotClientDotCustomsearchStrings.customsearch
import typings.gapiDotClientDotCustomsearch.gapiDotClientDotCustomsearchStrings.v1
import typings.gapiDotClientDotCustomsearch.gapiNs.clientNs.customsearchNs.CseResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val cse: CseResource = js.native
  /** Load CustomSearch API v1 */
  def load(name: customsearch, version: v1): js.Thenable[Unit] = js.native
  def load(name: customsearch, version: v1, callback: js.Function0[_]): Unit = js.native
}

