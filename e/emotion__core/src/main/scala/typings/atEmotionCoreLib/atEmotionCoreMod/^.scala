package typings
package atEmotionCoreLib.atEmotionCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@emotion/core", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CacheProvider: reactLib.reactMod.ReactNs.Provider[atEmotionUtilsLib.atEmotionUtilsMod.EmotionCache] = js.native
  val ThemeContext: reactLib.reactMod.ReactNs.Context[js.Object] = js.native
  val jsx: atEmotionCoreLib.Anon_A = js.native
  def ClassNames[Theme](props: ClassNamesProps[Theme]): reactLib.reactMod.ReactNs.ReactElement[_] = js.native
  def Global[Theme](props: GlobalProps[Theme]): reactLib.reactMod.ReactNs.ReactElement[_] = js.native
  def css(args: atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]]*): atEmotionUtilsLib.atEmotionUtilsMod.SerializedStyles = js.native
  def css(
    template: stdLib.TemplateStringsArray,
    args: atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]]*
  ): atEmotionUtilsLib.atEmotionUtilsMod.SerializedStyles = js.native
  def keyframes(args: atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]]*): atEmotionSerializeLib.atEmotionSerializeMod.Keyframes = js.native
  def keyframes(
    template: stdLib.TemplateStringsArray,
    args: atEmotionSerializeLib.atEmotionSerializeMod.Interpolation[js.UndefOr[scala.Nothing]]*
  ): atEmotionSerializeLib.atEmotionSerializeMod.Keyframes = js.native
  def withEmotionCache[Props, RefType](
    func: js.Function3[
      /* props */ Props, 
      /* context */ atEmotionUtilsLib.atEmotionUtilsMod.EmotionCache, 
      /* ref */ reactLib.reactMod.ReactNs.Ref[RefType], 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ): reactLib.reactMod.ReactNs.SFC[Props with reactLib.reactMod.ReactNs.ClassAttributes[RefType]] = js.native
}

