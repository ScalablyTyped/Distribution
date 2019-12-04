package typings.expo.buildLinkingLinkingDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedURL extends js.Object {
  var path: String | Null
  var queryParams: js.Object | Null
}

object ParsedURL {
  @scala.inline
  def apply(path: String = null, queryParams: js.Object = null): ParsedURL = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedURL]
  }
}

