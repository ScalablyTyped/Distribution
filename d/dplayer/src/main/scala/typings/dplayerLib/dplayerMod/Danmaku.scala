package typings
package dplayerLib.dplayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Danmaku extends js.Object {
  def clear(): scala.Unit
  def draw(danmaku: DPlayerDanmakuItem): scala.Unit
  def hide(): scala.Unit
  def opacity(percentage: scala.Double): scala.Unit
  def send(danmaku: DPlayerDanmakuItem, callback: js.Function0[scala.Unit]): scala.Unit
  def show(): scala.Unit
}

