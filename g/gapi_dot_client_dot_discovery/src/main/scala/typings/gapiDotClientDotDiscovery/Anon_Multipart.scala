package typings.gapiDotClientDotDiscovery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Multipart extends js.Object {
  /** True if this endpoint supports upload multipart media. */
  var multipart: js.UndefOr[Boolean] = js.undefined
  /** The URI path to be used for upload. Should be used in conjunction with the basePath property at the api-level. */
  var path: js.UndefOr[String] = js.undefined
}

object Anon_Multipart {
  @scala.inline
  def apply(multipart: js.UndefOr[Boolean] = js.undefined, path: String = null): Anon_Multipart = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multipart)) __obj.updateDynamic("multipart")(multipart.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Multipart]
  }
}

