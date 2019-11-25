package typings.gapiDotClientDotBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestAccess extends js.Object {
  /** A concurrent access response. */
  var concurrentAccess: js.UndefOr[ConcurrentAccessRestriction] = js.undefined
  /** A download access response. */
  var downloadAccess: js.UndefOr[DownloadAccessRestriction] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
}

object RequestAccess {
  @scala.inline
  def apply(
    concurrentAccess: ConcurrentAccessRestriction = null,
    downloadAccess: DownloadAccessRestriction = null,
    kind: String = null
  ): RequestAccess = {
    val __obj = js.Dynamic.literal()
    if (concurrentAccess != null) __obj.updateDynamic("concurrentAccess")(concurrentAccess.asInstanceOf[js.Any])
    if (downloadAccess != null) __obj.updateDynamic("downloadAccess")(downloadAccess.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestAccess]
  }
}

