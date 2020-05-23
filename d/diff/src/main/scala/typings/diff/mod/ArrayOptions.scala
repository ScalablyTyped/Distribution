package typings.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayOptions[TLeft, TRight] extends BaseOptions {
  /**
    * Comparator for custom equality checks.
    */
  var comparator: js.UndefOr[js.Function2[/* left */ TLeft, /* right */ TRight, Boolean]] = js.undefined
}

object ArrayOptions {
  @scala.inline
  def apply[TLeft, TRight](
    comparator: (/* left */ TLeft, /* right */ TRight) => Boolean = null,
    ignoreCase: js.UndefOr[Boolean] = js.undefined
  ): ArrayOptions[TLeft, TRight] = {
    val __obj = js.Dynamic.literal()
    if (comparator != null) __obj.updateDynamic("comparator")(js.Any.fromFunction2(comparator))
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayOptions[TLeft, TRight]]
  }
}

