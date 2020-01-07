package typings.googleapis.buildSrcApisToolresultsV1beta3Mod.toolresults_v1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ListExecutionsResponse extends js.Object {
  /**
    * Executions.  Always set.
    */
  var executions: js.UndefOr[js.Array[Schema$Execution]] = js.native
  /**
    * A continuation token to resume the query at the next item.  Will only be
    * set if there are more Executions to fetch.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object Schema$ListExecutionsResponse {
  @scala.inline
  def apply(executions: js.Array[Schema$Execution] = null, nextPageToken: String = null): Schema$ListExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    if (executions != null) __obj.updateDynamic("executions")(executions.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListExecutionsResponse]
  }
}

