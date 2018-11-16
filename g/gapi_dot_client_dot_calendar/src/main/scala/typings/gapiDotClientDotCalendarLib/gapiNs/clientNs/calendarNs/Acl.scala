package typings
package gapiDotClientDotCalendarLib.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Acl extends js.Object {
  /** ETag of the collection. */
  var etag: js.UndefOr[java.lang.String] = js.undefined
  /** List of rules on the access control list. */
  var items: js.UndefOr[js.Array[AclRule]] = js.undefined
  /** Type of the collection ("calendar#acl"). */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Token used to access the next page of this result. Omitted if no further results are available, in which case nextSyncToken is provided. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Token used at a later point in time to retrieve only the entries that have changed since this result was returned. Omitted if further results are
               * available, in which case nextPageToken is provided.
               */
  var nextSyncToken: js.UndefOr[java.lang.String] = js.undefined
}

