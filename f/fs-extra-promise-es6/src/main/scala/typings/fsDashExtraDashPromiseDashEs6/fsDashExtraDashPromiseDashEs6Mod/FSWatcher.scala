package typings.fsDashExtraDashPromiseDashEs6.fsDashExtraDashPromiseDashEs6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FSWatcher extends js.Object {
  def close(): Unit
}

object FSWatcher {
  @scala.inline
  def apply(close: () => Unit): FSWatcher = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
  
    __obj.asInstanceOf[FSWatcher]
  }
}

