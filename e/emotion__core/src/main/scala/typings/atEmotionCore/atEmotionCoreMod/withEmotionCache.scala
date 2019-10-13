package typings.atEmotionCore.atEmotionCoreMod

import typings.atEmotionUtils.atEmotionUtilsMod.EmotionCache
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.ReactNode
import typings.react.reactMod.Ref
import typings.react.reactMod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@emotion/core", "withEmotionCache")
@js.native
object withEmotionCache extends js.Object {
  def apply[Props, RefType](
    func: js.Function3[/* props */ Props, /* context */ EmotionCache, /* ref */ Ref[RefType], ReactNode]
  ): SFC[Props with ClassAttributes[RefType]] = js.native
}

