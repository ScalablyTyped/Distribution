package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timer extends js.Object {
  def pause(): Unit
  def restart(): Unit
  def start(): Unit
}

object Timer {
  @scala.inline
  def apply(pause: () => Unit, restart: () => Unit, start: () => Unit): Timer = {
    val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), restart = js.Any.fromFunction0(restart), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[Timer]
  }
}

