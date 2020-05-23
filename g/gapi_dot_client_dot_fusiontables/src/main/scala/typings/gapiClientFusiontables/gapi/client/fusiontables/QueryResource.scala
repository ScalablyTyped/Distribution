package typings.gapiClientFusiontables.gapi.client.fusiontables

import typings.gapiClient.gapi.client.Request
import typings.gapiClientFusiontables.anon.Hdrs
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
  def sql(request: Hdrs): Request[Sqlresponse]
  /**
    * Executes a SQL statement which can be any of
    * - SELECT
    * - SHOW
    * - DESCRIBE
    */
  def sqlGet(request: Hdrs): Request[Sqlresponse]
}

object QueryResource {
  @scala.inline
  def apply(sql: Hdrs => Request[Sqlresponse], sqlGet: Hdrs => Request[Sqlresponse]): QueryResource = {
    val __obj = js.Dynamic.literal(sql = js.Any.fromFunction1(sql), sqlGet = js.Any.fromFunction1(sqlGet))
    __obj.asInstanceOf[QueryResource]
  }
}

