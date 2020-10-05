package typings.emotionSerialize.mod

import typings.emotionUtils.mod.RegisteredCache
import typings.emotionUtils.mod.SerializedStyles
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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

