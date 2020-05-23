package typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDoubleclickbidmanager.anon.Alt
import typings.gapiClientDoubleclickbidmanager.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueriesResource extends js.Object {
  /** Creates a query. */
  def createquery(request: Alt): Request[Query]
  /** Deletes a stored query as well as the associated stored reports. */
  def deletequery(request: Fields): Request[Unit]
  /** Retrieves a stored query. */
  def getquery(request: Fields): Request[Query]
  /** Retrieves stored queries. */
  def listqueries(request: Alt): Request[ListQueriesResponse]
  /** Runs a stored query to generate a report. */
  def runquery(request: Fields): Request[Unit]
}

object QueriesResource {
  @scala.inline
  def apply(
    createquery: Alt => Request[Query],
    deletequery: Fields => Request[Unit],
    getquery: Fields => Request[Query],
    listqueries: Alt => Request[ListQueriesResponse],
    runquery: Fields => Request[Unit]
  ): QueriesResource = {
    val __obj = js.Dynamic.literal(createquery = js.Any.fromFunction1(createquery), deletequery = js.Any.fromFunction1(deletequery), getquery = js.Any.fromFunction1(getquery), listqueries = js.Any.fromFunction1(listqueries), runquery = js.Any.fromFunction1(runquery))
    __obj.asInstanceOf[QueriesResource]
  }
}

