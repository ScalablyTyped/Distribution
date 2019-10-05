package typings.gapiDotClientDotDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotDoubleclickbidmanager.Anon_Alt
import typings.gapiDotClientDotDoubleclickbidmanager.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueriesResource extends js.Object {
  /** Creates a query. */
  def createquery(request: Anon_Alt): Request[Query]
  /** Deletes a stored query as well as the associated stored reports. */
  def deletequery(request: Anon_AltFields): Request[Unit]
  /** Retrieves a stored query. */
  def getquery(request: Anon_AltFields): Request[Query]
  /** Retrieves stored queries. */
  def listqueries(request: Anon_Alt): Request[ListQueriesResponse]
  /** Runs a stored query to generate a report. */
  def runquery(request: Anon_AltFields): Request[Unit]
}

object QueriesResource {
  @scala.inline
  def apply(
    createquery: Anon_Alt => Request[Query],
    deletequery: Anon_AltFields => Request[Unit],
    getquery: Anon_AltFields => Request[Query],
    listqueries: Anon_Alt => Request[ListQueriesResponse],
    runquery: Anon_AltFields => Request[Unit]
  ): QueriesResource = {
    val __obj = js.Dynamic.literal(createquery = js.Any.fromFunction1(createquery), deletequery = js.Any.fromFunction1(deletequery), getquery = js.Any.fromFunction1(getquery), listqueries = js.Any.fromFunction1(listqueries), runquery = js.Any.fromFunction1(runquery))
  
    __obj.asInstanceOf[QueriesResource]
  }
}

