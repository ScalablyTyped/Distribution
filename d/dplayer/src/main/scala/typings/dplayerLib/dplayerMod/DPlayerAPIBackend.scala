package typings
package dplayerLib.dplayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DPlayerAPIBackend extends js.Object {
  def read(endpoint: js.Any, callback: js.Function0[scala.Unit]): scala.Unit
  def send(endpoint: js.Any, danmakuData: DPlayerDanmakuItem, callback: js.Function0[scala.Unit]): scala.Unit
}

