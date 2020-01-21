package typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientDoubleclickbidmanager.AnonAlt
import typings.gapiClientDoubleclickbidmanager.AnonAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueriesResource extends js.Object {
  /** Creates a query. */
  def createquery(request: AnonAlt): Request_[Query]
  /** Deletes a stored query as well as the associated stored reports. */
  def deletequery(request: AnonAltFields): Request_[Unit]
  /** Retrieves a stored query. */
  def getquery(request: AnonAltFields): Request_[Query]
  /** Retrieves stored queries. */
  def listqueries(request: AnonAlt): Request_[ListQueriesResponse]
  /** Runs a stored query to generate a report. */
  def runquery(request: AnonAltFields): Request_[Unit]
}

object QueriesResource {
  @scala.inline
  def apply(
    createquery: AnonAlt => Request_[Query],
    deletequery: AnonAltFields => Request_[Unit],
    getquery: AnonAltFields => Request_[Query],
    listqueries: AnonAlt => Request_[ListQueriesResponse],
    runquery: AnonAltFields => Request_[Unit]
  ): QueriesResource = {
    val __obj = js.Dynamic.literal(createquery = js.Any.fromFunction1(createquery), deletequery = js.Any.fromFunction1(deletequery), getquery = js.Any.fromFunction1(getquery), listqueries = js.Any.fromFunction1(listqueries), runquery = js.Any.fromFunction1(runquery))
  
    __obj.asInstanceOf[QueriesResource]
  }
}

