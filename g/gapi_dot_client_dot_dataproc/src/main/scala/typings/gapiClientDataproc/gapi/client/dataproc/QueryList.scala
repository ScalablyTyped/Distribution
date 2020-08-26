package typings.gapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryList extends js.Object {
  /**
    * Required. The queries to execute. You do not need to terminate a query with a semicolon. Multiple queries can be specified in one string by separating
    * each with a semicolon. Here is an example of an Cloud Dataproc API snippet that uses a QueryList to specify a HiveJob:
    * "hiveJob": {
    * "queryList": {
    * "queries": [
    * "query1",
    * "query2",
    * "query3;query4",
    * ]
    * }
    * }
    */
  var queries: js.UndefOr[js.Array[String]] = js.native
}

object QueryList {
  @scala.inline
  def apply(): QueryList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryList]
  }
  @scala.inline
  implicit class QueryListOps[Self <: QueryList] (val x: Self) extends AnyVal {
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
    def setQueriesVarargs(value: String*): Self = this.set("queries", js.Array(value :_*))
    @scala.inline
    def setQueries(value: js.Array[String]): Self = this.set("queries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueries: Self = this.set("queries", js.undefined)
  }
  
}

