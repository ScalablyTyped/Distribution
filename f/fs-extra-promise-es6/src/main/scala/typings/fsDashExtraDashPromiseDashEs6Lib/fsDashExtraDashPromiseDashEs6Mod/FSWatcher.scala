package typings
package fsDashExtraDashPromiseDashEs6Lib.fsDashExtraDashPromiseDashEs6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FSWatcher extends js.Object {
  def close(): scala.Unit
}

object FSWatcher {
  @scala.inline
  def apply(close: js.Function0[scala.Unit]): FSWatcher = {
    val __obj = js.Dynamic.literal(close = close)
  
    __obj.asInstanceOf[FSWatcher]
  }
}

