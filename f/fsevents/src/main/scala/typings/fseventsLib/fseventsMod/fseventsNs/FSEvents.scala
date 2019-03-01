package typings
package fseventsLib.fseventsMod.fseventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FSEvents extends js.Object {
  def start(): this.type
  def stop(): this.type
}

object FSEvents {
  @scala.inline
  def apply(start: js.Function0[FSEvents], stop: js.Function0[FSEvents]): FSEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("stop")(stop)
    __obj.asInstanceOf[FSEvents]
  }
}

