package typings.formSerialize.mod

import typings.formSerialize.formSerializeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsHash extends Options[ResultHash] {
  @JSName("hash")
  var hash_OptionsHash: `true`
}

object OptionsHash {
  @scala.inline
  def apply(
    hash: `true`,
    disabled: js.UndefOr[Boolean] = js.undefined,
    empty: js.UndefOr[Boolean] = js.undefined,
    serializer: (ResultHash, /* key */ String, /* value */ String) => ResultHash = null
  ): OptionsHash = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (serializer != null) __obj.updateDynamic("serializer")(js.Any.fromFunction3(serializer))
    __obj.asInstanceOf[OptionsHash]
  }
}

