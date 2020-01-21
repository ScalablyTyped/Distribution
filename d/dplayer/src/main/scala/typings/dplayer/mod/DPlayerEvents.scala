package typings.dplayer.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DPlayerEvents with String] = js.native
  /* "abort" */ @js.native
  object abort extends TopLevel[abort with String]
  
  /* "canplay" */ @js.native
  object canplay extends TopLevel[canplay with String]
  
  /* "canplaythrough" */ @js.native
  object canplaythrough extends TopLevel[canplaythrough with String]
  
  /* "contextmenu_hide" */ @js.native
  object contextmenu_hide extends TopLevel[contextmenu_hide with String]
  
  /* "contextmenu_show" */ @js.native
  object contextmenu_show extends TopLevel[contextmenu_show with String]
  
  /* "danmaku_clear" */ @js.native
  object danmaku_clear extends TopLevel[danmaku_clear with String]
  
  /* "danmaku_hide" */ @js.native
  object danmaku_hide extends TopLevel[danmaku_hide with String]
  
  /* "danmaku_loaded" */ @js.native
  object danmaku_loaded extends TopLevel[danmaku_loaded with String]
  
  /* "danmaku_opacity" */ @js.native
  object danmaku_opacity extends TopLevel[danmaku_opacity with String]
  
  /* "danmaku_send" */ @js.native
  object danmaku_send extends TopLevel[danmaku_send with String]
  
  /* "danmaku_show" */ @js.native
  object danmaku_show extends TopLevel[danmaku_show with String]
  
  /* "destroy" */ @js.native
  object destroy extends TopLevel[destroy with String]
  
  /* "durationchange" */ @js.native
  object durationchange extends TopLevel[durationchange with String]
  
  /* "emptied" */ @js.native
  object emptied extends TopLevel[emptied with String]
  
  /* "ended" */ @js.native
  object ended extends TopLevel[ended with String]
  
  /* "error" */ @js.native
  object error extends TopLevel[error with String]
  
  /* "fullscreen" */ @js.native
  object fullscreen extends TopLevel[fullscreen with String]
  
  /* "fullscreen_cancel" */ @js.native
  object fullscreen_cancel extends TopLevel[fullscreen_cancel with String]
  
  /* "loadeddata" */ @js.native
  object loadeddata extends TopLevel[loadeddata with String]
  
  /* "loadedmetadata" */ @js.native
  object loadedmetadata extends TopLevel[loadedmetadata with String]
  
  /* "loadstart" */ @js.native
  object loadstart extends TopLevel[loadstart with String]
  
  /* "mozaudioavailable" */ @js.native
  object mozaudioavailable extends TopLevel[mozaudioavailable with String]
  
  /* "notice_hide" */ @js.native
  object notice_hide extends TopLevel[notice_hide with String]
  
  /* "notice_show" */ @js.native
  object notice_show extends TopLevel[notice_show with String]
  
  /* "pause" */ @js.native
  object pause extends TopLevel[pause with String]
  
  /* "play" */ @js.native
  object play extends TopLevel[play with String]
  
  /* "playing" */ @js.native
  object playing extends TopLevel[playing with String]
  
  /* "progress" */ @js.native
  object progress extends TopLevel[progress with String]
  
  /* "quality_end" */ @js.native
  object quality_end extends TopLevel[quality_end with String]
  
  /* "quality_start" */ @js.native
  object quality_start extends TopLevel[quality_start with String]
  
  /* "ratechange" */ @js.native
  object ratechange extends TopLevel[ratechange with String]
  
  /* "resize" */ @js.native
  object resize extends TopLevel[resize with String]
  
  /* "screenshot" */ @js.native
  object screenshot extends TopLevel[screenshot with String]
  
  /* "seeked" */ @js.native
  object seeked extends TopLevel[seeked with String]
  
  /* "seeking" */ @js.native
  object seeking extends TopLevel[seeking with String]
  
  /* "stalled" */ @js.native
  object stalled extends TopLevel[stalled with String]
  
  /* "subtitle_change" */ @js.native
  object subtitle_change extends TopLevel[subtitle_change with String]
  
  /* "subtitle_hide" */ @js.native
  object subtitle_hide extends TopLevel[subtitle_hide with String]
  
  /* "subtitle_show" */ @js.native
  object subtitle_show extends TopLevel[subtitle_show with String]
  
  /* "suspend" */ @js.native
  object suspend extends TopLevel[suspend with String]
  
  /* "thumbnails_hide" */ @js.native
  object thumbnails_hide extends TopLevel[thumbnails_hide with String]
  
  /* "thumbnails_show" */ @js.native
  object thumbnails_show extends TopLevel[thumbnails_show with String]
  
  /* "timeupdate" */ @js.native
  object timeupdate extends TopLevel[timeupdate with String]
  
  /* "volumechange" */ @js.native
  object volumechange extends TopLevel[volumechange with String]
  
  /* "waiting" */ @js.native
  object waiting extends TopLevel[waiting with String]
  
}

