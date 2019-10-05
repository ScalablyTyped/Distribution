package typings.atEmotionSerialize.atEmotionSerializeMod

import typings.atEmotionUtils.atEmotionUtilsMod.RegisteredCache
import typings.atEmotionUtils.atEmotionUtilsMod.SerializedStyles
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@emotion/serialize", "serializeStyles")
@js.native
object serializeStyles extends js.Object {
  def apply[MP](args: js.Array[TemplateStringsArray | Interpolation[MP]], registered: RegisteredCache): SerializedStyles = js.native
  def apply[MP](
    args: js.Array[TemplateStringsArray | Interpolation[MP]],
    registered: RegisteredCache,
    mergedProps: MP
  ): SerializedStyles = js.native
}

