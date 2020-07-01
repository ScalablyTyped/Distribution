package typings.giustoInkRouter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hash extends js.Object {
  var hash: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var pathname: String
  var search: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[js.Any] = js.undefined
}

object Hash {
  @scala.inline
  def apply(
    pathname: String,
    hash: String = null,
    key: String = null,
    search: String = null,
    state: js.Any = null
  ): Hash = {
    val __obj = js.Dynamic.literal(pathname = pathname.asInstanceOf[js.Any])
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (search != null) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hash]
  }
}

