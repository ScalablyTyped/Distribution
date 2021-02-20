package typings.dplayer

import typings.dplayer.mod.DirectionType
import typings.dplayer.mod.FullScreenType
import typings.dplayer.mod.Lang
import typings.dplayer.mod.Preload
import typings.dplayer.mod.SubTitleType
import typings.dplayer.mod.VideoType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dplayerStrings {
  
  @js.native
  sealed trait ass extends SubTitleType
  @scala.inline
  def ass: ass = "ass".asInstanceOf[ass]
  
  @js.native
  sealed trait auto
    extends Preload
       with VideoType
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait bottom extends DirectionType
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait browser extends FullScreenType
  @scala.inline
  def browser: browser = "browser".asInstanceOf[browser]
  
  @js.native
  sealed trait dash extends VideoType
  @scala.inline
  def dash: dash = "dash".asInstanceOf[dash]
  
  @js.native
  sealed trait en extends Lang
  @scala.inline
  def en: en = "en".asInstanceOf[en]
  
  @js.native
  sealed trait flv extends VideoType
  @scala.inline
  def flv: flv = "flv".asInstanceOf[flv]
  
  @js.native
  sealed trait hls extends VideoType
  @scala.inline
  def hls: hls = "hls".asInstanceOf[hls]
  
  @js.native
  sealed trait metadata extends Preload
  @scala.inline
  def metadata: metadata = "metadata".asInstanceOf[metadata]
  
  @js.native
  sealed trait none extends Preload
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait normal extends VideoType
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait right extends DirectionType
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait top extends DirectionType
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait web extends FullScreenType
  @scala.inline
  def web: web = "web".asInstanceOf[web]
  
  @js.native
  sealed trait webtorrent extends VideoType
  @scala.inline
  def webtorrent: webtorrent = "webtorrent".asInstanceOf[webtorrent]
  
  @js.native
  sealed trait webvtt extends SubTitleType
  @scala.inline
  def webvtt: webvtt = "webvtt".asInstanceOf[webvtt]
  
  @js.native
  sealed trait `zh-cn` extends Lang
  @scala.inline
  def `zh-cn`: `zh-cn` = "zh-cn".asInstanceOf[`zh-cn`]
  
  @js.native
  sealed trait `zh-tw` extends Lang
  @scala.inline
  def `zh-tw`: `zh-tw` = "zh-tw".asInstanceOf[`zh-tw`]
}
