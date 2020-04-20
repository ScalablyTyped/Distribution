package typings.emotionCore

import typings.emotionUtils.mod.EmotionCache
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object emotionCoreComponents extends emotionCoreProps {
  @scala.inline
  def CacheProvider: ComponentType[CacheProviderProps[EmotionCache]] = typings.emotionCore.mod.CacheProvider.asInstanceOf[ComponentType[CacheProviderProps[EmotionCache]]]
  @scala.inline
  def ClassNames[Theme]: ComponentType[ClassNamesProps[Theme]] = typings.emotionCore.mod.ClassNames.asInstanceOf[ComponentType[ClassNamesProps[Theme]]]
  @scala.inline
  def Global[Theme]: ComponentType[GlobalProps[Theme]] = typings.emotionCore.mod.Global.asInstanceOf[ComponentType[GlobalProps[Theme]]]
}

