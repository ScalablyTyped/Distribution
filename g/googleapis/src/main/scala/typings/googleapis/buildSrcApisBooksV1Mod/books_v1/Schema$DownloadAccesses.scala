package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DownloadAccesses extends js.Object {
  /**
    * A list of download access responses.
    */
  var downloadAccessList: js.UndefOr[js.Array[Schema$DownloadAccessRestriction]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$DownloadAccesses {
  @scala.inline
  def apply(downloadAccessList: js.Array[Schema$DownloadAccessRestriction] = null, kind: String = null): Schema$DownloadAccesses = {
    val __obj = js.Dynamic.literal()
    if (downloadAccessList != null) __obj.updateDynamic("downloadAccessList")(downloadAccessList.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DownloadAccesses]
  }
}

