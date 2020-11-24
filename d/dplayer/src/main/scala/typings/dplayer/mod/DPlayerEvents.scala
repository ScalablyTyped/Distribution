package typings.dplayer.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DPlayerEvents extends js.Object
@JSImport("dplayer", "DPlayerEvents")
@js.native
object DPlayerEvents extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DPlayerEvents with String] = js.native
  
  @js.native
  sealed trait abort extends DPlayerEvents
  /* "abort" */ @js.native
  object abort extends TopLevel[abort with String]
  
  @js.native
  sealed trait canplay extends DPlayerEvents
  /* "canplay" */ @js.native
  object canplay extends TopLevel[canplay with String]
  
  @js.native
  sealed trait canplaythrough extends DPlayerEvents
  /* "canplaythrough" */ @js.native
  object canplaythrough extends TopLevel[canplaythrough with String]
  
  @js.native
  sealed trait contextmenu_hide extends DPlayerEvents
  /* "contextmenu_hide" */ @js.native
  object contextmenu_hide extends TopLevel[contextmenu_hide with String]
  
  @js.native
  sealed trait contextmenu_show extends DPlayerEvents
  /* "contextmenu_show" */ @js.native
  object contextmenu_show extends TopLevel[contextmenu_show with String]
  
  @js.native
  sealed trait danmaku_clear extends DPlayerEvents
  /* "danmaku_clear" */ @js.native
  object danmaku_clear extends TopLevel[danmaku_clear with String]
  
  @js.native
  sealed trait danmaku_hide extends DPlayerEvents
  /* "danmaku_hide" */ @js.native
  object danmaku_hide extends TopLevel[danmaku_hide with String]
  
  @js.native
  sealed trait danmaku_loaded extends DPlayerEvents
  /* "danmaku_loaded" */ @js.native
  object danmaku_loaded extends TopLevel[danmaku_loaded with String]
  
  @js.native
  sealed trait danmaku_opacity extends DPlayerEvents
  /* "danmaku_opacity" */ @js.native
  object danmaku_opacity extends TopLevel[danmaku_opacity with String]
  
  @js.native
  sealed trait danmaku_send extends DPlayerEvents
  /* "danmaku_send" */ @js.native
  object danmaku_send extends TopLevel[danmaku_send with String]
  
  @js.native
  sealed trait danmaku_show extends DPlayerEvents
  /* "danmaku_show" */ @js.native
  object danmaku_show extends TopLevel[danmaku_show with String]
  
  @js.native
  sealed trait destroy extends DPlayerEvents
  /* "destroy" */ @js.native
  object destroy extends TopLevel[destroy with String]
  
  @js.native
  sealed trait durationchange extends DPlayerEvents
  /* "durationchange" */ @js.native
  object durationchange extends TopLevel[durationchange with String]
  
  @js.native
  sealed trait emptied extends DPlayerEvents
  /* "emptied" */ @js.native
  object emptied extends TopLevel[emptied with String]
  
  @js.native
  sealed trait ended extends DPlayerEvents
  /* "ended" */ @js.native
  object ended extends TopLevel[ended with String]
  
  @js.native
  sealed trait error extends DPlayerEvents
  /* "error" */ @js.native
  object error extends TopLevel[error with String]
  
  @js.native
  sealed trait fullscreen extends DPlayerEvents
  /* "fullscreen" */ @js.native
  object fullscreen extends TopLevel[fullscreen with String]
  
  @js.native
  sealed trait fullscreen_cancel extends DPlayerEvents
  /* "fullscreen_cancel" */ @js.native
  object fullscreen_cancel extends TopLevel[fullscreen_cancel with String]
  
  @js.native
  sealed trait loadeddata extends DPlayerEvents
  /* "loadeddata" */ @js.native
  object loadeddata extends TopLevel[loadeddata with String]
  
  @js.native
  sealed trait loadedmetadata extends DPlayerEvents
  /* "loadedmetadata" */ @js.native
  object loadedmetadata extends TopLevel[loadedmetadata with String]
  
  @js.native
  sealed trait loadstart extends DPlayerEvents
  /* "loadstart" */ @js.native
  object loadstart extends TopLevel[loadstart with String]
  
  @js.native
  sealed trait mozaudioavailable extends DPlayerEvents
  /* "mozaudioavailable" */ @js.native
  object mozaudioavailable extends TopLevel[mozaudioavailable with String]
  
  @js.native
  sealed trait notice_hide extends DPlayerEvents
  /* "notice_hide" */ @js.native
  object notice_hide extends TopLevel[notice_hide with String]
  
  @js.native
  sealed trait notice_show extends DPlayerEvents
  /* "notice_show" */ @js.native
  object notice_show extends TopLevel[notice_show with String]
  
  @js.native
  sealed trait pause extends DPlayerEvents
  /* "pause" */ @js.native
  object pause extends TopLevel[pause with String]
  
  @js.native
  sealed trait play extends DPlayerEvents
  /* "play" */ @js.native
  object play extends TopLevel[play with String]
  
  @js.native
  sealed trait playing extends DPlayerEvents
  /* "playing" */ @js.native
  object playing extends TopLevel[playing with String]
  
  @js.native
  sealed trait progress extends DPlayerEvents
  /* "progress" */ @js.native
  object progress extends TopLevel[progress with String]
  
  @js.native
  sealed trait quality_end extends DPlayerEvents
  /* "quality_end" */ @js.native
  object quality_end extends TopLevel[quality_end with String]
  
  @js.native
  sealed trait quality_start extends DPlayerEvents
  /* "quality_start" */ @js.native
  object quality_start extends TopLevel[quality_start with String]
  
  @js.native
  sealed trait ratechange extends DPlayerEvents
  /* "ratechange" */ @js.native
  object ratechange extends TopLevel[ratechange with String]
  
  @js.native
  sealed trait resize extends DPlayerEvents
  /* "resize" */ @js.native
  object resize extends TopLevel[resize with String]
  
  @js.native
  sealed trait screenshot extends DPlayerEvents
  /* "screenshot" */ @js.native
  object screenshot extends TopLevel[screenshot with String]
  
  @js.native
  sealed trait seeked extends DPlayerEvents
  /* "seeked" */ @js.native
  object seeked extends TopLevel[seeked with String]
  
  @js.native
  sealed trait seeking extends DPlayerEvents
  /* "seeking" */ @js.native
  object seeking extends TopLevel[seeking with String]
  
  @js.native
  sealed trait stalled extends DPlayerEvents
  /* "stalled" */ @js.native
  object stalled extends TopLevel[stalled with String]
  
  @js.native
  sealed trait subtitle_change extends DPlayerEvents
  /* "subtitle_change" */ @js.native
  object subtitle_change extends TopLevel[subtitle_change with String]
  
  @js.native
  sealed trait subtitle_hide extends DPlayerEvents
  /* "subtitle_hide" */ @js.native
  object subtitle_hide extends TopLevel[subtitle_hide with String]
  
  @js.native
  sealed trait subtitle_show extends DPlayerEvents
  /* "subtitle_show" */ @js.native
  object subtitle_show extends TopLevel[subtitle_show with String]
  
  @js.native
  sealed trait suspend extends DPlayerEvents
  /* "suspend" */ @js.native
  object suspend extends TopLevel[suspend with String]
  
  @js.native
  sealed trait thumbnails_hide extends DPlayerEvents
  /* "thumbnails_hide" */ @js.native
  object thumbnails_hide extends TopLevel[thumbnails_hide with String]
  
  @js.native
  sealed trait thumbnails_show extends DPlayerEvents
  /* "thumbnails_show" */ @js.native
  object thumbnails_show extends TopLevel[thumbnails_show with String]
  
  @js.native
  sealed trait timeupdate extends DPlayerEvents
  /* "timeupdate" */ @js.native
  object timeupdate extends TopLevel[timeupdate with String]
  
  @js.native
  sealed trait volumechange extends DPlayerEvents
  /* "volumechange" */ @js.native
  object volumechange extends TopLevel[volumechange with String]
  
  @js.native
  sealed trait waiting extends DPlayerEvents
  /* "waiting" */ @js.native
  object waiting extends TopLevel[waiting with String]
}
