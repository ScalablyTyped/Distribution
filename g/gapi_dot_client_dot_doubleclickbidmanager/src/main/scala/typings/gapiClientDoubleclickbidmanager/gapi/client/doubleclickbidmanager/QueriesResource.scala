package typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDoubleclickbidmanager.anon.Alt
import typings.gapiClientDoubleclickbidmanager.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueriesResource extends js.Object {
  /** Creates a query. */
  def createquery(request: Alt): Request[Query] = js.native
  /** Deletes a stored query as well as the associated stored reports. */
  def deletequery(request: Fields): Request[Unit] = js.native
  /** Retrieves a stored query. */
  def getquery(request: Fields): Request[Query] = js.native
  /** Retrieves stored queries. */
  def listqueries(request: Alt): Request[ListQueriesResponse] = js.native
  /** Runs a stored query to generate a report. */
  def runquery(request: Fields): Request[Unit] = js.native
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
  @scala.inline
  implicit class QueriesResourceOps[Self <: QueriesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreatequery(value: Alt => Request[Query]): Self = this.set("createquery", js.Any.fromFunction1(value))
    @scala.inline
    def setDeletequery(value: Fields => Request[Unit]): Self = this.set("deletequery", js.Any.fromFunction1(value))
    @scala.inline
    def setGetquery(value: Fields => Request[Query]): Self = this.set("getquery", js.Any.fromFunction1(value))
    @scala.inline
    def setListqueries(value: Alt => Request[ListQueriesResponse]): Self = this.set("listqueries", js.Any.fromFunction1(value))
    @scala.inline
    def setRunquery(value: Fields => Request[Unit]): Self = this.set("runquery", js.Any.fromFunction1(value))
  }
  
}

