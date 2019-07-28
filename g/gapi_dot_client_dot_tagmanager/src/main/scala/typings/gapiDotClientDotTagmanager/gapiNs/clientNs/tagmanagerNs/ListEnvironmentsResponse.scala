package typings.gapiDotClientDotTagmanager.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEnvironmentsResponse extends js.Object {
  /** All Environments of a GTM Container. */
  var environment: js.UndefOr[js.Array[Environment]] = js.undefined
  /** Continuation token for fetching the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ListEnvironmentsResponse {
  @scala.inline
  def apply(environment: js.Array[Environment] = null, nextPageToken: String = null): ListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ListEnvironmentsResponse]
  }
}

