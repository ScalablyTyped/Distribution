package typings.formSerialize.mod

import typings.formSerialize.formSerializeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsString extends Options[String] {
  @JSName("hash")
  var hash_OptionsString: `false`
}

object OptionsString {
  @scala.inline
  def apply(
    hash: `false`,
    disabled: js.UndefOr[Boolean] = js.undefined,
    empty: js.UndefOr[Boolean] = js.undefined,
    serializer: (String, /* key */ String, /* value */ String) => String = null
  ): OptionsString = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (serializer != null) __obj.updateDynamic("serializer")(js.Any.fromFunction3(serializer))
    __obj.asInstanceOf[OptionsString]
  }
}

