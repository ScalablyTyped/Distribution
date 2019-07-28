package typings.atFeathersjsFeathers.atFeathersjsFeathersMod

import org.scalablytyped.runtime.StringDictionary
import typings.atFeathersjsFeathers.atFeathersjsFeathersNumbers.`false`
import typings.atFeathersjsFeathers.atFeathersjsFeathersStrings.max
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params
  extends /* key */ StringDictionary[js.Any] {
  var paginate: js.UndefOr[`false` | (Pick[PaginationOptions, max])] = js.undefined
  var query: js.UndefOr[Query] = js.undefined
}

object Params {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    paginate: `false` | (Pick[PaginationOptions, max]) = null,
    query: Query = null
  ): Params = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (paginate != null) __obj.updateDynamic("paginate")(paginate.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Params]
  }
}

