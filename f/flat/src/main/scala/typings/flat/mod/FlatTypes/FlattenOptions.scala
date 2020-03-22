package typings.flat.mod.FlatTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlattenOptions extends js.Object {
  var delimiter: js.UndefOr[String] = js.undefined
  var maxDepth: js.UndefOr[Double] = js.undefined
  var safe: js.UndefOr[Boolean] = js.undefined
  var transformKey: js.UndefOr[js.Function1[/* key */ String, String]] = js.undefined
}

object FlattenOptions {
  @scala.inline
  def apply(
    delimiter: String = null,
    maxDepth: Int | Double = null,
    safe: js.UndefOr[Boolean] = js.undefined,
    transformKey: /* key */ String => String = null
  ): FlattenOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe.asInstanceOf[js.Any])
    if (transformKey != null) __obj.updateDynamic("transformKey")(js.Any.fromFunction1(transformKey))
    __obj.asInstanceOf[FlattenOptions]
  }
}

