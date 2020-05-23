package typings.diff.anon

import typings.diff.mod.Callback
import typings.diff.mod.Change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined diff.diff.ArrayOptions<any, any> & std.Partial<diff.diff.CallbackOptions> */
trait ArrayOptionsanyanyPartial extends js.Object {
  var callback: js.UndefOr[Callback] = js.undefined
  /**
    * Comparator for custom equality checks.
    */
  var comparator: js.UndefOr[js.Function2[/* left */ js.Any, /* right */ js.Any, Boolean]] = js.undefined
  /**
    * `true` to ignore casing difference.
    * @default false
    */
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
}

object ArrayOptionsanyanyPartial {
  @scala.inline
  def apply(
    callback: (/* err */ js.UndefOr[scala.Nothing], /* value */ js.UndefOr[js.Array[Change]]) => Unit = null,
    comparator: (/* left */ js.Any, /* right */ js.Any) => Boolean = null,
    ignoreCase: js.UndefOr[Boolean] = js.undefined
  ): ArrayOptionsanyanyPartial = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (comparator != null) __obj.updateDynamic("comparator")(js.Any.fromFunction2(comparator))
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayOptionsanyanyPartial]
  }
}

