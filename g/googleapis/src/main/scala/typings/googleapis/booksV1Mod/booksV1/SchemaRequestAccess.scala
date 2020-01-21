package typings.googleapis.booksV1Mod.booksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRequestAccess extends js.Object {
  /**
    * A concurrent access response.
    */
  var concurrentAccess: js.UndefOr[SchemaConcurrentAccessRestriction] = js.native
  /**
    * A download access response.
    */
  var downloadAccess: js.UndefOr[SchemaDownloadAccessRestriction] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaRequestAccess {
  @scala.inline
  def apply(
    concurrentAccess: SchemaConcurrentAccessRestriction = null,
    downloadAccess: SchemaDownloadAccessRestriction = null,
    kind: String = null
  ): SchemaRequestAccess = {
    val __obj = js.Dynamic.literal()
    if (concurrentAccess != null) __obj.updateDynamic("concurrentAccess")(concurrentAccess.asInstanceOf[js.Any])
    if (downloadAccess != null) __obj.updateDynamic("downloadAccess")(downloadAccess.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRequestAccess]
  }
}

