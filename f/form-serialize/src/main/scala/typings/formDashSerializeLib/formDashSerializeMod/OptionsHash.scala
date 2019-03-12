package typings
package formDashSerializeLib.formDashSerializeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsHash extends Options[ResultHash] {
  @JSName("hash")
  var hash_OptionsHash: formDashSerializeLib.formDashSerializeLibNumbers.`true`
}

object OptionsHash {
  @scala.inline
  def apply(
    hash: formDashSerializeLib.formDashSerializeLibNumbers.`true`,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    empty: js.UndefOr[scala.Boolean] = js.undefined,
    serializer: (ResultHash, /* key */ java.lang.String, /* value */ java.lang.String) => ResultHash = null
  ): OptionsHash = {
    val __obj = js.Dynamic.literal(hash = hash)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty)
    if (serializer != null) __obj.updateDynamic("serializer")(js.Any.fromFunction3(serializer))
    __obj.asInstanceOf[OptionsHash]
  }
}

