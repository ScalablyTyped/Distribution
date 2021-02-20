package typings.dplayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DPlayerEvents extends StObject
@JSImport("dplayer", "DPlayerEvents")
@js.native
object DPlayerEvents extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DPlayerEvents with String] = js.native
  
  @js.native
  sealed trait abort extends DPlayerEvents
  /* "abort" */ val abort: typings.dplayer.mod.DPlayerEvents.abort with String = js.native
  
  @js.native
  sealed trait canplay extends DPlayerEvents
  /* "canplay" */ val canplay: typings.dplayer.mod.DPlayerEvents.canplay with String = js.native
  
  @js.native
  sealed trait canplaythrough extends DPlayerEvents
  /* "canplaythrough" */ val canplaythrough: typings.dplayer.mod.DPlayerEvents.canplaythrough with String = js.native
  
  @js.native
  sealed trait contextmenu_hide extends DPlayerEvents
  /* "contextmenu_hide" */ val contextmenu_hide: typings.dplayer.mod.DPlayerEvents.contextmenu_hide with String = js.native
  
  @js.native
  sealed trait contextmenu_show extends DPlayerEvents
  /* "contextmenu_show" */ val contextmenu_show: typings.dplayer.mod.DPlayerEvents.contextmenu_show with String = js.native
  
  @js.native
  sealed trait danmaku_clear extends DPlayerEvents
  /* "danmaku_clear" */ val danmaku_clear: typings.dplayer.mod.DPlayerEvents.danmaku_clear with String = js.native
  
  @js.native
  sealed trait danmaku_hide extends DPlayerEvents
  /* "danmaku_hide" */ val danmaku_hide: typings.dplayer.mod.DPlayerEvents.danmaku_hide with String = js.native
  
  @js.native
  sealed trait danmaku_loaded extends DPlayerEvents
  /* "danmaku_loaded" */ val danmaku_loaded: typings.dplayer.mod.DPlayerEvents.danmaku_loaded with String = js.native
  
  @js.native
  sealed trait danmaku_opacity extends DPlayerEvents
  /* "danmaku_opacity" */ val danmaku_opacity: typings.dplayer.mod.DPlayerEvents.danmaku_opacity with String = js.native
  
  @js.native
  sealed trait danmaku_send extends DPlayerEvents
  /* "danmaku_send" */ val danmaku_send: typings.dplayer.mod.DPlayerEvents.danmaku_send with String = js.native
  
  @js.native
  sealed trait danmaku_show extends DPlayerEvents
  /* "danmaku_show" */ val danmaku_show: typings.dplayer.mod.DPlayerEvents.danmaku_show with String = js.native
  
  @js.native
  sealed trait destroy extends DPlayerEvents
  /* "destroy" */ val destroy: typings.dplayer.mod.DPlayerEvents.destroy with String = js.native
  
  @js.native
  sealed trait durationchange extends DPlayerEvents
  /* "durationchange" */ val durationchange: typings.dplayer.mod.DPlayerEvents.durationchange with String = js.native
  
  @js.native
  sealed trait emptied extends DPlayerEvents
  /* "emptied" */ val emptied: typings.dplayer.mod.DPlayerEvents.emptied with String = js.native
  
  @js.native
  sealed trait ended extends DPlayerEvents
  /* "ended" */ val ended: typings.dplayer.mod.DPlayerEvents.ended with String = js.native
  
  @js.native
  sealed trait error extends DPlayerEvents
  /* "error" */ val error: typings.dplayer.mod.DPlayerEvents.error with String = js.native
  
  @js.native
  sealed trait fullscreen extends DPlayerEvents
  /* "fullscreen" */ val fullscreen: typings.dplayer.mod.DPlayerEvents.fullscreen with String = js.native
  
  @js.native
  sealed trait fullscreen_cancel extends DPlayerEvents
  /* "fullscreen_cancel" */ val fullscreen_cancel: typings.dplayer.mod.DPlayerEvents.fullscreen_cancel with String = js.native
  
  @js.native
  sealed trait loadeddata extends DPlayerEvents
  /* "loadeddata" */ val loadeddata: typings.dplayer.mod.DPlayerEvents.loadeddata with String = js.native
  
  @js.native
  sealed trait loadedmetadata extends DPlayerEvents
  /* "loadedmetadata" */ val loadedmetadata: typings.dplayer.mod.DPlayerEvents.loadedmetadata with String = js.native
  
  @js.native
  sealed trait loadstart extends DPlayerEvents
  /* "loadstart" */ val loadstart: typings.dplayer.mod.DPlayerEvents.loadstart with String = js.native
  
  @js.native
  sealed trait mozaudioavailable extends DPlayerEvents
  /* "mozaudioavailable" */ val mozaudioavailable: typings.dplayer.mod.DPlayerEvents.mozaudioavailable with String = js.native
  
  @js.native
  sealed trait notice_hide extends DPlayerEvents
  /* "notice_hide" */ val notice_hide: typings.dplayer.mod.DPlayerEvents.notice_hide with String = js.native
  
  @js.native
  sealed trait notice_show extends DPlayerEvents
  /* "notice_show" */ val notice_show: typings.dplayer.mod.DPlayerEvents.notice_show with String = js.native
  
  @js.native
  sealed trait pause extends DPlayerEvents
  /* "pause" */ val pause: typings.dplayer.mod.DPlayerEvents.pause with String = js.native
  
  @js.native
  sealed trait play extends DPlayerEvents
  /* "play" */ val play: typings.dplayer.mod.DPlayerEvents.play with String = js.native
  
  @js.native
  sealed trait playing extends DPlayerEvents
  /* "playing" */ val playing: typings.dplayer.mod.DPlayerEvents.playing with String = js.native
  
  @js.native
  sealed trait progress extends DPlayerEvents
  /* "progress" */ val progress: typings.dplayer.mod.DPlayerEvents.progress with String = js.native
  
  @js.native
  sealed trait quality_end extends DPlayerEvents
  /* "quality_end" */ val quality_end: typings.dplayer.mod.DPlayerEvents.quality_end with String = js.native
  
  @js.native
  sealed trait quality_start extends DPlayerEvents
  /* "quality_start" */ val quality_start: typings.dplayer.mod.DPlayerEvents.quality_start with String = js.native
  
  @js.native
  sealed trait ratechange extends DPlayerEvents
  /* "ratechange" */ val ratechange: typings.dplayer.mod.DPlayerEvents.ratechange with String = js.native
  
  @js.native
  sealed trait resize extends DPlayerEvents
  /* "resize" */ val resize: typings.dplayer.mod.DPlayerEvents.resize with String = js.native
  
  @js.native
  sealed trait screenshot extends DPlayerEvents
  /* "screenshot" */ val screenshot: typings.dplayer.mod.DPlayerEvents.screenshot with String = js.native
  
  @js.native
  sealed trait seeked extends DPlayerEvents
  /* "seeked" */ val seeked: typings.dplayer.mod.DPlayerEvents.seeked with String = js.native
  
  @js.native
  sealed trait seeking extends DPlayerEvents
  /* "seeking" */ val seeking: typings.dplayer.mod.DPlayerEvents.seeking with String = js.native
  
  @js.native
  sealed trait stalled extends DPlayerEvents
  /* "stalled" */ val stalled: typings.dplayer.mod.DPlayerEvents.stalled with String = js.native
  
  @js.native
  sealed trait subtitle_change extends DPlayerEvents
  /* "subtitle_change" */ val subtitle_change: typings.dplayer.mod.DPlayerEvents.subtitle_change with String = js.native
  
  @js.native
  sealed trait subtitle_hide extends DPlayerEvents
  /* "subtitle_hide" */ val subtitle_hide: typings.dplayer.mod.DPlayerEvents.subtitle_hide with String = js.native
  
  @js.native
  sealed trait subtitle_show extends DPlayerEvents
  /* "subtitle_show" */ val subtitle_show: typings.dplayer.mod.DPlayerEvents.subtitle_show with String = js.native
  
  @js.native
  sealed trait suspend extends DPlayerEvents
  /* "suspend" */ val suspend: typings.dplayer.mod.DPlayerEvents.suspend with String = js.native
  
  @js.native
  sealed trait thumbnails_hide extends DPlayerEvents
  /* "thumbnails_hide" */ val thumbnails_hide: typings.dplayer.mod.DPlayerEvents.thumbnails_hide with String = js.native
  
  @js.native
  sealed trait thumbnails_show extends DPlayerEvents
  /* "thumbnails_show" */ val thumbnails_show: typings.dplayer.mod.DPlayerEvents.thumbnails_show with String = js.native
  
  @js.native
  sealed trait timeupdate extends DPlayerEvents
  /* "timeupdate" */ val timeupdate: typings.dplayer.mod.DPlayerEvents.timeupdate with String = js.native
  
  @js.native
  sealed trait volumechange extends DPlayerEvents
  /* "volumechange" */ val volumechange: typings.dplayer.mod.DPlayerEvents.volumechange with String = js.native
  
  @js.native
  sealed trait waiting extends DPlayerEvents
  /* "waiting" */ val waiting: typings.dplayer.mod.DPlayerEvents.waiting with String = js.native
}
