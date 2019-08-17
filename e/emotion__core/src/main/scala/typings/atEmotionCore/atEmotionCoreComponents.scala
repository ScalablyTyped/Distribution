package typings.atEmotionCore

import typings.atEmotionUtils.atEmotionUtilsMod.EmotionCache
import typings.react.reactMod.ComponentType
import typings.react.reactMod.ProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atEmotionCoreComponents extends atEmotionCoreProps {
  @scala.inline
  def apply[P /* <: js.Object */]: ComponentType[String] = typings.atEmotionCore.atEmotionCoreMod.jsx.asInstanceOf[js.Dynamic].selectDynamic("<apply>").asInstanceOf[typings.react.reactMod.ComponentType[java.lang.String]]
  @scala.inline
  def CacheProvider: ComponentType[ProviderProps[EmotionCache]] = typings.atEmotionCore.atEmotionCoreMod.^.CacheProvider.asInstanceOf[typings.react.reactMod.ComponentType[
  typings.react.reactMod.ProviderProps[typings.atEmotionUtils.atEmotionUtilsMod.EmotionCache]]]
  @scala.inline
  def ClassNames[Theme]: ComponentType[typings.atEmotionCore.atEmotionCoreMod.ClassNamesProps[Theme]] = typings.atEmotionCore.atEmotionCoreMod.^.asInstanceOf[js.Dynamic].selectDynamic("ClassNames").asInstanceOf[typings.react.reactMod.ComponentType[typings.atEmotionCore.atEmotionCoreMod.ClassNamesProps[Theme]]]
  @scala.inline
  def Global[Theme]: ComponentType[typings.atEmotionCore.atEmotionCoreMod.GlobalProps[Theme]] = typings.atEmotionCore.atEmotionCoreMod.^.asInstanceOf[js.Dynamic].selectDynamic("Global").asInstanceOf[typings.react.reactMod.ComponentType[typings.atEmotionCore.atEmotionCoreMod.GlobalProps[Theme]]]
}

