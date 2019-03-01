package typings
package gapiDotClientDotDoubleclickbidmanagerLib.gapiNs.clientNs.doubleclickbidmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueriesResource extends js.Object {
  /** Creates a query. */
  def createquery(request: gapiDotClientDotDoubleclickbidmanagerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Query]
  /** Deletes a stored query as well as the associated stored reports. */
  def deletequery(request: gapiDotClientDotDoubleclickbidmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves a stored query. */
  def getquery(request: gapiDotClientDotDoubleclickbidmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Query]
  /** Retrieves stored queries. */
  def listqueries(request: gapiDotClientDotDoubleclickbidmanagerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ListQueriesResponse]
  /** Runs a stored query to generate a report. */
  def runquery(request: gapiDotClientDotDoubleclickbidmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
}

object QueriesResource {
  @scala.inline
  def apply(
    createquery: js.Function1[
      gapiDotClientDotDoubleclickbidmanagerLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[Query]
    ],
    deletequery: js.Function1[
      gapiDotClientDotDoubleclickbidmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    getquery: js.Function1[
      gapiDotClientDotDoubleclickbidmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Query]
    ],
    listqueries: js.Function1[
      gapiDotClientDotDoubleclickbidmanagerLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListQueriesResponse]
    ],
    runquery: js.Function1[
      gapiDotClientDotDoubleclickbidmanagerLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ]
  ): QueriesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createquery")(createquery)
    __obj.updateDynamic("deletequery")(deletequery)
    __obj.updateDynamic("getquery")(getquery)
    __obj.updateDynamic("listqueries")(listqueries)
    __obj.updateDynamic("runquery")(runquery)
    __obj.asInstanceOf[QueriesResource]
  }
}

