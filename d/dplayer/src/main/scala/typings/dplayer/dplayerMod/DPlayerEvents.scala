package typings.dplayer.dplayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DPlayerEvents extends js.Object

@JSImport("dplayer", "DPlayerEvents")
@js.native
object DPlayerEvents extends js.Object {
  @js.native
  sealed trait abort extends DPlayerEvents
  
  @js.native
  sealed trait canplay extends DPlayerEvents
  
  @js.native
  sealed trait canplaythrough extends DPlayerEvents
  
  @js.native
  sealed trait contextmenu_hide extends DPlayerEvents
  
  @js.native
  sealed trait contextmenu_show extends DPlayerEvents
  
  @js.native
  sealed trait danmaku_clear extends DPlayerEvents
  
  @js.native
  sealed trait danmaku_hide extends DPlayerEvents
  
  @js.native
  sealed trait danmaku_loaded extends DPlayerEvents
  
  @js.native
  sealed trait danmaku_opacity extends DPlayerEvents
  
  @js.native
  sealed trait danmaku_send extends DPlayerEvents
  
  @js.native
  sealed trait danmaku_show extends DPlayerEvents
  
  @js.native
  sealed trait destroy extends DPlayerEvents
  
  @js.native
  sealed trait durationchange extends DPlayerEvents
  
  @js.native
  sealed trait emptied extends DPlayerEvents
  
  @js.native
  sealed trait ended extends DPlayerEvents
  
  @js.native
  sealed trait error extends DPlayerEvents
  
  @js.native
  sealed trait fullscreen extends DPlayerEvents
  
  @js.native
  sealed trait fullscreen_cancel extends DPlayerEvents
  
  @js.native
  sealed trait loadeddata extends DPlayerEvents
  
  @js.native
  sealed trait loadedmetadata extends DPlayerEvents
  
  @js.native
  sealed trait loadstart extends DPlayerEvents
  
  @js.native
  sealed trait mozaudioavailable extends DPlayerEvents
  
  @js.native
  sealed trait notice_hide extends DPlayerEvents
  
  @js.native
  sealed trait notice_show extends DPlayerEvents
  
  @js.native
  sealed trait pause extends DPlayerEvents
  
  @js.native
  sealed trait play extends DPlayerEvents
  
  @js.native
  sealed trait playing extends DPlayerEvents
  
  @js.native
  sealed trait progress extends DPlayerEvents
  
  @js.native
  sealed trait quality_end extends DPlayerEvents
  
  @js.native
  sealed trait quality_start extends DPlayerEvents
  
  @js.native
  sealed trait ratechange extends DPlayerEvents
  
  @js.native
  sealed trait resize extends DPlayerEvents
  
  @js.native
  sealed trait screenshot extends DPlayerEvents
  
  @js.native
  sealed trait seeked extends DPlayerEvents
  
  @js.native
  sealed trait seeking extends DPlayerEvents
  
  @js.native
  sealed trait stalled extends DPlayerEvents
  
  @js.native
  sealed trait subtitle_change extends DPlayerEvents
  
  @js.native
  sealed trait subtitle_hide extends DPlayerEvents
  
  @js.native
  sealed trait subtitle_show extends DPlayerEvents
  
  @js.native
  sealed trait suspend extends DPlayerEvents
  
  @js.native
  sealed trait thumbnails_hide extends DPlayerEvents
  
  @js.native
  sealed trait thumbnails_show extends DPlayerEvents
  
  @js.native
  sealed trait timeupdate extends DPlayerEvents
  
  @js.native
  sealed trait volumechange extends DPlayerEvents
  
  @js.native
  sealed trait waiting extends DPlayerEvents
  
  /* "abort" */ val abort: typings.dplayer.dplayerMod.DPlayerEvents.abort with String = js.native
  /* "canplay" */ val canplay: typings.dplayer.dplayerMod.DPlayerEvents.canplay with String = js.native
  /* "canplaythrough" */ val canplaythrough: typings.dplayer.dplayerMod.DPlayerEvents.canplaythrough with String = js.native
  /* "contextmenu_hide" */ val contextmenu_hide: typings.dplayer.dplayerMod.DPlayerEvents.contextmenu_hide with String = js.native
  /* "contextmenu_show" */ val contextmenu_show: typings.dplayer.dplayerMod.DPlayerEvents.contextmenu_show with String = js.native
  /* "danmaku_clear" */ val danmaku_clear: typings.dplayer.dplayerMod.DPlayerEvents.danmaku_clear with String = js.native
  /* "danmaku_hide" */ val danmaku_hide: typings.dplayer.dplayerMod.DPlayerEvents.danmaku_hide with String = js.native
  /* "danmaku_loaded" */ val danmaku_loaded: typings.dplayer.dplayerMod.DPlayerEvents.danmaku_loaded with String = js.native
  /* "danmaku_opacity" */ val danmaku_opacity: typings.dplayer.dplayerMod.DPlayerEvents.danmaku_opacity with String = js.native
  /* "danmaku_send" */ val danmaku_send: typings.dplayer.dplayerMod.DPlayerEvents.danmaku_send with String = js.native
  /* "danmaku_show" */ val danmaku_show: typings.dplayer.dplayerMod.DPlayerEvents.danmaku_show with String = js.native
  /* "destroy" */ val destroy: typings.dplayer.dplayerMod.DPlayerEvents.destroy with String = js.native
  /* "durationchange" */ val durationchange: typings.dplayer.dplayerMod.DPlayerEvents.durationchange with String = js.native
  /* "emptied" */ val emptied: typings.dplayer.dplayerMod.DPlayerEvents.emptied with String = js.native
  /* "ended" */ val ended: typings.dplayer.dplayerMod.DPlayerEvents.ended with String = js.native
  /* "error" */ val error: typings.dplayer.dplayerMod.DPlayerEvents.error with String = js.native
  /* "fullscreen" */ val fullscreen: typings.dplayer.dplayerMod.DPlayerEvents.fullscreen with String = js.native
  /* "fullscreen_cancel" */ val fullscreen_cancel: typings.dplayer.dplayerMod.DPlayerEvents.fullscreen_cancel with String = js.native
  /* "loadeddata" */ val loadeddata: typings.dplayer.dplayerMod.DPlayerEvents.loadeddata with String = js.native
  /* "loadedmetadata" */ val loadedmetadata: typings.dplayer.dplayerMod.DPlayerEvents.loadedmetadata with String = js.native
  /* "loadstart" */ val loadstart: typings.dplayer.dplayerMod.DPlayerEvents.loadstart with String = js.native
  /* "mozaudioavailable" */ val mozaudioavailable: typings.dplayer.dplayerMod.DPlayerEvents.mozaudioavailable with String = js.native
  /* "notice_hide" */ val notice_hide: typings.dplayer.dplayerMod.DPlayerEvents.notice_hide with String = js.native
  /* "notice_show" */ val notice_show: typings.dplayer.dplayerMod.DPlayerEvents.notice_show with String = js.native
  /* "pause" */ val pause: typings.dplayer.dplayerMod.DPlayerEvents.pause with String = js.native
  /* "play" */ val play: typings.dplayer.dplayerMod.DPlayerEvents.play with String = js.native
  /* "playing" */ val playing: typings.dplayer.dplayerMod.DPlayerEvents.playing with String = js.native
  /* "progress" */ val progress: typings.dplayer.dplayerMod.DPlayerEvents.progress with String = js.native
  /* "quality_end" */ val quality_end: typings.dplayer.dplayerMod.DPlayerEvents.quality_end with String = js.native
  /* "quality_start" */ val quality_start: typings.dplayer.dplayerMod.DPlayerEvents.quality_start with String = js.native
  /* "ratechange" */ val ratechange: typings.dplayer.dplayerMod.DPlayerEvents.ratechange with String = js.native
  /* "resize" */ val resize: typings.dplayer.dplayerMod.DPlayerEvents.resize with String = js.native
  /* "screenshot" */ val screenshot: typings.dplayer.dplayerMod.DPlayerEvents.screenshot with String = js.native
  /* "seeked" */ val seeked: typings.dplayer.dplayerMod.DPlayerEvents.seeked with String = js.native
  /* "seeking" */ val seeking: typings.dplayer.dplayerMod.DPlayerEvents.seeking with String = js.native
  /* "stalled" */ val stalled: typings.dplayer.dplayerMod.DPlayerEvents.stalled with String = js.native
  /* "subtitle_change" */ val subtitle_change: typings.dplayer.dplayerMod.DPlayerEvents.subtitle_change with String = js.native
  /* "subtitle_hide" */ val subtitle_hide: typings.dplayer.dplayerMod.DPlayerEvents.subtitle_hide with String = js.native
  /* "subtitle_show" */ val subtitle_show: typings.dplayer.dplayerMod.DPlayerEvents.subtitle_show with String = js.native
  /* "suspend" */ val suspend: typings.dplayer.dplayerMod.DPlayerEvents.suspend with String = js.native
  /* "thumbnails_hide" */ val thumbnails_hide: typings.dplayer.dplayerMod.DPlayerEvents.thumbnails_hide with String = js.native
  /* "thumbnails_show" */ val thumbnails_show: typings.dplayer.dplayerMod.DPlayerEvents.thumbnails_show with String = js.native
  /* "timeupdate" */ val timeupdate: typings.dplayer.dplayerMod.DPlayerEvents.timeupdate with String = js.native
  /* "volumechange" */ val volumechange: typings.dplayer.dplayerMod.DPlayerEvents.volumechange with String = js.native
  /* "waiting" */ val waiting: typings.dplayer.dplayerMod.DPlayerEvents.waiting with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DPlayerEvents with String] = js.native
}

