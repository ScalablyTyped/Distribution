package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val datasets: gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs.DatasetsResource = js.native
  val jobs: gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs.JobsResource = js.native
  val projects: gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs.ProjectsResource = js.native
  val tabledata: gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs.TabledataResource = js.native
  val tables: gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs.TablesResource = js.native
  /** Load BigQuery API v2 */
  def load(
    name: gapiDotClientDotBigqueryLib.gapiDotClientDotBigqueryLibStrings.bigquery,
    version: gapiDotClientDotBigqueryLib.gapiDotClientDotBigqueryLibStrings.v2
  ): stdLib.PromiseLike[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotBigqueryLib.gapiDotClientDotBigqueryLibStrings.bigquery,
    version: gapiDotClientDotBigqueryLib.gapiDotClientDotBigqueryLibStrings.v2,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

