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
  def apply(pause: () => scala.Unit, restart: () => scala.Unit, start: () => scala.Unit): Timer = {
    val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), restart = js.Any.fromFunction0(restart), start = js.Any.fromFunction0(start))
  
    __obj.asInstanceOf[Timer]
  }
}

