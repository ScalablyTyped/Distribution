package typings
package atEmotionSerializeLib.atEmotionSerializeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@emotion/serialize", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def serializeStyles[MP](
    args: js.Array[stdLib.TemplateStringsArray | Interpolation[MP]],
    registered: atEmotionUtilsLib.atEmotionUtilsMod.RegisteredCache
  ): atEmotionUtilsLib.atEmotionUtilsMod.SerializedStyles = js.native
  def serializeStyles[MP](
    args: js.Array[stdLib.TemplateStringsArray | Interpolation[MP]],
    registered: atEmotionUtilsLib.atEmotionUtilsMod.RegisteredCache,
    mergedProps: MP
  ): atEmotionUtilsLib.atEmotionUtilsMod.SerializedStyles = js.native
}

