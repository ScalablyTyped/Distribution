package typings.dplayer.mod

import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dplayer", JSImport.Default)
@js.native
class default protected () extends DPlayer {
  def this(options: DPlayerOptions) = this()
  /* CompleteClass */
  override var danmaku: Danmaku = js.native
  /* CompleteClass */
  override var events: js.Any = js.native
  /* CompleteClass */
  override var fullScreen: FullScreen = js.native
  /* CompleteClass */
  override var video: HTMLVideoElement = js.native
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /* CompleteClass */
  override def notice(text: String, time: Double, opacity: Double): Unit = js.native
  /* CompleteClass */
  override def on(event: DPlayerEvents, handler: js.Function0[Unit]): Unit = js.native
  /* CompleteClass */
  override def pause(): Unit = js.native
  /* CompleteClass */
  override def play(): Unit = js.native
  /* CompleteClass */
  override def seek(time: Double): Unit = js.native
  /* CompleteClass */
  override def speed(rate: Double): Unit = js.native
  /* CompleteClass */
  override def switchQuality(index: Double): Unit = js.native
  /* CompleteClass */
  override def switchVideo(video: DPlayerVideo, danmaku: DPlayerDanmaku): Unit = js.native
  /* CompleteClass */
  override def toggle(): Unit = js.native
  /* CompleteClass */
  override def volume(percentage: Double, nostorage: Boolean, nonotice: Boolean): Unit = js.native
}

