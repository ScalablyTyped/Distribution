package typings.dplayer.mod

import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DPlayer extends StObject {
  
  var danmaku: Danmaku = js.native
  
  def destroy(): Unit = js.native
  
  var events: js.Any = js.native
  
  var fullScreen: FullScreen = js.native
  
  def notice(text: String, time: Double, opacity: Double): Unit = js.native
  
  def on(event: DPlayerEvents, handler: js.Function0[Unit]): Unit = js.native
  
  def pause(): Unit = js.native
  
  def play(): Unit = js.native
  
  def seek(time: Double): Unit = js.native
  
  def speed(rate: Double): Unit = js.native
  
  def switchQuality(index: Double): Unit = js.native
  
  def switchVideo(video: DPlayerVideo, danmaku: DPlayerDanmaku): Unit = js.native
  
  def toggle(): Unit = js.native
  
  var video: HTMLVideoElement = js.native
  
  def volume(percentage: Double, nostorage: Boolean, nonotice: Boolean): Unit = js.native
}
object DPlayer {
  
  @scala.inline
  def apply(
    danmaku: Danmaku,
    destroy: () => Unit,
    events: js.Any,
    fullScreen: FullScreen,
    notice: (String, Double, Double) => Unit,
    on: (DPlayerEvents, js.Function0[Unit]) => Unit,
    pause: () => Unit,
    play: () => Unit,
    seek: Double => Unit,
    speed: Double => Unit,
    switchQuality: Double => Unit,
    switchVideo: (DPlayerVideo, DPlayerDanmaku) => Unit,
    toggle: () => Unit,
    video: HTMLVideoElement,
    volume: (Double, Boolean, Boolean) => Unit
  ): DPlayer = {
    val __obj = js.Dynamic.literal(danmaku = danmaku.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), events = events.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any], notice = js.Any.fromFunction3(notice), on = js.Any.fromFunction2(on), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), seek = js.Any.fromFunction1(seek), speed = js.Any.fromFunction1(speed), switchQuality = js.Any.fromFunction1(switchQuality), switchVideo = js.Any.fromFunction2(switchVideo), toggle = js.Any.fromFunction0(toggle), video = video.asInstanceOf[js.Any], volume = js.Any.fromFunction3(volume))
    __obj.asInstanceOf[DPlayer]
  }
  
  @scala.inline
  implicit class DPlayerMutableBuilder[Self <: DPlayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDanmaku(value: Danmaku): Self = StObject.set(x, "danmaku", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEvents(value: js.Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullScreen(value: FullScreen): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotice(value: (String, Double, Double) => Unit): Self = StObject.set(x, "notice", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOn(value: (DPlayerEvents, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSeek(value: Double => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSpeed(value: Double => Unit): Self = StObject.set(x, "speed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSwitchQuality(value: Double => Unit): Self = StObject.set(x, "switchQuality", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSwitchVideo(value: (DPlayerVideo, DPlayerDanmaku) => Unit): Self = StObject.set(x, "switchVideo", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setVideo(value: HTMLVideoElement): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume(value: (Double, Boolean, Boolean) => Unit): Self = StObject.set(x, "volume", js.Any.fromFunction3(value))
  }
}
