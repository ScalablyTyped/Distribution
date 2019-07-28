package typings.formDashSerialize.formDashSerializeMod

import typings.formDashSerialize.formDashSerializeNumbers.`false`
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
    val __obj = js.Dynamic.literal(hash = hash)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty)
    if (serializer != null) __obj.updateDynamic("serializer")(js.Any.fromFunction3(serializer))
    __obj.asInstanceOf[OptionsString]
  }
}

