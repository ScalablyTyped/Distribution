package typings
package fastqLib.fastqMod.fastqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait queue extends js.Object {
  var concurrency: scala.Double
  def drain(): js.Any
  def empty(): scala.Unit
  def idle(): scala.Boolean
  def kill(): js.Any
  def killAndDrain(): js.Any
  def length(): scala.Double
  def pause(): js.Any
  def push(task: js.Any, done: done): scala.Unit
  def resume(): js.Any
  def saturated(): scala.Unit
  def unshift(task: js.Any, done: done): scala.Unit
}

object queue {
  @scala.inline
  def apply(
    concurrency: scala.Double,
    drain: js.Function0[js.Any],
    empty: js.Function0[scala.Unit],
    idle: js.Function0[scala.Boolean],
    kill: js.Function0[js.Any],
    killAndDrain: js.Function0[js.Any],
    length: js.Function0[scala.Double],
    pause: js.Function0[js.Any],
    push: js.Function2[js.Any, done, scala.Unit],
    resume: js.Function0[js.Any],
    saturated: js.Function0[scala.Unit],
    unshift: js.Function2[js.Any, done, scala.Unit]
  ): queue = {
    val __obj = js.Dynamic.literal(concurrency = concurrency, drain = drain, empty = empty, idle = idle, kill = kill, killAndDrain = killAndDrain, length = length, pause = pause, push = push, resume = resume, saturated = saturated, unshift = unshift)
  
    __obj.asInstanceOf[queue]
  }
}

