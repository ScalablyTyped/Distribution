package typings.fastq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait queue extends js.Object {
  var concurrency: Double
  def drain(): js.Any
  def empty(): Unit
  def idle(): Boolean
  def kill(): js.Any
  def killAndDrain(): js.Any
  def length(): Double
  def pause(): js.Any
  def push(task: js.Any, done: done): Unit
  def resume(): js.Any
  def saturated(): Unit
  def unshift(task: js.Any, done: done): Unit
}

object queue {
  @scala.inline
  def apply(
    concurrency: Double,
    drain: () => js.Any,
    empty: () => Unit,
    idle: () => Boolean,
    kill: () => js.Any,
    killAndDrain: () => js.Any,
    length: () => Double,
    pause: () => js.Any,
    push: (js.Any, done) => Unit,
    resume: () => js.Any,
    saturated: () => Unit,
    unshift: (js.Any, done) => Unit
  ): queue = {
    val __obj = js.Dynamic.literal(concurrency = concurrency.asInstanceOf[js.Any], drain = js.Any.fromFunction0(drain), empty = js.Any.fromFunction0(empty), idle = js.Any.fromFunction0(idle), kill = js.Any.fromFunction0(kill), killAndDrain = js.Any.fromFunction0(killAndDrain), length = js.Any.fromFunction0(length), pause = js.Any.fromFunction0(pause), push = js.Any.fromFunction2(push), resume = js.Any.fromFunction0(resume), saturated = js.Any.fromFunction0(saturated), unshift = js.Any.fromFunction2(unshift))
    __obj.asInstanceOf[queue]
  }
}

