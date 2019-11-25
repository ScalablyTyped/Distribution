package typings.gapiDotClientDotIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentitytoolkitRelyingpartyDownloadAccountRequest extends js.Object {
  /** GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration. */
  var delegatedProjectNumber: js.UndefOr[String] = js.undefined
  /** The max number of results to return in the response. */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** The token for the next page. This should be taken from the previous response. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** Specify which project (field value is actually project id) to operate. Only used when provided credential. */
  var targetProjectId: js.UndefOr[String] = js.undefined
}

object IdentitytoolkitRelyingpartyDownloadAccountRequest {
  @scala.inline
  def apply(
    delegatedProjectNumber: String = null,
    maxResults: Int | Double = null,
    nextPageToken: String = null,
    targetProjectId: String = null
  ): IdentitytoolkitRelyingpartyDownloadAccountRequest = {
    val __obj = js.Dynamic.literal()
    if (delegatedProjectNumber != null) __obj.updateDynamic("delegatedProjectNumber")(delegatedProjectNumber.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (targetProjectId != null) __obj.updateDynamic("targetProjectId")(targetProjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentitytoolkitRelyingpartyDownloadAccountRequest]
  }
}

