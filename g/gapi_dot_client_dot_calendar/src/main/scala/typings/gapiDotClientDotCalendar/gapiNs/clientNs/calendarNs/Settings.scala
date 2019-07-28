package typings.gapiDotClientDotCalendar.gapiNs.clientNs.calendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /** Etag of the collection. */
  var etag: js.UndefOr[String] = js.undefined
  /** List of user settings. */
  var items: js.UndefOr[js.Array[Setting]] = js.undefined
  /** Type of the collection ("calendar#settings"). */
  var kind: js.UndefOr[String] = js.undefined
  /** Token used to access the next page of this result. Omitted if no further results are available, in which case nextSyncToken is provided. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /**
    * Token used at a later point in time to retrieve only the entries that have changed since this result was returned. Omitted if further results are
    * available, in which case nextPageToken is provided.
    */
  var nextSyncToken: js.UndefOr[String] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Setting] = null,
    kind: String = null,
    nextPageToken: String = null,
    nextSyncToken: String = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (nextSyncToken != null) __obj.updateDynamic("nextSyncToken")(nextSyncToken)
    __obj.asInstanceOf[Settings]
  }
}

