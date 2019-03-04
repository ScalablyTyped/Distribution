package typings
package formDashSerializeLib.formDashSerializeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsString
  extends Options[java.lang.String] {
  @JSName("hash")
  var hash_OptionsString: formDashSerializeLib.formDashSerializeLibNumbers.`false`
}

object OptionsString {
  @scala.inline
  def apply(
    hash: formDashSerializeLib.formDashSerializeLibNumbers.`false`,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    empty: js.UndefOr[scala.Boolean] = js.undefined,
    serializer: js.Function3[
      java.lang.String, 
      /* key */ java.lang.String, 
      /* value */ java.lang.String, 
      java.lang.String
    ] = null
  ): OptionsString = {
    val __obj = js.Dynamic.literal(hash = hash)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty)
    if (serializer != null) __obj.updateDynamic("serializer")(serializer)
    __obj.asInstanceOf[OptionsString]
  }
}

