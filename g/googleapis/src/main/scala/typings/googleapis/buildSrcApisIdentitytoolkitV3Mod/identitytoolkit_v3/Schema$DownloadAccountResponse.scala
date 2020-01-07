package typings.googleapis.buildSrcApisIdentitytoolkitV3Mod.identitytoolkit_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of downloading accounts in batch.
  */
@js.native
trait Schema$DownloadAccountResponse extends js.Object {
  /**
    * The fixed string &quot;identitytoolkit#DownloadAccountResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The next page token. To be used in a subsequent request to return the
    * next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The user accounts data.
    */
  var users: js.UndefOr[js.Array[Schema$UserInfo]] = js.native
}

object Schema$DownloadAccountResponse {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, users: js.Array[Schema$UserInfo] = null): Schema$DownloadAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (users != null) __obj.updateDynamic("users")(users.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DownloadAccountResponse]
  }
}

