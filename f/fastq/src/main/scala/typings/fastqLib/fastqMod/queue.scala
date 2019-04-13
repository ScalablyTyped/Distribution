package typings
package fastqLib.fastqMod

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
    drain: () => js.Any,
    empty: () => scala.Unit,
    idle: () => scala.Boolean,
    kill: () => js.Any,
    killAndDrain: () => js.Any,
    length: () => scala.Double,
    pause: () => js.Any,
    push: (js.Any, done) => scala.Unit,
    resume: () => js.Any,
    saturated: () => scala.Unit,
    unshift: (js.Any, done) => scala.Unit
  ): queue = {
    val __obj = js.Dynamic.literal(concurrency = concurrency, drain = js.Any.fromFunction0(drain), empty = js.Any.fromFunction0(empty), idle = js.Any.fromFunction0(idle), kill = js.Any.fromFunction0(kill), killAndDrain = js.Any.fromFunction0(killAndDrain), length = js.Any.fromFunction0(length), pause = js.Any.fromFunction0(pause), push = js.Any.fromFunction2(push), resume = js.Any.fromFunction0(resume), saturated = js.Any.fromFunction0(saturated), unshift = js.Any.fromFunction2(unshift))
  
    __obj.asInstanceOf[queue]
  }
}

