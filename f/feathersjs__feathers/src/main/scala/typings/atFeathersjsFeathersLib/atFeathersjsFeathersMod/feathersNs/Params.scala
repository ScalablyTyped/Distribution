package typings
package atFeathersjsFeathersLib.atFeathersjsFeathersMod.feathersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var paginate: js.UndefOr[
    atFeathersjsFeathersLib.atFeathersjsFeathersLibNumbers.`false` | (stdLib.Pick[PaginationOptions, atFeathersjsFeathersLib.atFeathersjsFeathersLibStrings.max])
  ] = js.undefined
  var query: js.UndefOr[Query] = js.undefined
}

object Params {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    paginate: atFeathersjsFeathersLib.atFeathersjsFeathersLibNumbers.`false` | (stdLib.Pick[PaginationOptions, atFeathersjsFeathersLib.atFeathersjsFeathersLibStrings.max]) = null,
    query: Query = null
  ): Params = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (paginate != null) __obj.updateDynamic("paginate")(paginate.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Params]
  }
}

