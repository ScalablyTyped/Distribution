package typings.gapiDotClientDotAdmin.gapiNs.clientNs.adminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activities extends js.Object {
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** Each record in read response. */
  var items: js.UndefOr[js.Array[Activity]] = js.undefined
  /** Kind of list response this is. */
  var kind: js.UndefOr[String] = js.undefined
  /** Token for retrieving the next page */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object Activities {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Activity] = null,
    kind: String = null,
    nextPageToken: String = null
  ): Activities = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[Activities]
  }
}

