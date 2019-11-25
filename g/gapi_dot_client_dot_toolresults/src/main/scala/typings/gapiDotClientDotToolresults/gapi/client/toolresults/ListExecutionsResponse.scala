package typings.gapiDotClientDotToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListExecutionsResponse extends js.Object {
  /**
    * Executions.
    *
    * Always set.
    */
  var executions: js.UndefOr[js.Array[Execution]] = js.undefined
  /**
    * A continuation token to resume the query at the next item.
    *
    * Will only be set if there are more Executions to fetch.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListExecutionsResponse {
  @scala.inline
  def apply(executions: js.Array[Execution] = null, nextPageToken: String = null): ListExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    if (executions != null) __obj.updateDynamic("executions")(executions.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListExecutionsResponse]
  }
}

