package typings.editJsonFile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** JSON file editor options. */
trait Options extends js.Object {
  var autosave: js.UndefOr[Boolean] = js.undefined
  var stringify_eol: js.UndefOr[Boolean] = js.undefined
  var stringify_fn: js.UndefOr[js.Function1[/* data */ js.Object, String]] = js.undefined
  var stringify_width: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autosave: js.UndefOr[Boolean] = js.undefined,
    stringify_eol: js.UndefOr[Boolean] = js.undefined,
    stringify_fn: /* data */ js.Object => String = null,
    stringify_width: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autosave)) __obj.updateDynamic("autosave")(autosave.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stringify_eol)) __obj.updateDynamic("stringify_eol")(stringify_eol.get.asInstanceOf[js.Any])
    if (stringify_fn != null) __obj.updateDynamic("stringify_fn")(js.Any.fromFunction1(stringify_fn))
    if (!js.isUndefined(stringify_width)) __obj.updateDynamic("stringify_width")(stringify_width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

