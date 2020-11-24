package typings.dplayer

import typings.dplayer.mod.DirectionType
import typings.dplayer.mod.FullScreenType
import typings.dplayer.mod.Lang
import typings.dplayer.mod.Preload
import typings.dplayer.mod.SubTitleType
import typings.dplayer.mod.VideoType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dplayerStrings {
  
  @scala.inline
  def ass: ass = "ass".asInstanceOf[ass]
  
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @scala.inline
  def browser: browser = "browser".asInstanceOf[browser]
  
  @scala.inline
  def dash: dash = "dash".asInstanceOf[dash]
  
  @scala.inline
  def en: en = "en".asInstanceOf[en]
  
  @scala.inline
  def flv: flv = "flv".asInstanceOf[flv]
  
  @scala.inline
  def hls: hls = "hls".asInstanceOf[hls]
  
  @scala.inline
  def metadata: metadata = "metadata".asInstanceOf[metadata]
  
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @scala.inline
  def web: web = "web".asInstanceOf[web]
  
  @scala.inline
  def webtorrent: webtorrent = "webtorrent".asInstanceOf[webtorrent]
  
  @scala.inline
  def webvtt: webvtt = "webvtt".asInstanceOf[webvtt]
  
  @scala.inline
  def `zh-cn`: `zh-cn` = "zh-cn".asInstanceOf[`zh-cn`]
  
  @scala.inline
  def `zh-tw`: `zh-tw` = "zh-tw".asInstanceOf[`zh-tw`]
  
  @js.native
  sealed trait ass extends SubTitleType
  
  @js.native
  sealed trait auto
    extends Preload
       with VideoType
  
  @js.native
  sealed trait bottom extends DirectionType
  
  @js.native
  sealed trait browser extends FullScreenType
  
  @js.native
  sealed trait dash extends VideoType
  
  @js.native
  sealed trait en extends Lang
  
  @js.native
  sealed trait flv extends VideoType
  
  @js.native
  sealed trait hls extends VideoType
  
  @js.native
  sealed trait metadata extends Preload
  
  @js.native
  sealed trait none extends Preload
  
  @js.native
  sealed trait normal extends VideoType
  
  @js.native
  sealed trait right extends DirectionType
  
  @js.native
  sealed trait top extends DirectionType
  
  @js.native
  sealed trait web extends FullScreenType
  
  @js.native
  sealed trait webtorrent extends VideoType
  
  @js.native
  sealed trait webvtt extends SubTitleType
  
  @js.native
  sealed trait `zh-cn` extends Lang
  
  @js.native
  sealed trait `zh-tw` extends Lang
}
