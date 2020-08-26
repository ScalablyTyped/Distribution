package typings.gapiClientFusiontables.gapi.client.fusiontables

import typings.gapiClient.gapi.client.Request
import typings.gapiClientFusiontables.anon.Hdrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  def sql(request: Hdrs): Request[Sqlresponse] = js.native
  /**
    * Executes a SQL statement which can be any of
    * - SELECT
    * - SHOW
    * - DESCRIBE
    */
  def sqlGet(request: Hdrs): Request[Sqlresponse] = js.native
}

object QueryResource {
  @scala.inline
  def apply(sql: Hdrs => Request[Sqlresponse], sqlGet: Hdrs => Request[Sqlresponse]): QueryResource = {
    val __obj = js.Dynamic.literal(sql = js.Any.fromFunction1(sql), sqlGet = js.Any.fromFunction1(sqlGet))
    __obj.asInstanceOf[QueryResource]
  }
  @scala.inline
  implicit class QueryResourceOps[Self <: QueryResource] (val x: Self) extends AnyVal {
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
    def setSql(value: Hdrs => Request[Sqlresponse]): Self = this.set("sql", js.Any.fromFunction1(value))
    @scala.inline
    def setSqlGet(value: Hdrs => Request[Sqlresponse]): Self = this.set("sqlGet", js.Any.fromFunction1(value))
  }
  
}

