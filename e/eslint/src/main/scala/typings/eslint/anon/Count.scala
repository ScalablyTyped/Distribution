package typings.eslint.anon

import typings.eslint.mod.AST.Token
import typings.eslint.mod.SourceCode.FilterPredicate
import typings.estree.mod.Comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Count extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var filter: js.UndefOr[FilterPredicate] = js.undefined
  var includeComments: js.UndefOr[Boolean] = js.undefined
}

object Count {
  @scala.inline
  def apply(
    count: js.UndefOr[Double] = js.undefined,
    filter: /* tokenOrComment */ Token | Comment => Boolean = null,
    includeComments: js.UndefOr[Boolean] = js.undefined
  ): Count = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (!js.isUndefined(includeComments)) __obj.updateDynamic("includeComments")(includeComments.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
}

