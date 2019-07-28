package typings.gapiDotClientDotDoubleclicksearch.gapiNs.clientNs

import typings.gapiDotClientDotDoubleclicksearch.gapiDotClientDotDoubleclicksearchStrings.doubleclicksearch
import typings.gapiDotClientDotDoubleclicksearch.gapiDotClientDotDoubleclicksearchStrings.v2
import typings.gapiDotClientDotDoubleclicksearch.gapiNs.clientNs.doubleclicksearchNs.ConversionResource
import typings.gapiDotClientDotDoubleclicksearch.gapiNs.clientNs.doubleclicksearchNs.ReportsResource
import typings.gapiDotClientDotDoubleclicksearch.gapiNs.clientNs.doubleclicksearchNs.SavedColumnsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val conversion: ConversionResource = js.native
  val reports: ReportsResource = js.native
  val savedColumns: SavedColumnsResource = js.native
  /** Load DoubleClick Search API v2 */
  def load(name: doubleclicksearch, version: v2): js.Thenable[Unit] = js.native
  def load(name: doubleclicksearch, version: v2, callback: js.Function0[_]): Unit = js.native
}

