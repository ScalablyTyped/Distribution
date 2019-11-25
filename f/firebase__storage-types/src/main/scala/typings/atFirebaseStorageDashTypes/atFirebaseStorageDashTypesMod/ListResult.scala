package typings.atFirebaseStorageDashTypes.atFirebaseStorageDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListResult extends js.Object {
  var items: js.Array[Reference]
  var nextPageToken: String | Null
  var prefixes: js.Array[Reference]
}

object ListResult {
  @scala.inline
  def apply(items: js.Array[Reference], prefixes: js.Array[Reference], nextPageToken: String = null): ListResult = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], prefixes = prefixes.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResult]
  }
}

