package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UsersListResponse extends js.Object {
  /** List of user resources in the instance. */
  var items: js.UndefOr[js.Array[User]] = js.undefined
  /** This is always sql#usersList. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
               * An identifier that uniquely identifies the operation. You can use this identifier to retrieve the Operations resource that has information about the
               * operation.
               */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

