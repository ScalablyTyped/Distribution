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
  def apply(start: () => FSEvents, stop: () => FSEvents): FSEvents = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[FSEvents]
  }
}

