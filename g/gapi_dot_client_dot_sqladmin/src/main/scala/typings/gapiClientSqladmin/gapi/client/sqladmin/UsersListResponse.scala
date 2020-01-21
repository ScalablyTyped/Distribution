package typings.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsersListResponse extends js.Object {
  /** List of user resources in the instance. */
  var items: js.UndefOr[js.Array[User]] = js.undefined
  /** This is always sql#usersList. */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * An identifier that uniquely identifies the operation. You can use this identifier to retrieve the Operations resource that has information about the
    * operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object UsersListResponse {
  @scala.inline
  def apply(items: js.Array[User] = null, kind: String = null, nextPageToken: String = null): UsersListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsersListResponse]
  }
}

