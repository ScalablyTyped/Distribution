package typings.eslint

import typings.eslint.eslintMod.SourceCodeNs.FilterPredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var filter: js.UndefOr[FilterPredicate] = js.undefined
  var includeComments: js.UndefOr[Boolean] = js.undefined
}

object Anon_Count {
  @scala.inline
  def apply(
    count: Int | Double = null,
    filter: FilterPredicate = null,
    includeComments: js.UndefOr[Boolean] = js.undefined
  ): Anon_Count = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(includeComments)) __obj.updateDynamic("includeComments")(includeComments)
    __obj.asInstanceOf[Anon_Count]
  }
}

