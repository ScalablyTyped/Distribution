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

