package typings
package gapiDotClientDotDoubleclickbidmanagerLib.gapiNs.clientNs.doubleclickbidmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueriesResource extends js.Object {
  /** Creates a query. */
  def createquery(request: gapiDotClientDotDoubleclickbidmanagerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Query]
  /** Deletes a stored query as well as the associated stored reports. */
  def deletequery(request: gapiDotClientDotDoubleclickbidmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves a stored query. */
  def getquery(request: gapiDotClientDotDoubleclickbidmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Query]
  /** Retrieves stored queries. */
  def listqueries(request: gapiDotClientDotDoubleclickbidmanagerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ListQueriesResponse]
  /** Runs a stored query to generate a report. */
  def runquery(request: gapiDotClientDotDoubleclickbidmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

object QueriesResource {
  @scala.inline
  def apply(
    createquery: gapiDotClientDotDoubleclickbidmanagerLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Query],
    deletequery: gapiDotClientDotDoubleclickbidmanagerLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    getquery: gapiDotClientDotDoubleclickbidmanagerLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Query],
    listqueries: gapiDotClientDotDoubleclickbidmanagerLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[ListQueriesResponse],
    runquery: gapiDotClientDotDoubleclickbidmanagerLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  ): QueriesResource = {
    val __obj = js.Dynamic.literal(createquery = js.Any.fromFunction1(createquery), deletequery = js.Any.fromFunction1(deletequery), getquery = js.Any.fromFunction1(getquery), listqueries = js.Any.fromFunction1(listqueries), runquery = js.Any.fromFunction1(runquery))
  
    __obj.asInstanceOf[QueriesResource]
  }
}

