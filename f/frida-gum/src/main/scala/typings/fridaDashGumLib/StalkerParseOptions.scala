package typings
package fridaDashGumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StalkerParseOptions extends js.Object {
  /**
    * Whether to include the type of each event. Defaults to `true`.
    */
  var annotate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to format pointer values as strings instead of `NativePointer`
    * values, i.e. less overhead if you're just going to `send()` the result
    * and not actually parse the data agent-side.
    */
  var stringify: js.UndefOr[scala.Boolean] = js.undefined
}

object StalkerParseOptions {
  @scala.inline
  def apply(
    annotate: js.UndefOr[scala.Boolean] = js.undefined,
    stringify: js.UndefOr[scala.Boolean] = js.undefined
  ): StalkerParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(annotate)) __obj.updateDynamic("annotate")(annotate)
    if (!js.isUndefined(stringify)) __obj.updateDynamic("stringify")(stringify)
    __obj.asInstanceOf[StalkerParseOptions]
  }
}

