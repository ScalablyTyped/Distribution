package typings.dplayer.mod

import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DPlayer extends StObject {
  
  var danmaku: Danmaku
  
  def destroy(): Unit
  
  var events: js.Any
  
  var fullScreen: FullScreen
  
  def notice(text: String, time: Double, opacity: Double): Unit
  
  def on(event: DPlayerEvents, handler: js.Function0[Unit]): Unit
  
  def pause(): Unit
  
  def play(): Unit
  
  def seek(time: Double): Unit
  
  def speed(rate: Double): Unit
  
  def switchQuality(index: Double): Unit
  
  def switchVideo(video: DPlayerVideo, danmaku: DPlayerDanmaku): Unit
  
  def toggle(): Unit
  
  var video: HTMLVideoElement
  
  def volume(percentage: Double, nostorage: Boolean, nonotice: Boolean): Unit
}
object DPlayer {
  
  inline def apply(
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
  
  extension [Self <: DPlayer](x: Self) {
    
    inline def setDanmaku(value: Danmaku): Self = StObject.set(x, "danmaku", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setEvents(value: js.Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setFullScreen(value: FullScreen): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
    
    inline def setNotice(value: (String, Double, Double) => Unit): Self = StObject.set(x, "notice", js.Any.fromFunction3(value))
    
    inline def setOn(value: (DPlayerEvents, js.Function0[Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    inline def setSeek(value: Double => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
    
    inline def setSpeed(value: Double => Unit): Self = StObject.set(x, "speed", js.Any.fromFunction1(value))
    
    inline def setSwitchQuality(value: Double => Unit): Self = StObject.set(x, "switchQuality", js.Any.fromFunction1(value))
    
    inline def setSwitchVideo(value: (DPlayerVideo, DPlayerDanmaku) => Unit): Self = StObject.set(x, "switchVideo", js.Any.fromFunction2(value))
    
    inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    
    inline def setVideo(value: HTMLVideoElement): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVolume(value: (Double, Boolean, Boolean) => Unit): Self = StObject.set(x, "volume", js.Any.fromFunction3(value))
  }
}
