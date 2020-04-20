package typings.gapiClientFusiontables.gapi.client.fusiontables

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientFusiontables.AnonHdrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResource extends js.Object {
  /**
    * Executes a Fusion Tables SQL statement, which can be any of
    * - SELECT
    * - INSERT
    * - UPDATE
    * - DELETE
    * - SHOW
    * - DESCRIBE
    * - CREATE statement.
    */
  def sql(request: AnonHdrs): Request_[Sqlresponse]
  /**
    * Executes a SQL statement which can be any of
    * - SELECT
    * - SHOW
    * - DESCRIBE
    */
  def sqlGet(request: AnonHdrs): Request_[Sqlresponse]
}

object QueryResource {
  @scala.inline
  def apply(sql: AnonHdrs => Request_[Sqlresponse], sqlGet: AnonHdrs => Request_[Sqlresponse]): QueryResource = {
    val __obj = js.Dynamic.literal(sql = js.Any.fromFunction1(sql), sqlGet = js.Any.fromFunction1(sqlGet))
    __obj.asInstanceOf[QueryResource]
  }
}

