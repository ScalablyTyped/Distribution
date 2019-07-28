package typings.gapiDotClientDotBigquery.gapiNs.clientNs

import typings.gapiDotClientDotBigquery.gapiDotClientDotBigqueryStrings.bigquery
import typings.gapiDotClientDotBigquery.gapiDotClientDotBigqueryStrings.v2
import typings.gapiDotClientDotBigquery.gapiNs.clientNs.bigqueryNs.DatasetsResource
import typings.gapiDotClientDotBigquery.gapiNs.clientNs.bigqueryNs.JobsResource
import typings.gapiDotClientDotBigquery.gapiNs.clientNs.bigqueryNs.ProjectsResource
import typings.gapiDotClientDotBigquery.gapiNs.clientNs.bigqueryNs.TabledataResource
import typings.gapiDotClientDotBigquery.gapiNs.clientNs.bigqueryNs.TablesResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val datasets: DatasetsResource = js.native
  val jobs: JobsResource = js.native
  val projects: ProjectsResource = js.native
  val tabledata: TabledataResource = js.native
  val tables: TablesResource = js.native
  /** Load BigQuery API v2 */
  def load(name: bigquery, version: v2): js.Thenable[Unit] = js.native
  def load(name: bigquery, version: v2, callback: js.Function0[_]): Unit = js.native
}

