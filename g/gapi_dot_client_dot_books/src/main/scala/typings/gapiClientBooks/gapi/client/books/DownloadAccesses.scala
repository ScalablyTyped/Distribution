package typings.gapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadAccesses extends js.Object {
  /** A list of download access responses. */
  var downloadAccessList: js.UndefOr[js.Array[DownloadAccessRestriction]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[String] = js.undefined
}

object DownloadAccesses {
  @scala.inline
  def apply(downloadAccessList: js.Array[DownloadAccessRestriction] = null, kind: String = null): DownloadAccesses = {
    val __obj = js.Dynamic.literal()
    if (downloadAccessList != null) __obj.updateDynamic("downloadAccessList")(downloadAccessList.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadAccesses]
  }
}

