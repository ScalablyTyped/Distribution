package typings
package dplayerLib.dplayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DPlayerEvents extends js.Object

@JSImport("dplayer", "DPlayerEvents")
@js.native
object DPlayerEvents extends js.Object {
  @js.native
  sealed trait abort
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait canplay
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait canplaythrough
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait contextmenu_hide
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait contextmenu_show
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait danmaku_clear
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait danmaku_hide
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait danmaku_loaded
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait danmaku_opacity
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait danmaku_send
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait danmaku_show
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait destroy
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait durationchange
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait emptied
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait ended
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait error
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait fullscreen
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait fullscreen_cancel
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait loadeddata
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait loadedmetadata
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait loadstart
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait mozaudioavailable
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait notice_hide
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait notice_show
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait pause
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait play
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait playing
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait progress
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait quality_end
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait quality_start
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait ratechange
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait resize
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait screenshot
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait seeked
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait seeking
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait stalled
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait subtitle_change
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait subtitle_hide
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait subtitle_show
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait suspend
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait thumbnails_hide
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait thumbnails_show
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait timeupdate
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait volumechange
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  @js.native
  sealed trait waiting
    extends dplayerLib.dplayerMod.DPlayerEvents
  
  /* "abort" */ val abort: abort with java.lang.String = js.native
  /* "canplay" */ val canplay: canplay with java.lang.String = js.native
  /* "canplaythrough" */ val canplaythrough: canplaythrough with java.lang.String = js.native
  /* "contextmenu_hide" */ val contextmenu_hide: contextmenu_hide with java.lang.String = js.native
  /* "contextmenu_show" */ val contextmenu_show: contextmenu_show with java.lang.String = js.native
  /* "danmaku_clear" */ val danmaku_clear: danmaku_clear with java.lang.String = js.native
  /* "danmaku_hide" */ val danmaku_hide: danmaku_hide with java.lang.String = js.native
  /* "danmaku_loaded" */ val danmaku_loaded: danmaku_loaded with java.lang.String = js.native
  /* "danmaku_opacity" */ val danmaku_opacity: danmaku_opacity with java.lang.String = js.native
  /* "danmaku_send" */ val danmaku_send: danmaku_send with java.lang.String = js.native
  /* "danmaku_show" */ val danmaku_show: danmaku_show with java.lang.String = js.native
  /* "destroy" */ val destroy: destroy with java.lang.String = js.native
  /* "durationchange" */ val durationchange: durationchange with java.lang.String = js.native
  /* "emptied" */ val emptied: emptied with java.lang.String = js.native
  /* "ended" */ val ended: ended with java.lang.String = js.native
  /* "error" */ val error: error with java.lang.String = js.native
  /* "fullscreen" */ val fullscreen: fullscreen with java.lang.String = js.native
  /* "fullscreen_cancel" */ val fullscreen_cancel: fullscreen_cancel with java.lang.String = js.native
  /* "loadeddata" */ val loadeddata: loadeddata with java.lang.String = js.native
  /* "loadedmetadata" */ val loadedmetadata: loadedmetadata with java.lang.String = js.native
  /* "loadstart" */ val loadstart: loadstart with java.lang.String = js.native
  /* "mozaudioavailable" */ val mozaudioavailable: mozaudioavailable with java.lang.String = js.native
  /* "notice_hide" */ val notice_hide: notice_hide with java.lang.String = js.native
  /* "notice_show" */ val notice_show: notice_show with java.lang.String = js.native
  /* "pause" */ val pause: pause with java.lang.String = js.native
  /* "play" */ val play: play with java.lang.String = js.native
  /* "playing" */ val playing: playing with java.lang.String = js.native
  /* "progress" */ val progress: progress with java.lang.String = js.native
  /* "quality_end" */ val quality_end: quality_end with java.lang.String = js.native
  /* "quality_start" */ val quality_start: quality_start with java.lang.String = js.native
  /* "ratechange" */ val ratechange: ratechange with java.lang.String = js.native
  /* "resize" */ val resize: resize with java.lang.String = js.native
  /* "screenshot" */ val screenshot: screenshot with java.lang.String = js.native
  /* "seeked" */ val seeked: seeked with java.lang.String = js.native
  /* "seeking" */ val seeking: seeking with java.lang.String = js.native
  /* "stalled" */ val stalled: stalled with java.lang.String = js.native
  /* "subtitle_change" */ val subtitle_change: subtitle_change with java.lang.String = js.native
  /* "subtitle_hide" */ val subtitle_hide: subtitle_hide with java.lang.String = js.native
  /* "subtitle_show" */ val subtitle_show: subtitle_show with java.lang.String = js.native
  /* "suspend" */ val suspend: suspend with java.lang.String = js.native
  /* "thumbnails_hide" */ val thumbnails_hide: thumbnails_hide with java.lang.String = js.native
  /* "thumbnails_show" */ val thumbnails_show: thumbnails_show with java.lang.String = js.native
  /* "timeupdate" */ val timeupdate: timeupdate with java.lang.String = js.native
  /* "volumechange" */ val volumechange: volumechange with java.lang.String = js.native
  /* "waiting" */ val waiting: waiting with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[dplayerLib.dplayerMod.DPlayerEvents with java.lang.String] = js.native
}

