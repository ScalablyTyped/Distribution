package typings.googleapis.booksV1Mod.booksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDownloadAccesses extends js.Object {
  /**
    * A list of download access responses.
    */
  var downloadAccessList: js.UndefOr[js.Array[SchemaDownloadAccessRestriction]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaDownloadAccesses {
  @scala.inline
  def apply(downloadAccessList: js.Array[SchemaDownloadAccessRestriction] = null, kind: String = null): SchemaDownloadAccesses = {
    val __obj = js.Dynamic.literal()
    if (downloadAccessList != null) __obj.updateDynamic("downloadAccessList")(downloadAccessList.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDownloadAccesses]
  }
}

