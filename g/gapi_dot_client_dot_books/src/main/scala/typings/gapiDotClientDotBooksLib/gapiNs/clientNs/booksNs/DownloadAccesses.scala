package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadAccesses extends js.Object {
  /** A list of download access responses. */
  var downloadAccessList: js.UndefOr[js.Array[DownloadAccessRestriction]] = js.undefined
  /** Resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object DownloadAccesses {
  @scala.inline
  def apply(downloadAccessList: js.Array[DownloadAccessRestriction] = null, kind: java.lang.String = null): DownloadAccesses = {
    val __obj = js.Dynamic.literal()
    if (downloadAccessList != null) __obj.updateDynamic("downloadAccessList")(downloadAccessList)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[DownloadAccesses]
  }
}

