package typings.flat.mod.FlatTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnflattenOptions extends js.Object {
  var delimiter: js.UndefOr[String] = js.undefined
  var `object`: js.UndefOr[Boolean] = js.undefined
  var overwrite: js.UndefOr[Boolean] = js.undefined
  var transformKey: js.UndefOr[js.Function1[/* key */ String, String]] = js.undefined
}

object UnflattenOptions {
  @scala.inline
  def apply(
    delimiter: String = null,
    `object`: js.UndefOr[Boolean] = js.undefined,
    overwrite: js.UndefOr[Boolean] = js.undefined,
    transformKey: /* key */ String => String = null
  ): UnflattenOptions = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(`object`)) __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (!js.isUndefined(overwrite)) __obj.updateDynamic("overwrite")(overwrite.asInstanceOf[js.Any])
    if (transformKey != null) __obj.updateDynamic("transformKey")(js.Any.fromFunction1(transformKey))
    __obj.asInstanceOf[UnflattenOptions]
  }
}

