package typings
package eslintLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Filter extends js.Object {
  var filter: js.UndefOr[eslintLib.eslintMod.SourceCodeNs.FilterPredicate] = js.undefined
  var includeComments: js.UndefOr[scala.Boolean] = js.undefined
  var skip: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Filter {
  @scala.inline
  def apply(
    filter: eslintLib.eslintMod.SourceCodeNs.FilterPredicate = null,
    includeComments: js.UndefOr[scala.Boolean] = js.undefined,
    skip: scala.Int | scala.Double = null
  ): Anon_Filter = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (!js.isUndefined(includeComments)) __obj.updateDynamic("includeComments")(includeComments)
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Filter]
  }
}

