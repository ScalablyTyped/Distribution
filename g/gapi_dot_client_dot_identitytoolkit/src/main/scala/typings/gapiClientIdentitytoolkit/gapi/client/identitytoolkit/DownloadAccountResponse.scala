package typings.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadAccountResponse extends js.Object {
  /** The fixed string "identitytoolkit#DownloadAccountResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** The next page token. To be used in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** The user accounts data. */
  var users: js.UndefOr[js.Array[UserInfo]] = js.undefined
}

object DownloadAccountResponse {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, users: js.Array[UserInfo] = null): DownloadAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadAccountResponse]
  }
}

