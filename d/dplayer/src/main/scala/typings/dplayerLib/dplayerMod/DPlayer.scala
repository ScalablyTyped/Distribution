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
    destroy: js.Function0[scala.Unit],
    events: js.Any,
    fullScreen: FullScreen,
    notice: js.Function3[java.lang.String, scala.Double, scala.Double, scala.Unit],
    on: js.Function2[DPlayerEvents, js.Function0[scala.Unit], scala.Unit],
    pause: js.Function0[scala.Unit],
    play: js.Function0[scala.Unit],
    seek: js.Function1[scala.Double, scala.Unit],
    speed: js.Function1[scala.Double, scala.Unit],
    switchQuality: js.Function1[scala.Double, scala.Unit],
    switchVideo: js.Function2[DPlayerVideo, DPlayerDanmaku, scala.Unit],
    toggle: js.Function0[scala.Unit],
    video: stdLib.HTMLVideoElement,
    volume: js.Function3[scala.Double, scala.Boolean, scala.Boolean, scala.Unit]
  ): DPlayer = {
    val __obj = js.Dynamic.literal(danmaku = danmaku, destroy = destroy, events = events, fullScreen = fullScreen, notice = notice, on = on, pause = pause, play = play, seek = seek, speed = speed, switchQuality = switchQuality, switchVideo = switchVideo, toggle = toggle, video = video, volume = volume)
  
    __obj.asInstanceOf[DPlayer]
  }
}

