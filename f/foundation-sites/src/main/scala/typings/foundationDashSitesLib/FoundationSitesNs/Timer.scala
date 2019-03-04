package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timer extends js.Object {
  def pause(): scala.Unit
  def restart(): scala.Unit
  def start(): scala.Unit
}

object Timer {
  @scala.inline
  def apply(
    pause: js.Function0[scala.Unit],
    restart: js.Function0[scala.Unit],
    start: js.Function0[scala.Unit]
  ): Timer = {
    val __obj = js.Dynamic.literal(pause = pause, restart = restart, start = start)
  
    __obj.asInstanceOf[Timer]
  }
}

