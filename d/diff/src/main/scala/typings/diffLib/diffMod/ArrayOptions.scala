package typings
package diffLib.diffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayOptions[TLeft, TRight] extends BaseOptions {
  /**
    * Comparator for custom equality checks.
    */
  var comparator: js.UndefOr[js.Function2[/* left */ TLeft, /* right */ TRight, scala.Boolean]] = js.undefined
}

object ArrayOptions {
  @scala.inline
  def apply[TLeft, TRight](
    comparator: js.Function2[/* left */ TLeft, /* right */ TRight, scala.Boolean] = null,
    ignoreCase: js.UndefOr[scala.Boolean] = js.undefined
  ): ArrayOptions[TLeft, TRight] = {
    val __obj = js.Dynamic.literal()
    if (comparator != null) __obj.updateDynamic("comparator")(comparator)
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    __obj.asInstanceOf[ArrayOptions[TLeft, TRight]]
  }
}

