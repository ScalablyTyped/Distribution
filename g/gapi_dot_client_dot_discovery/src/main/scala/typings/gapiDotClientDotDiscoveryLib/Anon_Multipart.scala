package typings
package gapiDotClientDotDiscoveryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Multipart extends js.Object {
  /** True if this endpoint supports upload multipart media. */
  var multipart: js.UndefOr[scala.Boolean] = js.undefined
  /** The URI path to be used for upload. Should be used in conjunction with the basePath property at the api-level. */
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Multipart {
  @scala.inline
  def apply(multipart: js.UndefOr[scala.Boolean] = js.undefined, path: java.lang.String = null): Anon_Multipart = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multipart)) __obj.updateDynamic("multipart")(multipart)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Anon_Multipart]
  }
}

