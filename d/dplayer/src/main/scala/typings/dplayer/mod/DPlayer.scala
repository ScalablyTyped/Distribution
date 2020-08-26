package typings.dplayer.mod

import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DPlayer extends js.Object {
  var danmaku: Danmaku = js.native
  var events: js.Any = js.native
  var fullScreen: FullScreen = js.native
  var video: HTMLVideoElement = js.native
  def destroy(): Unit = js.native
  def notice(text: String, time: Double, opacity: Double): Unit = js.native
  def on(event: DPlayerEvents, handler: js.Function0[Unit]): Unit = js.native
  def pause(): Unit = js.native
  def play(): Unit = js.native
  def seek(time: Double): Unit = js.native
  def speed(rate: Double): Unit = js.native
  def switchQuality(index: Double): Unit = js.native
  def switchVideo(video: DPlayerVideo, danmaku: DPlayerDanmaku): Unit = js.native
  def toggle(): Unit = js.native
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
  implicit class DPlayerOps[Self <: DPlayer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDanmaku(value: Danmaku): Self = this.set("danmaku", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setEvents(value: js.Any): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullScreen(value: FullScreen): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotice(value: (String, Double, Double) => Unit): Self = this.set("notice", js.Any.fromFunction3(value))
    @scala.inline
    def setOn(value: (DPlayerEvents, js.Function0[Unit]) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    @scala.inline
    def setPlay(value: () => Unit): Self = this.set("play", js.Any.fromFunction0(value))
    @scala.inline
    def setSeek(value: Double => Unit): Self = this.set("seek", js.Any.fromFunction1(value))
    @scala.inline
    def setSpeed(value: Double => Unit): Self = this.set("speed", js.Any.fromFunction1(value))
    @scala.inline
    def setSwitchQuality(value: Double => Unit): Self = this.set("switchQuality", js.Any.fromFunction1(value))
    @scala.inline
    def setSwitchVideo(value: (DPlayerVideo, DPlayerDanmaku) => Unit): Self = this.set("switchVideo", js.Any.fromFunction2(value))
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
    @scala.inline
    def setVideo(value: HTMLVideoElement): Self = this.set("video", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolume(value: (Double, Boolean, Boolean) => Unit): Self = this.set("volume", js.Any.fromFunction3(value))
  }
  
}

