package typings
package dplayerLib.dplayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dplayer", JSImport.Default)
@js.native
class default protected () extends DPlayer {
  def this(options: DPlayerOptions) = this()
  /* CompleteClass */
  override var events: js.Any = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def notice(text: java.lang.String, time: scala.Double, opacity: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def on(event: DPlayerEvents, handler: js.Function0[scala.Unit]): scala.Unit = js.native
  /* CompleteClass */
  override def pause(): scala.Unit = js.native
  /* CompleteClass */
  override def play(): scala.Unit = js.native
  /* CompleteClass */
  override def seek(time: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def speed(rate: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def switchQuality(index: scala.Double): scala.Unit = js.native
  /* CompleteClass */
  override def switchVideo(video: DPlayerVideo, danmaku: DPlayerDanmaku): scala.Unit = js.native
  /* CompleteClass */
  override def toggle(): scala.Unit = js.native
  /* CompleteClass */
  override def volume(percentage: scala.Double, nostorage: scala.Boolean, nonotice: scala.Boolean): scala.Unit = js.native
}

