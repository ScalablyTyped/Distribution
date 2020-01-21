package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StalkerParseOptions extends js.Object {
  /**
    * Whether to include the type of each event. Defaults to `true`.
    */
  var annotate: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to format pointer values as strings instead of `NativePointer`
    * values, i.e. less overhead if you're just going to `send()` the result
    * and not actually parse the data agent-side.
    */
  var stringify: js.UndefOr[Boolean] = js.undefined
}

object StalkerParseOptions {
  @scala.inline
  def apply(annotate: js.UndefOr[Boolean] = js.undefined, stringify: js.UndefOr[Boolean] = js.undefined): StalkerParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(annotate)) __obj.updateDynamic("annotate")(annotate.asInstanceOf[js.Any])
    if (!js.isUndefined(stringify)) __obj.updateDynamic("stringify")(stringify.asInstanceOf[js.Any])
    __obj.asInstanceOf[StalkerParseOptions]
  }
}

