package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hidden extends js.Object {
  var hidden: js.UndefOr[Boolean] = js.native
  var modified: js.UndefOr[Boolean] = js.native
  var restricted: js.UndefOr[Boolean] = js.native
  var starred: js.UndefOr[Boolean] = js.native
  var trashed: js.UndefOr[Boolean] = js.native
  var viewed: js.UndefOr[Boolean] = js.native
}

object Hidden {
  @scala.inline
  def apply(
    hidden: js.UndefOr[Boolean] = js.undefined,
    modified: js.UndefOr[Boolean] = js.undefined,
    restricted: js.UndefOr[Boolean] = js.undefined,
    starred: js.UndefOr[Boolean] = js.undefined,
    trashed: js.UndefOr[Boolean] = js.undefined,
    viewed: js.UndefOr[Boolean] = js.undefined
  ): Hidden = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(modified)) __obj.updateDynamic("modified")(modified.get.asInstanceOf[js.Any])
    if (!js.isUndefined(restricted)) __obj.updateDynamic("restricted")(restricted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(starred)) __obj.updateDynamic("starred")(starred.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trashed)) __obj.updateDynamic("trashed")(trashed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(viewed)) __obj.updateDynamic("viewed")(viewed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hidden]
  }
}

