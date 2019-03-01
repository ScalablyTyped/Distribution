package typings
package gapiDotClientDotDataprocLib.gapiNs.clientNs.dataprocNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var queries: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object QueryList {
  @scala.inline
  def apply(queries: js.Array[java.lang.String] = null): QueryList = {
    val __obj = js.Dynamic.literal()
    if (queries != null) __obj.updateDynamic("queries")(queries)
    __obj.asInstanceOf[QueryList]
  }
}

