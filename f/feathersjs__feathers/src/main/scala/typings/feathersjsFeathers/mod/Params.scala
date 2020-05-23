package typings.feathersjsFeathers.mod

import org.scalablytyped.runtime.StringDictionary
import typings.feathersjsFeathers.anon.PickPaginationOptionsmax
import typings.feathersjsFeathers.feathersjsFeathersBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params
  extends /* key */ StringDictionary[js.Any] {
  var paginate: js.UndefOr[`false` | PickPaginationOptionsmax] = js.undefined
  var query: js.UndefOr[Query] = js.undefined
}

object Params {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    paginate: `false` | PickPaginationOptionsmax = null,
    query: Query = null
  ): Params = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (paginate != null) __obj.updateDynamic("paginate")(paginate.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

