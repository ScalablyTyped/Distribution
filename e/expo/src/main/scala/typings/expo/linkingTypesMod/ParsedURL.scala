package typings.expo.linkingTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedURL extends js.Object {
  var hostname: String | Null
  var path: String | Null
  var queryParams: QueryParams | Null
  var scheme: String | Null
}

object ParsedURL {
  @scala.inline
  def apply(
    hostname: String = null,
    path: String = null,
    queryParams: QueryParams = null,
    scheme: String = null
  ): ParsedURL = {
    val __obj = js.Dynamic.literal()
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedURL]
  }
}

