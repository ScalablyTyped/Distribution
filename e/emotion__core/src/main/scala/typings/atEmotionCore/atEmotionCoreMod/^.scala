package typings.atEmotionCore.atEmotionCoreMod

import typings.atEmotionSerialize.atEmotionSerializeMod.Interpolation
import typings.atEmotionSerialize.atEmotionSerializeMod.Keyframes
import typings.atEmotionUtils.atEmotionUtilsMod.EmotionCache
import typings.atEmotionUtils.atEmotionUtilsMod.SerializedStyles
import typings.react.reactMod.ClassAttributes
import typings.react.reactMod.Context
import typings.react.reactMod.Provider
import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.Ref
import typings.react.reactMod.SFC
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@emotion/core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CacheProvider: Provider[EmotionCache] = js.native
  val ThemeContext: Context[js.Object] = js.native
  def ClassNames[Theme](props: ClassNamesProps[Theme]): ReactElement = js.native
  def Global[Theme](props: GlobalProps[Theme]): ReactElement = js.native
  def css(args: Interpolation[js.UndefOr[scala.Nothing]]*): SerializedStyles = js.native
  def css(template: TemplateStringsArray, args: Interpolation[js.UndefOr[scala.Nothing]]*): SerializedStyles = js.native
  def keyframes(args: Interpolation[js.UndefOr[scala.Nothing]]*): Keyframes = js.native
  def keyframes(template: TemplateStringsArray, args: Interpolation[js.UndefOr[scala.Nothing]]*): Keyframes = js.native
  def withEmotionCache[Props, RefType](
    func: js.Function3[/* props */ Props, /* context */ EmotionCache, /* ref */ Ref[RefType], ReactNode]
  ): SFC[Props with ClassAttributes[RefType]] = js.native
}

