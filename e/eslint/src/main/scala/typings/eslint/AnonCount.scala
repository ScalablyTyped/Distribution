package typings.eslint

import typings.eslint.mod.AST.Token
import typings.eslint.mod.SourceCode.FilterPredicate
import typings.estree.mod.Comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCount extends js.Object {
  var count: js.UndefOr[Double] = js.undefined
  var filter: js.UndefOr[FilterPredicate] = js.undefined
  var includeComments: js.UndefOr[Boolean] = js.undefined
}

object AnonCount {
  @scala.inline
  def apply(
    count: Int | Double = null,
    filter: /* tokenOrComment */ Token | Comment => Boolean = null,
    includeComments: js.UndefOr[Boolean] = js.undefined
  ): AnonCount = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (!js.isUndefined(includeComments)) __obj.updateDynamic("includeComments")(includeComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCount]
  }
}

