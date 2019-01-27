package typings
package atEmotionSerializeLib.atEmotionSerializeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@emotion/serialize", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def serializeStyles[MP](
    registered: atEmotionUtilsLib.atEmotionUtilsMod.RegisteredCache,
    args: js.Array[
      stdLib.TemplateStringsArray | atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[MP]
    ]
  ): atEmotionUtilsLib.atEmotionUtilsMod.SerializedStyles = js.native
  def serializeStyles[MP](
    registered: atEmotionUtilsLib.atEmotionUtilsMod.RegisteredCache,
    args: js.Array[
      stdLib.TemplateStringsArray | atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[MP]
    ],
    mergedProps: MP
  ): atEmotionUtilsLib.atEmotionUtilsMod.SerializedStyles = js.native
}

