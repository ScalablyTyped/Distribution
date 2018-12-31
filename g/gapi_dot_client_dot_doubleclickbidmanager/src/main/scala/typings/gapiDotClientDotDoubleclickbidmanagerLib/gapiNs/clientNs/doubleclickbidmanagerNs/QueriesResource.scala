package typings
package gapiDotClientDotDoubleclickbidmanagerLib.gapiNs.clientNs.doubleclickbidmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueriesResource extends js.Object {
  /** Creates a query. */
  def createquery(request: gapiDotClientDotDoubleclickbidmanagerLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Query]
  /** Deletes a stored query as well as the associated stored reports. */
  def deletequery(request: gapiDotClientDotDoubleclickbidmanagerLib.Anon_QueryId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves a stored query. */
  def getquery(request: gapiDotClientDotDoubleclickbidmanagerLib.Anon_QueryId): gapiDotClientLib.gapiNs.clientNs.Request[Query]
  /** Retrieves stored queries. */
  def listqueries(request: gapiDotClientDotDoubleclickbidmanagerLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ListQueriesResponse]
  /** Runs a stored query to generate a report. */
  def runquery(request: gapiDotClientDotDoubleclickbidmanagerLib.Anon_QueryId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

