package typings.emotionCore

import typings.emotionUtils.mod.EmotionCache
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object emotionCoreComponents extends emotionCoreProps {
  @scala.inline
  def CacheProvider: ComponentType[CacheProviderProps[EmotionCache]] = typings.emotionCore.mod.CacheProvider.asInstanceOf[typings.react.mod.ComponentType[CacheProviderProps[typings.emotionUtils.mod.EmotionCache]]]
  @scala.inline
  def ClassNames[Theme]: ComponentType[ClassNamesProps[Theme]] = typings.emotionCore.mod.ClassNames.asInstanceOf[typings.react.mod.ComponentType[ClassNamesProps[Theme]]]
  @scala.inline
  def Global[Theme]: ComponentType[GlobalProps[Theme]] = typings.emotionCore.mod.Global.asInstanceOf[typings.react.mod.ComponentType[GlobalProps[Theme]]]
}

