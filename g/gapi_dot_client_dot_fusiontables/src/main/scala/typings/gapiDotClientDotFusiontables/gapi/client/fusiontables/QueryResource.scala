package typings.gapiDotClientDotFusiontables.gapi.client.fusiontables

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotFusiontables.Anon_AltFieldsHdrs
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
  def sql(request: Anon_AltFieldsHdrs): Request[Sqlresponse]
  /**
    * Executes a SQL statement which can be any of
    * - SELECT
    * - SHOW
    * - DESCRIBE
    */
  def sqlGet(request: Anon_AltFieldsHdrs): Request[Sqlresponse]
}

object QueryResource {
  @scala.inline
  def apply(
    sql: Anon_AltFieldsHdrs => Request[Sqlresponse],
    sqlGet: Anon_AltFieldsHdrs => Request[Sqlresponse]
  ): QueryResource = {
    val __obj = js.Dynamic.literal(sql = js.Any.fromFunction1(sql), sqlGet = js.Any.fromFunction1(sqlGet))
  
    __obj.asInstanceOf[QueryResource]
  }
}

