package typings
package dplayerLib.dplayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DPlayer extends js.Object {
  var danmaku: Danmaku
  var events: js.Any
  var fullScreen: FullScreen
  var video: stdLib.HTMLVideoElement
  def destroy(): scala.Unit
  def notice(text: java.lang.String, time: scala.Double, opacity: scala.Double): scala.Unit
  def on(event: DPlayerEvents, handler: js.Function0[scala.Unit]): scala.Unit
  def pause(): scala.Unit
  def play(): scala.Unit
  def seek(time: scala.Double): scala.Unit
  def speed(rate: scala.Double): scala.Unit
  def switchQuality(index: scala.Double): scala.Unit
  def switchVideo(video: DPlayerVideo, danmaku: DPlayerDanmaku): scala.Unit
  def toggle(): scala.Unit
  def volume(percentage: scala.Double, nostorage: scala.Boolean, nonotice: scala.Boolean): scala.Unit
}

object DPlayer {
  @scala.inline
  def apply(
    danmaku: Danmaku,
    destroy: () => scala.Unit,
    events: js.Any,
    fullScreen: FullScreen,
    notice: (java.lang.String, scala.Double, scala.Double) => scala.Unit,
    on: (DPlayerEvents, js.Function0[scala.Unit]) => scala.Unit,
    pause: () => scala.Unit,
    play: () => scala.Unit,
    seek: scala.Double => scala.Unit,
    speed: scala.Double => scala.Unit,
    switchQuality: scala.Double => scala.Unit,
    switchVideo: (DPlayerVideo, DPlayerDanmaku) => scala.Unit,
    toggle: () => scala.Unit,
    video: stdLib.HTMLVideoElement,
    volume: (scala.Double, scala.Boolean, scala.Boolean) => scala.Unit
  ): DPlayer = {
    val __obj = js.Dynamic.literal(danmaku = danmaku, destroy = js.Any.fromFunction0(destroy), events = events, fullScreen = fullScreen, notice = js.Any.fromFunction3(notice), on = js.Any.fromFunction2(on), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), seek = js.Any.fromFunction1(seek), speed = js.Any.fromFunction1(speed), switchQuality = js.Any.fromFunction1(switchQuality), switchVideo = js.Any.fromFunction2(switchVideo), toggle = js.Any.fromFunction0(toggle), video = video, volume = js.Any.fromFunction3(volume))
  
    __obj.asInstanceOf[DPlayer]
  }
}

