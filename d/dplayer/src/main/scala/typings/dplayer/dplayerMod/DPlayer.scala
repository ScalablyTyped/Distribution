package typings.dplayer.dplayerMod

import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DPlayer extends js.Object {
  var danmaku: Danmaku
  var events: js.Any
  var fullScreen: FullScreen
  var video: HTMLVideoElement
  def destroy(): Unit
  def notice(text: String, time: Double, opacity: Double): Unit
  def on(event: DPlayerEvents, handler: js.Function0[Unit]): Unit
  def pause(): Unit
  def play(): Unit
  def seek(time: Double): Unit
  def speed(rate: Double): Unit
  def switchQuality(index: Double): Unit
  def switchVideo(video: DPlayerVideo, danmaku: DPlayerDanmaku): Unit
  def toggle(): Unit
  def volume(percentage: Double, nostorage: Boolean, nonotice: Boolean): Unit
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
    val __obj = js.Dynamic.literal(danmaku = danmaku, destroy = js.Any.fromFunction0(destroy), events = events, fullScreen = fullScreen, notice = js.Any.fromFunction3(notice), on = js.Any.fromFunction2(on), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), seek = js.Any.fromFunction1(seek), speed = js.Any.fromFunction1(speed), switchQuality = js.Any.fromFunction1(switchQuality), switchVideo = js.Any.fromFunction2(switchVideo), toggle = js.Any.fromFunction0(toggle), video = video, volume = js.Any.fromFunction3(volume))
  
    __obj.asInstanceOf[DPlayer]
  }
}

