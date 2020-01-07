package typings.googleapis.buildSrcApisDoubleclickbidmanagerV1Mod.doubleclickbidmanager_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List queries response.
  */
@js.native
trait Schema$ListQueriesResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;doubleclickbidmanager#listQueriesResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Retrieved queries.
    */
  var queries: js.UndefOr[js.Array[Schema$Query]] = js.native
}

object Schema$ListQueriesResponse {
  @scala.inline
  def apply(kind: String = null, queries: js.Array[Schema$Query] = null): Schema$ListQueriesResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (queries != null) __obj.updateDynamic("queries")(queries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListQueriesResponse]
  }
}

