package typings.fastq.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait queue[T, R] extends js.Object {
  var concurrency: Double = js.native
  def drain(): js.Any = js.native
  def empty(): Unit = js.native
  def getQueue(): js.Array[T] = js.native
  def idle(): Boolean = js.native
  def kill(): js.Any = js.native
  def killAndDrain(): js.Any = js.native
  def length(): Double = js.native
  def pause(): js.Any = js.native
  def push(task: T, done: done[R]): Unit = js.native
  def resume(): js.Any = js.native
  def saturated(): Unit = js.native
  def unshift(task: T, done: done[R]): Unit = js.native
}

object queue {
  @scala.inline
  def apply[T, R](
    concurrency: Double,
    drain: () => js.Any,
    empty: () => Unit,
    getQueue: () => js.Array[T],
    idle: () => Boolean,
    kill: () => js.Any,
    killAndDrain: () => js.Any,
    length: () => Double,
    pause: () => js.Any,
    push: (T, done[R]) => Unit,
    resume: () => js.Any,
    saturated: () => Unit,
    unshift: (T, done[R]) => Unit
  ): queue[T, R] = {
    val __obj = js.Dynamic.literal(concurrency = concurrency.asInstanceOf[js.Any], drain = js.Any.fromFunction0(drain), empty = js.Any.fromFunction0(empty), getQueue = js.Any.fromFunction0(getQueue), idle = js.Any.fromFunction0(idle), kill = js.Any.fromFunction0(kill), killAndDrain = js.Any.fromFunction0(killAndDrain), length = js.Any.fromFunction0(length), pause = js.Any.fromFunction0(pause), push = js.Any.fromFunction2(push), resume = js.Any.fromFunction0(resume), saturated = js.Any.fromFunction0(saturated), unshift = js.Any.fromFunction2(unshift))
    __obj.asInstanceOf[queue[T, R]]
  }
  @scala.inline
  implicit class queueOps[Self <: queue[_, _], T, R] (val x: Self with (queue[T, R])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConcurrency(value: Double): Self = this.set("concurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrain(value: () => js.Any): Self = this.set("drain", js.Any.fromFunction0(value))
    @scala.inline
    def setEmpty(value: () => Unit): Self = this.set("empty", js.Any.fromFunction0(value))
    @scala.inline
    def setGetQueue(value: () => js.Array[T]): Self = this.set("getQueue", js.Any.fromFunction0(value))
    @scala.inline
    def setIdle(value: () => Boolean): Self = this.set("idle", js.Any.fromFunction0(value))
    @scala.inline
    def setKill(value: () => js.Any): Self = this.set("kill", js.Any.fromFunction0(value))
    @scala.inline
    def setKillAndDrain(value: () => js.Any): Self = this.set("killAndDrain", js.Any.fromFunction0(value))
    @scala.inline
    def setLength(value: () => Double): Self = this.set("length", js.Any.fromFunction0(value))
    @scala.inline
    def setPause(value: () => js.Any): Self = this.set("pause", js.Any.fromFunction0(value))
    @scala.inline
    def setPush(value: (T, done[R]) => Unit): Self = this.set("push", js.Any.fromFunction2(value))
    @scala.inline
    def setResume(value: () => js.Any): Self = this.set("resume", js.Any.fromFunction0(value))
    @scala.inline
    def setSaturated(value: () => Unit): Self = this.set("saturated", js.Any.fromFunction0(value))
    @scala.inline
    def setUnshift(value: (T, done[R]) => Unit): Self = this.set("unshift", js.Any.fromFunction2(value))
  }
  
}

