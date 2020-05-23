package typings.eslint.anon

import typings.eslint.mod.AST.Token
import typings.eslint.mod.SourceCode.FilterPredicate
import typings.estree.mod.Comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  var filter: js.UndefOr[FilterPredicate] = js.undefined
  var includeComments: js.UndefOr[Boolean] = js.undefined
  var skip: js.UndefOr[Double] = js.undefined
}

object Filter {
  @scala.inline
  def apply(
    filter: /* tokenOrComment */ Token | Comment => Boolean = null,
    includeComments: js.UndefOr[Boolean] = js.undefined,
    skip: js.UndefOr[Double] = js.undefined
  ): Filter = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (!js.isUndefined(includeComments)) __obj.updateDynamic("includeComments")(includeComments.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skip)) __obj.updateDynamic("skip")(skip.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

