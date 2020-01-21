package typings.gapiClientDoubleclickbidmanager.gapi.client.doubleclickbidmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListQueriesResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "doubleclickbidmanager#listQueriesResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Retrieved queries. */
  var queries: js.UndefOr[js.Array[Query]] = js.undefined
}

object ListQueriesResponse {
  @scala.inline
  def apply(kind: String = null, queries: js.Array[Query] = null): ListQueriesResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListQueriesResponse]
  }
}

