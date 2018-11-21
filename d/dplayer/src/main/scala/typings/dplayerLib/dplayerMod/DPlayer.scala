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

