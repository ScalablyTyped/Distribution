package typings
package dplayerLib.dplayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DPlayerAPIBackend extends js.Object {
  def read(endpoint: js.Any, callback: js.Function0[scala.Unit]): scala.Unit
  def send(endpoint: js.Any, danmakuData: DPlayerDanmakuItem, callback: js.Function0[scala.Unit]): scala.Unit
}

object DPlayerAPIBackend {
  @scala.inline
  def apply(
    read: js.Function2[js.Any, js.Function0[scala.Unit], scala.Unit],
    send: js.Function3[js.Any, DPlayerDanmakuItem, js.Function0[scala.Unit], scala.Unit]
  ): DPlayerAPIBackend = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("read")(read)
    __obj.updateDynamic("send")(send)
    __obj.asInstanceOf[DPlayerAPIBackend]
  }
}

