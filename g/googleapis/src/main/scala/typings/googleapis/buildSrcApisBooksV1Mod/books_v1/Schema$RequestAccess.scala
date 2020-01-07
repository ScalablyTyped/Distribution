package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RequestAccess extends js.Object {
  /**
    * A concurrent access response.
    */
  var concurrentAccess: js.UndefOr[Schema$ConcurrentAccessRestriction] = js.native
  /**
    * A download access response.
    */
  var downloadAccess: js.UndefOr[Schema$DownloadAccessRestriction] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$RequestAccess {
  @scala.inline
  def apply(
    concurrentAccess: Schema$ConcurrentAccessRestriction = null,
    downloadAccess: Schema$DownloadAccessRestriction = null,
    kind: String = null
  ): Schema$RequestAccess = {
    val __obj = js.Dynamic.literal()
    if (concurrentAccess != null) __obj.updateDynamic("concurrentAccess")(concurrentAccess.asInstanceOf[js.Any])
    if (downloadAccess != null) __obj.updateDynamic("downloadAccess")(downloadAccess.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RequestAccess]
  }
}

