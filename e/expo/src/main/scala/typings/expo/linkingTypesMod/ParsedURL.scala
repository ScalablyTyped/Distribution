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
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], queryParams = queryParams.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedURL]
  }
}

