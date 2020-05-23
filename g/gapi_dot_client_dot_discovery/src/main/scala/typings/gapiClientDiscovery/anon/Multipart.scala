package typings.gapiClientDiscovery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Multipart extends js.Object {
  /** True if this endpoint supports upload multipart media. */
  var multipart: js.UndefOr[Boolean] = js.undefined
  /** The URI path to be used for upload. Should be used in conjunction with the basePath property at the api-level. */
  var path: js.UndefOr[String] = js.undefined
}

object Multipart {
  @scala.inline
  def apply(multipart: js.UndefOr[Boolean] = js.undefined, path: String = null): Multipart = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multipart)) __obj.updateDynamic("multipart")(multipart.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Multipart]
  }
}

